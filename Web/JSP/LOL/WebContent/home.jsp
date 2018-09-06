<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>list</title>
	<meta charset="UTF-8">

	<!-- Required meta tags -->
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>

<style>

	.table { background-color: white; }
	.table { font-weight: bold; }
	
</style>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light .table-dark">
  <a class="navbar-brand" href="#">LOL</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="home.do">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="list.do">Notice Board</a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Shop
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="#">Cosmetic</a>
          <a class="dropdown-item" href="#">Fashion</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">Something else here</a>
        </div>
      </li>
      <li class="nav-item">
        <a class="nav-link disabled" href="#">Disabled</a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="text" name="Id" placeholder="Id" aria-label="Id" value="<% if(session.getAttribute("id") != null) out.println(session.getAttribute("id")); %>">
	  <input class="form-control mr-sm-2" type="Password" name="pw" placeholder="Password" aria-label="Password">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit" redirectUrl = "list.do">Login</button> &nbsp;
      
<!--       <button class="btn btn-outline-success my-2 my-sm-0" type="submit" a href="logout.jsp">Logout</button> &nbsp; -->
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit" onclick="javascript:window.location='join.jsp'; return false;">Join</a></button> &nbsp;&nbsp;&nbsp;
      <!-- target="_blank" window.open(this.href, '', 'width=400, height=430');  -->
      
        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>
 	
 	<!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

	<center>
	<table width="800" class="table table-striped">
		<thead class="thead-dark">
		<tr>
			<th scope="col"></th>
		</tr>
	</table>
	<table border=1 bordercolor=black cellpadding=0 cellspacing="0" width="1000" height="750">
		<tr>
			<td colspan=2 width=100% height=150>
			<img src=".img/beach.jpg" width=1000 height=150>
			<img src=".img/ra.jpg" width=1000 height=150>
			</td>
		</tr>
	</table>
	</center>

</body>
</html>