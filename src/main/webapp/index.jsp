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

	<h2>Please log in or <a href ="register.jsp">register</a></h2>
	
	<div class="loginDiv">
		<h3>Customer Log In</h3>
		<form action="/userlogin" method="post" ><!-- This is for customer login -->
			<label for = "username">Username: </label>
			<input type="text" name="username" autocomplete="off" required><br/>
			<label for = "password">Password: </label>
			<input type="password" name="password" required><br/>
			<button type="submit" style="float:right">Log In</button>
		</form>
	</div>
	
	<div class="loginDiv">
		<h3>Admin Log In</h3>
		<form action="/adminlogin" method="post"><!-- This is for admin login -->
			<label for = "username">Username: </label>
			<input type="text" name="username" autocomplete="off" required><br/>
			<label for = "password">Password: </label>
			<input type="password" name="password" required><br/>
			<button type="submit" style="float:right">Log In</button>
		</form>
	</div>
	
	<p><a href ="adminhome.jsp">Admin skip log in, delete this before presentation</a></p>
	<p><a href ="customerhome.jsp">Customer skip log in, delete this before presentation</a></p>

</div>
</body>
</html>
