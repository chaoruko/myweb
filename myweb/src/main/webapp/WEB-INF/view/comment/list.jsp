<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script type="text/javascript">
	$(function() {
		myweb.board.init();
	});
</script>

<div><s:link href="/article/?boardId=${board.id}">${board.name}</s:link></div>
<div style="font-weight: bold;">${article.title}</div>
<div style="font-size: 10pt;">${f:br(f:h(article.bodyText))}</div>

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


<table>
	<c:forEach items="${comments}" var="cm">

		<tr>
			<td>${cm.createdPerson.name} <br> ${f:br(f:h(cm.bodyText))}
			</td>
		</tr>


	</c:forEach>
</table>
