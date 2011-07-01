<script type="text/javascript">
	$(function() {
		myweb.board.init();
	});
</script>

<div class="pageTitle">
	<s:link href="/blog/?boardId=${board.id}">
		${board.name}
	</s:link>
</div>

<s:form styleClass="form">
	<html:errors />
	<html:hidden property="id" />
	<html:hidden property="boardId" />

	<ul>
		<li><label><bean:message key="labels.title" /> </label> <span><html:text
					property="title" /> </span></li>
		<li><label><bean:message key="labels.bodyText" /> </label> <span><html:textarea
					property="bodyText"></html:textarea> </span>
		</li>

	</ul>
	<div class="actions">
		<html:submit property="save">
			<bean:message key="labels.save" />
		</html:submit>
	</div>
</s:form>

