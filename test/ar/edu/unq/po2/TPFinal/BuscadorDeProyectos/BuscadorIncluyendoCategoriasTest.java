package ar.edu.unq.po2.TPFinal.BuscadorDeProyectos;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.TPFinal.Proyecto;
import ar.edu.unq.po2.TPFinal.Common.Categoria;

class BuscadorIncluyendoCategoriasTest {

	@Mock
	Proyecto proyecto1 = mock(Proyecto.class);
    Proyecto proyecto2 = mock(Proyecto.class);
    Proyecto proyecto3 = mock(Proyecto.class);
    Proyecto proyecto4 = mock(Proyecto.class);
	BuscadorIncluyendoCategorias buscadorIncluyendoCategorias;
	Categoria categoria;
	
	
	@BeforeEach
	void setUp() {
		List<Proyecto> proyectosAFiltrar = new ArrayList<Proyecto>();
		  when(proyecto1.getCategorias()).thenReturn("Alrededor del mundo.");
	      when(proyecto2.getCategorias()).thenReturn("Evolución y procesos geológicos y geoambientales en la región pampeana.");
	      when(proyecto3.getCategorias()).thenReturn("Separando las Aguas.");
	      when(proyecto4.getCategorias()).thenReturn("Creando un tornado.");

	        proyectosAFiltrar.add(proyecto1);
			proyectosAFiltrar.add(proyecto2);     
			proyectosAFiltrar.add(proyecto3);
			proyectosAFiltrar.add(proyecto4);
		
	}
	
	
	@Test
	void buscadorIncluyendoCategorias(List<Proyecto> proyectosAFiltrar) {
		
	}

}
