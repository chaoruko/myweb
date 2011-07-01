<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="pageTitle">Portal Config</div>
<c:if test="${!admin}">
Please login admin
</c:if>

<c:if test="${admin}">

	<div class="navi">
		<a href="create/">create</a>
	</div>


	<table class="table">
		<c:forEach items="${portals}" var="p">
			<tr>
				<td><a href="edit/?id=${p.id}">edit</a>
				</td>
				<td>${p.key}</td>
				<td>${p.keyId}</td>
			</tr>
		</c:forEach>
	</table>


</c:if>
