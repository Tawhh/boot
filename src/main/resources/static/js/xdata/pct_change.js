$(function () {
    var $tips = $('.tips');
    $tips.on('click', function (e) {
        location.reload();
        $tips.hide()
    });

    var getTableData = function() {
        var url = ctx + "api/xdata/pct_change/do_list";
        $.post(url,{},function(res){
            var data = res;
            if(data.success){
                vm.data_date = data.obj.dataDate;
                vm.list = data.obj.list;
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
        list: []
    },
    methods: {
        pctChange1d: function(value) {
            var d = value || "";
            if (d == "") { return ""}else{ d = (d * 100).toFixed(2)}
            if(d >= 2.5){
                return '<span class="pctC1">'+ d +'</span>'
            }else if(d < 2.5 && d >= 1.5){
                return '<span class="pctC2">'+ d +'</span>'
            }else if(d < -1.5 && d >= -2.5){
                return '<span class="pctC3">'+ d +'</span>'
            }else if(d <= -2.5){
                return '<span class="pctC4">'+ d +'</span>'
            }else{
                return '<span>'+ d +'</span>'
            }
        },
        pctChange3d: function(value) {
            var d = value || "";
            if (d == "") { return ""}else{ d = (d * 100).toFixed(2)}
            if(d >= 3){
                return '<span class="pctC1">'+ d +'</span>'
            }else if(d < 3 && d >= 2){
                return '<span class="pctC2">'+ d +'</span>'
            }else if(d < -2 && d >= -3){
                return '<span class="pctC3">'+ d +'</span>'
            }else if(d <= -3){
                return '<span class="pctC4">'+ d +'</span>'
            }else{
                return '<span>'+ d +'</span>'
            }
        },
        pctChange5d: function(value) {
            var d = value || "";
            if (d == "") { return ""}else{ d = (d * 100).toFixed(2)}
            if(d >= 5){
                return '<span class="pctC1">'+ d +'</span>'
            }else if(d < 5 && d >= 3){
                return '<span class="pctC2">'+ d +'</span>'
            }else if(d < -3 && d >= -5){
                return '<span class="pctC3">'+ d +'</span>'
            }else if(d <= -5){
                return '<span class="pctC4">'+ d +'</span>'
            }else{
                return '<span>'+ d +'</span>'
            }
        }
    }
});

