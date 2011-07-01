<div class="pageTitle">
	<s:link href="/admin/person">
		<bean:message key="labels.person" />
	</s:link>
</div>

<s:form styleClass="form">
	<html:errors />

	<html:hidden property="id" />

	<ul>
		<li><label for="personEditCode"><bean:message
					key="labels.code" /> </label><span> <html:text property="code"
					styleId="personEditCode" /> </span>
		</li>
		<li><label><bean:message key="labels.password" /> </label> <span><html:password
					property="password" /> </span></li>

		<li><label><bean:message key="labels.name" /> </label> <span><html:text
					property="name" /> </span></li>
		<li><label><bean:message key="labels.level" /> </label> <span><html:select
					property="level">
					<html:options collection="levels" property="value"
						labelProperty="label" />
				</html:select> </span>
		</li>
		<li><label><bean:message key="labels.mailAddress" /> </label> <span><html:text
					property="mailAddress" /> </span></li>
	</ul>

	<div class="actions">
		<html:submit property="save">
			<bean:message key="labels.save" />
		</html:submit>
	</div>

</s:form>

