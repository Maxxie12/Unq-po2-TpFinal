package ar.edu.unq.po2.TPFinal.BuscadorDeProyectos;

import java.util.List;
import java.util.ArrayList;

import ar.edu.unq.po2.TPFinal.Proyecto;

public class BuscadorAnd extends BuscadorLogico {

	public BuscadorAnd(IBuscadorProyectos filtroBusqueda1, IBuscadorProyectos filtroBusqueda2) {
		super(filtroBusqueda1, filtroBusqueda2);
		
	}

	@Override
	public List<Proyecto> filtrar(List<Proyecto> proyectosAFiltrar) {
		List<Proyecto> proyectosAFiltrarConBuscador1 = new ArrayList <Proyecto>();
		List<Proyecto> proyectosAFiltrarConBuscador2 = new ArrayList <Proyecto>();
		
		
		proyectosAFiltrarConBuscador1.addAll(this.getFiltroBusqueda1().filtrar(proyectosAFiltrar));
		proyectosAFiltrarConBuscador2.addAll(this.getFiltroBusqueda2().filtrar(proyectosAFiltrar));
		
		proyectosAFiltrarConBuscador1.retainAll(proyectosAFiltrarConBuscador2); // Me quedo con los proyectos que aparecen en ambas listas
		return(proyectosAFiltrarConBuscador1);
	}	
}
