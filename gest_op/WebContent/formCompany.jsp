<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/biblioteca_prestiti/BiblioPrestitiServlet" name="companyform" method="POST">
		
		<input name="whatsend" value="company" type="hidden">
		Partita IVA:
		<input name="idccompany" type="text"><br>
		Nome Impresa:
		<input name="company_name" type="text"><br>
		Telefono:
		<input name="phone" type="text"><br>
		Email:
		<input name="email" type="text"><br>
	<input type="submit">
	</form>
</body>
</html>