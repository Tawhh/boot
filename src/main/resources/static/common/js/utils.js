function rem2px(d) {
    var rem = document.documentElement.style.fontSize.slice(0, -2);
    var val = parseFloat(d) * (rem - 0);
    if (typeof d === 'string' && d.match(/rem$/)) {
        val += '';
    }
    return val;
};
$.ajaxSettings = $.extend($.ajaxSettings, {
    dataType: "json",
    cache: false,
    beforeSend: function(){
        //在发送请求之前做某事，比如说 设置loading动画显示
        $(".ajax-loading").show();
    },
    success: function(){
    },
    complete: function(xhr) {
        $(".ajax-loading").hide();
    },
    error: function(){
    }
});