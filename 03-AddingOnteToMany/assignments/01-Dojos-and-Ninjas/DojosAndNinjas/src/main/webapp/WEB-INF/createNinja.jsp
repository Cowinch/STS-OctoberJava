<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Ninja</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
	<h1 class="text-light text-center mb-5">New Ninja</h1>
		<div class="d-flex justify-content-center">
			<div class="bg-dark box">
			 	<form:form action="/ninja/create" method="post" modelAttribute="ninja">
					<div class="form-group mb-3">
						<div class="mb-2 d-flex justify-content-between">
							<form:label path="dojo" class="text-light">Dojo: </form:label>
                			<form:select path="dojo" class="d-flex">
                    			<c:forEach var="dojo" items="${dojos }">
                        			<form:option path="dojo" value="${dojo.id }">${dojo.name}</form:option>
                    			</c:forEach>
                			</form:select>
            			</div>
						<div class="mb-2 d-flex justify-content-between">
							<form:label path="firstName" class="text-light">First Name: </form:label>
							<form:input path="firstName" class=""></form:input>
						</div>
						<div class="mb-2 d-flex justify-content-between">
							<form:label path="lastName" class="text-light">Last Name: </form:label>
							<form:input path="lastName"></form:input>
						</div>
						<div class="mb-2 d-flex justify-content-between">
							<form:label path="age" class="text-light">Age: </form:label>
							<form:input path="age"></form:input>
						</div>
					</div>
						<input type="submit" value="Create" class="btn btn-success" >
				</form:form>
			</div>
		</div>


<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
</body>
</html>