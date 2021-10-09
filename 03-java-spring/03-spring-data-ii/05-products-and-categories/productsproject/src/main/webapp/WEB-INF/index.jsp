<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Products</title>
</head>
<body>
<h1>Product List</h1>
<table class="table">
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Description</th>
		<th>Price</th>
		<th>Category</th>
	</tr>
	<tr>
	<c:forEach var="product" items="${allProducts}">
		<td><c:out value="${product.id}"></c:out></td>
		<td><c:out value="${product.name}"></c:out></td>
		<td><c:out value="${product.description}"></c:out></td>
		<td><c:out value="${product.price}"></c:out></td>
		<td><c:out value="${product.categories}"></c:out></td>
	</c:forEach>
	</tr>
</table>
<h1>Categories</h1>
<table class="table">
	<tr>
	<th scope="row">Name</th>
	<c:forEach var="category" items="${allCategories}">
		<td scope="col"><c:out value="${category.name}"></c:out></td>
	</c:forEach>
	</tr>
</table>
<a href="/newProduct">Add a new product</a>
<a href="/newCategory">Add a new category</a>
</body>
</html>