<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script type="text/javascript">
	$(function() {
		myweb.article.init();
	});
</script>
<s:link href="/board">
	<bean:message key="labels.board" />
</s:link>
<div class="pageTitle">${board.name}/${board.entryType}</div>

<input type="button" value="Open" id="articleListCmdOpen">
<input type="button" value="Close" id="articleListCmdClose">

<div style="display: none;" id="articleListFormWrap">

	<s:form styleClass="form">
		<html:errors />
		<html:hidden property="boardId" />
		<html:hidden property="id" />
		<%--
		<ul>
			<li><label><bean:message key="labels.title" /> </label> <span><html:text
						property="title" styleClass="text" /> </span>
			</li>
			<li><label><bean:message key="labels.bodyText" /> </label> <span><html:textarea
						property="bodyText" styleClass="textarea" /> </span>
			</li>
		</ul>
		 --%>
		<table class="form">
			<tr>
				<td class="hd"><bean:message key="labels.title" /></td>
				<td><html:text property="title" styleClass="text" /></td>
			</tr>
			<tr>
				<td class="hd"><bean:message key="labels.bodyText" /></td>
				<td><html:textarea property="bodyText" styleClass="textarea" />
				</td>
			</tr>
		</table>
		<div class="clear"></div>
		<div class="actions">
			<html:submit property="save">
				<bean:message key="labels.save" />
			</html:submit>
			<html:submit property="delete">
				<bean:message key="labels.delete" />
			</html:submit>
		</div>
	</s:form>
</div>

<div class="clear"></div>

<c:forEach items="${articles}" var="a">
	<div class="article">
		<!-- [${a.id}]  -->
		<div>
			<span class="title">${a.title}</span>
		</div>
		<div>
			<span class="created_at"><fmt:formatDate
					value="${a.createdAt}" pattern="yyyy/MM/dd hh:mm" /> </span> <span
				class="created_by">${a.createdPerson.name}</span>
			<c:if
				test="${admin || (loggedIn && (userDto.id == a.createdPersonId || userDto.id == board.adminPersonId) ) }">
				<s:link href="/article/edit?Id=${a.id}">
					<bean:message key="labels.edit" />
				</s:link>
			</c:if>
		</div>
		<div class="bodyText">${f:br(f:h(a.bodyText))}</div>

		<div style="text-align: left;">
			<s:link href="/comment?articleId=${a.id}">
				<bean:message key="labels.comment" /><bean:message key="labels.do" />
			</s:link>
		</div>
		<%--
		<div class="comments">
			<ul>
				<c:forEach items="${a.comments}" var="comment">
					<li>${comment.bodyText} （${comment.createdPerson.name} &nbsp;<fmt:formatDate
							value="${comment.createdAt}" pattern="yyyy/MM/dd HH:mm" />）</li>
				</c:forEach>
			</ul>
		</div>
		 --%>
	 
		<input type="hidden" name="articleId" value="${a.id}">
		<span class="loadComment"><bean:message key="labels.comment" /></span>
		<div class="comments"></div>


	</div>
</c:forEach>

