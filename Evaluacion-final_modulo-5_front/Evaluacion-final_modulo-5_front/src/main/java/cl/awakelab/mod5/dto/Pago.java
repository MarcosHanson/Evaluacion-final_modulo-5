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
public class Pago {

	private Integer PagMonto;
	private String PagMes;
	private Integer PagAño;
	private String PagRut;
	private String PagFecha;
}
