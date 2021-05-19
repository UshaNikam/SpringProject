<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>
	<form name='frm' action='validate' method='POST'>
		<input type='text' name='name' value=''
			style='width: 400px; height: 40px;' /><br>
		<br> <input type='text' name='pass' value=''
			style='width: 400px; height: 40px;' /><br>
		<br> <input type='submit' name='s' value='Login'
			style='width: 400px; height: 40px;' /><br>
		<br> <span style='background-color: red; color: white'>${msg}</span>
	</form>
</body>
</html>
