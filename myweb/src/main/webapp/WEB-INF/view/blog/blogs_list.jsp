<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="pageTitle">
	<s:link href="/blog">
		<bean:message key="labels.blog" />

	</s:link>
</div>

<table class="table">
	<c:forEach items="${blogs}" var="b">
		<tr>

			<td><s:link href="/article/?boardId=${b.id}">${b.name}</s:link>
			</td>
			<td>${b.adminPerson.name}</td>
		</tr>
	</c:forEach>
</table>

