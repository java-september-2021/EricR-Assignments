<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create a new Dojo</title>
</head>
<body>
<h2>New Dojo</h2>
<form:form class="form" method="post" action="/newdojo" modelAttribute="dojo">
<form:errors path="location" class="errors"></form:errors>
<form:label path="location">Name: </form:label>
<form:input type="text" path="dojo"/>
<input type="submit" class="btn btn-primatry" value="Create"/>
</form:form>
</body>
</html>