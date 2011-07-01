<div class="pageTitle">
	<bean:message key="labels.person" />
</div>

<s:form styleClass="form">
	<html:errors />

	<html:hidden property="id" />

	<ul>
		<li><label> <bean:message key="labels.key" /> </label> <span>
				<html:text property="key" /> </span></li>
		<li><label> <bean:message key="labels.keyId" /> </label> <span>
				<html:text property="keyId" /> </span></li>
	</ul>

	<html:submit property="save">
		<bean:message key="labels.save" />
	</html:submit>
</s:form>

