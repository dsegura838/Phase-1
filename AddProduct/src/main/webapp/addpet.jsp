<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Pet</title>
</head>
<body>
	<h1>Add Animal</h1>
	 <form name = "loginForm" method="get" action="PetsServlet">
	  name: <input type="text" name="name"/> <br/>
	  price: <input type="number" name="price"/> <br/>
	  color: <input type="text" name="color"/> <br/>
	  
	  <input type="submit" value="Add">
	 </form>

</body>
</html>