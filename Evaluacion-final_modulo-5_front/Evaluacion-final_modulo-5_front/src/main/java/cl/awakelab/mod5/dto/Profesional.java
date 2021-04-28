package cl.awakelab.mod5.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Profesional {

	private String proRut;
	private String proNombre;
	private String proApellido;
	private String proTelefono;
	private String proTitulo;
	private String proProyecto;
	private String usuariosURun;
	
}
