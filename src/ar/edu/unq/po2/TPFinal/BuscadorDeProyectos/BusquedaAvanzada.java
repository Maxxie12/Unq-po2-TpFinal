package ar.edu.unq.po2.TPFinal.BuscadorDeProyectos;

import java.util.List;

import ar.edu.unq.po2.TPFinal.Proyecto;

public class BusquedaAvanzada extends BuscadorProyectos {
	
	private List<BuscadorProyectos> buscadoresAAplicar;
	

	@Override
	public List<Proyecto> filtrar(List<Proyecto> proyectosAFiltrar) {
		for ()
		return null;
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

