<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
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
	<h1 class="text-center text-light">Send an Omikuji!</h1>
	<p class="text-center text-light"><c:out value="${error}"/></p>
    <form action="/process" method="post">
    	<div class="col-2 container p-3 bg-secondary">
            <div class="form-group">
                <label for="years">Pick any number from 5 to 25</label>
                <input class="form-control mb-3" type="number" name="years" id="years">
            </div>
            <div class="form-group">
                <label for="city">Enter the name of any city.</label>
                <input class="form-control mb-3" type="text" name="city" id="city">
            </div>
            <div class="form-group">
                <label for="person">Enter the name of any real person</label>
                <input class="form-control mb-3" type="text" name="person" id="person">
            </div>
            <div class="form-group">
                <label for="hobby">Enter professional endeavor or hobby: </label>
                <input class="form-control mb-3" type="text" name="hobby" id="hobby">
            </div>
            <div class="form-group">
                <label for="thing">Enter any type of living thing.</label>
                <input class="form-control mb-3" type="text" name="thing" id="thing">
            </div>
            <div class="form-group">
                <label for="nice">Say sometthing nice to someone: </label>
                <textarea class="form-control mb-3" name="nice" id="nice" cols="30" rows="10"></textarea>
            </div>
            <button>Submit!</button>
    	</div>
    </form>
</body>
</html>