<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Confirmation Form</title>
</head>
<body>

The Student is confirmed: ${student.firstName} ${student.lastName} 
<br><br>
Standard: ${student.standard}
<br><br>
Country: ${student.country}
<br><br>
PAN: ${student.panNumber}
<br><br>
Favorite Language: ${student.favoriteLanguage}
<br><br>
Favorite Operating System: 
<ul>
	<c:forEach var="temp" items="${student.favoriteOS }">
	<li>${temp}</li>
	</c:forEach>
</ul>
</body>
</html>