<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="servlets.FormularioServlet"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	 <form action="formulario" method="post">
	 	<label><input type="checkbox" id="cbox1" name="cbox1" value="Bananas"> Bananas</label><br>
	 	<label><input type="checkbox" id="cbox2" name="cbox2" value="Ananas"> Ananas</label><br>
	 	<label><input type="checkbox" id="cbox3" name="cbox3" value="Manzanas"> Manzanas</label><br>
	 	<button type="submit">Agregar al carrito</button>	 	
	 </form>
</body>
</html>