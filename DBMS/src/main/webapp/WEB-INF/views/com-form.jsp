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

    <title>Complaint Form</title>
  </head>
  <body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="/DBMS">Medicos</a>
 
</nav>  
    
    <div class="container mt-5 bg-dark text-white">
    <div class="container mt-5 text-center">
    <br>
    <h2>Complaint Registration Form </h2>
    </div>
    <div class="container mt-5">
    
    	<form action="complaint" method="post">
    	
  		
  		<div class="form-group">
    		<label for="Cid">Order ID</label>
    		<input 	type="int" 
    				class="form-control" 
    				id="FirstName" 
    				aria-describedby="emailHelp" 
    				placeholder="Enter OrderId here" 
    				name="OrderID"
    				required>
    		
  		</div>
  		
  		<div class="form-group">
    		<label for="gender">Date</label>
    		<input 	type="text" 
    				class="form-control" 
    				id="gender" 
    				aria-describedby="emailHelp" 
    				placeholder="Enter Date here" 
    				name="Complaint_Date"
    				required>
    		
  		</div>
  		
  		<div class="form-group">
    		<label for="gender">Description</label>
    		<input 	type="text" 
    				class="form-control" 
    				id="gender" 
    				aria-describedby="emailHelp" 
    				placeholder="Enter Complaint Description here" 
    				name="Description"
    				required>
    		
  		</div>
  		
  		<br>
  		<div class="container text-center">
  		<button type="submit" class="btn btn-success">Register Complaint</button>
    	</div>
    	</form><br><br>
    
    </div></div>
    

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