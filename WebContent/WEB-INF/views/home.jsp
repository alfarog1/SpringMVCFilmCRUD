<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
  <%@include file="stylesheet.css" %>
</style>

<%-- <link href="<c:url value="/WEB-INF/lib/stylesheet.css" />" rel="stylesheet"> --%>
<link href="/WEB-INF/lib/views/stylesheet.css" rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Oswald:400,300,700|EB+Garamond" rel="stylesheet">
<meta charset="UTF-8">
  <!-- Bootstrap CSS File -->
  <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Libraries CSS Files -->
  <link href="lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">

<title>IMDB-SD</title>
</head>

<body>


  <!-- ========== HEADER SECTION ========== -->
  <section id="home" name="home"></section>
  <div id="headerwrap">
    <div class="container">
      <div class="logo">
        <img src="https://raw.githubusercontent.com/alfarog1/SpringMVCFilmCRUD/master/WebContent/WEB-INF/lib/logo.png" width="35%" height="25%">
      </div>
      <div class="row">
              <h1>IMDB - SD</h1>
        <h3>Let's watch a movie...</h3>
        	<!-- <div class="container"> -->
	<div class="all-field-text">
		<form action="findFilmId.do" method="GET">
			<label for="filmId">Film by ID:</label><input type="text" name="filmId" placeholder= "Search by ID..."><br />
			<input type="submit" value="Find by ID">
		</form>
		
		<form action="searchFilm.do" method="GET">
			<label for="searchTerm">Film by Keyword:</label><input type="text" name="searchTerm"   placeholder= "Search by keyword..."><br />
			<input type="submit" value="Find by Keywords">
		</form>

		<form action="add.do" method="GET">
		<!-- 	<label for="film">Add Film:</label><input type="text" name="film"><br /> -->
			<input type="submit" value="Add Film">

		</form>
		</div>
	<!-- </div> -->
        <br>
        <div id="f"></div>
        <div class="col-lg-6 col-lg-offset-3">
        </div>
      </div>
    </div>
    <!-- /container -->
  </div>
  <!-- /headerwrap -->






<!--Nav bar   -->
<!-- <div class="topnav">
  <a class="active" href="#home">Home</a>
  <a href="#about">About</a>
  <a href="#contact">Contact</a>
  <input type="text" placeholder="Search..">
</div> -->

 <div class="header">
	 </div>















</body>
</html>