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
    <h3>Click here you you have'nt signed up yet</h3>
    <a href="showsigup" class="btn btn-primary">Sign-up</a>
	
	<form:form action="processlogin" method="post" modelAttribute="login">
	
	<label for="name">User Name(*)</label>
	<form:input type="text" path="user" /> 
	<form:errors path="user" cssClass="error"/><br><br>
	
	<label for="name">Password(*)</label>
	<form:input type="text" path="password" /> 
	<form:errors path="password" cssClass="error"/><br><br>
	
	<label>Type : </label>
	<form:radiobuttons path="type" items="${login.typeOptions}"/> <br><br>
	
	
	<input type="submit" value="submit" />
		
	</form:form>
	
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
  </body>
</html>