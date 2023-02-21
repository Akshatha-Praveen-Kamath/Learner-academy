<%@page import="org.simplilearn.lms.entities.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./deleteStudent" method="post">
<h4>Delete a Student</h4>
		sid:<input type="text" name="sid"><br> <input
			type="submit" value="Delete Student">
	</form>
	<a href="home.jsp">Go to Home Page</a>
</body>
</html>