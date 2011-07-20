<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script type="text/javascript">
	$(function() {
		myweb.board.init();
	});
</script>

<div>
	<s:link href="/article/?boardId=${board.id}">${board.name}</s:link>
</div>
<div style="font-weight: bold;margin-top: 5px;">${article.title}</div>
<div style="font-size: 10pt;">${f:br(f:h(article.bodyText))}</div>

<s:form styleClass="form">
	<html:errors />
	<html:hidden property="articleId" />
	<html:hidden property="id" />
	<ul>
		<li><label>comment</label> <span> <html:textarea
					property="bodyText" styleClass="textarea" /> </span></li>
	</ul>

	<div class="actions">
		<input type="submit" name="save" value="Save"> <input
			type="submit" name="delete" value="Delete">
	</div>
</s:form>

<div class="clear"></div>
<table class="table">
	<c:forEach items="${comments}" var="cm">
		<tr>
			<td>${cm.createdPerson.name} <br> ${f:br(f:h(cm.bodyText))}
			</td>
		</tr>
	</c:forEach>
</table>
