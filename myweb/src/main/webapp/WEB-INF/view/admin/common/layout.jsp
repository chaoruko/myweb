<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:getAsString name="title" /></title>
<link rel="stylesheet" type="text/css" href="${f:url('/css/reset.css')}" />

<link rel="stylesheet" type="text/css" href="${f:url('/css/myweb.css')}" />
<link rel="stylesheet" type="text/css"
	href="${f:url('/css/smoothness/jquery-ui-1.8.13.custom.css')}" />
<link rel="stylesheet" type="text/css"
	href="${f:url('/js/cleditor/jquery.cleditor.css')}" />
<script src="${f:url('/js/jquery-1.5.1.min.js')}"></script>
<script src="${f:url('/js/cleditor/jquery.cleditor.min.js')}"></script>
<script src="${f:url('/js/jquery-ui-1.8.13.custom.min.js')}"></script>
<script src="${f:url('/js/myweb.js')}"></script>
<script src="${f:url('/js/board.js')}"></script>
<script src="${f:url('/js/member.js')}"></script>
<script type="text/javascript">
	$(function() {
		myweb.init();
	});
</script>
</head>
<body>
	<div id="container">
		<div id="header">
			<tiles:insert page="header.jsp" />
		</div>

		<div id="navi">
		<%--
			<div class="menu">
				<tiles:insert page="menu.jsp" />
			</div>
		 --%>
		</div>

		<div id="wrapper">
			<div id="content">
				<tiles:insert attribute="content" />
			</div>
		</div>

		<div id="sidebar">
			<tiles:insert page="menu.jsp" />
		</div>
		<div id="footer">
			<tiles:insert page="footer.jsp" />
		</div>
	</div>


</body>
</html>