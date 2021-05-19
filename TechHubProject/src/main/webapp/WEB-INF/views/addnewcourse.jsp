<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.container{
 background:orange;
 border-color:black;
 border-radius:10px;
 margin-left:35%;
 margin-right:25%;
 margin-top:-20%;
}
</style>
</head>
<body>
<jsp:include page="master.jsp"></jsp:include>
<div class="container">
  <center>
    <h1>Add New Course</h1>
    <form name="frm" action="addcourse" method="POST">
  <input type="text" name="name" value=""  placeholder="Enter course name"/><br><br>
  <input type="text" name="duration" value=""  placeholder="Enter course duration"/><br><br>
  <input type="text" name="fee" value=""  placeholder="Enter course fee"/><br><br>
  <input type="submit" name="s" value="Add New Course"/>
  </form>
   <span style="background-color:red;color:black;">${msg }</span>
  </center>
  </div>
</body>
</html>