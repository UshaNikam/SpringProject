<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{
  padding:0;
  margin:0;
  height:100%;
  
}
.menu ul{
 list-style:none;
 height:100%;
 
}
.menu ul ul{
transition: all 0.3s;
opacity:0;
position:absolute;
visibility:hidden;
left:90%;
top:-2%;
}
.menu ul li:hover > ul{
opacity:1;
visibility:visible;
color:red;
}

.menu ul li{
 padding:15px;
 position:relative;
 width:200px;
 height:100%;
 background-color:lightblue;

}
.menu ul li a{
color:red;
text-decoration:none;
}
</style>
</head>
<body>
<div class="menu">
  <ul>
  <li>COURSE MASTER
  <ul>
  <li><a href="newcourse">ADD NEW COURSE</a></li>
  <li><a href="viewcourse">VIEW ALL COURSE</a></li>
  </ul>
  <li>TOPIC MASTER
  <ul>
  <li><a href="addTopic">ADD NEW TOPIC</a></li>
  <li><a href="">VIEW ALL TOPIC</a></li>
  </ul>
  <li>STUDY MATERIAL MASTER
  <ul>
  <li><a href="">ADD STUDY MATERIAL</a></li>
  <li><a href="">VIEW STUDY MATERIAL</a></li>
  </ul>
 </ul>
</div>
</body>
</html>