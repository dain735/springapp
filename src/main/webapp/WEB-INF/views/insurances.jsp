<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
  <title><fmt:message key="title"/></title>
  <style>
*     .error { color: red; } */
</style>
</head>
<body>
<h1><fmt:message key="selectinsurance.heading"/></h1>
  <table width="95%" bgcolor="f8f8ff" border="0" cellspacing="0" cellpadding="5">
    <tr>
      <c:forEach items="${model.insurances}" var="insurance">
      <form:form method="post" commandName="selectInsurance">
      <c:out value="${insurance.insuranceID}"/> <i><c:out value="${insurance.insuranceDescription}"/>
      <input type="hidden" value="${insurance.insuranceID}" name="insurance"></i>
      <input type="submit" value="Hire"></i><br><br>
      </form:form>
    </c:forEach>
    </tr>
  </table>
  <br>
<a href="<c:url value="hello.htm"/>">Home</a>
</body>
</html>