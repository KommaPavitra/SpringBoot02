<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align= "center">
<h1>Student Details</h1>
<a href="/student/createStudent">Create Student</a>

<table border="1" cellpadding="10">
<tr>
<th>Id</th>
<th>FirstName</th>
<th>LastName</th>
<th>Email</th>
<th>Contact</th>
<th>Location</th>
</tr>
<c:forEach items = "${listStudents}" var = "student">
<tr>
<td>${student.id}</td>
<td>${student.firstName}</td>
<td>${student.lastName}</td>
<td>${student.email}</td>
<td>${student.contact}</td>
<td>${student.location}</td>
</c:forEach>
</table>
</div>

</body>
</html>