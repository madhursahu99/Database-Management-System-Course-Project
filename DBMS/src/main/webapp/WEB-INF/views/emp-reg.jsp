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

    <title>Employee Registration</title>
  </head>
  <body>
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="/DBMS">Medicos</a>
  
</nav>  
    <div class="container mt-5 bg-dark ">
    <div class="card card-body bg-dark text-white">
    <div class="container mt-5 text-center">
    <h2>Employee Registration Form</h2>
    </div>
    
    <div class="container mt-5 bg-dark">
    
    
    	<form action="addemp" method="post">
  		
  		<div class="form-group">
    		<label for="FirstName">First Name</label>
    		<input 	type="text" 
    				class="form-control" 
    				id="FirstName" 
    				aria-describedby="emailHelp" 
    				placeholder="Enter First Name here" 
    				name="FirstName"
    				required>
    		
  		</div>
  		
  		<div class="form-group">
    		<label for="LastName">Last Name</label>
    		<input 	type="text" 
    				class="form-control" 
    				id="LastName" 
    				aria-describedby="emailHelp" 
    				placeholder="Enter Last Name here" 
    				name="LastName">
    		
  		</div>
  		
  		<div class="form-group">
    		<label for="joining_date">Joining_Date</label>
    		<input 	type="text" 
    				class="form-control" 
    				id="joining_date" 
    				aria-describedby="emailHelp" 
    				placeholder="Enter Joining Date here (yyyy-mm-dd)" 
    				name="joining_date"
    				required>
    		
  		</div>
  		
  		<div class="form-group">
    		<label for="exampleInputEmail1">Email address</label>
    		<input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Email" name="email" required>
  		</div>
  		
  		<div class="form-group">
    		<label for="designation">Designation</label>
    		<input 	type="text" 
    				class="form-control" 
    				id="LastName" 
    				aria-describedby="emailHelp" 
    				placeholder="Enter Employee Designation here" 
    				name="designation"
    				required>
    		
  		</div>
  		
  		<div class="form-group">
    		<label for="LastName">Aadhar Number</label>
    		<input 	type="text" 
    				class="form-control" 
    				id="LastName" 
    				aria-describedby="emailHelp" 
    				placeholder="Enter Employee Aadhar Number here" 
    				name="aadhar_number"
    				required>
    		
  		</div>
  		
  		<div class="form-group">
    		<label for="LastName">Phone Number</label>
    		<input 	type="text" 
    				class="form-control" 
    				id="LastName" 
    				aria-describedby="emailHelp" 
    				placeholder="Enter Employee Phone Number here" 
    				name="phone_number"
    				required>
    		
  		</div>
  		
  		<div class="form-group">
    		<label for="LastName">Store ID</label>
    		<input 	type="integer" 
    				class="form-control" 
    				id="LastName" 
    				aria-describedby="emailHelp" 
    				placeholder="Enter Employee StoreID here" 
    				name="StoreID"
    				required>
    		
  		</div>
  		
  		<div class="form-group">
    		<label for="username">User Name</label>
    		<input 	type="text" 
    				class="form-control" 
    				id="username" 
    				aria-describedby="emailHelp" 
    				placeholder="Enter your UserName here" 
    				name="username"
    				required>
    		
  		</div>
  		
  		<div class="form-group">
    		<label for="userPassword">Password</label>
    		<input 	type="password" 
    				class="form-control" 
    				id="password" 
    				aria-describedby="emailHelp" 
    				placeholder="Enter your Password here" 
    				name="password"
    				required>
    		
  		</div>
  		
  		<div class="form-group">
    		<label for="salary">Salary</label>
    		<input 	type="integer" 
    				class="form-control" 
    				id="salary" 
    				aria-describedby="emailHelp" 
    				placeholder="Enter Salary here" 
    				name="salary"
    				required>
    		
  		</div>
  		<div class="container text-center">
  		<button type="submit" class="btn btn-success">Add Employee</button><br><br>
    	</div>
    	</form>
    
    </div>
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