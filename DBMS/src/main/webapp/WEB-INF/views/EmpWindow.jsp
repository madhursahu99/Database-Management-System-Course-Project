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

    <title>Employee Module</title>
  </head>
  <body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="/DBMS">Medicos</a>
  
</nav>  
	<div class="jumbotron">
  		<h1 class="display-4 text-center">Welcome to Employee's Module</h1>
  		<p class="lead text-center">This is a module specially designed for the employees.It has all the necessary tools to manage the medicines.</p>
  		<hr class="my-4">
  		<div class="container text-center">
  			<a class="btn btn-outline-info btn-lg center" href="medaddform" role="button">Add New Medicine</a><br><br>
  			<a class="btn btn-outline-info btn-lg" href="showallmed" role="button">View All Medicine</a><br><br>
  			
  			
  			<a class="btn btn-outline-info btn-lg" data-toggle="collapse" href="#upd_price" role="button" aria-expanded="false" aria-controls="collapseExample">
    				Update Price
  			</a><br><br>
  			<div class="collapse" id="upd_price">
			<div class="card text-center">
			<div class="card card-body">
					<form action="upd_price" method="post">
  						<div class="form-row align-items-center">
    						<div class="col-auto">
      							<label class="sr-only" for="inlineFormInput">MedicineID</label>
      							<input type="integer" class="form-control mb-2" id="id" placeholder="Enter MedicineID" name="id">
    						</div>
    						<div class="col-auto">
     							 <label class="sr-only" for="inlineFormInputGroup">New Price</label>
      								<div class="input-group mb-2">
        								<div class="input-group-prepend">
       	 									</div>
        							<input type="integer" class="form-control" id="salary" placeholder="Enter New Price" name="price">
      						</div>
    						</div>
    
    						<div class="col-auto">
     							 <button type="submit" class="btn btn-secondary">Update Price</button>
    						</div>
  						</div>  							
					</form>
 			</div>
 			</div>
			</div>
  			
  			<a class="btn btn-outline-info btn-lg" data-toggle="collapse" href="#storeno" role="button" aria-expanded="false" aria-controls="collapseExample">
    				View Medicine by Store
  			</a><br><br>	
			<div class="collapse" id="storeno">
			<div class="container text-center">
			<form action="showallmedbs" method="post">
				<div class="input-group ">
  					<select class="custom-select" id="inputGroupSelect04" aria-label="Example select with button addon" name="id">
    					<option selected>Select store</option>
    					<option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option>
        				<option value="5">5</option><option value="5">6</option><option value="7">7</option><option value="8">8</option>
      					<option value="9">9</option><option value="10">10</option><option value="11">11</option><option value="12">12</option>
      					<option value="13">13</option><option value="14">14</option><option value="15">15</option><option value="16">16</option>
      					<option value="17">17</option><option value="18">18</option><option value="19">19</option><option value=20">20</option>
    
  					</select>
  					<div class="input-group-append">
    					<button type="submit" class="btn btn-secondary">View Store Medicines</button>
  					</div>
				</div>
				</form>
			</div>
			</div>
  			
  			
  			
  			<a class="btn btn-outline-info btn-lg" data-toggle="collapse" href="#searchbyid" role="button" aria-expanded="false" aria-controls="collapseExample">
    				Search Medicine by ID
  			</a><br><br>
  			<div class="collapse" id="searchbyid">
			<div class="container text-center">
			<form action="searchmedbyid" method="post">
				<div class="input-group mb-3">
  					<input type="integer" class="form-control" placeholder="Enter EmployeeID" aria-label="Enter EmployeeID" aria-describedby="button-addon2" name="id">
  					<div class="input-group-append">
    					<button type="submit" class="btn btn-secondary">Search Medicine</button>
  					</div>
				</div>
				</form>
			</div>
			</div>
  			
  			<a class="btn btn-outline-info btn-lg" data-toggle="collapse" href="#delbyid" role="button" aria-expanded="false" aria-controls="collapseExample">
    				Delete Medicine by ID
  			</a><br><br>
  			<div class="collapse" id="delbyid">
			<div class="container text-center">
			<form action="del_med" method="post">
				<div class="input-group mb-3">
  					<input type="integer" class="form-control" placeholder="Enter EmployeeID" aria-label="Enter EmployeeID" aria-describedby="button-addon2" name="id">
  					<div class="input-group-append">
    					<button type="submit" class="btn btn-secondary">Delete Medicine</button>
  					</div>
				</div>
				</form>
			</div>
			</div>
  			
  			<a class="btn btn-outline-info btn-lg" href="storeorders" role="button">View Orders</a><br><br>
  			
  			<a class="btn btn-outline-info btn-lg" href="updateempprofile" role="button">Update Profile</a><br><br>
  			
  			<a class="btn btn-danger btn-lg" href="emplogout" role="button">Logout</a><br><br>
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