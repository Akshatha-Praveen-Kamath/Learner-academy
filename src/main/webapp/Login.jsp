<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./home" method="post">
	Username<input type="text" name="username"><br>
	Password<input type="text" name="password"><br>
	UserType<select name="usertype">
	<option value="admin">Admin</option>
	<option value="user">User</option>
	</select>
	<input type="submit" value="Login">
</form>
</body>
</html>