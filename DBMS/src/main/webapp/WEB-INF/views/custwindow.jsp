<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

    <title>Customer Module</title>
  </head>
  <body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="/DBMS">Medicos</a>
  
</nav>  
	<div class="jumbotron">
  		<h1 class="display-4 text-center">Welcome to Customer's Module</h1>
  		<p class="lead text-center">This is a module specially designed for the customers.It has all the necessary tools to view and purchase the medicines.</p>
  		<hr class="my-4">
  		<div class="container text-center">
  			<a class="btn btn-outline-info btn-lg" href="showallmedc" role="button">View All Medicines</a><br><br>
  			<a class="btn btn-outline-info btn-lg" href="showstores" role="button">View All Stores</a><br><br>
  			<a class="btn btn-outline-info btn-lg" href="complaint_form" role="button">Register a Complaint</a><br><br>
  			<a class="btn btn-outline-info btn-lg" href="viewcart" role="button">View Cart</a><br><br>
  			<a class="btn btn-outline-info btn-lg" href="vieworders" role="button">View Orders</a><br><br>
  			<a class="btn btn-outline-info btn-lg" href="upd_profile" role="button">Update Profile</a><br><br>
  			<a class="btn btn-outline-info btn-lg" href="addaddressf" role="button">Add Address</a><br><br>
  			<a class="btn btn-outline-info btn-lg" href="updaddressf" role="button">Update Address</a><br><br>
  			
  			
  			
  			
  			<a class="btn btn-outline-info btn-lg" data-toggle="collapse" href="#searchbyid" role="button" aria-expanded="false" aria-controls="collapseExample">
    				Search Medicine by ID
  			</a><br><br>
  			<div class="collapse" id="searchbyid">
			<div class="container text-center">
			<form action="searchmedebyid" method="post">
				<div class="input-group mb-3">
  					<input type="integer" class="form-control" placeholder="Enter EmployeeID" aria-label="Enter EmployeeID" aria-describedby="button-addon2" name="id">
  					<div class="input-group-append">
    					<button type="submit" class="btn btn-secondary">Search Medicine</button>
  					</div>
				</div>
				</form>
			</div>
			</div>
  			
  			
  			<a class="btn btn-danger btn-lg" href="customerlogout" role="button">Logout</a><br><br>
  		</div>
	</div>

    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>

    <!-- Option 2: jQuery, Popper.js, and Bootstrap JS
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
    -->
  </body>
</html>