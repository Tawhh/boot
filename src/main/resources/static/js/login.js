$(function () {
    var $userName = $('input[name=userName]');
    var $password = $('input[name=password]');
    var $loginForm = $('.loginForm');
    var $tip = $('.tip');
    var $mask = $('.mask');
    var $pwd = $('.pwd');

    var $tips = $('.tips');
    var $input = $('input');

    $pwd.on('click', function (e) {
        if($(this).hasClass("pwdc")){
            $(this).removeClass("pwdc").addClass("pwdo");
            $password.attr("type","text");
        }else{
            $(this).removeClass("pwdo").addClass("pwdc");
            $password.attr("type","password");
        }
    });
    $input.on("input", function () {
        $tips.hide()
    })

    $loginForm.on('submit', function (e) {
        if ($.trim($userName.val()) == "") {
            $mask.show();
            $tip.text('请输入用户名').show();
            return false
        }
        if ($.trim($password.val()) == "") {
            $mask.show();
            $tip.text('请输入密码').show();
            return false
        }
    })

    $mask.on('click', function (e) {
        $mask.hide()
        $tip.hide()
    });
    $tip.on('click', function (e) {
        $mask.hide()
        $tip.hide()
    })

    $tips.on('click', function (e) {
        $tips.hide()
    })
})
