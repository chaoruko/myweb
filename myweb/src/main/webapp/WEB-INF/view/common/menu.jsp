<ul>
	<li><s:link href="/menu">
			<bean:message key="labels.menu" />
		</s:link></li>
	<li><s:link href="/portal">
			<bean:message key="labels.portal" />
		</s:link></li>
	<li><s:link href="/board">
			<bean:message key="labels.board" />
		</s:link></li>
</ul>

<c:if test="${admin}">
<br>
<br>
	<ul>
		<li><s:link href="/admin/mailHistories">
				<bean:message key="labels.mailHistories" />
			</s:link></li>
		<li><s:link href="/admin/mailData">
				<bean:message key="labels.mailData" />
			</s:link></li>
		<li><s:link href="/admin/person">
				<bean:message key="labels.person" />
			</s:link></li>
		<li><s:link href="/admin/cluster">
				<bean:message key="labels.cluster" />,<bean:message
					key="labels.member" />
			</s:link></li>
		<li><s:link href="/admin/portalConfig">
				<bean:message key="labels.portalConfig" />
			</s:link></li>
	</ul>
</c:if>
