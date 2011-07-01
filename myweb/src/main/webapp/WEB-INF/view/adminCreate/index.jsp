<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Admin:</title>
</head>
<body>

	<html:messages id="message" message="true">
			${message}
	</html:messages>

	<s:form styleClass="form">
	<html:errors />

		<ul>
			<li><label><bean:message key="labels.userId" /> </label> <span><html:text
						property="userId" /> </span>
			</li>
			<li><label><bean:message key="labels.password" /> </label> <span><html:password
						property="password" /> </span>
			</li>
		</ul>


		<c:if test="${!hasAdmins}">
			<html:submit property="create">
				<bean:message key="labels.create" />
			</html:submit>
		</c:if>
	</s:form>

</body>
</html>

