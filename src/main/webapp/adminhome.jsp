<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Home</title>
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
        <a class="nav-link" href="adminhome.jsp">Welcome <%= request.getParameter("username") %> <span class="sr-only">(current)</span></a>
      </li>
      
       <li class="nav-item">
        <a class="nav-link" href="index.jsp">Logout</a>
      </li>
     
         
    </ul>
    
  </div>
</nav>
<body>
<h1>Admin Home</h1>

<button class="btn btn-outline-info" onclick="location.href = 'adminproducts.jsp';">Products Page</button>
<button class="btn btn-outline-info" onclick="location.href = 'admincustomers.jsp';">Customer Page</button>

</body>
</html>