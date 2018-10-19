<!-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1" -->
<!-- 	pageEncoding="ISO-8859-1"%> -->
<!-- 	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> -->
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="CSSLogin.css" />
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form method="post" action="ServletConnexion">

		<table>
			<tr>
			<td><img src="../img/proxibanque.png" alt="Nouveau !" /></td>
			<td><h1>PROXIBANQUE</h1></td>
			</tr>
		</table>

		<h2>Veuillez vous connecter</h2>
		<fieldset>
			<legend>Connexion</legend>
			<div>
				<br />Login : <input name="login"> <br /> <br />Password
				: <input name="password" type="password"> <br />
			</div>
		</fieldset>

		<br /> <input type="reset" value="Reset"
			style="background-color: red; border: 1px solid black" /> <input
			type="submit" value="Envoyer"
			style="background-color: green; border: 1px solid black" />
	</form>

</body>
</html>