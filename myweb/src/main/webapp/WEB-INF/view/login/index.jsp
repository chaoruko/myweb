<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>myweb</title>
<link rel="stylesheet" type="text/css" href="${f:url('/css/myweb.css')}" />
<link rel="stylesheet" type="text/css"
	href="${f:url('/css/smoothness/jquery-ui-1.8.13.custom.css')}" />
<script src="${f:url('/js/jquery-1.5.1.min.js')}"></script>
<script src="${f:url('/js/jquery-ui-1.8.13.custom.min.js')}"></script>
</head>
<body>
	<div class="pageTitle">
		<bean:message key="labels.login" />
	</div>
	<s:form styleClass="form">
		<html:errors />
		<ul>
			<li><label><bean:message key="labels.code" /> </label> <span><html:text
						property="userId" /> </span></li>
			<li><label><bean:message key="labels.password" /> </label> <span><html:password
						property="password" /> </span></li>
		</ul>
		<div class="actions">
			<html:submit property="login">
				<bean:message key="labels.login" />
			</html:submit>
		</div>
	</s:form>
</body>
</html>