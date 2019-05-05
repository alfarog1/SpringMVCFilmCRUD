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
<title>Edit Film</title>
</head>
<body>
	<div class="container">
		<form:form action="updateFilm.do" method="POST" modelAttribute="film">
			<form:label path="id">Id: ${film.id }</form:label>
			<form:input path="id" type="hidden"/>
			<form:errors path="id" />
			<br />
			<form:label path="title">Title:</form:label>
			<form:input path="title" />
			<form:errors path="title" />
			<br />

			<br />
			<form:label path="description">Description:</form:label>
			<form:input path="description" />
			<form:errors path="description" />
			<br />
			<form:label path="releaseYear">Release Year:</form:label>
			<form:input path="releaseYear" />
			<form:errors path="releaseYear" />
			<br />

			<form:label path="rentalDuration">Rental Duration:</form:label>
			<form:input path="rentalDuration" />
			<form:errors path="rentalDuration" />
			<br />
			<form:label path="rentalRate">Rental Rate:</form:label>
			<form:input path="rentalRate" />
			<form:errors path="rentalRate" />
			<br />
			<form:label path="length">Length (Minutes):</form:label>
			<form:input path="length" />
			<form:errors path="length" />
			<br />
			<form:label path="replacementCost">Replacement Cost:</form:label>
			<form:input path="replacementCost" />
			<form:errors path="replacementCost" />
			<br />
			

			<input type="submit" value="Save Changes">

		</form:form>

	</div>
</body>
</html>