<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="master.jsp"></jsp:include>

<br><br>
<!-- <form name='frm' action='finalupdate' method='POST'> -->
<form name='frm' action='saverecord' method='POST'>
        
             
		<%-- <input type='hidden' name='id' value='${id}' --%>
		
		<input type='text' name='id' value='${id}'
		
			style='width: 400px; height: 40px;' placeholder='Enter the Name'/><br>
		<input type='text' name='name' value='${n}'
			style='width: 400px; height: 40px;' placeholder='Enter the Name'/><br>
		<br> <input type='text' name='email' value='${e}'
			style='width: 400px; height: 40px;'  placeholder='Enter the Email'/><br>
		<br>
		  <input type='text' name='contact' value='${c}' style='width:400px;height:40px;' placeholder='Enter the Contact'/><br><br>
		  
		<!--  <input type='submit' name='s' value='Final Update' -->
		 
		  <input type='submit' name='s' value='Add New Record'
			style='width: 400px; height: 40px;' /><br>
		<br> <span style='background-color: red; color: white'>${msg}</span>
	</form>
</body>
</html>