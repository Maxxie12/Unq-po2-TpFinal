package ar.edu.unq.po2.TPFinal.BuscadorDeProyectos;

import java.util.ArrayList;
import java.util.List;
import ar.edu.unq.po2.TPFinal.Proyecto;


public class ExclusionPorCategoria extends BuscadorPorCategoria {
	

	@Override
	public List<Proyecto> filtrar(List<Proyecto> proyectosAFiltrar) {
		List<Proyecto> resultadosDeLaBusqueda = new ArrayList<Proyecto>();
		
		for (Proyecto proyecto : proyectosAFiltrar) {
			if (!(proyecto.getCategorias().containsAll(this.getCategorias()))) {
				resultadosDeLaBusqueda.add(proyecto);
			}
		}
		return resultadosDeLaBusqueda;
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



