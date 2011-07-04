<script type="text/javascript">
	$(function() {
		myweb.admin.portalConfig.init();
	});
</script>
<div class="pageTitle">
	<bean:message key="labels.person" />
</div>

<s:form styleClass="form">
	<html:errors />

	<html:hidden property="id" />

	<ul>
		<li><label> <bean:message key="labels.key" /> </label> <span>


				<html:select property="key" styleId="portalConfigFormKey">
				</html:select> </span>
		</li>
		<li><label> <bean:message key="labels.keyId" /> </label> <span>
				<html:select property="keyId" styleId="portalConfigFormKeyId">
				</html:select>
		</span>
		</li>
	</ul>

	<html:submit property="save">
		<bean:message key="labels.save" />
	</html:submit>
</s:form>

