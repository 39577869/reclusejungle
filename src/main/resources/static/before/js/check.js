var check;
$(function () {
    //拖动验证
    $(".inner").mousedown(function (e) {
        var dx, os = $(".inner").offset(), _differ = $(".outer").width() - $(".inner").width();
        $(document).mousemove(function (e) {
            dx = e.pageX - os.left;
            if (dx < 0) {
                dx = 0;
            } else if (dx > _differ) {
                dx = _differ;
            }
            $(".filter-box").css('width', dx);
            $(".inner").css("left", dx);
        });
        $(document).mouseup(function (e) {
            $(document).off('mousemove');
            $(document).off('mouseup');
            dx = e.pageX - os.left;
            if (dx < _differ) {
                 
                SlideCheckFail();
            } else if (dx >= _differ) { 
                SlideCheckSuccess(_differ); 
            }

        })
    })
    
    $("input[type=button]").click(function () {
        SlideCheckFail();
    });
    
});

//初始验证
function SlideCheckFail() {
    $(".outer").removeClass("act");
    $(".inner").css("left", 0);
    $(".inner").html("&gt;&gt;");
    $(".filter-box").css('width', 0);
    $(".outer>span").html("按住滑块，拖拽到最右边");

    $("#CaptchaID").val("0");
    $(".outer span").addClass("txtRoll");
}
//验证成功
function SlideCheckSuccess(dx) {
    $(".outer").addClass("act");
    $(".outer>span").html("验证通过！");
    $(".inner").html('&radic;');
    $(".inner").css("left", dx);
    $(".filter-box").css('width', dx);
    $("#CaptchaID").val("1");
    $(".outer span").removeClass("txtRoll");
    check=true;
}

 