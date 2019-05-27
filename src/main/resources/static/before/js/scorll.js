$(function(){
    var ms = ($('#a1').offset().top) - $(window).scrollTop();
    $("#nav").css("top", ms+20);
    $(window).scroll(function(){
       if($(window).scrollTop()>$('#a1').offset().top){
           $("#nav").css("top", 100);
       }else{
           $("#nav").css("top", ms+20);
       }
        //Ϊҳ�����ҳ����������¼�
        var nav=$("#nav li").size();
        var wst =  $(window).scrollTop(); //���������붥��ֵ
        for (i=1; i<nav+1; i++){             //��ѭ��
            if($("#a"+i).offset().top<=wst){ //�жϹ�����λ��
                //���c��
                $("#a"+i+i).parent().addClass("c").siblings().removeClass("c");	//��ǰ������c��
            }
        }
    });
});