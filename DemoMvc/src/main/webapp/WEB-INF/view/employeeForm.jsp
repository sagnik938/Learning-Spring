<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<style>
.error {
	color: red
}
;
</style>
</head>
<body>
	<h1>Add new employee</h1>
	<form:form method="post" action="save">
		<table>

			<tr>
				<td>Id:</td>
				<td><form:input path="id" /></td>
			</tr>

			<tr>
				<td>Name:</td>
				<td><form:input path="name" /> 
			</tr>

			<tr>
				<td>Salary:</td>
				<td><form:input path="salary" />
			</tr>

			<tr>
				<td>Designation:</td>
				<td><form:input path="designation" /> 
			</tr>
			<tr>
				<td><input type="submit" value="submit" /></td>
			</tr>

		</table>

	</form:form>
</body>
</html>