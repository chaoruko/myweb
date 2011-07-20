<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script type="text/javascript">
	$(function() {
		myweb.admin.member.init();
	});
</script>

<div class="pageTitle">
	<s:link href="/admin/cluster">
		<bean:message key="labels.member" />
		<bean:message key="labels.cluster" />
	</s:link>
</div>

<s:form styleClass="form">
	<html:errors />
	<html:hidden property="id" />
	<html:hidden property="clusterId" />

	<table class="form">
		<tr>
			<td class="hd"><bean:message key="labels.cluster" /></td>
			<td>${cluster.name}</td>
		</tr>
		<tr>
			<td class="hd"><bean:message key="labels.person" /></td>
			<td><html:select property="personId"
					styleId="adminClusterMemberListFormPersonId"></html:select></td>
		</tr>
	</table>


	<div class="actions">
		<html:submit property="save">
			<bean:message key="labels.save" />
		</html:submit>
	</div>

</s:form>


<div class="list">
	<table class="table">
		<tr>
			<th><bean:message key="labels.edit" /></th>
			<th><bean:message key="labels.id" /></th>
			<th><bean:message key="labels.member" /></th>
		</tr>
		<c:forEach items="${members}" var="mem">
			<tr>
				<td><a href="edit/?id=${mem.id}"><bean:message
							key="labels.edit" /> </a></td>
				<td>${mem.id}</td>
				<td>${mem.person.name}</td>
			</tr>
		</c:forEach>
	</table>
</div>
