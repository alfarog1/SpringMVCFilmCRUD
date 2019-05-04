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
		<form action="createFilm.do" method="POST">
			<label for="title">Title:</label><input type="text" name="filmId"><br />
			<label for="title">Description:</label><input type="text" name="description"><br />
			<label for="title">Release Year:</label><input type="text" name="relYear"><br />
			<label for="title">Rental Duration (days):</label><input type="text" name="rDuration"><br />
			<label for="title">Rental Rate:</label><input type="text" name="rRate"><br />
			<label for="title">Film Length (min):</label><input type="text" name="length"><br />
			<label for="title">Replacement Cost:</label><input type="text" name="rCost"><br />
			<label for="title">Rating</label><br>
			<input type="radio" name="rating" value="G"><input type="radio" name="rating" value="PG"><br />
			<input type="radio" name="rating" value="PG13"><input type="radio" name="rating" value="R"><input type="radio" name="rating" value="NC17"><br />
			<label for="title">Special Features</label><br>
			<input type="checkbox" name="specFeat" value="Trailers">Trailers<br />
			<input type="checkbox" name="specFeat" value="Commentaries">Commentaries<br />
			<input type="checkbox" name="specFeat" value="Deleted Scenes">Deleted Scenes<br />
			<input type="checkbox" name="specFeat" value="Behind the Scenes">Behind the Scenes<br />
			
			
			
			
			<input type="submit" value="addFilm">

		</form>
	</div>
</body>
</html>