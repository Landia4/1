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
 
<h1>Registazione avvenuta con successo!</h1>

	<a href="login.jsp">
			<button type="button">Login</button>
		</a>
		
		<%List<Utente> utenti = (List <Utente>)request.getAttribute("utenti"); %>
		
		<%for (Utente u : utenti){%>
		
			<p> <%= u.getNome()%>  </p> 
		
		<% }%>
</body>
</html>