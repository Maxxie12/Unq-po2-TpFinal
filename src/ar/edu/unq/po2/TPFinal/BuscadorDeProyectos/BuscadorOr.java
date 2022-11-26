package ar.edu.unq.po2.TPFinal.BuscadorDeProyectos;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.TPFinal.Proyecto;

public class BuscadorOr extends BuscadorLogico {

	public BuscadorOr(IBuscadorProyectos filtroBusqueda1, IBuscadorProyectos filtroBusqueda2) {
		super(filtroBusqueda1, filtroBusqueda2);
	}

	@Override
	public List<Proyecto> filtrar(List<Proyecto> proyectosAFiltrar) {
		List<Proyecto> proyectosResultantes = new ArrayList <Proyecto>();
		
	    proyectosResultantes.addAll(this.getFiltroBusqueda1().filtrar(proyectosAFiltrar));
	    proyectosResultantes.addAll(this.getFiltroBusqueda2().filtrar(proyectosAFiltrar));
		
		return proyectosResultantes.stream().distinct().toList();
	}
}
 

