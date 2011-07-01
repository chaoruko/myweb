<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="pageTitle">
	<bean:message key="labels.person" />
</div>
<c:if test="${!admin}">
Please login admin
</c:if>

<c:if test="${admin}">

	<div class="navi">
		<a href="create/"><bean:message key="labels.create" /> </a>
	</div>


	<table class="table">
		<tr>
			<th><bean:message key="labels.edit" /></th>
			<th><bean:message key="labels.id" /></th>
			<th><bean:message key="labels.code" /></th>
			<th><bean:message key="labels.name" /></th>
			<th><bean:message key="labels.level" /></th>
		</tr>
		<c:forEach items="${persons}" var="person">
			<tr>
				<td><a href="edit/?id=${person.id}"><bean:message
							key="labels.edit" /> </a></td>
				<td>${person.id}</td>
				<td>${person.code}</td>
				<td>${person.name}</td>
				<td>${person.level}</td>
			</tr>
		</c:forEach>
	</table>


</c:if>
