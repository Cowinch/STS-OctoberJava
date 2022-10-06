<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Expenses</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
	<h1 class="text-center mb-3 text-light">Edit Expenses</h1>
	<div >
		<form:form action="/edit/${expense.id}" method="post" modelAttribute="expense">
		<input type="hidden" name="_method" value="put">
		<div class="container col-3 bg-dark p-3">
			<div class="form-group mb-2 d-flex justify-content-between">
				<form:label path="name" class="text-light">Expense Name: </form:label>
				
				<form:input path="name"/>
			</div>
			<div class="form-group mb-2 d-flex justify-content-between">
				<form:label path="vendor" class="text-light">Vendor: </form:label>
				
				<form:input path="vendor"/>
			</div>
			<div class="form-group mb-2 d-flex justify-content-between">
				<form:label path="amount" class="text-light">Amount: </form:label>
				
				<form:input path="amount"/>
			</div>
			<div class="form-group mb-2 d-flex justify-content-between">
				<form:label path="description" class="text-light">Description: </form:label>
				
				<form:textarea path="description"/>
			</div>
			<div>
				<input type="submit" value="Submit" class="btn btn-success"/>
			</div>
		</div>
		<div class="container col-3">
			<form:errors path="name" class="text-danger"/><br/>
			<form:errors path="vendor" class="text-danger"/><br/>
			<form:errors path="amount" class="text-danger"/><br/>
			<form:errors path="description" class="text-danger"/><br/>
		</div>
		</form:form>
	</div>
	



<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
</body>
</html>