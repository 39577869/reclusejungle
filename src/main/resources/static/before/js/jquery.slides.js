
function sliderlbt(id){
	var sWidth = $(id).width();
	var len = $(id+" .silder_panel").length
	var index = 0;
	var picTimer;

	var btn = "<a class='prev'>Prev</a><a class='next'>Next</a>";
	$(id).append(btn);

	$(id+" .silder_nav li").css({"opacity":"0.6","filter":"alpha(opacity=60)"}).mouseenter(function() {
		index = $(id+"  .silder_nav li").index(this);
		showPics(index);
	}).eq(0).trigger("mouseenter");

	$(id+" .prev,"+id+" .next").css({"opacity":"0.2","filter":"alpha(opacity=20)"}).hover(function(){
		$(this).stop(true,false).animate({"opacity":"0.6","filter":"alpha(opacity=60)"},300);
	},function() {
		$(this).stop(true,false).animate({"opacity":"0.2","filter":"alpha(opacity=20)"},300);
	});


	// Prev
	$(id+"  .prev").click(function() {
		index -= 1;
		if(index == -1) {index = len - 1;}
		showPics(index);
	});

	// Next
	$(id+"  .next").click(function() {
		index += 1;
		if(index == len) {index = 0;}
		showPics(index);
	});

	//
	$(id+" .silder_con").css("width",sWidth * (len));

	// mouse
	$(id).hover(function() {
		clearInterval(picTimer);
	},function() {
		picTimer = setInterval(function() {
			showPics(index);
			index++;
			if(index == len) {index = 0;}
		},3000);
	}).trigger("mouseleave");

	// showPics
	function showPics(index) {
		var nowLeft = -index*sWidth;
		$(id+" .silder_con").stop(true,false).animate({"left":nowLeft},300);
		$(id+" .silder_nav li").removeClass("current").eq(index).addClass("current");
		$(id+" .silder_nav li").stop(true,false).animate({"opacity":"0.5"},300).eq(index).stop(true,false).animate({"opacity":"1"},300);
	}
};