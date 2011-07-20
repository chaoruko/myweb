myweb.article = {
	init : function() {
		$(".article").each(function() {
			var articleId = $(this).find("input[name='articleId']").val();
			var cmd = $(this).children(".loadComment");
			var area = $(this).children(".comments");
			cmd.click(function() {
				var url = "test2?id=" + articleId;
				$.ajax({
					type : "POST",
					url : url,
					dataType : "html",
					success : function(html) {
						area.empty();
						area.append(html);
					}
				});
			});
		});

		$("#articleListCmdOpen").click(function() {
			$("#articleListFormWrap").show();
		});
		$("#articleListCmdClose").click(function() {
			$("#articleListFormWrap").hide();
		});
	}
};

myweb.admin.board = {
	init : function() {

		myweb.service({
			url : "/person/list",
			success : function(response) {
				var opt = '<option value="" />';
				$(response.list).each(
						function(index, row) {
							opt += '<option value="' + row.id + '">' + row.name
									+ '</option>';
						});
				$("#boardFormAdminPersonId").append(opt);
				$("#boardFormAdminPersonId").css({
					width : 'auto'
				});
			}
		});
		myweb.service({
			url : "/admin/board/optionsEntryOpts",
			success : function(response) {
				var opt = '<option value="" />';
				$(response.list).each(
						function(index, row) {
							opt += '<option value="' + row.value + '">'
									+ row.label + '</option>';
						});
				$("#bordFormEntryType").append(opt);
				$("#bordFormEntryType").css({
					width : 'auto'
				});
			}
		});

	}
};
myweb.blog = {
	init : function() {
		$("#blogFormBodyText").cleditor({
			width : 600,
			height : 300
		});
	}
};
