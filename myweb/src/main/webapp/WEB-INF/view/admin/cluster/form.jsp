<div>Cluster</div>

<s:form styleClass="form">
	<html:errors />
	<html:hidden property="id" />
	<ul>
		<li><label><bean:message key="labels.code" /> </label> <span><html:text
					property="code" /> </span></li>
		<li><label><bean:message key="labels.name" /> </label> <span><html:text
					property="name" /> </span></li>
	</ul>

	<html:submit property="save">
		<bean:message key="labels.save" />
	</html:submit>
</s:form>

