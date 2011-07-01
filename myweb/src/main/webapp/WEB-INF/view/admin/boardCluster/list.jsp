<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="title">
	<s:link href="/admin/board">
		<bean:message key="labels.board" />
		<bean:message key="labels.cluster" />
	</s:link>
</div>


${board.name}
<s:form styleClass="form">
	<html:errors />
	<html:hidden property="id" />
	<html:hidden property="boardId" />
	<ul>
		<li><label>cluster</label> <span><html:select
					property="clusterId">
					<html:option value=""></html:option>
					<html:options collection="clusters" property="id"
						labelProperty="name" />
				</html:select> </span></li>
	</ul>


	<html:submit property="save">
		<bean:message key="labels.save" />
	</html:submit>
</s:form>



<table class="table">
	<tr>
		<th><bean:message key="labels.edit" /></th>
		<th><bean:message key="labels.id" /></th>
		<th><bean:message key="labels.name" /></th>
	</tr>
	<c:forEach items="${boardClusters}" var="bc">
		<tr>
			<td><a href="edit/?id=${bc.id}"><bean:message
						key="labels.edit" /> </a></td>
			<td>${bc.id}</td>
			<td>${bc.cluster.name}</td>
		</tr>
	</c:forEach>
</table>


