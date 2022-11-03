package ar.edu.unq.po2.TPFinal.BuscadorDeProyectos;

import java.util.List;

import ar.edu.unq.po2.TPFinal.Proyecto;

public class BuscadorNot extends BuscadorProyectos {
	
	private BuscadorProyectos buscadorANegar;
	
	public void setBuscadorANegrar(BuscadorProyectos buscadorDeProyectos) {
		this.buscadorANegar = buscadorDeProyectos;
	}
	
	 public List<Proyecto> filtrar(List<Proyecto> proyectosAFiltrar) {
		 
		 
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
