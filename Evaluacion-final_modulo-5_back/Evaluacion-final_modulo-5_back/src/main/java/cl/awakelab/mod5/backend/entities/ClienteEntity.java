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
public class ClienteEntity {

	@Id
	@Column(name = "rutcliente")
	private Integer rutCliente;
	@Column(name = "clinombres")
	private String cliNombres;
	@Column(name = "cliapellidos")
	private String cliApellidos;
	@Column(name = "clitelefono")
	private String cliTelefono;
	@Column(name = "cliafp")
	private String cliAfp;
	@Column(name = "clisistemasalud")
	private String cliSistemaSalud;
	@Column(name = "clidireccion")
	private String cliDireccion;
	@Column(name = "clicomuna")
	private String cliComuna;
	@Column(name = "cliedad")
	private String cliEdad;
	@Column(name = "usuarios_urun")
	private Integer usuariosURun;
}
