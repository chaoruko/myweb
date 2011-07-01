<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
title:${article.title}
<c:forEach items="${comments}" var="comment">
${comment.bodyText}
</c:forEach>
