<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
<legend>Fill Your Form</legend>
<form action="saveStudent" method = "post">

<label for="firstname">FirstName</label>
<input id="firstname" type = "text" name = "firstname"><br><br>

<label for="lastname">LastName</label>
<input id="lastname" type = "text" name = "lastname"><br><br>

<label for="email">Email</label>
<input id="email" type = "text" name = "email"><br><br>

<label for="contact">Contact</label>
<input id="contact" type = "text" name = "contact"><br><br>

<label for="location">Location</label>
<input id="location" type = "text" name = "location"><br><br>

<input type="submit" value = "Submit"> <input type="reset">

</form>

<br>
<a href="/student/studentDetails">GetDetails</a>
<%-- ${studentMsg} --%>
</fieldset>

</body>
</html>