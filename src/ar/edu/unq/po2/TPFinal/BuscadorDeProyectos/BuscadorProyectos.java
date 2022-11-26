package ar.edu.unq.po2.TPFinal.BuscadorDeProyectos;

import java.util.List;

import ar.edu.unq.po2.TPFinal.Proyecto;

public interface BuscadorProyectos {

	public abstract List<Proyecto> filtrar(List<Proyecto> proyectosAFiltrar);
	
	public abstract void agregarBuscador(BuscadorProyectos buscadorProyectos);
	
	public abstract void quitarBuscador(BuscadorProyectos buscadorProyectos);
}



 