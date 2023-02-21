<%@page import="org.simplilearn.lms.entities.AcademicClass"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./deleteClass" method="post">
<h4>Delete a Class</h4>
		cid:<input type="text" name="cid"><br> <input
			type="submit" value="Delete Class">
	</form>
	<a href="home.jsp">Go to Home Page</a>
</body>
</html>