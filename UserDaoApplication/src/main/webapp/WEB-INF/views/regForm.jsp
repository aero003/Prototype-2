<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration Page</title>
</head>
<body>
	<h1>Add New User</h1>
	<form:form method = "post" action = "save">
	<table>
	  <tr>
	  	<td>First Name: </td>
	  	<td><form:input path="firstName"/></td>
	  </tr>
	  <tr>
	  	<td>Last Name: </td>
	  	<td><form:input path="lastName"/></td>
	  </tr>
	  <tr>
	  	<td>Middle Name: </td>
	  	<td><form:input path="middleName"/></td>
	  </tr>
	  <tr>
	  	<td>Address: </td>
	  	<td><form:input path="address"/></td>
	  </tr>
	  <tr>
	  	<td>Email: </td>
	  	<td><form:input path="email"/></td>
	  </tr>
	  <tr>
	  	<td>Phone Number: </td>
	  	<td><form:input path="phoneNumber"/></td>
	  </tr>
	  <tr>
	  	<td>Height: </td>
	  	<td><form:input path="height"/></td>
	  </tr>
	  <tr>
	  	<td>weight: </td>
	  	<td><form:input path="weight"/></td>
	  </tr>
	  <tr>
	    <td> </td>
	  	<td><input type = "submit" value = "Save"/></td>
	  </tr>
	</table>
	</form:form>
</body>
</html>