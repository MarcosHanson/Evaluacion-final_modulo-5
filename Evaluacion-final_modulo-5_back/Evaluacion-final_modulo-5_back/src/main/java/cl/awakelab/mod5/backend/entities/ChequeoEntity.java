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
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class ChequeoEntity {
	
	@Id
	@Column(name="id_chequeo")
	private Integer idChequeo;
	@Column(name="nombre")
	private String nombre;
	@Column(name="detalle")
	private String detalle;
	@Column(name="estado")
	private String estado;
	@Column(name="cliente_rutcliente")
	private Integer clienteRutCliente;


}
