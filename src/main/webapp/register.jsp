<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
<h1>Register User</h1>
	
<form action="/registeruser" method="post">
	<label for = "username">Username: </label>
	<input type="text" name="username" required><br/>
	<label for = "name">Full Name: </label>
	<input type="text" name="name" required><br/>
	<label for = "password">Password: </label>
	<input type="password" name="password" required><br/>
	<label for = "email">Email: </label>
	<input type="text" name="email" required><br/>
	<button type="submit">Register</button>
</form>
<a href="index.jsp">Log In</a>
</body>
</html>