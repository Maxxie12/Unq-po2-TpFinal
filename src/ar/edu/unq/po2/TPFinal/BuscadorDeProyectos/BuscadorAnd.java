package ar.edu.unq.po2.TPFinal.BuscadorDeProyectos;

import java.util.List;
import java.util.ArrayList;

import ar.edu.unq.po2.TPFinal.Proyecto;

public class BuscadorAnd extends BuscadorProyectos {
	
	private BuscadorProyectos PrimerBuscador;
	private BuscadorProyectos SegundoBuscador;
	
	public BuscadorAnd(BuscadorProyectos primerBuscador, BuscadorProyectos segundoBuscador) {	// CONSTRUCTOR
		this.agregarBuscadores(primerBuscador, segundoBuscador);
		
	}	

	public BuscadorProyectos getPrimerBuscador() {
		return PrimerBuscador;
	}

	public BuscadorProyectos getSegundoBuscador() {
		return SegundoBuscador;
	}

	public  List<Proyecto> filtrar(List<Proyecto> proyectosAFiltrar){
		List<Proyecto> proyectosAFiltrarConBuscador1 = new ArrayList <Proyecto>();
		List<Proyecto> proyectosAFiltrarConBuscador2 = new ArrayList <Proyecto>();
		
		
		proyectosAFiltrarConBuscador1.addAll(this.getPrimerBuscador().filtrar(proyectosAFiltrar));
		proyectosAFiltrarConBuscador2.addAll(this.getSegundoBuscador().filtrar(proyectosAFiltrar));
		
		proyectosAFiltrarConBuscador1.retainAll(proyectosAFiltrarConBuscador2); // Me quedo con los proyectos que aparecen en ambas listas
		return(proyectosAFiltrarConBuscador1);
		
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
