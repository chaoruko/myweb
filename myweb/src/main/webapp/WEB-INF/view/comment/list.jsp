<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script type="text/javascript">
	$(function() {
		myweb.board.init();
	});
</script>

<div>${board.name}</div>
<div>${article.title}</div>
<div style="font-size: 10pt;">${f:br(f:h(article.bodyText))}</div>

<c:if test="${loggedIn}">

	<div>${msg}</div>
	<s:form>
		<html:errors />
		<html:hidden property="articleId" />
		<html:hidden property="id" />
		<br>
comment:
<html:textarea property="bodyText" />

		<input type="submit" name="save" value="Save">
		<input type="submit" name="delete" value="Delete">
	</s:form>

</c:if>

<c:forEach items="${comments}" var="cm">
	<div class="comment">
		<div class="bodyText">
			${f:br(f:h(cm.bodyText))}<span class="created_by">(${cm.createdPerson.name})</span>
		</div>


	</div>
</c:forEach>
