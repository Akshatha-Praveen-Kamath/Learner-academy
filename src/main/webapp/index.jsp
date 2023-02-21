<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="login">
		<form action=./login method=post style="text-align:center">
			<h1 style="text-align:center;color:lightred;">Learning Management System</h1>
			<button><a href=./register.jsp>Register</a></button>
			<button><a href=./SavedUserLogin.jsp>Login</a></button>
		</form>
		</div>
	<p style="colour:red;">${requestScope.msg}</p>
</body>
</html>