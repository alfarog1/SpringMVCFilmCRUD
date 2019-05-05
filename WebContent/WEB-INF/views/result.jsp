<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
  <%@include file="stylesheet.css" %>
</style>
<meta charset="UTF-8">
<title>Film</title>
</head>
<body>

	<div>
		<c:choose>
			<c:when test="${! empty error }">
				<h3>Could not perform action, try again.</h3>
			</c:when>

			<c:when test="${! empty film}">
				<h3>${film.title}</h3>

				<p>
					Id: ${film.id }<br> Released on: ${film.releaseYear} <br>
					Rated: ${film.rating} <br> Language: ${film.language} <br>
					Duration: ${film.length}<br>
				</p>

				<p>${film.description}</p>
		Rental Duration: ${film.rentalDuration} Rental Rate: ${film.rentalRate}
		Replacement Cost: ${film.replacementCost}<br>
		Special Features: ${film.specitalFeatures}

				<c:forEach var="actor" items="${film.cast }"> * ${actor } <br>
				</c:forEach>
				<br>
				<c:forEach var="filmCategories" items="${film.categories }">  ${filmCategories.categoryName} <br>
				</c:forEach>
				<br>

				<form action="edit.do" method="GET">
					<input type="hidden" name="filmId" value="${film.id}"> <input
						type="submit" value="Edit Film">
				</form>
				<br>

				<form action="deleteFilm.do" method="GET">
					<input type="hidden" name="filmId" value="${film.id}"> <input
						type="submit" value="Delete Film">
			</form>
				<%-- <form action="home.do" method="GET">
					<input type="submit" value="Home">
				</form>  --%>
			</c:when>
			<c:when test="${! empty error}">

				<h2>Film not found...</h2>

			</c:when>

			<c:otherwise>
				<c:forEach var="film" items="${searchResults }">
					<br>

					<h3>${film.title}</h3>

					<p>
						Id: ${film.id }<br> Released on: ${film.releaseYear} <br>
						Rated: ${film.rating} <br>

						<c:if test="${! empty film.language}">Language: ${film.language} <br>
						</c:if>


						Duration: ${film.length}<br>
					</p>

					<p>${film.description}</p>
		Rental Duration: ${film.rentalDuration} Rental Rate: ${film.rentalRate}
		Replacement Cost: ${film.replacementCost}<br>
		Special Features: ${film.specitalFeatures}
		

					<c:forEach var="actor" items="${film.cast }"> * ${actor } <br>
					</c:forEach>
					<br>
					<c:forEach var="filmCategories" items="${film.categories }">  ${filmCategories.categoryName} <br>
					</c:forEach>
					<br>

					<form action="edit.do" method="GET">
						<input type="hidden" name="filmId" value="${film.id}"> <input
							type="submit" value="Edit Film">
					</form>
					<br>

					<form action="deleteFilm.do" method="GET">
						<input type="hidden" name="filmId" value="${film.id}"> <input
							type="submit" value="Delete Film">
				<%-- 	</form>
					<form action="home.do" method="GET">
						<input type="submit" value="Home">
					</form> --%>

				</c:forEach>
				<br>

			</c:otherwise>
		</c:choose>
	</div>

	<div>
	<form action="home.do" method="GET">
			<input type="submit" value="Home">
		</form>
	</div>
	

</body>
</html>