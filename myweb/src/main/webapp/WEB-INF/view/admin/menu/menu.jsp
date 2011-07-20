<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="pageTitle">
	<bean:message key="labels.admin" />
	<bean:message key="labels.menu" />
</div>

<ul>
	<li><s:link href="/admin/mailHistories">
			<bean:message key="labels.mailHistories" />
		</s:link>
	</li>
	<li><s:link href="/admin/mailData">
			<bean:message key="labels.mailData" />
		</s:link>
	</li>
	<li><s:link href="/admin/person">
			<bean:message key="labels.person" />
		</s:link>
	</li>
	<li><s:link href="/admin/cluster">
			<bean:message key="labels.cluster" />,<bean:message
				key="labels.member" />
		</s:link>
	</li>
	<li><s:link href="/admin/portalConfig">
			<bean:message key="labels.portalConfig" />
		</s:link>
	</li>
	<li><s:link href="/admin/board">
			<bean:message key="labels.board" />
				&amp;
				<bean:message key="labels.blog" />
		</s:link>
	</li>

</ul>