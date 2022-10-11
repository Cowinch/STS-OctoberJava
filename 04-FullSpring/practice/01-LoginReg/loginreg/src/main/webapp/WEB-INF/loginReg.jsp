<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col">
				<h1 class="text-light">Register</h1>
				<form:form action="/user/register" method="post" modelAttribute="newUser">
					<div class="form-group">
						<label class="text-light">User Name</label>
						<form:input path="userName" class="form-control"/>
						<form:errors path="userName" class="text-danger"/>
					</div>
					<div class="form-group">
						<label class="text-light">Email</label>
						<form:input path="email" class="form-control"/>
						<form:errors path="email" class="text-danger"/>
					</div>
					<div class="form-group">
						<label class="text-light">Password</label>
						<form:input type="password" path="password" class="form-control"/>
						<form:errors path="password" class="text-danger"/>
					</div>
					<div class="form-group">
						<label class="text-light">Confirm Password</label>
						<form:input type="password" path="confirm" class="form-control"/>
						<form:errors path="confirm" class="text-danger"/>
					</div>
					<input type="submit" value="Register User" class="btn btn-primary mt-2"/>
				</form:form>
			</div>
			<div class="col">
			<h1 class="text-light">login</h1>
			<form:form action="/user/login" method="post" modelAttribute="newUser">
				<div class="form-group">
						<label class="text-light">Email</label>
						<form:input path="email" class="form-control"/>
						<form:errors path="email" class="text-danger"/>
					</div>
					<div class="form-group">
						<label class="text-light">Password</label>
						<form:input type="password" path="password" class="form-control"/>
						<form:errors path="password" class="text-danger"/>
					</div>
					<input type="submit" value="Login" class="btn btn-primary mt-2"/>
			</form:form>
			</div>
		</div>
	</div>


<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
</body>
</html>