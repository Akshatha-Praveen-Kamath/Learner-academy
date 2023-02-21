<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="./AcademicClass" method="post">
	<h4>Add Class Details</h4>
		CID<input type="text" name="cid">
		Name<input type="text" name="name"><br>
		Duration<input type="text" name="duration"><br>
		<input type="submit" value="Submit">
	</form>
	<a href="home.jsp">Go to Home Page</a>
</body>
</html>