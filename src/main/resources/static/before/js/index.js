//�������
var len = $(".index-lbt .num > li").length;
var index = 0;  //ͼƬ���
var adTimer;
$(".index-lbt .num li").mouseover(function() {
    index = $(".num li").index(this);  //��ȡ����� li ��index
    showImg(index);
}).eq(0).mouseover();
//����ֹͣ������������ʼ����.
$('#scrollPics').hover(function() {
    clearInterval(adTimer);
}, function() {
    adTimer = setInterval(function() {
        showImg(index)
        index++;
        if (index == len) {       //���һ��ͼƬ֮��ת����һ��
            index = 0;
        }
    }, 3000);
}).trigger("mouseleave");

function showImg(index) {
    var adHeight = $("#scrollPics>ul>li:first").height();
    $(".slider").stop(true, false).animate({
        "marginTop": -adHeight * index + "px"    //�ı� marginTop ���Ե�ֵ�ﵽ�ֲ���Ч��
    }, 1000);
    $(".num li").removeClass("on")
        .eq(index).addClass("on");
}

//������
$(".TabTitle ul li:nth-child(1)").find("p").css("background-position","0 px 0px");
$(".TabTitle li").click(function(){
    $(this).addClass("active").siblings().removeClass("active");
    var index=$(".TabTitle li").index(this);
    $(".TabContent .myTab_Content").eq(index).show().siblings() .hide()
    $(this).find("p").css("background-position","0px 0px").parent().siblings().find("p").css("background-position","-27px 0px")
})
//�������ڲ�
$(".tj-top span").click(function(){
    $(this).addClass("gnxjac").siblings().removeClass("gnxjac");
    var index=$(".tj-top span").index(this);
    $(".tj-bottom .xj").eq(index).show().siblings() .hide()
});
//�м�����1
$(".index-domestic .rmtj2 span").hover(function(){
    $(this).addClass("forest").siblings().removeClass("forest");
    var index=$(".index-domestic .rmtj2 span").index(this);
    $(".im-main .one").eq(index).show().siblings() .hide()
});
//�м�����2
$(".index-abroad .rmtj2 span").hover(function(){
    $(this).addClass("forest1").siblings().removeClass("forest1");
    var index=$(".index-abroad .rmtj2 span").index(this);
    $(".ia-main .one").eq(index).show().siblings() .hide()
});
//���-�����
$(".ch-title p").click(function(){
    $(this).addClass("wzms").siblings().removeClass("wzms");
    $(this).removeClass("yums").siblings().addClass("yums");
    var index=$(".ch-title p").index(this);
    $(".ch-nr .ch-one").eq(index).show().siblings() .hide()
});
//����ҳ�����֣�
$(".yhdp .yhdp-top p").click(function(){
    $(this).addClass("xqy-dc").siblings().removeClass("xqy-dc");
    var index=$(".yhdp .yhdp-top p").index(this);
    $(".xxy-mian .xm-one").eq(index).show().siblings() .hide()
});

$(".cljmbg").hover(function(){
	$(".cljmbg img").attr("src","images/jm_07_1.jpg");
},function(){
	$(".cljmbg img").attr("src","images/jm_07.jpg");
});

$(".xjjmbg").hover(function(){
	$(".xjjmbg img").attr("src","images/jm_10_1.jpg");
},function(){
	$(".xjjmbg img").attr("src","images/jm_10.jpg");
});

$(".ycjmbg").hover(function(){
	$(".ycjmbg img").attr("src","images/jm_12_1.jpg");
},function(){
	$(".ycjmbg img").attr("src","images/jm_12.jpg");
});
//����-����ҳ��
$(".jmjdcx-top  span").click(function(){
    $(this).addClass("dywr").siblings().removeClass("dywr");
    var index=$(".jmjdcx-top  span").index(this);
    $(".jmjdcx-nr .jmjdx-one").eq(index).show().siblings() .hide()
});
$(".fzym-p12  span").click(function(){
    $(this).addClass("qzfz").siblings().removeClass("qzfz");
    var index=$(".fzym-p12  span").index(this);
    $(".qzsqb .qzsqb-one").eq(index).show().siblings() .hide();
});

$(".tjdd1").click(function(){
   var ws= $(window).scrollTop();
    $(".cgxd1").css("margin-top",ws+"px");
   $(".tcc").css("display","block");
}); 

$(".a1").click(function(){
    var ws= $(window).scrollTop();
    $(".cgxd1").css("margin-top",ws+"px");
    $(".tcc").css("display","block");
});
//���-����ҳ
$(".ydtjw").click(function(){
    var ws1= $(window).scrollTop();
     wsc=ws1+200;
    $(".tx-ydm").css("margin-top",wsc+"px");
    $(".tcc").css("display","block");
});
//点击提交弹出密码，现在修改为在上面显示密码
/*$(".tjch").click(function(){
    var ws= $(window).scrollTop();
    $(".cgxd3").css("margin-top",ws+"px");
    $(".tcc").css("display","block");
});*/
$(".close").click(function(){
    $(".tcc").css("display","none");
    var clxjmainid = $('#clxjmainid').val();  
    window.location.href="carinfo!selCarofCid.action?clxjmain.id="+clxjmainid;
});
$(".close2").click(function(){
    $(".tcc").css("display","none"); 
    window.location.href="ConEntryPage.jsp"; 
});
$(".close3").click(function(){
    $(".tcc").css("display","none"); 
    window.location.href="login.jsp";
});
$(".close4").click(function(){
    $(".tcc").css("display","none"); 
    window.location.href="ConEntryPage.jsp"; 
});
$(".close5").click(function(){
    $(".tcc").css("display","none");   
    window.location.href="joincl.jsp";
});
$(".close6").click(function(){
    $(".tcc").css("display","none");   
    window.location.href="joinxj.jsp";
});
$(".close7").click(function(){
    $(".tcc").css("display","none");   
    window.location.href="joincar.jsp";
});
$(".index-top .right .two").hover(function(){
    $(".index-top .right .three").toggle();
});

//�����
$(function(){
    var cc=$(".yc-txdd1").height();
    
    $(".tcc").css("height" ,cc+"px");
     
    //������д����
    var dtmheight=$(".dtm-left").height();
    //alert($(".dtm-left").height)
   $(".dtm-right").css("height",dtmheight+"px");



});