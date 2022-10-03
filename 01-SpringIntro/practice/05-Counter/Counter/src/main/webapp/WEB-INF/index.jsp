<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Counter</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script type="text/javascript" src="/js/app.js"></script>
</head>
<body>
	<div class="container col-5">
		<h1 class="text-center mt-5"><c:out value="${bigText}"/></h1>
		<div class="d-flex justify-content-between">	
			<p>you have visited this server <c:out value="${count}"/></p>
			<c:if test="${doubleTime==false}">
				<a href="/">Test another visit?</a>
				<a href="/double">Take me to the double zone!</a>
			</c:if>
			<c:if test="${doubleTime==true}">
				<a href="/double">Test another visit?</a>
				<a href="/">Take me back so single count!</a>
			</c:if>
			<a href="/reset">Reset the count</a>
		</div>
	</div>
</body>
</html>