<div class="inner">
	<div class="pageTitle">
		<s:link href="/admin/mailData">
			<bean:message key="labels.mailData" />
		</s:link>
	</div>


	<s:form styleClass="form">
		<html:errors />

		<html:hidden property="id" />

		<ul>
			<li><label><bean:message key="labels.subject" /> </label> <span><html:text
						property="subject" styleClass="text" /> </span></li>
			<li><label><bean:message key="labels.bodyText" /> </label> <span><html:textarea
						property="bodyText" styleClass="textarea" /> </span></li>
		</ul>

		<html:submit property="save">
			<bean:message key="labels.save" />
		</html:submit>
		<html:submit property="send">
			<bean:message key="labels.send" />
		</html:submit>
	</s:form>

</div>
