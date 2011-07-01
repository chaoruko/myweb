var myweb = {
		
	init:function(){
		var obj = $("#global-messages");
		if(obj != null){
			$(obj).hide("slow");
		}
	},
	
	service : function(options){
		var url = "/myweb" + options.url;
		$.ajax({
			type : "POST",
			url : url,
			dataType : options.dataType || "json",
			data : options.param,
			success : options.success
		});
	}
};

