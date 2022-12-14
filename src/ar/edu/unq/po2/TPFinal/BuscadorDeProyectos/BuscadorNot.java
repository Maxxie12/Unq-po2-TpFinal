package ar.edu.unq.po2.TPFinal.BuscadorDeProyectos;

import java.util.List;

import ar.edu.unq.po2.TPFinal.Proyecto;

public class BuscadorNot implements IBuscadorProyectos {

	private IBuscadorProyectos filtroBusqueda;

	public BuscadorNot(IBuscadorProyectos buscador) {
		this.filtroBusqueda = buscador;
	}

	public List<Proyecto> filtrar(List<Proyecto> proyectosAFiltrar) {
		//Buscamos los proyectos segun el filtro que queremos negar
		List<Proyecto> busquedaNegada = this.filtroBusqueda.filtrar(proyectosAFiltrar);
		
		//De los mismo proyectos que recibimos, filtramos los que no contienen la busqueda negada
		return proyectosAFiltrar.stream().filter(p -> !busquedaNegada.contains(p)).toList();
	}
}
