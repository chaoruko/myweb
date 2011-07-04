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

myweb.admin = {
		
};

myweb.admin.portalConfig = {
	init : function() {
		myweb.service({
			url : "/admin/portalConfig/optionsOfKeys",
			success : function(response) {
				var opt = '<option value="" />';
				$(response.list).each(function(index, row) {
					opt += '<option value="' + row.value + '">'
					    + row.label + '</option>';
				});
				$("#portalConfigFormKey").append(opt);
				$("#portalConfigFormKey").css({
					width : 'auto'
				});
			}
		});
		myweb.service({
			url : "/board/boards",
			success : function(response) {
				var opt = '<option value="" />';
				$(response.list).each(
						function(index, row) {
							opt += '<option value="' + row.id + '">' + row.name
									+ '</option>';
						});
				$("#portalConfigFormKeyId").append(opt);
				$("#portalConfigFormKeyId").css({
					width : 'auto'
				});
			}
		});

	}
};
