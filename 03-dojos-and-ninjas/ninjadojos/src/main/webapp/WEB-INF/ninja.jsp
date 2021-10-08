<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Ninja</title>
</head>
<body>
<form action="/newNinja" method="POST">
<p>Dojo<p>
<select name="dojo">
<c:forEach items="${allDojos}" var="dojo">
<option>${dojo.name}</option>
</c:forEach>
</select>
<p>First name</p>
<input name="firstName" type="text">
<p>Last name</p>
<input name="lastName" type="text">
<p>Age</p>
<input name="age" type="text">

<button>Submit</button>


</form>

</body>
</html>