<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <title>Hello, world!</title>
  </head>
  <body>
    <h1>Hello, world!</h1>
	
	<form:form action="addentity" method="post" modelAttribute="entity">
	
	<label for="name">First Name(*)</label>
	<form:input type="text" path="first" /> 
	<form:errors path="first" cssClass="error"/><br><br>
	
	<label for="name">last Name(*)</label>
	<form:input type="text" path="last" /> 
	<form:errors path="last" cssClass="error"/><br><br>
	
	<label for="name">User Name(*)</label>
	<form:input type="text" path="user" /> 
	<form:errors path="user" cssClass="error"/><br><br>
	
	<label for="name">Email(*)</label>
	<form:input type="text" path="email" /> 
	<form:errors path="password" cssClass="error"/><br><br>
	
	<label for="name">Password(*)</label>
	<form:input type="text" path="password" /> 
	<form:errors path="password" cssClass="error"/><br><br>
	
	<label>Type : </label>
	<form:radiobuttons path="type" items="${entity.typeOptions}"/> <br><br>
	
	
	<input type="submit" value="submit" />
		
	</form:form>
   	
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
  </body>
</html>