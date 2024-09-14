<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="model.Utente"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Ciao User!</h1>

	<%
	Utente utenteAutentificato = (Utente) request.getAttribute("utenteAutentificato");
	%>
	
	<p><%utenteAutentificato.getUsername();%></p>
	<p><%utenteAutentificato.getNome();%></p>



</body>
</html>