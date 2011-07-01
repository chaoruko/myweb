<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="pageTitle">
	<s:link href="/admin/cluster">
		<bean:message key="labels.member" />
		<bean:message key="labels.cluster" />
	</s:link>
</div>
<c:if test="${!admin}">
Please login admin
</c:if>

<c:if test="${admin}">


	<s:form styleClass="form">
		<html:errors />
		<html:hidden property="id" />
		<html:hidden property="clusterId" />

		<ul>
			<li><label><bean:message key="labels.cluster" />
			</label> <span>${cluster.name} </span>
			</li>
			<li><label> <bean:message key="labels.person" /> </label> <span>
					<html:select property="personId">
						<html:option value=""></html:option>
						<html:options collection="persons" property="id"
							labelProperty="name" />
					</html:select> </span>
			</li>
		</ul>


		<div class="actions">
			<html:submit property="save">
				<bean:message key="labels.save" />
			</html:submit>
		</div>

	</s:form>



	<table class="table">
		<tr>
			<th><bean:message key="labels.edit" />
			</th>
			<th><bean:message key="labels.id" />
			</th>
			<th><bean:message key="labels.member" />
			</th>
		</tr>
		<c:forEach items="${members}" var="mem">
			<tr>
				<td><a href="edit/?id=${mem.id}"><bean:message
							key="labels.edit" /> </a>
				</td>
				<td>${mem.id}</td>
				<td>${mem.person.name}</td>
			</tr>
		</c:forEach>
	</table>


</c:if>
