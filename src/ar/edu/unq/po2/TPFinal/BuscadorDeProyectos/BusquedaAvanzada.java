package ar.edu.unq.po2.TPFinal.BuscadorDeProyectos;

import java.util.List;

import ar.edu.unq.po2.TPFinal.Proyecto;

public class BusquedaAvanzada extends BuscadorProyectos {
	
	private BuscadorProyectos PrimerBuscador;
	private BuscadorProyectos SegundoBuscador;

	@Override
	public List<Proyecto> filtrar(List<Proyecto> proyectosAFiltrar) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void agregar(BuscadorProyectos buscadorProyectos1, BuscadorProyectos buscadorProyectos2) {
		this.PrimerBuscador  = buscadorProyectos1;
		this.SegundoBuscador = buscadorProyectos2; 
		
	}

	

	public BuscadorProyectos getPrimerBuscador() {
		return PrimerBuscador;
	}

	public BuscadorProyectos getSegundoBuscador() {
		return SegundoBuscador;
	}

	@Override
	public void quitar(BuscadorProyectos buscadorProyectos1, BuscadorProyectos buscadorProyectos2) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

