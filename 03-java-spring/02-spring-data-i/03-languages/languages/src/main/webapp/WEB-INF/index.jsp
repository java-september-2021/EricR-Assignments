<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix=”c” uri=”http://java.sun.com/jsp/jstl/core” %>
	<%@ taglib prefix=”form” uri=”http://www.springframework.org/tags/form %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Languages</title>
</head>
<body>
<h1>Welcome to Languages</h1>
<hr>
<table>
<thead>
<tr>
<td>Name</td>
<td>Creator</td>
<td>Version</td>
<td>Action</td>
</tr>
</thead>
<tbody>
</tbody>
</table>

<h3>Create new language</h3>
<form  method="POST" action="/new">
<p>
<label>Name:</label>
</p>
<p>
<label>Creator:</label>
</p>
<p>
<label>Current Version:</label>
</p>
</form>
</body>
</html>