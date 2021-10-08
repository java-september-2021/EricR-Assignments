<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-uWxY/CJNBR+1zjPWmfnSnVxwRheevXITnMqoEIeG1LJrdI0GlVs/9cVSyPYXdcSF" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>All Dojos</title>
</head>
<body>
<h1>Ninjas and Dojos!</h1>

<table class="table">
	<thead>
		<tr>
			<th scope="col">First name</th>
			<th scope="col">Last name</th>
			<th scope="col">Age</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${allNinjas}" var="ninja">
		<tr>
		<td>${ninja.firstname}</td>
		<td>${ninja.lastname}</td>
		<td>${ninja.age}</td>
		</tr>
		</c:forEach>
	</tbody>
</table>
<a href="/newn">Add a new ninja</a>
<table class="table">
	<thead>
		<tr>
			<th>Name</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${allDojos}" var="dojo">
		<tr>
		<td>${dojo.name}</td>
		</tr>
		</c:forEach>
	</tbody>
</table>
<a href="/newdo">Add a new dojo</a>

</body>
</html>