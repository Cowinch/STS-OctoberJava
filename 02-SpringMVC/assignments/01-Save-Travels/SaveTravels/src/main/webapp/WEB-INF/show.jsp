<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Expense details</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
	<h1 class="text-center mb-3 text-light">Expense Details</h1>
	<div class="container col-4 bg-dark p-3">
		<p class="text-light">Expense Name: <c:out value="${expense.name }"/></p>
		<p class="text-light">Expense Description: <c:out value="${expense.description }"/></p>
		<p class="text-light">Vendor: <c:out value="${expense.vendor }"/></p>
		<p class="text-light">Amount: <c:out value="${expense.amount }"/></p>
		<p><a href="/">Go back</a></p>
	</div>
	



<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
</body>
</html>