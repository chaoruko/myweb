<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div>
	<bean:message key="labels.cluster" />
</div>
<c:if test="${!admin}">
Please login admin
</c:if>

<c:if test="${admin}">

	<div>
		<a href="create/"><bean:message key="labels.create" /> </a>
	</div>


	<table class="table">
		<tr>
			<th><bean:message key="labels.edit" /></th>
			<th><bean:message key="labels.id" /></th>
			<th><bean:message key="labels.code" /></th>
			<th><bean:message key="labels.name" /></th>
			<th><bean:message key="labels.member" /></th>
		</tr>
		<c:forEach items="${clusters}" var="cl">
			<tr>
				<td><a href="edit/?id=${cl.id}"><bean:message
							key="labels.edit" /> </a>
				</td>
				<td>${cl.id}</td>
				<td>${cl.code}</td>
				<td>${cl.name}</td>
				<td><s:link href="/admin/clusterMember/?clusterId=${cl.id}">
						<bean:message key="labels.member" />
					</s:link>
				</td>
			</tr>
		</c:forEach>
	</table>

</c:if>
