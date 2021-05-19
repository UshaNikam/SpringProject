<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="master.jsp"></jsp:include>
<br><br>
<table border='5' align='center' width='60%' >
<tr>
 <th>NAME</th>
 <th>EMAIL</th>
 <th>CONTACT</th>
 <th>DELETE</th>
 <th>UPDATE</th>
</tr>
<c:forEach var="reg" items="${r}">
  <tr>
    <td>${reg.getName()}</td>
    <td>${reg.getEmail()}</td>
    <td>${reg.getContact()}</td>
    <td><a href='del?id=${reg.getId()}'>DELETE</a></td>
    <td><a href='upd?name=${reg.getName()}&email=${reg.getEmail()}&contact=${reg.getContact()}&id=${reg.getId()}'>UPDATE</a></td>
    
  
  </tr>
</c:forEach>
</table>
</body>
</html>