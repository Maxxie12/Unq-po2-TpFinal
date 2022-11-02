package ar.edu.unq.po2.TPFinal.BuscadorDeProyectos;

import java.util.List;

import ar.edu.unq.po2.TPFinal.Proyecto;

public abstract class BuscadorProyectos {

	public abstract List<Proyecto> filtrar(List<Proyecto> proyectosAFiltrar);
	
	public abstract void agregar(BuscadorProyectos buscadorProyectos1, BuscadorProyectos buscadorProyectos2);
	
	public abstract void quitar(BuscadorProyectos buscadorProyectos1, BuscadorProyectos buscadorProyectos2);
}



 