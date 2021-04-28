<%@ page 	language="java" 
			contentType="text/html; charset=ISO-8859-1"
    		pageEncoding="ISO-8859-1"%>

<%@ taglib 	prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib 	prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Listado de Visitas</title>
		
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
        <h1>LISTADO DE VISITAS</h1></div>
		
		<!-- TABLA -->
    	<div class="container">
        <table id="listadoVisitas" class="table table-striped table-bordered" style="width:100%">
            <thead>
            	<tr>
                	<th>Id visita</th>
                    <th>Fecha</th>
                    <th>Hora</th>
                    <th>RUT del cliente</th>
                    <th>Nombre del cliente</th>
                    <th>Chequeo de asesoria</th>
                </tr>
            </thead>
            
            <tbody>
            	<c:forEach items="${claveListaVisitas}" var="listaVisitas">
	                <tr>
	                    <td><c:out value="${listaUsuario.getIdVisita()}"></c:out></td>
	                    <td><c:out value="${listaUsuario.getVisFecha()}"></c:out></td>
	                    <td><c:out value="${listaUsuario.getVisHora()}"></c:out></td>
	                    <td><c:out value="${listaUsuario.getVisRut()}"></c:out></td>
	                    <td><c:out value="${listaUsuario.getNombre()}"></c:out></td>
	                    <td><c:out value="${listaUsuario.getVisChequeo()}"></c:out></td>
	                </tr>
               	</c:forEach> 
            </tbody>
           	<br>
        	<div>
           		<input 	type="button" 
           				onclick="location.href='crearCapacitacion';"
                    	value="Crear visita">
  			</div>
	       	</table>
			
			<!-- Scrips data table  -->
	        <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
	        <script src="https://cdn.datatables.net/1.10.24/js/jquery.dataTables.min.js"></script>
	        <script src="https://cdn.datatables.net/1.10.24/js/dataTables.jqueryui.min.js"></script>
	
	        <script>
	            $(document).ready(function () {
	                $('#listarcapacitaciones').DataTable({
	                    language: {
	                        url: 'http://cdn.datatables.net/plug-ins/1.10.24/i18n/Spanish.json'
	                    }
	                });
	            });
	        </script>
	   	</div>
	 
	 	<footer><h1>© 2021  humanidea  ·  Pivacidad  ·  Terminos  · Mapa del Sitios </h1></footer>
	</body>
</html>
	                 