package ar.edu.unq.po2.TPFinal.BuscadorDeProyectos;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.TPFinal.Proyecto;

public class BuscadorOr extends BuscadorProyectos {
  
    private BuscadorProyectos PrimerBuscador;
	private BuscadorProyectos SegundoBuscador;

	public void setPrimerBuscador(BuscadorProyectos primerBuscador) {
		PrimerBuscador = primerBuscador;
	}

	public void setSegundoBuscador(BuscadorProyectos segundoBuscador) {
		SegundoBuscador = segundoBuscador;
	}

	public BuscadorProyectos getPrimerBuscador() {
		return PrimerBuscador;
	}

   	public BuscadorProyectos getSegundoBuscador() {
		return SegundoBuscador;
	}
 
 public List<Proyecto> filtrar(List<Proyecto> proyectosAFiltrar){
    List<Proyecto> proyectosAFiltrarConBuscador1 = new ArrayList <Proyecto>();
	List<Proyecto> proyectosAFiltrarConBuscador2 = new ArrayList <Proyecto>();
	
	proyectosAFiltrarConBuscador1.addAll(this.getPrimerBuscador().filtrar(proyectosAFiltrar));
	proyectosAFiltrarConBuscador2.addAll(this.getSegundoBuscador().filtrar(proyectosAFiltrar));
	
	proyectosAFiltrarConBuscador1.removeAll(proyectosAFiltrarConBuscador2); // Me quedo con los proyectos que NO se repiten en ambas listas
	
	return (proyectosAFiltrarConBuscador1);
	
 
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
 
}
