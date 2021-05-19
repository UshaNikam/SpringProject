<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
        rel="stylesheet">
 <style>
 .pojo{
    width:50%;
    height:60%;
    background-color:orange;
 }
 </style>
</head>
<body>
     <center>
     <div class="pojo">
     <div>
     <h1>Admin Login</h1></div>
       <form name="frm" action="login" method="POST">
       <div class="form-group>
       <label for="exampleInputEmail">Username </label>
       <input type="text" name="username" class="form-control" id="exampleInputEmail" placeholder="Enter username"><br><br>
       </div>
       <div>
       <label for="exampleInputPassword">Password</label>
       <input type="password" name="password" class=""form-control" id="exampleInputPassword" placeholder="Enter password"><br><br>
       </div>
       <button type="submit" class="btn btn-success" name="s">Log In</button>
       </div>
       </center>
       </form>



      <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
      <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>