<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

<body>
<h1>Hello Seller</h1>
<form:form action="addproduct" method="post" modelAttribute="product">
	
	<label for="name">Name(*)</label>
	<form:input type="text" path="name" /> 
	<form:errors path="name" cssClass="error"/><br><br>
	
	<label for="name">Description(*)</label>
	<form:input type="textarea" row="100" col="100" path="description" /> 
	<form:errors path="name" cssClass="error"/><br><br>
	
	<label for="name">Category(*)</label>
	<form:input type="text" path="category" /> 
	<form:errors path="name" cssClass="error"/><br><br>
	
	<label for="name">Price(*)</label>
	<form:input type="text" path="price" /> 
	<form:errors path="name" cssClass="error"/><br><br>
	
	
	
	
	<input class="btn btn-primary" type="submit" value="submit" />
		
	</form:form>
	<div class="container-fluid">
	<a href="/spring_mvc_app/" class="btn btn-danger" >Exit</a>
	</div> 
</body>
<style>
.container-fluid{
display: flex;
justify-content: center;
}
</style>
</html>