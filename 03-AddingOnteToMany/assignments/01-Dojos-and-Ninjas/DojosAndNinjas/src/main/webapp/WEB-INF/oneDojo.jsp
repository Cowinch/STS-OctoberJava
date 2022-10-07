<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
	<h1 class="text-center text-light mb-5"><c:out value="${dojo.name }"/></h1>
	<p class="container"><a href="/dojos">Go back</a></p>
	<table class="container table table-dark table-striped mb-5">
		<thead>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
				<th>Options</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="ninja" items="${ninjas}">
				<tr>
					<td><c:out value="${ninja.firstName}"></c:out></td>
					<td><c:out value="${ninja.lastName}"></c:out></td>
					<td><c:out value="${ninja.age}"></c:out></td>
					<td>
						<div class=d-flex>
							<form action="/edit/<c:out value='${ninja.id}'></c:out>">
								<button class="btn btn-warning">Edit</button>
							</form>
							<form method="post" action="/delete/<c:out value='${ninja.id}'></c:out>">
								<input type="hidden" name="_method" value="delete">	
								<input type="submit" value="Kick out" class="btn btn-danger">	
							</form>
						</div>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<h1></h1>


<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
</body>
</html>