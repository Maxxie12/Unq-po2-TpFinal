package ar.edu.unq.po2.TPFinal.BuscadorDeProyectos;

import java.util.List;
import java.util.ArrayList;

import ar.edu.unq.po2.TPFinal.Proyecto;

public class BuscadorAnd extends BusquedaAvanzada {
	
	public BuscadorAnd(BuscadorProyectos primerBuscador, BuscadorProyectos segundoBuscador) {	// CONSTRUCTOR
		this.agregarBuscadores(primerBuscador, segundoBuscador);
		
	}

	public  List<Proyecto> filtrar(List<Proyecto> proyectosAFiltrar){
		List<Proyecto> proyectosAFiltrarConBuscador1 = new ArrayList <Proyecto>();
		List<Proyecto> proyectosAFiltrarConBuscador2 = new ArrayList <Proyecto>();
		
		
		proyectosAFiltrarConBuscador1.addAll(this.getPrimerBuscador().filtrar(proyectosAFiltrar));
		proyectosAFiltrarConBuscador2.addAll(this.getSegundoBuscador().filtrar(proyectosAFiltrar));
		
		proyectosAFiltrarConBuscador1.retainAll(proyectosAFiltrarConBuscador2);
		
		return(proyectosAFiltrarConBuscador1);
		
	}
	
}
