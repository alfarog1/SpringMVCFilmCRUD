<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New Film</title>
</head>
<body>
	<div class="container">
		<form action="findFilmId.do" method="GET">
			<label for="filmId">Film ID:</label><input type="text" name="filmId"><br />
			<input type="submit" value="Find by ID">
		</form>

		<form action="createFilm.do" method="POST">
			<label for="filmId">Film to Add:</label><input type="text" name="filmId"><br />
			<input type="submit" value="Add Film">

		</form>
	</div>
</body>
</html>