<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="master.jsp"></jsp:include>
<center><h3>COURSE DETAILS</h3></center>
<table border='5' align="center">
<tr>
<th>NAME</th>
<th>DURATION</th>
<th>FEE</th>
</tr>
<c:forEach var="cr" items="${k }">
<tr>
<td>${cr.getName()}</td>
<td>${cr.getDuration()}</td>
<td>${cr.getFee()}</td>
</tr>
</c:forEach>
</table>
</body>
</html>