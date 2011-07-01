<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<tiles:insert template="/WEB-INF/view/common/layout.jsp" flush="true" >
<tiles:put name="title" value="Article"/>
<tiles:put name="content" value="/WEB-INF/view/admin/article/list.jsp" />
</tiles:insert>

