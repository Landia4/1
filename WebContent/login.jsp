<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="LoginServlet">
		<label for="username">Username</label> <input type="text"
			name="username" id="username" placeholder="Inserire username" /> <br>
		<label for="password">Password</label> <input type="text"
			name="password" id="password" placeholder="Inserire password" /> <br>

		<br /> <br />
		
		 <input type="submit" value="Login" /> 
		 
		 <a href="registrazione.jsp">
			<button type="button">Registrati</button>
		</a>

	</form>
	
	

</body>
</html>