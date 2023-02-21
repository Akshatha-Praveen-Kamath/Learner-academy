<%@page import="org.simplilearn.lms.entities.Subject"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="./deleteSubject" method="post">
	<h4>Delete a Subject</h4>
		sid:<input type="text" name="sid"><br> <input
			type="submit" value="Delete Subject">
	</form>
	<a href="home.jsp">Go to Home Page</a>
</body>
</html>