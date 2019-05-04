<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Film</title>
</head>
<body>

<div>
<h3>${film.title}</h3>

		<p>
		Released on: ${film.releaseYear} <br>
		Rated: ${film.rating} <br>
		Language: ${film.language} <br>
		Duration: ${film.length}<br>
		</p>
		
		<p>
		${film.description}
		</p>
		Rental Duration: ${film.rentalDuration} Rental Rate: ${film.rentalRate}
		Replacement Cost: ${film.replacementCost}<br>
		Special Features: ${film.specitalFeatures}
		</p>
		
		<c:forEach var = "actor" items = "${film.cast }"> * ${actor } <br></c:forEach><br>
		<c:forEach var = "filmCategories" items = "${film.categories }">  ${filmCategories.categoryName} <br> </c:forEach><br>
		
		
	


</div>







	<div>

		<form action="updateFilm.do" method="GET">
			<input type="submit" value="Edit Film">
		</form><br>

		<form action="home.do" method="GET">
			<input type="submit" value="Home">
		</form>

	</div>

</body>
</html>