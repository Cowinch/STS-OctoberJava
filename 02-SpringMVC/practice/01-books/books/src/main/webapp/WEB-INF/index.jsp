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
	<h1 class="text-center mt-4 text-light">All books</h1>
	<table class="container col-6 table table-dark table-striped mt-5">
	<thead>
		<tr>
			<th>ID</th>
			<th>Title</th>
			<th>Language</th>
			<th># Pages</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="book" items="${books}">
			<tr>
			<td><c:out value="${book.id }"></c:out></td>
			<td><a href="book/${book.id}"><c:out value="${book.title }"></c:out></a></td>
			<td><c:out value="${book.language }"></c:out></td>
			<td><c:out value="${book.numberOfPages }"></c:out></td>
			</tr>
		</c:forEach>
	</tbody>
	</table>

<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
</body>
</html>