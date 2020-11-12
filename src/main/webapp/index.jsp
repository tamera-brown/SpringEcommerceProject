<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

 
        
<title>Login</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
  
   
</head>


<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="index.jsp">Furniture Store</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="index.jsp">Login <span class="sr-only">(current)</span></a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="#">About us</a>
      </li>
     <li class="nav-item">
        <a class="nav-link" href="#">Contact us</a>
      </li>
         
    </ul>
    
  </div>
</nav>
<body>
<h1>Login</h1>


	<p>Customer Log In</p>
	<form action="/userlogin" method="post"><!-- This is for customer login -->
	
	 <div class="form-group">
		<label for = "username">Username: </label>
		<input type="text" class="form-control" name="username" required>
		</div>
		<div class="form-group">
		<label for = "password">Password: </label>
		<input type="password" class="form-control" name="password" required>
		</div>
		<button type="submit"class="btn btn-default" onclick="location.href = 'customerhome.jsp';" >Log In</button>
	</form>
<br/>


	<p>Admin Log In</p>
	<form action="/adminlogin" method="post"><!-- This is for admin login -->
	<div class="form-group">
		<label for = "username">Username: </label>
		<input type="text" class="form-control" name="username" required>
		</div>
		<div class="form-group">
		<label for = "password">Password: </label>
		<input type="password" class="form-control" name="password" required>
		</div>
		<button type="submit"class="btn btn-default" onclick="location.href = 'adminhome.jsp';">Log In</button>
	</form>
	<br/>

<a href ="register.jsp">Don't have an Account? Register now</a><br/>

<a href ="adminhome.jsp">Admin skip log in, delete this before presentation</a><br/>
<a href ="customerhome.jsp">Customer skip log in, delete this before presentation</a>


</body>
</html>