<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<script>
function validateForm() {
  var x = document.forms["loginForm"]["name"].value;
  var y = document.forms["loginForm"]["color"].value;
  var z = document.forms["loginForm"]["price"].value;
  if (x == "") {
    alert("Name must be filled out");
    return false;
  }
  if (z == "") {
	    alert("Price must be filled out");
	    return false;
	  }
  if (y == "") {
    alert("Color must be filled out");
    return false;
  }
}
</script>

<title>Add Pet</title>
</head>
<body>
	<h1>Add Animal</h1>
	 <form name = "loginForm" method="get" action="PetsServlet" onsubmit="return validateForm()" method="get">
	  name: <input type="text" name="name"/> <br/>
	  price: <input type="number" name="price"/> <br/>
	  color: <input type="text" name="color"/> <br/>
	  
	  <input type="submit" value="Add">
	 </form>

</body>
</html>