<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Accesso</title>
    <script type="text/javascript">
    
    </script>
</head>
<body>
	<form method="post" action="/gest_op/Servlet" name="formaccesso">
      <br>Inserire dati per l'accesso. <br>
      ID Operatore:<input type="number" name="idop" min="100"style="border: solid 1px #6E6E6E;">
      Nome Op.:<input type="text" name="nomeop" style="border: solid 1px #6E6E6E;">
      Cognome Op.:<input type="text" name="cognop" style="border: solid 1px #6E6E6E;">
      <input type="submit" name="invia" value="Invia">
      <input type="reset" value="Cancella">
    </form>
</body>
</html>