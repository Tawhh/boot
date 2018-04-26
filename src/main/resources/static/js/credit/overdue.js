$(function () {
    var $tips = $('.tips');
    $tips.on('click', function (e) {
        location.reload();
        $tips.hide()
    });

    function createArChart(res) {
        var colorList = ['#A2015B', '#F3CE04', '#FF8300', '#FF0000', '#CC0000']
        var seriesList = [];
        $.each(res, function(i,e){
            var series = {
                value: e,
                label: {
                    show: true,
                    position: 'top',
                    color: '#000',
                    fontSize: rem2px(0.24)
                },
                itemStyle: {
                    color: colorList[i]
                }
            };
            seriesList.push(series);
        });
        var chart = echarts.init(document.getElementById('ar-chart'));
        var chartOption = {
            title: {
                show: true,
                left:  rem2px(0.24),
                top:  rem2px(0.24),
                text: "集团整体分逾期汇总图-赊销",
                textStyle: {
                    fontSize: rem2px(0.24)
                }
            },
            legend: {
                show: false
            },
            calculable: false,
            grid: {
                right: rem2px(0.2),
                left: rem2px(1.2),
                top: rem2px(1),
                bottom: rem2px(0.8)
            },
//            dataZoom: [
//                {
//                    type: 'inside',
//                    start: 0,
//                    end: 100
//                }
//            ],
            xAxis: [
                {
                    type: 'category',
                    splitLine: {
                        show: true,
                        lineStyle: {
                            color: '#6E6E6E',
                            type: 'dashed'
                        }
                    },
                    axisLabel: {
                        margin: '24',
                        color: '#000',
                        rotate: 15,
                        fontSize: rem2px(0.2)
                    },
                    axisLine: {
                        lineStyle: {
                            color: '#6E6E6E'
                        }
                    },
                    data: ["逾期总数", "逾期30天以内", "逾期30-90天", "逾期90-180天", "逾期180天以上",]
                }
            ],
            yAxis: [{
                type: 'value',
                // name: "万元",
                // nameLocation: 'start',
                // nameGap: rem2px(0.24),
                // nameTextStyle: {
                //     color: '#6E6E6E',
                //     fontSize: rem2px(0.24)
                // },
                splitLine: {
                    show: true,
                    lineStyle: {
                        color: '#6E6E6E',
                        type: 'dashed'
                    }
                },
                axisLabel: {
                    color: '#6E6E6E',
                    fontSize: rem2px(0.24)
                },
                axisLine: {
                    lineStyle: {
                        color: '#6E6E6E'
                    }
                }
            }],
            series: [
                {
                    name: '赊销',
                    type: 'bar',
                    barWidth: rem2px(0.18),
                    data: seriesList
                }
            ]
        };
        chart.setOption(chartOption, {notMerge: true});
    }

    function createPrepayChart(res) {
        var colorList = ['#A2015B', '#FF8300', '#FF0000', '#CC0000']
        var seriesList = [];
        $.each(res, function(i,e){
            var series = {
                value: e,
                type: 'bar',
                label: {
                    show: true,
                    position: 'top',
                    color: '#000',
                    fontSize: rem2px(0.24)
                },
                itemStyle: {
                    color: colorList[i]
                }
            };
            seriesList.push(series);
        });
        var chart = echarts.init(document.getElementById('prepay-chart'));
        var chartOption = {
            title: {
                show: true,
                left:  rem2px(0.24),
                top:  rem2px(0.24),
                text: "集团整体分逾期汇总图-预付",
                textStyle: {
                    fontSize: rem2px(0.24)
                }
            },
            legend: {
                show: false
            },
            calculable: false,
            grid: {
                right: rem2px(0.2),
                left: rem2px(1.2),
                top: rem2px(1),
                bottom: rem2px(0.8)
            },
//            dataZoom: [
//                {
//                    type: 'inside',
//                    start: 0,
//                    end: 100
//                }
//            ],
            xAxis: [
                {
                    type: 'category',
                    splitLine: {
                        show: true,
                        lineStyle: {
                            color: '#6E6E6E',
                            type: 'dashed'
                        }
                    },
                    axisLabel: {
                        margin: '24',
                        color: '#000',
                        rotate: 15,
                        fontSize: rem2px(0.2)
                    },
                    axisLine: {
                        lineStyle: {
                            color: '#6E6E6E'
                        }
                    },
                    data: ["逾期总数", "逾期10天以内", "逾期10-30天", "逾期30天以上",]
                }
            ],
            yAxis: [{
                type: 'value',
                // name: "万元",
                // nameLocation: 'start',
                // nameGap: rem2px(0.24),
                // nameTextStyle: {
                //     color: '#6E6E6E',
                //     fontSize: rem2px(0.24)
                // },
                splitLine: {
                    show: true,
                    lineStyle: {
                        color: '#6E6E6E',
                        type: 'dashed'
                    }
                },
                axisLabel: {
                    color: '#6E6E6E',
                    fontSize: rem2px(0.24)
                },
                axisLine: {
                    lineStyle: {
                        color: '#6E6E6E'
                    }
                }
            }],
            series: [
                {
                    name: '预付',
                    type: 'bar',
                    barWidth: rem2px(0.18),
                    data: seriesList
                }
            ]
        };
        chart.setOption(chartOption, {notMerge: true});
    }

    var getTableData = function() {
    	var url = ctx + "api/credit/overdue/data";
        $.post(url,{},function(res){
            var data = res;
            if(data.success){
                createArChart(data.obj.arOverdue);
                createPrepayChart(data.obj.prepayOverdue);
                vm.data_date = data.obj.dataDate;
                vm.ar_tableList = data.obj.arTableList;
                vm.prepay_tableList = data.obj.prepayTableList;
            }else{
                $('.tips').text("出了点错，请点击刷新").show();
                return false
            }
        })
    }
    getTableData()
});

var vm = new Vue({
    el: '#app',
    data: {
        data_date: "",
        ar_tableList: [],
        prepay_tableList: []
    }
});