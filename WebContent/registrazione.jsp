<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registrazione</title>
</head>
<body>

<form method="post" action="HomeServlet">
	<label for="username">Nome</label>
	<input type="text" name="nuovoNome" id="nuovoNome" placeholder="Inserire nome"/>
	<br>
	<label for="password">Cognome</label>
	<input type="text" name="nuovoCognome" id="nuovoCognome" placeholder="Inserire password cognome"/>
	<br>
	<label for="username">Mail</label>
	<input type="text" name="nuovoMail" id="nuovoMail" placeholder="Inserire mail"/>
	<br>
	<label for="username">Telefono</label>
	<input type="text" name="nuovoTelefono" id="nuovoTelefono" placeholder="Inserire telefono"/>
	<br>
	<label for="username">Username</label>
	<input type="text" name="nuovoUsername" id="nuovoUsername" placeholder="Inserire username"/>
	<br>
	<label for="username">Password</label>
	<input type="text" name="nuovoPassword" id="nuovoPassword" placeholder="Inserire password"/>
	<br>
	
	<br /><br />
	
	<input type="submit" value="Registrati" /> 
</form>

	

</body>
</html>