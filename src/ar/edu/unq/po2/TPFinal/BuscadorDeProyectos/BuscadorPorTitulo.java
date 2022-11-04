package ar.edu.unq.po2.TPFinal.BuscadorDeProyectos;

import java.util.ArrayList;
import java.util.List;
import ar.edu.unq.po2.TPFinal.Proyecto;

public class BuscadorPorTitulo extends BuscadorProyectos {
	
	private String tituloABuscar;
	

	@Override
	public List<Proyecto> filtrar(List<Proyecto> proyectosAFiltrar) {
		List<Proyecto> resultadoBusqueda = new ArrayList<Proyecto>();
		
		   proyectosAFiltrar.stream().filter(p -> p.getNombre().toUpperCase().contains(tituloABuscar.toUpperCase())).toList();
		   
		return resultadoBusqueda;
	}
	


public void textoABuscar( String tituloABuscar) {
	this.tituloABuscar  = tituloABuscar;
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
	

