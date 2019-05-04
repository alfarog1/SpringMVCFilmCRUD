<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SD IMDB</title>
</head>
<body>
	<div class="container">
	<form action="findFilmId.do" method="GET">
	<label for="firstName">First name:</label><input type="text" name="firstName"><br/>
	<label for="lastName">Last name:</label><input type="text" name="lastName"><br/>
	<input type="submit" value="Translate">
</form>
	</div>

<p>
			<a href="selectJSP.html" class="btn btn-primary" role="button">Back to Search</a>
		</p>
		<p>
			<a href="index.html" class="btn btn-secondary" role="button">Back to Home</a>
		</p>

</body>
</html>