package ar.edu.unq.po2.TPFinal.BuscadorDeProyectos;

import java.util.List;

import ar.edu.unq.po2.TPFinal.Proyecto;

public class BuscadorNot extends BuscadorProyectos {
	
	private BuscadorProyectos buscadorANegar;
	
	public void setBuscadorANegar(BuscadorProyectos buscadorDeProyectos) {
		this.buscadorANegar = buscadorDeProyectos;
	}
	
	 public List<Proyecto> filtrar(List<Proyecto> proyectosAFiltrar) {
		 List<Proyecto> busquedaNegada = proyectosAFiltrar;
		  
		 busquedaNegada.removeAll(buscadorANegar.filtrar(proyectosAFiltrar));
		 
		 return busquedaNegada;
	 }

	@Override
	public void agregarBuscador(BuscadorProyectos buscadorProyectos) {
		this.buscadorANegar = buscadorProyectos;
		
	}

	@Override
	public void quitarBuscador(BuscadorProyectos buscadorProyectos) {
		// TODO Auto-generated method stub
		
	}


	
	

}
