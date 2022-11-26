package ar.edu.unq.po2.TPFinal.BuscadorDeProyectos;

import java.util.List;

import ar.edu.unq.po2.TPFinal.Proyecto;

public class BuscadorNot implements IBuscadorProyectos {

	private IBuscadorProyectos filtroBusqueda;

	public BuscadorNot(IBuscadorProyectos buscador) {
		this.filtroBusqueda = buscador;
	}

	public List<Proyecto> filtrar(List<Proyecto> proyectosAFiltrar) {
		List<Proyecto> busquedaNegada = proyectosAFiltrar;

		busquedaNegada.removeAll(filtroBusqueda.filtrar(proyectosAFiltrar));

		return busquedaNegada;
	}
}
