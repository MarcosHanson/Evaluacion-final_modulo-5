package cl.awakelab.mod5.backend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class VisitasEntity {
	
	@Id
	@Column(name="idvisita")
	private Integer idVisita;
	@Column(name="visfecha")
	private String visFecha;
	@Column(name="vishora")
	private String visHora;
	@Column(name="visrutcliente")
	private String visRutCliente;
	@Column(name="visnombrecliente")
	private String visNombreCliente;
	@Column(name="vischequeo")
	private String visChequeo;


}
