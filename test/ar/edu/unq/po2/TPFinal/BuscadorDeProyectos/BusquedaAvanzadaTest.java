package ar.edu.unq.po2.TPFinal.BuscadorDeProyectos;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.TPFinal.Proyecto;

class BusquedaAvanzadaTest {

	@Mock
	Proyecto proyecto1 = mock(Proyecto.class);
    Proyecto proyecto2 = mock(Proyecto.class);
    Proyecto proyecto3 = mock(Proyecto.class);
    Proyecto proyecto4 = mock(Proyecto.class);
	BuscadorAnd busquedaAvanzada;
	
	@BeforeEach
	void setUp() {
	List<Proyecto> proyectosAFiltrar = new ArrayList<Proyecto>();
	List<BuscadorProyectos> buscadoresAAplicar = new ArrayList <BuscadorProyectos>();
	proyectosAFiltrar.add(proyecto1);
	proyectosAFiltrar.add(proyecto2);     
	proyectosAFiltrar.add(proyecto3);
	proyectosAFiltrar.add(proyecto4);
	
	
	
 }
	
	@Test
	void busquedaAvanzada(List<Proyecto>proyectosAFiltrar) {
		
		}
		
		
	}


