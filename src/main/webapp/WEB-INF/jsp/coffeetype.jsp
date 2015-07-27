<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CoffeeType Management</title>
</head>
<body>
	<h1>CoffeeType data</h1>
	<form:form action="coffeetype.do" method="POST">
		<table>
			<tr>
				<td>ID</td>
				<td><form:input path="id" /></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Price</td>
				<td><form:input path="price" /></td>
			</tr>
			<tr>
				<td>Total</td>
				<td><form:input path="total" /></td>
			</tr>
			<tr>
				<td>Note</td>
				<td><form:input path="note"/></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" name="action" value="Add"/>
					<input type="submit" name="action" value="Edit"/>
					<input type="submit" name="action" value="Delete"/>
					<input type="submit" name="action" value="Search"/>
				</td>
				<td><form:input path="note" action=""/></td>
			</tr>
		</table>
	</form:form>
	<br>
	<table border="1">
		<th>ID</th>
		<th>NAMe</th>
		<th>Price</th>
		<th>Total</th>
		<th>Note</th>
		<c:forEach items="${coffeelist}" var="coffeetype">
			<tr>
				<td>${coffeetype.id}</td>
				<td>${coffeetype.name}</td>
				<td>${coffeetype.price}</td>
				<td>${coffeetype.total}</td>
				<td>${coffeetype.note}</td>
			</tr>
		
		</c:forEach>
	</table>
</body>
</html>