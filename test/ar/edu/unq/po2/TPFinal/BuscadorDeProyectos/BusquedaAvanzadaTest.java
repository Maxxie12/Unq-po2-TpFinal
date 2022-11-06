package ar.edu.unq.po2.TPFinal.BuscadorDeProyectos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.TPFinal.Proyecto;

class BusquedaAvanzadaTest {

	@Mock
	Proyecto proyecto1;
	@Mock
    Proyecto proyecto2;
	@Mock
    Proyecto proyecto3;
	@Mock
    Proyecto proyecto4;
	@Mock
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


