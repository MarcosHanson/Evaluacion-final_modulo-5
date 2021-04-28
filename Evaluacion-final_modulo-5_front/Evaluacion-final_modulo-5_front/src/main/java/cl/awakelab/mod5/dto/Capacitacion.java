package cl.awakelab.mod5.dto;

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
public class Capacitacion {

	private String idCapacitacion;
	private String capFecha;
	private String capHora;
	private String capLugar;
	private Integer capDuracion;
	private String clienteRutCliente;
	
}
