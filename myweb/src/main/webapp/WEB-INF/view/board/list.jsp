<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="pageTitle">
	<s:link href="/board">
		<bean:message key="labels.board" />

	</s:link>
</div>


<table class="table">
	<c:forEach items="${boards}" var="b">
		<tr>
			<td><s:link href="/article/?boardId=${b.id}">${b.name}</s:link>
			</td>
			<td>${b.adminPerson.name}</td>
		</tr>
	</c:forEach>
</table>
