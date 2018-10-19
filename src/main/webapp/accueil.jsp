<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="CSS2.css" />
<head>
<meta charset="ISO-8859-1">
<title>Home ProxybanqueCOBT</title>
</head>
<body>


	<header>
		<img src="img/proxibanque.png" />
		<h1>Espace Conseiller</h1>
		<nav>
			<div class="topnav">
				<a class="active" href="accueil.jsp">Home</a> <a href="#news">News</a>
				<a href="login.jsp">Se deconnecter</a>
			</div>
		</nav>
	</header>


	<!-- 		<table> -->

	<!-- 			<td><img src="images/proxibanque.png" alt="Nouveau !" /></td> -->
	<!-- 			<td><h1>PROXIBANQUE</h1></td> -->
	<!-- 		</table> -->

	<!-- 	<h2>Votre Espace Conseiller</h2> -->

	<h3>Listes des Clients</h3>
	<table>
		<tr>
			<th>Prenom</th>
			<th>Nom</th>
			<th>Fiche client</th>
			<th>Editer</th>
			<th>Virement</th>
		</tr>

		<c:forEach var="element" items="${CleClient}">
			<tr>
				<td>${element.prenom}</td>
				<td>${element.nom}</td>
				<td><a href="ServletFicheClient?id=${element.idClient}">
						voir fiche</a></td>
				<td><a href="ServletEdition?id=${element.idClient}"> Editer</a></td>
				<td>Virement</td>
			</tr>
		</c:forEach>




	</table>
</body>
</html>