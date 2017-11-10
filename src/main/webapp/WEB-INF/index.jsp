<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>The Code</title>
<link rel="stylesheet" type="text/css" href="css/style.css" >
</head>
<body>

	<h3 class="red"><c:out value="${errors}" /></h3>
	
	 <h1>What is the code?</h1>
	 <form action="/code" method="POST">
	 	<input type="text" name="code" >
	 	<button>Try Code</button>
	 </form>
</body>
</html>