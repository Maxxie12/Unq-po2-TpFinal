package ar.edu.unq.po2.TPFinal.BuscadorDeProyectos;


import java.util.List;
import java.util.stream.Collectors;

import ar.edu.unq.po2.TPFinal.Proyecto;

public class BusquedaAvanzada extends BuscadorProyectos {
	
	private List<BuscadorProyectos> buscadoresAAplicar;
	

	@Override
	public List<Proyecto> filtrar(List<Proyecto> proyectosAFiltrar) {
		List<BuscadorProyectos> buscadoresAAplicar = this.buscadoresAAplicar;
		List<Proyecto> resultadosFiltrados = null;
		
		for (BuscadorProyectos buscadores : buscadoresAAplicar) {
			resultadosFiltrados = buscadores.filtrar(proyectosAFiltrar);
			
		}
		
	   return (resultadosFiltrados = resultadosFiltrados.stream()
               .collect(Collectors.toSet())
               .stream()
               .collect(Collectors.toList()));
	          
	}

	@Override
	public void agregarBuscador(BuscadorProyectos buscadorProyectos) {
		buscadoresAAplicar.add(buscadorProyectos);
		
	}

	@Override
	public void quitarBuscador(BuscadorProyectos buscadorProyectos) {
		buscadoresAAplicar.remove(buscadorProyectos);
	}


	
	
}

