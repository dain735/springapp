<%@ include file="/WEB-INF/views/include.jsp" %>

<html>
<head>
<title><fmt:message key="title" /></title>
</head>
<body>
	<h1>
		<fmt:message key="heading" />
	</h1>
	<p>
		<fmt:message key="greeting" />
		<c:out value="${model.now}" />
	</p>
	<h3>Client</h3>
	<c:forEach items="${model.clients}" var="client">
		<c:out value="${client.dni}" />
		<i><c:out value="${client.name}" /></i>
		<i><c:out value="${client.accountNumber}" /></i>
		<a href="<c:url value="insurances.htm"/>">Get Insurance</a><br />
		<i><c:out value="${client.insurance.insuranceID}" /></i>
		<i><c:out value="${client.insurance.insuranceDescription}" /></i>
		<br>
		<br>
		<%--       <a href="<c:url value="insurances.htm?clientID=${client.dni}"/>">Get Insurance</a><br><br> --%>
		<br>
	</c:forEach>
	<br>

	<br>
</body>
</html>