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
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script type="text/javascript" src="/js/app.js"></script>
</head>
<body class="bg-dark">
	<h1 class="text-center text-light">Here's Your Omikuji!</h1>
    <div class="container text-center bg-secondary p-3 col-2">
        <p>In <c:out value="${years}" /> years, you will live in <c:out value="${city}" /> with <c:out value="${person}" /> as your roommate, selling <c:out value="${hobby}" /> for a living. The next time you see a <c:out value="${thing}" />, you will have good luck. <c:out value="${nice }"/></p>
    </div>
    <p class="text-center mt-5"><a  href="/">Go back</a></p>
</body>
</html>