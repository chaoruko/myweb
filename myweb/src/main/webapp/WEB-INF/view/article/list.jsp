<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script type="text/javascript">
	$(function() {
		myweb.article.init();
	});
</script>
<s:link href="/board"><bean:message key="labels.board" /></s:link>
<div class="pageTitle">${board.name}/${board.entryType}</div>


<c:if test="${loggedIn}">

	<s:form styleClass="form">
		<html:errors />
		<html:hidden property="boardId" />
		<html:hidden property="id" />
		<br>
		<ul>
			<li><label>title</label> <span><html:text
						property="title" /> </span></li>
			<li><label>bodyText</label> <span><html:textarea
						property="bodyText" /> </span></li>
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
<div class="clear">
</div>
<c:forEach items="${articles}" var="a">
	<div class="article">
		<!-- [${a.id}]  -->
		<div class="title">
			<span class="title">${a.title}</span>
		</div>
		<div class="crated">
			<span class="created_by">(${a.createdPerson.name})</span> <span><fmt:formatDate
					value="${a.createdAt}" pattern="yyyy/MM/dd hh:mm" /> </span>
		</div>
		<div class="bodyText">${f:br(f:h(a.bodyText))}</div>
		<input type="hidden" name="articleId" value="${a.id}">
		<c:if
			test="${admin || (loggedIn && (userDto.id == a.createdPersonId || userDto.id == board.adminPersonId) ) }">
			<s:link href="/article/edit?Id=${a.id}">edit</s:link>
		</c:if>
		<span class="loadComment">view comments:</span>
		<div class="comments"></div>
		<s:link href="/comment?articleId=${a.id}">comments</s:link>
	</div>
</c:forEach>

