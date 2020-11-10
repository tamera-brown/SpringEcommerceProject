<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Log In</title>
<link rel="stylesheet" href="stylesheet.css">
</head>
<body >
<div class="content">
<h1>Please log in or <a href ="register.jsp">register</a></h1>
<div class="loginDiv">
	<p>Customer Log In</p>
	<form action="/userlogin" method="post" ><!-- This is for customer login -->
		<label for = "username">Username: </label>
		<input type="text" name="username" required><br/>
		<label for = "password">Password: </label>
		<input type="password" name="password" required><br/>
		<button type="submit">Log In</button>
	</form>
</div>

<div class="loginDiv">
	<p>Admin Log In</p>
	<form action="/adminlogin" method="post"><!-- This is for admin login -->
		<label for = "username">Username: </label>
		<input type="text" name="username" required><br/>
		<label for = "password">Password: </label>
		<input type="password" name="password" required><br/>
		<button type="submit">Log In</button>
	</form>
</div>
<p><a href ="adminhome.jsp">Admin skip log in, delete this before presentation</a></p>
<p><a href ="customerhome.jsp">Customer skip log in, delete this before presentation</a></p>

</div>
</body>
</html>
