<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="pageTitle">
	<s:link href="/admin/mailData">
		<bean:message key="labels.mailData" />
	</s:link>
</div>


<div class="navi">
	<a href="create/"><bean:message key="labels.create" /></a>
</div>


<c:forEach items="${mailDatas}" var="md">
	<div class="article">
		<div class="title">
			<a href="edit/?id=${md.id}"> [${md.id}]${md.subject}</a>
<%--			<a href="send/?id=${md.id}">メールおくる</a>  --%>
		</div>
		<div class="bodyText">${f:br(f:h(md.bodyText))}</div>
	</div>
</c:forEach>

<%--
<table class="table">
	<tr>
		<th>edit</th>
		<th>id</th>
		<th>subject</th>
		<th>bodyText</th>
	</tr>
	<c:forEach items="${mailDatas}" var="md">
		<tr>
			<td><a href="edit/?id=${md.id}">edit</a></td>
			<td>${md.id}</td>
			<td>${md.subject}</td>
			<td>${md.bodytext}</td>
		</tr>
	</c:forEach>
</table>

 --%>
