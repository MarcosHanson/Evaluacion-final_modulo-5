<%@ page 	language="java" 
			contentType="text/html; charset=ISO-8859-1"
    		pageEncoding="ISO-8859-1"%>

<%@ taglib 	prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib 	prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Listado de Usuarios</title>
		
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
        <h1>LISTADO DE USUARIOS</h1>
        </div>

 		<!-- TABLA -->
    	<div class="container">
        <table id="listaUsuarios" class="table table-striped table-bordered" style="width:100%">
            <thead>
            	<tr>
                	<th>Rut Usuario</th>
                    <th>Nombres</th>
                    <th>Apelidos</th>
                    <th>Fecha de Nacimiento</th>
                    <th>Tipo de usuario</th>
                    <th>Password</th>
                    <th>Eliminar</th>
                    <th>Editar</th>
                </tr>
            </thead>

			<tbody>
            	<c:forEach items="${claveListaUsuario}" var="listaUsuario">
	                <tr>
	                    <td><c:out value="${listaUsuario.getURun()}"></c:out></td>
	                    <td><c:out value="${listaUsuario.getUsuNombres()}"></c:out></td>
	                    <td><c:out value="${listaUsuario.getUusApellidos()}"></c:out></td>
	                    <td><c:out value="${listaUsuario.getUsuFechaNacimiento()}"></c:out></td>
	                    <td><c:out value="${listaUsuario.getTipoUsuario()}"></c:out></td>
	                    <td><c:out value="${listaUsuario.getPassword()}"></c:out></td>
	                    

	                    <td>Cliente</td>
	                        <td><a 	href=""><img 
	                        		src="https://cdn.icon-icons.com/icons2/55/PNG/128/editDelete_11203.png"
	    							width="30px"></a></td>
	                        <td><a 	href="/administrativo/buscar?rut=${listaUsuario.getURun()}"><img
	                                src="https://cdn.icon-icons.com/icons2/402/PNG/128/edit-validated_40458.png"
	                                width="30px"></a></td>
	                </tr>
               </c:forEach> 
            </tbody>
           	<br>
        	<div>
           		<input 	type="button" 
           				onclick="location.href='crearCapacitacion';"
                    	value="Crear usuario">
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