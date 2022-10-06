<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
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
	<h1 class="container mb-3 text-light">Save Travels</h1>
	<table class="container table table-dark table-striped mb-5">
		<thead>
			<tr>
				<th>Expense</th>
				<th>Vendor</th>
				<th>Amount</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="expense" items="${expenses}">
				<tr>
					<td><c:out value="${expense.name}"></c:out></td>
					<td><c:out value="${expense.vendor}"></c:out></td>
					<td>$<c:out value="${expense.amount}"></c:out></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<h3 class="container col-3 text-light">Add an expense: </h3>
	<div class="container col-3 bg-dark p-3">
		<form:form action="/expenses" method="post" modelAttribute="expense">
			<div class="form-group mb-2 d-flex justify-content-between">
				<form:label path="name" class="text-light">Expense Name: </form:label>
				<form:errors path="name" class="text-danger"/>
				<form:input path="name"/>
			</div>
			<div class="form-group mb-2 d-flex justify-content-between">
				<form:label path="vendor" class="text-light">Vendor: </form:label>
				<form:errors path="vendor" class="text-danger"/>
				<form:input path="vendor"/>
			</div>
			<div class="form-group mb-2 d-flex justify-content-between">
				<form:label path="amount" class="text-light">Amount: </form:label>
				<form:errors path="amount" class="text-danger"/>
				<form:input path="amount"/>
			</div>
			<div class="form-group mb-2 d-flex justify-content-between">
				<form:label path="description" class="text-light">Description: </form:label>
				<form:errors path="description" class="text-danger"/>
				<form:textarea path="description"/>
			</div>
			<div>
				<input type="submit" value="Submit" class="btn btn-success"/>
			</div>
		</form:form>
	</div>
	



<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
</body>
</html>