package ar.edu.unq.po2.TPFinal.BuscadorDeProyectos;


import java.util.List;

import ar.edu.unq.po2.TPFinal.Proyecto;
import ar.edu.unq.po2.TPFinal.Common.Categoria;


public class BuscadorPorCategorias extends BuscadorProyectos {
	
	private List<Categoria> categorias;
	

	public List<Categoria> getCategorias() {
		return categorias;
	}


	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}



	@Override
	public List<Proyecto> filtrar(List<Proyecto> proyectosAFiltrar) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void agregarBuscador(BuscadorProyectos buscadorProyectos) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void quitarBuscador(BuscadorProyectos buscadorProyectos) {
		// TODO Auto-generated method stub
		
	}




}
