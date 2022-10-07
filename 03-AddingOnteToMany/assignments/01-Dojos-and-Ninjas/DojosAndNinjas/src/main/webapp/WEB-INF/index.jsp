<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojos</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
	<div class="container d-flex justify-content-between">
		<div class="">
			<h1 class="text-light mb-3">Add a new Dojo!</h1>
			<div class="bg-dark box">
			 	<form:form action="/dojos/create" method="post" modelAttribute="dojo">
					<div class="form-group mb-3">
						<form:label path="name" class="text-light">Name: </form:label>
						<form:input path="name"></form:input>
					</div>
						<input type="submit" value="Create" class="btn btn-success" >
				</form:form>
			</div>
			<p><a href="/ninja/create">Add a ninja</a></p>
		</div>
		<div class="col-2">
			<h1 class="text-light mb-3">Dojos</h1>
			<div class="bg-dark box">
				<c:forEach var="dojo" items="${dojos}">
					<p class="mb-2"><a href='/dojos/<c:out value="${dojo.id }"></c:out>' class="text-light underline"><c:out value="${dojo.name}"></c:out></a></p>
				</c:forEach>
			</div>
		</div>
	</div>


<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
</body>
</html>