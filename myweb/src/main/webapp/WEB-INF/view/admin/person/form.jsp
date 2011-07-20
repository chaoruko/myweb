<div class="pageTitle">
	<s:link href="/admin/person">
		<bean:message key="labels.person" />
	</s:link>
</div>

<s:form styleClass="form">
	<html:errors />

	<html:hidden property="id" />

	<table class="form">
		<tr>
			<td class="hd"><bean:message key="labels.code" />
			</td>
			<td><html:text property="code" styleId="personEditCode"
					styleClass="text" />
			</td>
		</tr>
		<tr>
			<td class="hd"><bean:message key="labels.password" />
			</td>
			<td><html:password property="password" styleClass="text" />
			</td>
		</tr>

		<tr>

			<td class="hd"><bean:message key="labels.name" />
			</td>
			<td><html:text property="name" styleClass="text" />
			</td>
		</tr>
		<tr>

			<td class="hd"><bean:message key="labels.level" />
			</td>
			<td><html:select property="level">
					<html:optionsCollection property="levels" />
				</html:select>
			</td>
		</tr>
		<tr>

			<td class="hd"><bean:message key="labels.mailAddress" />
			</td>
			<td><html:text property="mailAddress" styleClass="text" />
			</td>
		</tr>
	</table>

	<div class="actions">
		<html:submit property="save">
			<bean:message key="labels.save" />
		</html:submit>
	</div>

</s:form>

