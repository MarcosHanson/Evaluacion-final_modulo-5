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
	<title>Responder Checklist</title>
		
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
        <h1>RESPONDER CHECKLIST</h1></div>

		<!-- TABLA -->
    	<div class="container">
        <table id="responderCheck" class="table table-striped table-bordered" style="width:100%">
            
            <thead>
            	<tr>
                	<th>Checks</th>
            	</tr>
            </thead>
            <tbody>
            	<tr>
            		<td>
                    	<input type="checkbox" name="checkbox" value="check1"> <label for="check1">Chequeo 1</label><br>
                       	<input type="checkbox" name="checkbox" value="check2"> <label for="check2">Chequeo 2</label><br>
                        <input type="checkbox" name="checkbox" value="check3"> <label for="check3">Chequeo 3</label><br>
                        <input type="checkbox" name="checkbox" value="check4"> <label for="check4">Chequeo 4</label><br>
                        <input type="checkbox" name="checkbox" value="check5"> <label for="check5">Chequeo 5</label><br>
                        <input type="checkbox" name="checkbox" value="check6"> <label for="check6">Chequeo 6</label><br>
                        <input type="checkbox" name="checkbox" value="check7"> <label for="check7">Chequeo 7</label><br>
                    	<br>
                        <input class="centrar" type="button" name="Submit" value="Verificar" id="verificarChequeo">
                        <div id="contenedor"></div>
                     </td>
				</tr>
			</tbody>
   
        	<tfoot class="formularios menuVolver">	
        		<tr>
    	       		<td>
 		            	<input  type="button" onclick="location.href='./listadovisitas.html';" value="Volver" />
                	</td>
            	</tr>
            </tfoot>
        </table>
		</div>
	
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
            	
            	
            	