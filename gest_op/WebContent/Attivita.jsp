<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrazione attività</title>





</head>
<body>
	<form method="post" action="/gest_op/Servlet" name="formaccesso">
		IDAttività: <input type="number" name="idatt" min="100"style="border: solid 1px #6E6E6E;">
		<br> IDOperatore: <input type="number" name="idop" style="border: solid 1px #6E6E6E;">
		<br> IDArticolo: <input type="text" name="idart" style="border: solid 1px #6E6E6E;">
		<br> Quantita': <input type="number" name="quant" style="border: solid 1px #6E6E6E;">
		<br> Data inizio:

							<input type="date" name="dt" onchange="mydate1();" hidden/>
						 	<input type="text" name="ndt"  onclick="mydate();" hidden/>
							<input type="button" Value="Date" onclick="mydate();"/>
	</form>
</body>
</html>