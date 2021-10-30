<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="springmvc.model.Employees"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

    <title>Medicine List</title>
  </head>
  <body>
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="/DBMS">Medicos</a>
  
</nav>  
    
<div class="jumbotron">
<div class="container text-center">
  <h7 class="display-4">List of All Medicines</h7>
   <hr class="my-4">
   </div>
<c:forEach begin="0" end="${size}" var="med" items="${med}">

        <div class="card mb-2 bg-dark text-white" style="max-width: 1500px;">
  <div class="row no-gutters">
    <div class="col-md-4">
      <img src="https://i.ibb.co/jMCz1gb/gvg.jpg" class="card-img" alt="...">
    </div>
    <div class="col-md-8">
      <div class="card-body">
        <h5 class="card-title">${med.medicine_Name}</h5>
        <p class="card-text">MedicineID : ${med.medicineId}</p>
        <p class="card-text">Company : ${med.company_Name}</p>
        <p class="card-text">Expiry Date : ${med.expiry_date}</p>
        <p class="card-text">Price : ${med.price}</p>
        
        <a class="btn btn-outline-info" data-toggle="collapse" href="#col" role="button" aria-expanded="false" aria-controls="collapseExample">
    				Add to cart
  			</a><br><br>
  			<div class="collapse" id="col">
			<div class="container text-center">
			<form action="addtocart/${med.medicineId}/${med.medicine_Name}/${med.storeID}" method="post">
				<div class="input-group mb-3">
  					<input type="integer" class="form-control" placeholder="Quantity" aria-label="Enter EmployeeID" aria-describedby="button-addon2" name="quantity">
  					<div class="input-group-append">
    					<button type="submit" class="btn btn-secondary">Add</button>
  					</div>
				</div>
				</form>
			</div>
			</div>
        
      </div>
    </div>
  </div>
</div>
     
</c:forEach>
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
