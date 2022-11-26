package ar.edu.unq.po2.TPFinal.BuscadorDeProyectos;

import java.util.List;

import ar.edu.unq.po2.TPFinal.Proyecto;

public abstract class BuscadorLogico {

	private IBuscadorProyectos filtroBusqueda1;
	private IBuscadorProyectos filtroBusqueda2;

	public BuscadorLogico(IBuscadorProyectos filtroBusqueda1, IBuscadorProyectos filtroBusqueda2) {
		this.filtroBusqueda1 = filtroBusqueda1;
		this.filtroBusqueda2 = filtroBusqueda2;
	}

	public IBuscadorProyectos getFiltroBusqueda1() {
		return filtroBusqueda1;
	}

	public IBuscadorProyectos getFiltroBusqueda2() {
		return filtroBusqueda2;
	}

	public abstract List<Proyecto> filtrar(List<Proyecto> proyectosAFiltrar);

}
