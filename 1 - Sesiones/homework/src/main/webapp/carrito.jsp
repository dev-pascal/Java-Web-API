<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="controller.CarritoController"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Carrito</title>
<body>
	<% CarritoController.cargar(out, session); %>
	<br>
	<br>
	<form action="carrito" method="post">
		<button type="submit">Vaciar carrito</button>	
	</form>
	<a href="/ej01.hw">Home</a>
</body>
</head>
</html>