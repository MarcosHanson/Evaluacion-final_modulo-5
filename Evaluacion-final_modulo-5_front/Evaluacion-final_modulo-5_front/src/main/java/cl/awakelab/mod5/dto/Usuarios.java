package cl.awakelab.mod5.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Usuarios {

	private String uRun;
	private String usuNombre;
	private String usuApellido;
	private String usuFechaNacimiento;
	private String tipoUsuario;
	private String password;
	
}