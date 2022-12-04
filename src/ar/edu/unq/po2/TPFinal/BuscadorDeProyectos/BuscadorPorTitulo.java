package ar.edu.unq.po2.TPFinal.BuscadorDeProyectos;

import java.util.ArrayList;
import java.util.List;
import ar.edu.unq.po2.TPFinal.Proyecto;

public class BuscadorPorTitulo implements IBuscadorProyectos {
	private String fraseABuscar = "";
	
	public BuscadorPorTitulo(String fraseABuscar) {
		this.fraseABuscar = fraseABuscar;
	}

	public String getFraseABuscar() {
		return fraseABuscar;
	}

	public void setFraseABuscar(String fraseABuscar) {
		this.fraseABuscar = fraseABuscar;
	}

	@Override
	public List<Proyecto> filtrar(List<Proyecto> proyectosAFiltrar) {
		List<Proyecto> resultadosDeLaBusqueda = new ArrayList<Proyecto>();
		resultadosDeLaBusqueda = proyectosAFiltrar.stream()
				.filter(proyecto -> proyecto.getNombre().contains(this.fraseABuscar)).toList();

		return (resultadosDeLaBusqueda);
	}

}
