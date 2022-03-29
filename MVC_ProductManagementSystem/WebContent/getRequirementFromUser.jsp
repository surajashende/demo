<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  
<%@ page import="java.util.*" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<table>
	<tr>
		<th>Product ID</th>
		<th>Product Name</th>
		<th>Product Price</th>
	</tr>
	
	<c:forEach items="${applicationScope.productListAll}" var="productListAll">
		<tr>
			<td><c:out value="${productListAll.id}"></c:out></td>
			<td><c:out value="${productListAll.name}"></c:out></td>
			<td><c:out value="${productListAll.price}"></c:out></td>
		</tr>
	</c:forEach>
</table>

<br><br>


<form action="ProductAllList" method="post">
	<h3><i>All Product list</i></h3>
	<input type="submit" value="GetAllProducts">
	
</form>





<form action="ProductByIDServlet" method="post">
	<table>
		<tr>
			<td><h3><i>Get Product By Id</i></h3></td>
		</tr>
		
		<tr>
			<td>
				Enter Product Id:<input type="number" name="productId"/>
				<input type="submit" value="GetProductById">
			</td>
		</tr>
		
	</table>
</form>

<br><br>

<table>
	<tr>
		<th>Product ID</th>
		<th>Product Name</th>
		<th>Product Price</th>
	</tr>
	
	<c:forEach items="${applicationScope.productById}" var="pro">
		<tr>
			<td><c:out value="${pro.id}"></c:out></td>
			<td><c:out value="${pro.name}"></c:out></td>
			<td><c:out value="${pro.price}"></c:out></td>
		</tr>
	</c:forEach>
</table>



</body>
</html>