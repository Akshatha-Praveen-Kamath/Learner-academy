<%@page import="org.simplilearn.lms.entities.Teacher"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><form action="./deleteTeacher" method="post">
<h4>Delete a Teacher</h4>
		sid:<input type="text" name="tid"><br> <input
			type="submit" value="Delete Teacher">
	</form>
	<a href="home.jsp">Go to Home Page</a>

</body>
</html>