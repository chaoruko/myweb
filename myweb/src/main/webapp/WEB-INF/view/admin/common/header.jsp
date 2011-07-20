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

<div id="global-navi">
	<ul>
	<%--
		<li><s:link href="/menu">
				<bean:message key="labels.menu" />
			</s:link></li>
	 --%>
		<li><s:link href="/portal">
				<bean:message key="labels.home" />
			</s:link></li>
		<li><s:link href="/board">
				<bean:message key="labels.board" />
			</s:link></li>
		<li><s:link href="/blog">
				<bean:message key="labels.blog" />
			</s:link></li>
		<li><s:link href="/admin/menu">
				<bean:message key="labels.admin" />
			</s:link></li>
	</ul>
</div>
