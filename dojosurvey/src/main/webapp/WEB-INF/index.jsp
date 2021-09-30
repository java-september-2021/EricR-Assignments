<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey</title>
</head>
<body>
<h1>Dojo Survey</h1>
<hr>
<form method="POST" action="/survey">
<p>
<label>Your Name</label>
<input type="text" name="name">
</p>
<p>
<label>Location</label>
<select name="location">
<option value="San Jose">San Jose</option>
<option value="Oakland">Oakland</option>
<option value="Seattle">Seattle</option>
<option value="Dallas">Dallas</option>
</select>
</p>
<p>
<select name="Language">
<option name="Java">Java</option>
<option name="Python">Python</option>
<option name="Javascript">Javascript</option>
</select>
</p>
<p>
<label>Comments (optional)</label>
<textarea name="comment"></textarea>
</p>
<button>Submit</button>
</form>
</body>
</html>