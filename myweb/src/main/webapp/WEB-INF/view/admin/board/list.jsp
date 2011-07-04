<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="pageTitle">
	<s:link href="/admin/board">
		<bean:message key="labels.board" />
		&amp;
		<bean:message key="labels.blog" />
	</s:link>
</div>


<div class="page-navi">
	<s:link href="create">
		<bean:message key="labels.create" />
	</s:link>
</div>

<table class="table">
	<tr>
		<th><bean:message key="labels.edit" /></th>
		<th><bean:message key="labels.id" /></th>
		<th><bean:message key="labels.name" /></th>
		<th><bean:message key="labels.admin" /></th>
		<th><bean:message key="labels.entryType" /></th>
		<th><bean:message key="labels.cluster" /></th>
	</tr>
	<c:forEach items="${boards}" var="b">
		<tr>
			<td><s:link href="edit?id=${b.id}">
					<bean:message key="labels.edit" />
				</s:link>
			</td>
			<td>${b.id}</td>
			<td><s:link href="/admin/article/?boardId=${b.id}">${b.name}</s:link>
			</td>
			<td>${b.adminPerson.name}</td>
			<td>${b.entryType}</td>
			<td><s:link href="/admin/boardCluster/?boardId=${b.id}">
					<bean:message key="labels.cluster" />
				</s:link>
		</tr>
	</c:forEach>

</table>

