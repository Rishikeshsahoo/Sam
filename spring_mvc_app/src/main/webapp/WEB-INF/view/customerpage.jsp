<%@page import="org.ncu.spring_mvc_app.Product"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello customer</h1>
	
	<div class="container">
  <div class="row">
    <div class="col-lg-3">
     <h4>Name</h4>
    </div>
    <div class="col-lg-3">
      <h4>Description</h4>
    </div>
    <div class="col-lg-3">
      <h4>Price</h4>
    </div>
    <div class="col-lg-3">
     
    </div>
  </div>
</div>
	
	<%
		if(session.getAttribute("products")!=null){
		ArrayList<Product> products = (ArrayList<Product>)session.getAttribute("products");
		for (int i = 0; i < products.size(); i++){
			
		String name=products.get(i).name;
		String desc=products.get(i).description;
		String price=products.get(i).price;
		String categ=products.get(i).category;
		String path="/spring_mvc_app/addtocart?count="+Integer.toString(i);
	%>
	
	<p>    
	<div class="container">
  <div class="row">
    <div class="col-lg-3">
      <%=name %>
    </div>
    <div class="col-lg-3">
      <%=desc %>
    </div>
    <div class="col-lg-3">
      <%=price %>
    </div>
    <div class="col-lg-3">
      <a href=<%=path %> class="btn btn-primary ">PICK</a></p> 
    </div>
  </div>
</div>
	
	<%
		}
		}
	%>
	<a href="/spring_mvc_app/viewcart" class="btn btn-sm btn-primary aaa">View cart</a>
	<a href="/spring_mvc_app/" class="btn btn-sm btn-danger aaa">Logout</a>
</body>
<style>
.aaa{
margin-top:20px;
margin-left:60px;
margin-right:60px;
display: flex;
justify-content: center;
}
</style>
</html>