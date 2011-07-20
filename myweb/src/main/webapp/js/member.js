
myweb.admin.member = {
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
				$("#adminClusterMemberListFormPersonId").append(opt);
				$("#adminClusterMemberListFormPersonId").css({
					width : 'auto'
				});
			}
		});

	}
};