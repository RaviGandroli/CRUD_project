<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Emp Management system</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="home">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="addEmp">Add Emp</a>
        </li>
        
            
          
      </ul>
     
    </div>
  </div>
</nav>

<div class="container mt-5">
<div class="row">
<div class="col-md-6 offset-md-3">
<div class="card">
<div class="card-header text-center">
<h3>Add Emp</h3>
<c:if test="${not empty msg }">
<h5 class="text-success">${msg }</h5>
<c:remove var="msg"/>
</c:if>
</div>
<div class="card-body">
<form action="createEmp" method="post" >
    <div class="mb-3">
       <label>Enter Full Name</label>
       <input type="text" name="fullName" class="form-control">
       
        <label>Enter Address </label>
       <input type="text" name="address" class="form-control">
       
        <label>Enter email </label>
       <input type="email" name="email" class="form-control">
       
        <label>Enter password </label>
       <input type="password" name="password" class="form-control">
       
        <label>Enter Designation </label>
       <input type="text" name="designation" class="form-control">
       
        <label>Enter salary </label>
       <input type="text" name="salary" class="form-control">
       
    </div>
    <button class="btn btn-primary">Submit</button>
</form>
</div>

</div>
</div>
</div>
</div>



</body>
</html>