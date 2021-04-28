<%@ page 	language="java" 
			contentType="text/html; charset=ISO-8859-1"
    		pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Contacto</title>
		<!-- jquery -->		
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
		 
		<!-- jquery validate -->
		<script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.3/dist/jquery.validate.min.js"></script>
		 
		<!-- archivo JavaScript -->
		<script type="text/javascript" src="/js/validaciones.js"></script>
	
		<!-- BootStrap -->
		<link	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
				rel="stylesheet"
				integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
				crossorigin="anonymous">
		
		<!-- css-->
		<style type="text/css"> <%@include file="/css/style.css"%></style>
	
</head>

<body>

	<!--nav -->	
	<div>
        <img src="https://evaluaciones.alineosoft.com/gentelella-master/production/images/logo-humanidea.png">
        <jsp:include page="menu/menu.jsp"></jsp:include>
    	
    </div>

	<h1 class="centrar"> CONTACTO</h1>
	
	
	<form class="formulario" action="" method="" id="formContacto">

		<div class="">
			<input class="campos-form" type="text" id="nomContacto" name="nomContacto" placeholder="* Nombre">
		</div>

		<div class="">
			 <input class="campos-form" type="email" id="mailContacto" name="mailContacto" placeholder="* Email" >
		</div>

		<div class="">
			<input class="campos-form" type="tel" id="telContacto" name="telContacto" placeholder="* Telefono [+569XXXXXXXX]">
		</div>

		<div class="">
			<input class="campos-form" type="text"id="menContacto" name="menContacto" placeholder="* Mensaje">
		</div>

		<div class="">
			<select class="campos-form" id="genContacto" name="genContacto">
				<option selected disabled value="">* Genero</option>
				<option value="1">Hombre</option>
				<option value="2">Mujer</option>
			</select>
		</div>
		<br>
		<div class="">
			<label for="" class=""> (*) Campos obligatorios</label></div>
		<br>
		<div class="">
			<input class="submit" id="boton" type="submit" value="Enviar"></div>		
		</div>
	</form>

	<!-- BootStrap -->
    <script
        src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"
        integrity="sha384-SR1sx49pcuLnqZUnnPwx6FCym0wLsk5JZuNx2bPPENzswTNFaQU1RDvt3wT4gWFG"
        crossorigin="anonymous"></script>
    <script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.min.js"
        integrity="sha384-j0CNLUeiqtyaRmlzUHCPZ+Gy5fQu0dQ6eZ/xAww941Ai1SxSY+0EQqNXNE6DZiVc"
        crossorigin="anonymous"></script>	
	
		 <footer>
        <h1>© 2021  humanidea  ·  Pivacidad  ·  Terminos  · Mapa del Sitios </h1>
        </footer>
	</body>
</html>