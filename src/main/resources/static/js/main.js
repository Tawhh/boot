$(function () {
    var $tip = $('.tip');
    var $mask = $('.mask');
    $mask.on('click', function (e) {
        $mask.hide()
        $tip.hide()
    });
    $tip.on('click', function (e) {
        $mask.hide()
        $tip.hide()
    });

});

var vm = new Vue({
    el: '#app',
    data: {},
    computed: {
        toDay: function () {
            var d = new Date();
            var year = d.getFullYear();
            var month = d.getMonth() + 1;
            var day = d.getDate();
            return year + '年' + month + '月' + day + '日'
        }
    }
});