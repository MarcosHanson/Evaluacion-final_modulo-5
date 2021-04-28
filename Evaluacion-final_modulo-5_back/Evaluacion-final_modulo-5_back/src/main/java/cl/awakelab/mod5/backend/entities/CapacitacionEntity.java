package cl.awakelab.mod5.backend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

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
@Entity
@SequenceGenerator(name = "CAP_SEQ", initialValue = 1, allocationSize = 1, sequenceName = "CAP_SEQ")
public class CapacitacionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CAP_SEQ")
	@Column(name = "idcapacitacion")
	private Integer idCapacitacion;
	@Column(name = "capfecha")
	private String capFecha;
	@Column(name = "caphora")
	private String capHora;
	@Column(name = "caplugar")
	private String capLugar;
	@Column(name = "capduracion")
	private Integer capDuracion;
	@Column(name = "cliente_rutcliente")
	private String clienteRutCliente;

}
