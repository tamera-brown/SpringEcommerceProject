<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Details</title>
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
        <a class="nav-link" href="customerhome.jsp">Welcome <%= request.getParameter("username") %> <span class="sr-only">(current)</span></a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="shoppingcart.jsp">Cart</a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="#">About us</a>
      </li>
     <li class="nav-item">
        <a class="nav-link" href="#">Contact us</a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="index.jsp">Logout</a>
      </li>
     
         
    </ul>
    
  </div>
</nav>
<body>
<form method="post">
<h3>Customer Details</h3>
<h5>Basic Info</h5>
  <div class="form-group">
    <label for="CustName">Name</label>
    <input type="text" class="form-control" value=<%= request.getParameter("name") %>>
  
  </div>
  <div class="form-group">
    <label for="CustEmail">Email</label>
    <input type="email" class="form-control" value=<%= request.getParameter("email") %> >
  </div>
  <div class="form-group">
    <label for="CustPhoneNum">Phone Number</label>
    <input type="tel" class="form-control" pattern="^\\(\\d{3}\\)\\s?\\d{3}-\\d{4}$" placeholder="(xxx) xxx-xxxx" required >
  </div>
  <h5>Billing Info</h5>
  <div class="form-group">
    <label for="CustAddress">Street Address</label>
    <input type="tel" class="form-control" pattern="^\\d+ [A-Z][a-z]* (Street|Avenue)" placeholder="Enter Street Address" required >
     <small id="addresslHelp" class="form-text text-muted">ex. 10 Water Street</small>
  </div>
  <div class="form-group">
    <label for="CustCity">City</label>
    <input type="tel" class="form-control" pattern="[A-Z][a-z]*" placeholder="Enter City" required >
  </div>
   <div class="form-group">
    <label for="CustState">State</label>
    <input type="tel" class="form-control" pattern="[A-Z]{2}" placeholder="Enter State" required >
    <small id="emailHelp" class="form-text text-muted">ex. MD </small>
  </div>
   <div class="form-group">
    <label for="CustZip">Zip</label>
    <input type="tel" class="form-control" pattern="\\d{5}$" placeholder="Enter Zip" required >
 
  </div>
  <button type="submit" class="btn btn-primary">Checkout</button>
</form>
</body>
</html>