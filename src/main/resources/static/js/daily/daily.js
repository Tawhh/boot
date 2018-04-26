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
            dataZoom: [
                {
                    type: 'inside',
                    start: 0,
                    end: 100
                }
            ],
            xAxis: [
                {
                    type: 'category',
                    axisLabel: {
                        margin: '24',
                        color: '#98A0A5',
                        fontSize: rem2px(0.24)
                    },
                    axisLine: {
                        lineStyle: {
                            color: '#949BA2'
                        }
                    },
                    data: res.corpName
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
                    name: '总盈亏',
                    type: 'bar',
                    barWidth: rem2px(0.18),
                    itemStyle: {
                        color: '#27A1C0'
                    },
                    data: res.totalPnl
                },
                {
                    name: '去年同期',
                    type: 'bar',
                    barWidth: rem2px(0.18),
                    itemStyle: {
                        color: '#586AB5'
                    },
                    data: res.volume
                },
                {
                    name: '预算利润',
                    type: 'bar',
                    barWidth: rem2px(0.18),
                    itemStyle: {
                        color: '#3E67BA'
                    },
                    data: res.profitBudget
                }
            ]
        };
        chart.setOption(chartOption, {notMerge: true});
    }
    var getTableData = function() {
        var url = ctx + "api/daily/group/do_list";
        $.post(url,{},function(res){
            var data = res;
            if(data.success){
                createChart(data.obj.chart);
                vm.data_date = data.obj.dataDate;
                vm.pnlRetList = data.obj.pnlRetList;
                vm.positionList = data.obj.positionList;
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
        pnlRetList: [],
        positionList: []
    }
});

