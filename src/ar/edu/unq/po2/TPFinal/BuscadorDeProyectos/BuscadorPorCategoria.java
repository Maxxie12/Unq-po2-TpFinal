package ar.edu.unq.po2.TPFinal.BuscadorDeProyectos;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.TPFinal.Proyecto;


public class BuscadorPorCategoria extends BuscadorProyectos {
	
	private List<String> categorias;
	

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


	public List<String> getCategorias() {
		return categorias;
	}


	public void setCategorias(List<String> categorias) {
		this.categorias = categorias;
	}

}
