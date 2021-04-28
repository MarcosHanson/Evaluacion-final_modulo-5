<%@ page 	language="java" 
			contentType="text/html; charset=ISO-8859-1"
    		pageEncoding="ISO-8859-1"%>

<%@ taglib 	prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib 	prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Editar Cliente</title>
		
		<!-- BootStrap -->
		<link	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
				rel="stylesheet"
				integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
				crossorigin="anonymous">
		
		<!-- Librerías tabla -->
	    <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
	    <link rel="stylesheet" href="https://cdn.datatables.net/1.10.24/css/dataTables.jqueryui.min.css">
		
		<!-- CSS -->
		<style type="text/css"> <%@include file="/css/style.css"%></style> 	
	</head>

	<body>
		<!--NAV -->	
		<div>
      		<img src="https://evaluaciones.alineosoft.com/gentelella-master/production/images/logo-humanidea.png">
        	<jsp:include page="menu/menu.jsp"></jsp:include>
    	</div>
    
    	<!-- TITULO PAGINA -->
    	<div class="centrar">
        <h1>EDITAR CLIENTE</h1></div>
    	
		<!-- form -->
		<form:form class="formulario" action="/crearUsurarioCliente" method="post" modelAttribute="FormUsCliente" id="FormUsCliente">
		
			<div class="">
				 <input type="text" class="campos-form" id="rutCliente" name="rutCliente" placeholder="* Rut del cliente" onfocus="">
			</div>	
			
			<div class="">
				 <input type="text" class="campos-form" id="cliTelefono" name="cliTelefono" placeholder="* Telefono" onfocus="">
			</div>		
				
			<div class="">
				 <input type="text" class="campos-form" id="cliAFP" name="cliAFP" placeholder="* AFP" onfocus="">
			</div>			
				
			<div >
				<select class="campos-form" id="cliSistemaSalud" name="cliSistemaSalud">
					<option selected disabled value="">* Sistema de Salud</option>
					<option value="1">Fonasa</option>
					<option value="2">Isapre</option>		 
				</select>
			</div>	
			
			<div class="">
				 <input type="text" class="campos-form" id="cliDireccion" name="cliDireccion" placeholder="* Direccion" onfocus="">
			</div>	
				
			<div class="">
				 <input type="text" class="campos-form" id="cliComuna" name="cliComuna" placeholder="* Comuna" onfocus="">
			</div>	
				
			<div class="">
				 <input type="number" class="campos-form" id="cliEdad" name="cliEdad" placeholder="* Edad" onfocus="">
			</div>		 
	
		
			<br>
			<div class="">
				<label for="" class=""> (*) Campos obligatorios</label></div>	
			<br>
			<div class="">
				<input class="submit" id="boton" type="submit" value="Enviar"></div>	
		</form:form>
		</div>
	
				<!-- BootStrap -->
	    <script
	        src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"
	        integrity="sha384-SR1sx49pcuLnqZUnnPwx6FCym0wLsk5JZuNx2bPPENzswTNFaQU1RDvt3wT4gWFG"
	        crossorigin="anonymous"></script>
	    <script
	        src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.min.js"
	        integrity="sha384-j0CNLUeiqtyaRmlzUHCPZ+Gy5fQu0dQ6eZ/xAww941Ai1SxSY+0EQqNXNE6DZiVc"
	        crossorigin="anonymous"></script>	
		
		<!-- jquery -->		
		 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
		 
		 <!-- jquery validate -->
		 <script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.3/dist/jquery.validate.min.js"></script>
		 
		 <!-- archivo JavaScript -->
		 <script type="text/javascript" src="/js/validaciones.js"></script>
		
			 <footer>
	        <h1>© 2021  humanidea  ·  Pivacidad  ·  Terminos  · Mapa del Sitios </h1>
	        </footer>
	</body>
</html>
