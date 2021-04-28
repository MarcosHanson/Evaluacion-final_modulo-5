package cl.awakelab.mod5.dto;



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
public class Visitas {
	
	private Integer idVisitas;
	private String visFecha;
	private String visHora;
	private String visRut;
	private String visNombre;
	private String visChequeo;
	
	
	

}
