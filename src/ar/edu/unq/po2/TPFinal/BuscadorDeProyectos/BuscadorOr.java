package ar.edu.unq.po2.TPFinal.BuscadorDeProyectos;

import java.util.List;

import ar.edu.unq.po2.TPFinal.Proyecto;

public class BuscadorOr extends BusquedaAvanzada {
  
 public BuscadorOr(BuscadorProyectos primerBuscador, BuscadorProyectos segundoBuscador) {
	 this.agregarBuscadores(primerBuscador, segundoBuscador);
 }
 
 public List<Proyecto> filtrar(List<Proyecto> proyectosAFiltrar);
}
