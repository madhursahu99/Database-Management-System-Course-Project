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

    <title>Medicos</title>
  </head>
  <body>
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="/DBMS">Medicos</a>
  
</nav>  
    <div class="container mt-5 bg-dark text-white">
    
    <div class="container mt-5 text-center">
    <h2>Medicine Addition Form</h2>
    </div>
    
    <div class="container mt-5">
    
    
    	<form action="addmed" method="post">
  		
  		<div class="form-group">
    		<label for="Med_name">Medicine Name</label>
    		<input 	type="text" 
    				class="form-control" 
    				id="FirstName" 
    				aria-describedby="emailHelp" 
    				placeholder="Enter Medicine Name here" 
    				name="medicine_Name"
    				required>
    		
  		</div>
  		
  		<div class="form-group">
    		<label for="LastName">Company Name</label>
    		<input 	type="text" 
    				class="form-control" 
    				id="LastName" 
    				aria-describedby="emailHelp" 
    				placeholder="Enter company Name here" 
    				name="Company_Name"
    				required>
    		
  		</div>
  		
  		<div class="form-group">
    		<label for="mfg_date">Manufacturing Date</label>
    		<input 	type="text" 
    				class="form-control" 
    				id="joining_date" 
    				aria-describedby="emailHelp" 
    				placeholder="Enter Manufacturing Date here (Format -> yyyy-mm-dd)" 
    				name="mfg_date"
    				required>
    		
  		</div>
  		
  		<div class="form-group">
    		<label for="mfg_date">Expiry Date</label>
    		<input 	type="text" 
    				class="form-control" 
    				id="joining_date" 
    				aria-describedby="emailHelp" 
    				placeholder="Enter Expiry Date here (Format -> yyyy-mm-dd)" 
    				name="Expiry_date"
    				required>
    		
  		</div>
  		
  		<div class="form-group">
    		<label for="LastName">Provider ID</label>
    		<input 	type="number" 
    				class="form-control" 
    				id="LastName" 
    				aria-describedby="emailHelp" 
    				placeholder="Enter ProviderID here" 
    				name="ProviderID"
    				required>
    		
  		</div>
  		
  		<div class="form-group">
    		<label for="LastName">Store ID</label>
    		<input 	type="number" 
    				class="form-control" 
    				id="LastName" 
    				aria-describedby="emailHelp" 
    				placeholder="Enter StoreID here" 
    				name="StoreID"
    				required>
    		
  		</div>
  		
  		<div class="form-group">
    		<label for="LastName">Price</label>
    		<input 	type="integer" 
    				class="form-control" 
    				id="LastName" 
    				aria-describedby="emailHelp" 
    				placeholder="Enter Price here" 
    				name="Price"
    				required>
    		
  		</div>
  		
  		<div class="form-group">
    		<label for="salary">Recommended Dosage per day</label>
    		<input 	type="integer" 
    				class="form-control" 
    				id="salary" 
    				aria-describedby="emailHelp" 
    				placeholder="Enter dosage here" 
    				name="Dose_per_day"
    				required>
    		
  		</div>
  		<div class="container text-center">
  		<button type="submit" class="btn btn-success">Add Medicine</button><br><br>
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