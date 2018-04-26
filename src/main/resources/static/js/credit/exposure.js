$(function () {
    var $tips = $('.tips');
    $tips.on('click', function (e) {
        location.reload();
        $tips.hide()
    });

    function createChart(res) {
        var chart = echarts.init(document.getElementById('bar-chart'));
        var chartOption = {
            legend: {
                show: true,
                top: rem2px(0.2),
                right: rem2px(0.3),
                textStyle: {
                    color: '#98A0A5',
                    fontSize: rem2px(0.24)
                }
            },
            calculable: false,
            grid: {
                right: '0',
                top: rem2px(0.8),
                bottom: rem2px(1)
            },
//            dataZoom: [
//                {
//                    type: 'inside',
//                    xAxisIndex: [0, 1],
//                    start: 0,
//                    end: 100
//                }
//            ],
            xAxis: [
                {
                    type: 'category',
                    axisLabel: {
                        margin: '24',
                        color: '#98A0A5',
                        rotate: 30,
                        fontSize: rem2px(0.24)
                    },
                    axisLine: {
                        lineStyle: {
                            color: '#949BA2'
                        }
                    },
                    data: res.chart.corp_name
                },//第一个X轴
                {
                    type: 'category',
                    axisLine: {show: false},//坐标轴轴线相关设置
                    axisTick: {show: false},//坐标轴刻度相关设置
                    axisLabel: {show: false},//坐标轴刻度标签的相关设置
                    splitArea: {show: false},//坐标轴在 grid 区域中的分隔区域，默认不显示
                    splitLine: {show: false},//坐标轴在 grid 区域中的分隔线
                    data: res.chart.corp_name
                }
            ],
            yAxis: [{
                type: 'value',
                nameTextStyle: {
                    fontSize: rem2px(0.24)
                },
                splitLine: {
                    show: false
                },
                axisLabel: {
                    color: '#98A0A5',
                    fontSize: rem2px(0.24)
                },
                axisLine: {
                    lineStyle: {
                        color: '#949BA2'
                    }
                }
            }],
            series: [
                {
                    name: '赊销',
                    type: 'bar',
                    barWidth: rem2px(0.18),
                    itemStyle: {
                        color: '#27A1C0'
                    },
                    data: res.chart.ar_exposure
                },
                {
                    name: '赊销&预付',
                    type: 'bar',
                    barWidth: rem2px(0.18),
                    itemStyle: {
                        color: '#586AB5'
                    },
                    data: res.chart.ar_prepay_exposure
                },
                {
                    name: '预付',
                    type: 'bar',
                    barWidth: rem2px(0.18),
                    itemStyle: {
                        color: '#3E67BA'
                    },
                    data: res.chart.prepay_exposure
                },
                {
                    name: '赊销',
                    type: 'bar',
                    xAxisIndex: 1,
                    barWidth: rem2px(0.18),
                    itemStyle: {
                        color: '#27A1C0',
                        opacity: 0.3
                    },
                    data: res.chart.ar_index
                },
                {
                    name: '赊销&预付',
                    type: 'bar',
                    xAxisIndex: 1,
                    barWidth: rem2px(0.18),
                    itemStyle: {
                        color: '#586AB5',
                        opacity: 0.3
                    },
                    data: res.chart.ar_prepay_index
                },
                {
                    name: '预付',
                    type: 'bar',
                    xAxisIndex: 1,
                    barWidth: rem2px(0.18),
                    itemStyle: {
                        color: '#3E67BA',
                        opacity: 0.3
                    },
                    data: res.chart.prepay_index
                }
            ]
        };
        chart.setOption(chartOption, {notMerge: true});
    }

    var getTableData = function() {
    	var url = ctx + "api/credit/exposure/data";
        $.post(url,{},function(res){
            var data = res;
            if(data.success){
                createChart(data.obj);
                vm.data_date = data.obj.data_date;
                vm.group = data.obj.group;
                vm.tableList = data.obj.table_list;
            }else{
                $('.tips').text("出了点错，请点击刷新").show();
                return false
            }
        })
    };
    getTableData();
});

var vm = new Vue({
    el: '#app',
    data: {
        data_date: "",
        group: [
            {"index_name": "group_total", "index_value": "", "status": "", "delta": ""},
            {"index_name": "group_ar", "index_value": "", "status": "", "delta": ""},
            {"index_name": "group_prepay", "index_value": "", "status": "", "delta": ""},
            {"index_name": "inner_ar", "index_value": "", "status": "", "delta": ""},
            {"index_name": "inner_prepay", "index_value": "", "status": "", "delta": ""},
            {"index_name": "oversea_ar", "index_value": "", "status": "", "delta": ""},
            {"index_name": "oversea_prepay", "index_value": "", "status": "", "delta": ""}
        ],
        tableList: []
    },
    filters: {
        percent: function(value) {
            return (value * 100).toFixed(2) + "%";
        }
    }
});