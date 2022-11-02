package ar.edu.unq.po2.TPFinal.BuscadorDeProyectos;

import java.util.ArrayList;
import java.util.List;
import ar.edu.unq.po2.TPFinal.Proyecto;

public class BuscadorPorTitulo extends BuscadorProyectos {
	
	private String tituloABuscar;
	

	@Override
	public List<Proyecto> filtrar(List<Proyecto> proyectosAFiltrar) {
		List<Proyecto> proyectoBuscado = new ArrayList<Proyecto>();
		
		   proyectosAFiltrar.stream().filter(p -> p.getNombre().toUpperCase().contains(tituloABuscar.toUpperCase())).toList();
		   
		return proyectoBuscado;
	}
	


public void textoABuscar( String tituloABuscar) {
	this.tituloABuscar  = tituloABuscar;
 }



@Override
public void agregarBuscadores(BuscadorProyectos buscadorProyectos1, BuscadorProyectos buscadorProyectos2) {
	// TODO Auto-generated method stub
	
}



@Override
public void quitarBuscadores(BuscadorProyectos buscadorProyectos1, BuscadorProyectos buscadorProyectos2) {
	// TODO Auto-generated method stub
	
}







}
	

