<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/biblioteca_prestiti/firstservlet" name="companyform" method="POST">
	<input name="whatsend" value="employee" type="hidden">
	<input name="FK_company" value="****" type="hidden">
		ID Impiegato:
		<input name="idemployee" type="text"><br>
		Nome Impiegato:
		<input name="name" type="text"><br>
		Cognome Impiegato:
		<input name="surname" type="text"><br>
		Badge:
		<input name="badge" type="text"><br>
	<input type="submit">
</form>
</body>
</html>