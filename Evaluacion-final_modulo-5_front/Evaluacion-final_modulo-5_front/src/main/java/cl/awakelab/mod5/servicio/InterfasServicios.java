package cl.awakelab.mod5.servicio;

import java.util.List;

public interface InterfasServicios<E> {
		
	public List<E> listar();
	
	public E crear(E dato);
	
	public void borrar(E dato);
	
	public E modificar(E dato);
	
	public E buscarPorId(String runUsuario);
	
}
