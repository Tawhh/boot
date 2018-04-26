$(function () {
    var $tip = $('.tip');
    var $mask = $('.mask');
    $tip.on('click', function (e) {
        $mask.hide()
        $tip.hide()
    });

    var rem2px = function (d) {
        var rem = document.documentElement.style.fontSize.slice(0, -2);
        var val = parseFloat(d) * (rem - 0);
        if (typeof d === 'string' && d.match(/rem$/)) {
            val += '';
        }
        return val;
    };

    function chartCorp(data1,data2,date) {
        var myChart1 = echarts.init(document.getElementById('chartCorp'));
        var myChart2 = echarts.init(document.getElementById('chartUnit'));
        var option1 = {
            color:["#F8CBAE","#BD0001","#517DC8"],
            dataZoom: {
                type: 'inside'
            },
            title: {
                text: "集团 VaR",
                left:"center",
                top:rem2px(0.4),
                textStyle:{
                    fontSize:rem2px(0.24)
                }
            },
            legend: {
                data: ["总盈亏变动", "VaR Limit", "VaR参数法（N）"],
                bottom: rem2px(0.53),
                textStyle:{
                	color: '#98A0A5',
                    fontSize: rem2px(0.18),
                }
            },
            yAxis: {
                name: '单位：万元',
                nameGap: rem2px(0.2),
                nameTextStyle:{
                	color: '#98A0A5',
                    fontSize:rem2px(0.18)
                },
                axisLine: {
                    show: false
                },
                axisTick: {
                    show: false,
                },
                splitLine: {
                    show: false
                },
                axisLabel:{
                    textStyle:{
                    	color: '#98A0A5',
                        fontSize:rem2px(0.18)
                    }
                }
            },
            xAxis: {
                type: 'category',
                data: date,
                axisTick: {
                    show: false
                },
                axisLine: {
                    lineStyle: {
                        color: '#ccc'
                    }
                },
                axisLabel: {
                    margin: rem2px(0.3),
                    textStyle: {
                    	color: '#98A0A5',
                        fontSize:rem2px(0.18)
                    }
                },
                splitLine: {
                    show: false
                },
            },
            series: [{
                name: "总盈亏变动",
                type: "bar",
                data:data1[4].data
            }, {
                name: "VaR Limit",
                type: 'line',
                z: 5,
                data:data1[2].data
            }, {
                name: "VaR Limit",
                type: 'line',
                z: 5,
                data:data1[3].data
            }, {
                name: "VaR参数法（N）",
                type: 'line',
                z: 4,
                data:data1[0].data
            },{
                name: "VaR参数法（N）",
                type: 'line',
                z: 4,
                data:data1[1].data
            }],
            grid: {
                top:rem2px(1.2) ,
                right:rem2px(0.8),
                left:rem2px(1.20),
                bottom:rem2px(1.5)
            }
        };
        var option2 = {
            color:["#0170C1","#00AF50","#FFC000","#7ECDF4","#8956A1","#B4D465","#B4D465","#C00000","#000000"],
            dataZoom: {
                type: 'inside'
            },
            title: {
                text: "集团VaR - VaR-Limit",
                left:"center",
                top:rem2px(0.4),
                textStyle:{
                    fontSize:rem2px(0.24)
                }
            },
            legend: {
                width:"82%",
                data: ["VaR Limit","中粮集团VaR"],
                top: rem2px(0.9),
                textStyle:{
                	 color: '#98A0A5',
                     fontSize: rem2px(0.18), 
                },
                itemGap: rem2px(0.2),
                itemWidth: rem2px(0.15),
            },
            yAxis: {
                name: '单位：万元',
                nameGap: rem2px(0.2),
                nameTextStyle:{
                	color: '#98A0A5',
                    fontSize:rem2px(0.18)
                },
                axisLine: {
                    show: false
                },
                axisTick: {
                    show: false,
                },
                splitLine: {
                    show: false
                },
                axisLabel:{
                    textStyle:{
                    	color: '#98A0A5',
                        fontSize:rem2px(0.18)
                    }
                }
            },
            xAxis: {
                type: 'category',
                data: date,
                axisTick: {
                    show: false
                },
                axisLine: {
                    lineStyle: {
                        color: '#ccc'
                    }
                },
                axisLabel: {
                    margin: rem2px(0.3),
                    textStyle: {
                    	color: '#98A0A5',
                        fontSize:rem2px(0.18)
                    }
                },
                splitLine: {
                    show: false
                }
            },
            series: [{
                name: "VaR Limit",
                type: "line",
                data: data1[2].data,
            }, {
                name: "中粮集团VaR",
                type: "line",
                data: data1[0].data
            }],
            grid: {
                top:rem2px(2.5) ,
                right:rem2px(0.62),
                left:rem2px(1.1),
                bottom:rem2px(1.2)
            }
        };
        $.each(data2,function (i,v){
                option2.series.unshift({
                    type:"bar",
                    stack:"v",
                    name:v.name,
                    data:v.data,
                })
                option2.legend.data.unshift(v.name)
        })
        myChart1.setOption(option1,{notMerge: true});
        myChart2.setOption(option2,{notMerge: true});
        $(window).resize(function(){
              myChart1.resize();
              myChart2.resize();
        });
    };

    var getTableData = function() {
    	var url = ctx + "api/market/var/data";
        $.post(url,{},function(data){
            if(data.success){
                chartCorp(data.obj.data_middle,data.obj.data_below,data.obj.date);
                vm.data_date = data.obj.maxDate;
                vm.corpTableList = data.obj.data_top;
            }else{
               $('.mask').show();
               $('.tip').text("出了点错，请点击刷新").show();
               return false
            }
        })
     }
     getTableData()
});

var vm = new Vue({
    el: '#app',
    data: {
    	data_date:"",
        corpTableList:[]
    },
    filters: {
    	fixed: function (value) {
    		return (value*100).toFixed(2) +"%"
    	  }
    }
});
        