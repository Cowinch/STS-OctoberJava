<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body class="bg-secondary">
	<h1 class="text-center mt-4 text-light">One Book</h1>
	<div class="container col-4 bg-dark">
		<h3 class="text-light">Title: <c:out value="${book.title}"/></h3>
		<p class="text-light">Description: <c:out value="${book.description}"/></p>
		<p class="text-light">Language: <c:out value="${book.language}"/></p>
		<p class="text-light">Number of Pages: <c:out value="${book.numberOfPages}"/></p>
		<p><a href="/">Go Back</a></p>
	</div>
	
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
</body>
</html>