<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="./addStudent" method="post">
	<h4>Add Student Details</h4>
		Name<input type="text" name="name"><br>
		Address<input type="text" name="address"><br>
		Age<input type="text" name="age"><br>
		<input type="submit" value="Submit">
	</form>
	<a href="home.jsp">Go to Home Page</a>
</body>
</html>