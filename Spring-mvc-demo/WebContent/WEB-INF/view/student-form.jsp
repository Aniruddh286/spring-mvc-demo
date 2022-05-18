<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form</title>
	<style>
		.error {color:red}
	</style>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
	
	First Name: <form:input path="firstName" placeholder="First Name"/> (*)
	<form:errors path="firstName" cssClass="error"/>
	<br><br>
	
	
	Last Name: <form:input path="lastName" placeholder="Last Name"/> (*)
	<form:errors path="lastName" cssClass="error"/>
	<br><br>
	
	Standard: <form:input path="standard" placeholder="Standard"/> (*)
	<form:errors path="standard" cssClass="error"/>
	<br><br>
	
	PAN: <form:input path="panNumber"/> (*)
	<form:errors path="panNumber" cssClass="error"/>
	<br><br>
	
	Country: <form:select path="country" >
	
		<form:options items="${student.countryOptions}"/>
		
		<!--<form:option value="India" label="India"/>
		<form:option value="Nepal" label="Nepal"/>
		<form:option value="China" label="China"/> -->
	
	</form:select>
	<br><br>
	Favorite Language: 
	Java<form:radiobutton path="favoriteLanguage" value="Java"/>
	C#<form:radiobutton path="favoriteLanguage" value="C#"/>
	php<form:radiobutton path="favoriteLanguage" value="php"/>
	
	<br><br>
	Favorite OS: 
	Linux<form:checkbox path="favoriteOS" value="Linux"/>
	Windows<form:checkbox path="favoriteOS" value="Windows"/>
	Mac<form:checkbox path="favoriteOS" value="Mac"/>
	<br><br>
	
	<input type="submit" value="Submit">
	<br><br>
	
	
	
	</form:form>

</body>
</html>