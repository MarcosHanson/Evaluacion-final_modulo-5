package cl.awakelab.mod5.backend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class ProfesionalEntity {

	@Id
	@Column(name = "prorut")
	private Integer proRut;
	@Column(name = "pronombre")
	private String proNombre;
	@Column(name = "proapellido")
	private String proApellido;
	@Column(name = "protelefono")
	private String proTeleofno;
	@Column(name = "protitulo")
	private String proTitulo;
	@Column(name = "proproyecto")
	private String proProyecto;
	@Column(name = "usuarios_urun")
	private Integer usuariosURun;

}
