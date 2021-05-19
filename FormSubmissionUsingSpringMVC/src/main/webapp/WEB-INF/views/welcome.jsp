<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- <h1>Welcome Page Application</h1> -->
<%-- 
<h1>Name is &nbsp;&nbsp;${n}</h1>
<h1>Email is &nbsp;&nbsp;${e}</h1>
<h1>Contact is &nbsp;&nbsp;${c}</h1> --%>

<h1>Name is &nbsp;&nbsp;${r.getName()}</h1>
<h1>Email is &nbsp;&nbsp;${r.getEmail()}</h1>
<h1>Contact is &nbsp;&nbsp;${r.getContact()}</h1>

</body>
</html>

