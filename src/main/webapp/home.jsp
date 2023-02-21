<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4>Hi,${sessionScope.User.username} Welcome to Learning Management System</h4>
<a href="addStudent.jsp">Add Student</br></a> 
<a href="deleteStudent.jsp">Delete Student</br></a> 

<a href="addSubject.jsp">Add Subject</br></a> 
<a href="deleteSubject.jsp">Delete Subject</br></a> 

<a href="addTeacher.jsp">Add Teacher</br></a>
<a href="deleteTeacher.jsp">Delete Teacher</br></a>


<a href="AcademicClass.jsp">Add Class</br></a>
<a href="deleteClass.jsp">Delete Class</br></a> 

<a href="displaySubjects">Display Subjects</br></a> 






</body>
</html>