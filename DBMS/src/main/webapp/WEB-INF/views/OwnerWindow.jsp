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

    <title>Owner Module</title>
  </head>
  <body>
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="/DBMS">Medicos</a>
 
</nav>  
    
	<div class="jumbotron">
  		<h1 class="display-4 text-center">Welcome to Owner's Module</h1>
  		<p class="lead text-center">This is a module specially designed for the owner of the business.It has all the necessary tools to manage the employees.</p>
  		<hr class="my-4">
  		<div class="container text-center">
  		<a class="btn btn-outline-info btn-lg" href="addstoref" role="button">Add Store</a><br><br>
  			<a class="btn btn-outline-info btn-lg center" href="empregform" role="button">Add New Employee</a><br><br>
  			<a class="btn btn-outline-info btn-lg" href="showall" role="button">View All Employees</a><br><br>
  			<a class="btn btn-outline-info btn-lg" href="showcom" role="button">View Complaints</a><br><br>
  			<a class="btn btn-outline-info btn-lg" href="showpha" role="button">View Pharmacists</a><br><br>
  			<a class="btn btn-outline-info btn-lg center" href="pharegform" role="button">Add New Pharmacist</a><br><br>
  			
  			
  			
  			<a class="btn btn-outline-info btn-lg" data-toggle="collapse" href="#updsal" role="button" aria-expanded="false" aria-controls="collapseExample">
    				Update Salary
  			</a><br><br>
  			<div class="collapse" id="updsal">
			<div class="card text-center">
			<div class="card card-body">
					<form action="upd_sal" method="post">
  						<div class="form-row align-items-center">
    						<div class="col-auto">
      							<label class="sr-only" for="inlineFormInput">EmployeeID</label>
      							<input type="integer" class="form-control mb-2" id="id" placeholder="Enter EmployeeID" name="id">
    						</div>
    						<div class="col-auto">
     							 <label class="sr-only" for="inlineFormInputGroup">New Salary</label>
      								<div class="input-group mb-2">
        								<div class="input-group-prepend">
       	 									</div>
        							<input type="text" class="form-control" id="salary" placeholder="Enter New Salary" name="salary">
      						</div>
    						</div>
    
    						<div class="col-auto">
     							 <button type="submit" class="btn btn-secondary">Update Salary</button>
    						</div>
  						</div>  							
					</form>
 			</div>
 			</div>
			</div>
  			
  			<a class="btn btn-outline-info btn-lg" data-toggle="collapse" href="#storeno" role="button" aria-expanded="false" aria-controls="collapseExample">
    				View Employee by Store
  			</a><br><br>	
			<div class="collapse" id="storeno">
			<div class="container text-center">
			<form action="showallbs" method="post">
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
    					<button type="submit" class="btn btn-secondary">View Store Employees</button>
  					</div>
				</div>
				</form>
			</div>
			</div>
  			
  			
  			
  			<a class="btn btn-outline-info btn-lg" data-toggle="collapse" href="#searchbyid" role="button" aria-expanded="false" aria-controls="collapseExample">
    				Search Employee by ID
  			</a><br><br>
  			<div class="collapse" id="searchbyid">
			<div class="container text-center">
			<form action="searchbyid" method="post">
				<div class="input-group mb-3">
  					<input type="integer" class="form-control" placeholder="Enter EmployeeID" aria-label="Enter EmployeeID" aria-describedby="button-addon2" name="id">
  					<div class="input-group-append">
    					<button type="submit" class="btn btn-secondary">Search Employee</button>
  					</div>
				</div>
				</form>
			</div>
			</div>
  			
  			<a class="btn btn-outline-info btn-lg" data-toggle="collapse" href="#delbyid" role="button" aria-expanded="false" aria-controls="collapseExample">
    				Delete Employee by ID
  			</a><br><br>
  			<div class="collapse" id="delbyid">
			<div class="container text-center">
			<form action="del_emp" method="post">
				<div class="input-group mb-3">
  					<input type="integer" class="form-control" placeholder="Enter EmployeeID" aria-label="Enter EmployeeID" aria-describedby="button-addon2" name="id">
  					<div class="input-group-append">
    					<button type="submit" class="btn btn-secondary">Delete Employee</button>
  					</div>
				</div>
				</form>
			</div>
			</div>
  			
  			
  			<a class="btn btn-danger btn-lg" href="ownerlogout" role="button">Logout</a><br><br>
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