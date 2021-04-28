<%@ page 	language="java" 
			contentType="text/html; charset=ISO-8859-1"
    		pageEncoding="ISO-8859-1"%>

<%@ taglib 	prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib 	prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Crear Usuario</title>
		
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
        <h1 class="centrar">CREAR USUARIO</h1>
		
		<!-- form -->
		<form:form class="formulario" action="/crearUsurario" method="post" modelAttribute="FormCrearUsuario" id="formUs">
		
			<div class="">
				<input type="text" class="campos-form" id="uRun" name="uRun" placeholder="* Rut Usuario">
			</div>
			
			<div class="">
				 <input type="text" placeholder="* Nombres" class="campos-form" id="usuNombre" name="usuNombre" >
			</div>
			
			<div class="">
				<input type="text" placeholder="* Apellidos" class="campos-form" id="usuApellido" name="usuApellido">
			</div>
	
			<div class="">
				 <input placeholder="* Fecha de Nacimiento" type="date" class="campos-form" id="usuFechaNacimiento" name="usuFechaNacimiento"  >
			</div>
	
			<div class="">
				<select class="campos-form" id="usTipo" name="usTipo" >
					<option selected disabled value="">* Tipo de Usuario</option>
					<option value="1">Cliente</option>
					<option value="2">Profesional</option>
					<option value="3">Administrativo</option>
				</select>
			</div>
			<br>
			<div class="">
			<label for="" class=""> (*) Campos obligatorios</label></div>
		</form:form>
		
		<div id="cliente" class="">
		<form:form class="formulario" action="/crearUsurarioCliente" method="post" modelAttribute="FormUsCliente" id="FormUsCliente">
			<h1 class="centrar">DATOS DE CLIENTE</h1>
		
			<div class="">
				 <input type="text" class="campos-form" id="rutCliente" name="rutCliente" placeholder="* Rut del cliente" onfocus="">
			</div>	
			
			<div class="">
				 <input type="text" class="campos-form" id="cliTelefono" name="cliTelefono" placeholder="* Telefono" onfocus="">
			</div>		
				
			<div class="">
				 <input type="text" class="campos-form" id="cliAFP" name="cliAFP" placeholder="* AFP" onfocus="">
			</div>			
				
			<div class="">
				<select id="cliSistemaSalud" name="cliSistemaSalud" class="campos-form">
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
		</form:form>
		</div>
		
		<div id="profesional" class="">
		<form:form class="formulario" action="/crearUsurarioProfesional" method="post" modelAttribute="FormUsProf" id="FormUsProf">
		<h1 class="centrar">DATOS DE PROFESIONAL</h1>
					
			<div class="">
				 <input type="text" class="campos-form" id="proTelefono" name="proTelefono" placeholder="* Telefono" onfocus="">
			</div>	
			
			<div class="">
				 <input type="text" class="campos-form" id="proTitulo" name="proTitulo" placeholder="* Titulo tecnico o profesional" onfocus="">
			</div>		
			
			<div class="">
				 <input type="text" class="campos-form" id="proProyecto" name="proProyecto" placeholder="* Nombre del proyecto" onfocus="">
			</div>
		
		</form:form>
		</div>
		 		
		<div id="administrativo" class="">
		<form:form class="formulario" action="/crearUsurarioAdministrativo" method="post" modelAttribute="FormUsAd" id="FormUsAd">
		<h1>DATOS DE ADMINISTRATIVO</h1>
		
			<div class="">
				 <input type="email" class="campos-form" id="adCorreo" name="adCorreo" placeholder="* Email" onfocus="">
			</div>	
					
			<div class="">
				 <input type="text" class="campos-form" id="adArea" name="adArea" placeholder="* Area administrativa" onfocus="">
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
		
		
		
		
		
		
		
		
		
		