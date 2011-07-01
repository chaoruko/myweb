<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="pageTitle">
	<s:link href="/board">
		<bean:message key="labels.board" />
		&amp;
		<bean:message key="labels.blog" />
	</s:link>
</div>


<c:if test="${admin}">
	<div class="page-navi">
		<s:link href="create">
			<bean:message key="labels.create" />
		</s:link>
	</div>


</c:if>



<ul>
	<c:forEach items="${boards}" var="b">
		<li><s:link href="/article/?boardId=${b.id}">${b.name}</s:link> <c:if
				test="${admin}">
（${b.adminPerson.name}）
<s:link href="edit?id=${b.id}">
					<bean:message key="labels.edit" />
				</s:link>
			</c:if></li>
	</c:forEach>
</ul>

<ul>
	<c:forEach items="${blogs}" var="b">
		<li><s:link href="/blog/?boardId=${b.id}">${b.name}</s:link> <c:if
				test="${admin}">
（${b.adminPerson.name}）
<s:link href="edit?id=${b.id}">
					<bean:message key="labels.edit" />
				</s:link>
			</c:if></li>
	</c:forEach>
</ul>

