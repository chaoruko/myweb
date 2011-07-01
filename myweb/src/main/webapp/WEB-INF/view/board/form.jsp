<script type="text/javascript">
	$(function() {
		myweb.board.init();
	});
</script>

<div class="pageTitle">
	<s:link href="/board">
		<bean:message key="labels.board" />
	</s:link>
</div>

<s:form styleClass="form" styleId="boardForm">
	<html:errors />
	<html:hidden property="id" />

	<ul>
		<li><label><bean:message key="labels.name" /> </label> <span><html:text
					property="name" /> </span>
		</li>
		<li><label><bean:message key="labels.description" /> </label> <span><html:textarea
					property="description"></html:textarea> </span></li>
		<li><label><bean:message key="labels.adminPerson" /> </label> <span>
				<%--
				<html:select property="adminPersonId">
					<html:option value=""></html:option>
					<html:options collection="persons" property="id"
						labelProperty="name" />
				</html:select> 
				 --%> <html:select property="adminPersonId"
					styleId="boardFormAdminPersonId"></html:select> </span>
		</li>
		<li><label><bean:message key="labels.type" /> </label> <span>
				<%--
				<html:select property="entryType">
					<html:options collection="entryTypes" property="value"
						labelProperty="label" />
				</html:select>
		 --%> <html:select property="entryType" styleId="bordFormEntryType">
				</html:select> </span>
		</li>
	</ul>
	<div class="actions">
		<html:submit property="save">
			<bean:message key="labels.save" />
		</html:submit>
	</div>
</s:form>

