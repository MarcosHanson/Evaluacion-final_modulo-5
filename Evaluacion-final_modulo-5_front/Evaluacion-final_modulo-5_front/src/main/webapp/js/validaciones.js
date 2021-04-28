/** VALIDACION RUT **/
$(document).ready(function() {
$.validator.addMethod("valRut", function (value, element) {
	var pattern = /([0-9]{8})([-]{1})([0-9]{1})/;
	return this.optional(element) || pattern.test(value);
		});
    });
	
/** VALIDACION TELEFONO **/
$(document).ready(function() {
	$.validator.addMethod("valTel", function (value, element) {
    	var pattern = /([+]{1})([5]{1}[6]{1}[9]{1})([0-9]{8}$)/;
    	return this.optional(element) || pattern.test(value);
  		});
    });   

/** VALIDACION EMAIL**/
$(document).ready(function() {
	$.validator.addMethod("valEmail", function (value, element) {
    	var pattern = /^(([^<>()[\]\.,;:\s@\"]+(\.[^<>()[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i;
    	return this.optional(element) || pattern.test(value);
  		});
    });   


/** VALIDACION CONTACTO **/

$(document).ready(function () {
	$("#formContacto").validate({
		
		rules: {
			nomContacto: {
					required: true,
					minlength: 1,
					maxlength: 50},

			mailContacto: {
					required: true,
					valEmail: true},

			telContacto: {
					required: true,
					valTel: true},

			menContacto: {
					required: true,
					minlength: 1,
					maxlength: 250},

			genContacto: {
					required: true,},},
		
		messages: {
			nomContacto: {
					required: "Campo bligatorio",
					minlength: "Se requiere al menos un caracter",
					maxlength: "Se requiere menos de 50 caracteres"},

			mailContacto: {
					required: "Campo bligatorio",
					valEmail: "Se requiere email valido"},

			telContacto: {
					required: "Campo bligatorio",
					valTel: "El formato del telefono valido es: +569XXXXXXXX"},

			menContacto: {
					required: "Campo bligatorio",
					minlength: "Se requiere al menos un caracter",
					maxlength: "Se requiere menos de 250 caracteres"},

			genContacto: {
					required: "Campo bligatorio"},},
            })
        });

/** CREAR CAPACITACION **/
$(document).ready(function () {
    $("#formCap").validate({
		
		rules: {
			idCapacitacion: {
					required: true,
					minlength: 1,
					maxlength: 50},
			
			capFecha: {
					required: true},				
			
			capHora: {
					required: true},			
			
			capLugar: {
					required: true,
					minlength: 1,
					maxlength: 50},
			
			capDuracion: {
					required: true,
					min: 1,
					max: 1000},
			
			clienteRutCliente: {
					required: true,
					valRut: true },},
			
		messages: {
			idCapacitacion: {
					required: "Campo obligatorio",
    				minlength: "Se requiere al menos un caracter",
				 	maxlength: "Se requiere menos de 50 caracteres"},		
			
			capFecha: {
					required: "Campo obligatorio"},				
			
			capHora: {
					required: "Campo obligatorio"},			
			
			capLugar: {
					required: "Campo obligatorio",
    				minlength: "Se requiere al menos un caracter",
				 	maxlength: "Se requiere menos de 50 caracteres"},		
			
			capDuracion: {
					required: "Campo obligatorio",
					min: "Se requiere al menos una hora",
					max: "Se requiere menos de 1000 horas"},
			
			clienteRutCliente: {
					required: "Campo obligatorio",
					valRut: "El formato válido de rut es: XXXXXXXX-X. En caso de terminar con K, reemplacelo con 0"},},
        });
    })
    
/** VALIDACION USUARIO **/

$(document).ready(function () {
  	$("#formUs").validate({
		
		rules: {
			uRun: {
					required: true,
					valRut: true},
    				
    		usuNombre: {
    				required: true,
    				minlength: 1,
					maxlength: 50},
    	
    		usuApellido: {
    				required: true,
    				minlength: 1,
					maxlength: 50},
    	
    		usuFechaNacimiento:{
    				required: true}, 
    				    	
    		usTipo: {
    				required: true},},
    	
    	messages: {
    		uRun: {		
    				required: "Campo obligatorio",
    				valRut: "El formato válido de rut es: XXXXXXXX-X. En caso de terminar con K, reemplacelo con 0"},
    				
    		usuNombre: {
    				required:"Campo obligatorio",
    				minlength: "Se requiere al menos un caracter",
				 	maxlength: "Se requiere menos de 50 caracteres"},		
    				
    		usuApellido: {
    				required:"Campo obligatorio",
    				minlength: "Se requiere al menos un caracter",
				 	maxlength: "Se requiere menos de 50 caracteres"},		
    			
    		usuFechaNacimiento: {
    				required: "Campo obligatorio"},
    				
    		usTipo: {
    				required: "Campo obligatorio"},		
                },
            }
        );
    })

/** VALIDACION CLIENTE **/		
 $(document).ready(function () {
  	$("#FormUsCliente").validate({
		
		rules: {   	
			rutCliente: {
					required: true,
					valRut: true},
			
			cliNombres: {
					required: true,
					minlength: 1,
					maxlength: 50},
    	
			cliApellidos: {
					required: true,
					minlength: 1,
					maxlength: 50},
    	
			cliTelefono: {
					required: true,
					valTel: true}, 
					
			cliAfp: {
					required: true,
					minlength: 1,
					maxlength: 20},
				
			cliSistemaSalud: {
					required: true},
			
			cliDireccion: {
					required: true,
					minlength: 1,
					maxlength: 100},
					
			cliComuna: {
					required: true,
					minlength: 1,
					maxlength: 50},
					
			cliEdad: {
					required: true,
					min: 0,
					max: 120},
								
			usuariosURun: {
					required: true,
					valRut: true},},
			
		messages: {
			rutCliente: {
					required:"Campo obligatorio",
					valRut: "El formato válido de rut es: XX.XXX.XXX-X. En caso de terminar con K, reemplacelo con 0"},
			
			cliNombres: {
					required: "Campo obligatorio",
					minlength: "Se requiere al menos un caracter",
					maxlength: "Se requiere menos de 50 caracteres"},
    	
			cliApellidos: {
					required: "Campo obligatorio",
					minlength: "Se requiere al menos un caracter",
					maxlength: "Se requiere menos de 50 caracteres"},
    	
			cliTelefono: {
					required: "Campo obligatorio",
					valTel: "El formato del telefono valido es: +569XXXXXXXX"}, 
					
			cliAfp: {
					required: "Campo obligatorio",
					minlength: "Se requiere al menos un caracter",
					maxlength: "Se requiere menos de 20 caracteres"},
				
			cliSistemaSalud: {
					required: "Campo obligatorio"},
			
			cliDireccion: {
					required: "Campo obligatorio",
					minlength: "Se requiere al menos un caracter",
					maxlength: "Se requiere menos de 100 caracteres"},
					
			cliComuna: {
					required: "Campo obligatorio",
					minlength: "Se requiere al menos un caracter",
					maxlength: "Se requiere menos de 50 caracteres"},
					
			cliEdad: {
					required: "Campo obligatorio",
					min: "Se requiere al menos un valor",
					max: "Se requiere menos de 120 años"},
								
			usuariosURun: {
					required: "Campo obligatorio",
					valTel: "El formato válido de rut es: XXXXXXXX-X. En caso de terminar con K, reemplacelo con 0"},}
			});	
		});
   
/** VALIDACION PROFESIONAL **/		
 $(document).ready(function () {
  	$("#FormUsProf").validate({
		
		rules: {
			
			proRut: {
					required: true,
					valRut: true},
					
			proNombre: {
					required: true,
					minlength: 1,
					maxlength: 50},
			
			proApellido: {
					required: true,
					minlength: 1,
					maxlength: 50},
					
			proTelefono: {
					required: true,
					valTel: true},
					
			proTitulo: {
					required: true,
					minlength: 1,
					maxlength: 50},
					
			proProyecto: {	
					required: true,
					minlength: 1,
					maxlength: 150},
					
			usuariosURun: {
					required: true,
					valRut: true},},
			
		messages: {
			proRut: {
					required:"Campo obligatorio",
					valRut: "El formato válido de rut es: XX.XXX.XXX-X. En caso de terminar con K, reemplacelo con 0"},
					
			proNombre: {
					required: "Campo obligatorio",
					minlength: "Se requiere al menos un caracter",
					maxlength: "Se requiere menos de 50 caracteres"},
			
			proApellido: {
					required: "Campo obligatorio",
					minlength: "Se requiere al menos un caracter",
					maxlength: "Se requiere menos de 50 caracteres"},
					
			proTelefono: {
					required: "Campo obligatorio",
					valTel:"El formato del telefono valido es: +569XXXXXXXX"},
					
			proTitulo: {
					required: "Campo obligatorio",
					minlength: "Se requiere al menos un caracter",
					maxlength: "Se requiere menos de 50 caracteres"},
					
			proProyecto: {	
					required: "Campo obligatorio",
					minlength: "Se requiere al menos un caracter",
					maxlength: "Se requiere menos de 150 caracteres"},
					
			usuariosURun: {
					required: "Campo obligatorio",
					valRut: "El formato válido de rut es: XXXXXXXX-X. En caso de terminar con K, reemplacelo con 0"},}
			});	
		});
		

/** VALIDAR ADMINISTRATIVO **/ 
$(document).ready(function () {
  	$("#FormUsAd").validate({
		
		rules: {
			adRut: {
					required: true,
					valRut: true},
					
			adNombre: {
					required: true,
					minlength: 1,
					maxlength: 50},
			
			adApellido: {
					required: true,
					minlength: 1,
					maxlength: 50},
					
			adCorreo: {
					required: true,
					valEmail: true},
					
			adArea: {
					required: true,
					minlength: 1,
					maxlength: 50},},
			
		messages: {
			adRut: {
					required:"Campo obligatorio",
					valRut: "El formato válido de rut es: XX.XXX.XXX-X. En caso de terminar con K, reemplacelo con 0"},
					
			adNombre: {
					required: "Campo obligatorio",
					minlength: "Se requiere al menos un caracter",
					maxlength: "Se requiere menos de 50 caracteres"},
			
			adApellido: {
					required: "Campo obligatorio",
					minlength: "Se requiere al menos un caracter",
					maxlength: "Se requiere menos de 50 caracteres"},
			
			adCorreo: {
					required: "Campo obligatorio",
					valEmail: "El formato válido de email es: XX@XX.XX" },
			
			adArea: {
					required: "Campo obligatorio",
					minlength: "Se requiere al menos un caracter",
					maxlength: "Se requiere menos de 50 caracteres"},}
			});	
		});
			
					
/** VALIDAR PAGO **/ 
$(document).ready(function () {
  	$("#formPago").validate({
		
		rules: {	
    		PagMonto: {
    				required: true,
					min: 1,
					max: 1000000000},
    		
    		PagMes: {
    				required: true},
    		
    		PagAño: {
    				required: true,
    				min: 2000,
					max: 2021},
    		
    		PagRut: {
    				required: true,
    				valRut: true},
    		
    		PagFecha: {
    				required: true},},
			
        messages: {
    		PagMonto: {
    				required: "Campo obligatorio",
					min: "Se requiere al menos un valor",
					max: "Se requiere menos de $1.000.000.000"},
    		
    		PagMes: {
    				required: "Campo obligatorio"},
    					
    		PagAño: {
    				required: "Campo obligatorio",
    				min: "Se requiere introducir un año superior a 2000",
					max: "Se requiere introducir un menor inferior a 2022"},
					
    		PagRut: {
    				required:"Campo obligatorio",
					valRut: "El formato válido de rut es: XXXXXXXX-X. En caso de terminar con K, reemplacelo con 0"},
    		
    				PagFecha: {
    				required: true}
                }    
            });
        });
