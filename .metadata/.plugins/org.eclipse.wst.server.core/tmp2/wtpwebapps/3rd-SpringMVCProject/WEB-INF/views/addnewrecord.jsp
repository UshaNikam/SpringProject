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
<form name='frm' action='saverecord' method='POST'>
		<input type='text' name='name' value=''
			style='width: 400px; height: 40px;' placeholder='Enter the Name'/><br>
		<br> <input type='text' name='email' value=''
			style='width: 400px; height: 40px;'  placeholder='Enter the Email'/><br>
		<br>
		  <input type='text' name='contact' value='' style='width:400px;height:40px;' placeholder='Enter the Contact'/><br><br>
		  
		 <input type='submit' name='s' value='Add New Rercord'
			style='width: 400px; height: 40px;' /><br>
		<br> <span style='background-color: red; color: white'>${msg}</span>
	</form>
</body>
</html>