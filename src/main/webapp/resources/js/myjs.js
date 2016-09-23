$(document).ready(function(){
	$('#reg').click(function(){
		$('.registration').css('display','block');
	});
})


function sandLanRU(){

	$.ajax({
		type : "POST",
		url  :	"rus",
		success : function(data){
			alert(data);
			setTimeout("window.location.reload()",2000);
			
				}
		
		
	});
}


function sandLanEN(){
	var lang = "EN";
	$.ajax({
		type : "POST",
		url  :	"eng",
		success : function(data){
			alert(data);
			setTimeout("window.location.reload()",2000);
			
			}
	
	});
}		