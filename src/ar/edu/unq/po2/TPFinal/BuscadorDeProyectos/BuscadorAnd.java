package ar.edu.unq.po2.TPFinal.BuscadorDeProyectos;

import java.util.List;
import java.util.ArrayList;

import ar.edu.unq.po2.TPFinal.Proyecto;

public class BuscadorAnd implements BuscadorProyectos {
	
	private BuscadorProyectos primerBuscador;
	private BuscadorProyectos segundoBuscador;
	


	public void setPrimerBuscador(BuscadorProyectos primerBuscador) {
		this.primerBuscador = primerBuscador;
	}

	public void setSegundoBuscador(BuscadorProyectos segundoBuscador) {
		this.segundoBuscador = segundoBuscador;
	}

	public BuscadorProyectos getPrimerBuscador() {
		return this.primerBuscador;
	}

	public BuscadorProyectos getSegundoBuscador() {
		return this.segundoBuscador;
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
	public void agregarBuscador(BuscadorProyectos buscadorProyectos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quitarBuscador(BuscadorProyectos buscadorProyectos) {
		// TODO Auto-generated method stub
		
	}

	
}
