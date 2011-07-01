header
<div style="text-align: right;">
<c:if test="${loggedIn}">
	${userDto.code} ${userDto.name} <s:link href="/logout">
		<bean:message key="labels.logout" />
	</s:link>
</c:if>
<c:if test="${!loggedIn}">

	<s:form action="/login">
		<html:errors />
		<bean:message key="labels.code" /> :<html:text property="userId"
			style="width:60px;border:none;font-size:10pt;" />
		<bean:message key="labels.password" /> :<html:password
			property="password" style="width:60px;border:none;font-size:10pt;" />
		<html:submit property="login">
			<bean:message key="labels.login" />
		</html:submit>
	</s:form>
</c:if>
</div>
