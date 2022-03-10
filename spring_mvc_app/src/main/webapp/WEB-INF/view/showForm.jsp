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
	<h2> Aadhar Verification Registration Form </h2>
	
	<hr> <br>
	
	<form:form action="processForm" method="post" modelAttribute="user">
	
	<label for="name">User Name</label><br>
	<form:input type="text" path="userName" /> 
	<form:errors path="userName" cssClass="red"></form:errors>
	<br><br>
	<label for="id">Aadhar ID</label><br>
	<form:input type="text" path="aadharId" /> 
  	<form:errors path="aadharId" cssClass="red"></form:errors>
  	
</div>
	<br><br>

	<label for="date">Date</label><br>
	<form:input type="date" path="date" /> 
	<form:errors path="date" cssClass="red"></form:errors>
	<br><br>
	
	<label for="email">Email Address</label><br>
	<form:input type="text" path="email" /> 
	<form:errors path="email" cssClass="red"></form:errors>
	<br><br>	
		
	Enter State <br>
	<form:select path="state">
		
		
		<form:options items="${user.stateOptions}"/>
		
	</form:select> <br><br><br>
	<label>Gender: </label>
	<form:radiobuttons path="gender" items="${user.genderOptions}"/> 
	
	<br><br>
	<label>Other Verification Options: </label> <br>
	<form:checkboxes path = "others" items="${user.otherOptions}" /> <br> <br>
	
	<label>Address Details</label><br>
	<form:textarea path="address" rows="5" cols="30" /> <br> <br> 
	<form:errors path="address" cssClass="red"></form:errors>
	
	<input type="submit" value="submit" />
		
	</form:form>
    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
    -->
  </body>
  <style>
	body
	{
		text-align: center;
	}
	.red
	{
		color: red;
	}
</style>

</html>