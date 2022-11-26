package ar.edu.unq.po2.TPFinal.BuscadorDeProyectos;


import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.TPFinal.Proyecto;
import ar.edu.unq.po2.TPFinal.Common.Categoria;


public class BuscadorPorCategorias implements IBuscadorProyectos {
	
	private List<Categoria> categorias = new ArrayList<Categoria>();
	
	public BuscadorPorCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}



	@Override
	public List<Proyecto> filtrar(List<Proyecto> proyectosAFiltrar) {
		// TODO Auto-generated method stub
		return null;
	}
}
