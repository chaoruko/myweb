<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<tiles:insert template="/WEB-INF/view/admin/common/layout.jsp" flush="true" >
<tiles:put name="title" value="mailData"/>
<tiles:put name="content" value="/WEB-INF/view/admin/mailData/form.jsp" />
</tiles:insert>



