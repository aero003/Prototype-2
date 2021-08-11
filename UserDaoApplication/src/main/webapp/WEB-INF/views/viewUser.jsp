<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<%@ page isELIgnored ="false" %>
<meta charset="ISO-8859-1">
<title>View User Page</title>
</head>
<body>
	<h1>Users List</h1>
	<table border = "2" width = "70%" cellpadding = "2">
	  <tr><th>Id</th><th>First Name</th><th>Last Name</th><th>Middle Name</th><th>Address</th><th>Email</th><th>Phone Number</th><th>Height</th><th>Weight</th><th>Delete</th></tr>
	  	<c:forEach var = "user" items = "${list}">
	  		<tr>
	  		    <td>${user.id}</td>
		  		<td>${user.firstName}</td>
		  		<td>${user.lastName}</td>
		  		<td>${user.middleName}</td>
		  		<td>${user.address}</td>
		  		<td>${user.email}</td>
		  		<td>${user.phoneNumber}</td>
		  		<td>${user.height}</td>
		  		<td>${user.weight}</td>
		  		<td><a href = "deleteUser/${user.id}">Delete</a></td>
	  		</tr>
	  	</c:forEach>
	</table>
	<br/>
	<a href = "regForm">Add New User</a>
</body>
</html>