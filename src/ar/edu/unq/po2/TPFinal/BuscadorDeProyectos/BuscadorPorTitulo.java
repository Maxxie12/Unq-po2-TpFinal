package ar.edu.unq.po2.TPFinal.BuscadorDeProyectos;

import java.util.ArrayList;
import java.util.List;
import ar.edu.unq.po2.TPFinal.Proyecto;

public class BuscadorPorTitulo implements BuscadorProyectos {
	private String fraseABuscar = "";
	

	
   public void fraseABuscar(String fraseABuscar) {
	   this.fraseABuscar = fraseABuscar;
   }
   
   
	@Override
	public List<Proyecto> filtrar(List<Proyecto> proyectosAFiltrar){
		List<Proyecto> resultadosDeLaBusqueda = new ArrayList<Proyecto>();
		resultadosDeLaBusqueda = proyectosAFiltrar.stream().filter(proyecto->proyecto.getNombre().contains(this.fraseABuscar)).toList();
		
		return (resultadosDeLaBusqueda);
	}
	








@Override
public void agregarBuscador(BuscadorProyectos buscadorProyectos) {
	// TODO Auto-generated method stub
	
}



@Override
public void quitarBuscador(BuscadorProyectos buscadorProyectos) {
	// TODO Auto-generated method stub
	
}







}
	

