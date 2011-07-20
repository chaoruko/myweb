<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- 
title:${article.title}
 -->
<ul>
<c:forEach items="${comments}" var="comment">
<li>${comment.bodyText}
（${comment.createdPerson.name} &nbsp;<fmt:formatDate value="${comment.createdAt}"
					pattern="yyyy/MM/dd HH:mm" />） 
</li>
</c:forEach>
</ul>
