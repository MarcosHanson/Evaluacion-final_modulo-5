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
public class AdministrativoEntity {

	@Id
	@Column(name = "adrut")
	private Integer adRut;
	@Column(name = "adnombre")
	private String adNombre;
	@Column(name = "adapellido")
	private String adApellido;
	@Column(name = "adcorreo")
	private String adCorreo;
	@Column(name = "adarea")
	private String adArea;
	@Column(name = "usuarios_urun")
	private Integer usuariosURun;

}
