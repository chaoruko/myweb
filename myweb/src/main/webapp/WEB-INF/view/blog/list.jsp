<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script type="text/javascript">
	$(function() {
		myweb.article.init();
	});
</script>
<s:link href="/board">
	<bean:message key="labels.back" />
</s:link>
<div class="pageTitle">Blog ${board.name}</div>

 
<c:if test="${loggedIn && board.adminPersonId == userDto.id}">

	<s:form styleClass="form">
		<html:errors />
		<html:hidden property="boardId" />
		<html:hidden property="id" />
		<br>
		<ul>
			<li><label><bean:message key="labels.title" />
			</label> <span><html:text property="title" /> </span></li>
			<li><label><bean:message key="labels.bodyText" />
			</label> <span><html:textarea property="bodyText" /> </span></li>
		</ul>
		<div class="actions">
			<html:submit property="save">
				<bean:message key="labels.save" />
			</html:submit>
			<html:submit property="delete">
				<bean:message key="labels.delete" />
			</html:submit>
		</div>
	</s:form>

</c:if>

<div class="clear"></div>
 

<c:forEach items="${articles}" var="a">
	<div class="article"
		style="margin-top: 20px; border-left: gray solid 1px;">
		<!-- [${a.id}]  -->
		<div
			style="font-weight: bold; border-left: gray solid 10px;border-bottom: gray solid 1px;padding:10px;">
			${a.title}
		</div>
		<div class="crated" style="text-align: right;">

			<c:if
				test="${admin || (loggedIn && (userDto.id == a.createdPersonId || userDto.id == board.adminPersonId) ) }">
				<s:link href="/article/edit?Id=${a.id}">edit</s:link>
			</c:if>
			<span><fmt:formatDate value="${a.createdAt}"
					pattern="yyyy/MM/dd hh:mm" /> </span> <input type="hidden"
				name="articleId" value="${a.id}">

		</div>
		<div class="bodyText" style="margin-left: 10px;line-height: 24px;">${f:br(f:h(a.bodyText))}</div>


	</div>
</c:forEach>

