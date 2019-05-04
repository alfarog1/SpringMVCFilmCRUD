<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>IMDB-SD</title>
</head>
<body>
	<div class="container">
		<form action="findFilmId.do" method="GET">
			<label for="filmId">Film by ID:</label><input type="text" name="filmId"><br />
			<input type="submit" value="Find by ID">
		</form>
		
		<form action="searchFilm.do" method="GET">
			<label for="searchTerm">Film by Keyword:</label><input type="text" name="searchTerm"><br />
			<input type="submit" value="Find by Keywords">
		</form>

		<form action="createFilm.do" method="POST">
			<label for="film">Add Film:</label><input type="text" name="film"><br />
			<input type="submit" value="Add Film">

		</form>
	</div>





</body>
</html>