<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="pageTitle">
	<bean:message key="labels.mailHistories" />
</div>


<table class="table">
	<tr>
		<th>id</th>
		<th>subject</th>
		<th>bodyText</th>
		<th>from</th>
		<th>to</th>
	</tr>
	<c:forEach items="${histories}" var="md">
		<tr>
			<td>${md.id}</td>
			<td>${md.subject}</td>
			<td>${md.bodytext}</td>
			<td>${md.fromAddress}</td>
			<td>${md.toAddress}</td>
		</tr>
	</c:forEach>
</table>

