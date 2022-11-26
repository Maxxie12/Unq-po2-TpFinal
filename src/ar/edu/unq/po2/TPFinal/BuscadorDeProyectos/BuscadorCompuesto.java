package ar.edu.unq.po2.TPFinal.BuscadorDeProyectos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ar.edu.unq.po2.TPFinal.Proyecto;

public class BuscadorCompuesto implements IBuscadorProyectos {

	private List<IBuscadorProyectos> buscadoresProyecto = new ArrayList<IBuscadorProyectos>();

	@Override
	public List<Proyecto> filtrar(List<Proyecto> proyectosAFiltrar) {
		List<IBuscadorProyectos> buscadoresAAplicar = this.buscadoresProyecto;
		List<Proyecto> resultadosFiltrados = new ArrayList<Proyecto>();

		for (IBuscadorProyectos buscadores : buscadoresAAplicar) {
			resultadosFiltrados = buscadores.filtrar(proyectosAFiltrar);

		}

		return (resultadosFiltrados = resultadosFiltrados.stream().collect(Collectors.toSet()).stream()
				.collect(Collectors.toList()));

	}

	public void addBuscador(IBuscadorProyectos buscadorProyectos) {
		buscadoresProyecto.add(buscadorProyectos);

	}

	public void removeBuscador(IBuscadorProyectos buscadorProyectos) {
		buscadoresProyecto.remove(buscadorProyectos);
	}

}
