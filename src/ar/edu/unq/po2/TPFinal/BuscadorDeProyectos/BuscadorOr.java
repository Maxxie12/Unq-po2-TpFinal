package ar.edu.unq.po2.TPFinal.BuscadorDeProyectos;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.TPFinal.Proyecto;

public class BuscadorOr extends BuscadorProyectos {
  
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
 public List<Proyecto> filtrar(List<Proyecto> proyectosAFiltrar){
    List<Proyecto> proyectosResultantes = new ArrayList <Proyecto>();
	
    proyectosResultantes.addAll(this.getPrimerBuscador().filtrar(proyectosAFiltrar));
    proyectosResultantes.addAll(this.getSegundoBuscador().filtrar(proyectosAFiltrar));
	
	return proyectosResultantes.stream().distinct().toList();
	
 
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
 

