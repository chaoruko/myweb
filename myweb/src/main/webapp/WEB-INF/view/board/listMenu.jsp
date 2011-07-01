<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<c:forEach items="${boards}" var="b">
	<li><s:link href="/article/?boardId=${b.id}">${b.name}</s:link>
	</li>
</c:forEach>
