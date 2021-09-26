<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello Human</title>
</head>
<body>
<%
	if ("name".length()==0) {
%>
	<p>Hello Human!</p>
<%
	}
	else {
%>
	<p>Hello <c:out value="${name}"/>!</p>
<%
	}
%>
</body>
</html>