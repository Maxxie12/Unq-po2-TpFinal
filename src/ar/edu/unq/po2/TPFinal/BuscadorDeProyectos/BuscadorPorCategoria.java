package ar.edu.unq.po2.TPFinal.BuscadorDeProyectos;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.TPFinal.Proyecto;
import ar.edu.unq.po2.TPFinal.Common.Categoria;


public class BuscadorPorCategoria extends BuscadorProyectos {
	
	private List<Categoria> categorias;
	

	@Override
	public List<Proyecto> filtrar(List<Proyecto> proyectosAFiltrar) {
		List<Proyecto> resultadosDeLaBusqueda = new ArrayList<Proyecto>();
		
		for (Proyecto proyecto : proyectosAFiltrar) {
			if (proyecto.getCategorias().containsAll(this.getCategorias())) {
				resultadosDeLaBusqueda.add(proyecto);
			}
		}
		return resultadosDeLaBusqueda;
	}


	public List<Categoria> getCategorias() {
		return categorias;
	}


	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
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
