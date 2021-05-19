<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.container{
background-color:red;
border-radius:10px;
margin-left:35%;
margin-right:25%;
}
</style>

</head>
<body>
<jsp:include page="master.jsp"></jsp:include>
<div class="container">
<center><h2>ADD NEW TOPIC</h2></center>
<form name="frm" action="topicadd" method="POST">
<center>
<input type="text" name="topicname" value="" placeholder="Enter topic name"/><br><br>
<input type="text" name="format" value="" placeholder="Enter topic format"/><br><br>
<input type="submit" name="s" value="Add Topic" />
</center>
</div>
</form>
</body>
</html>