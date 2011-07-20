<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="pageTitle"><bean:message key="labels.home" /></div>


<%--
<c:forEach items="${boards}" var="b">
	<br>${b.name}
</c:forEach>
 --%>


<c:forEach items="${articles}" var="ac">
	<c:if test="${ac.board != null}">
		<div>${ac.board.name}</div>
	</c:if>

	<div class="article">
		<div style="font-weight: bold;">${ac.title}</div>
		<div class="bodyText">${ac.bodyText}</div>
	</div>
</c:forEach>
