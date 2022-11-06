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

class BuscadorPorTituloTest {
	
	private String fraseABuscar = "";
	List<Proyecto> proyectosAFiltrar = new ArrayList<Proyecto>();
	
	@Mock
	Proyecto proyecto1 = mock(Proyecto.class);
    Proyecto proyecto2 = mock(Proyecto.class);
    Proyecto proyecto3 = mock(Proyecto.class);
    Proyecto proyecto4 = mock(Proyecto.class);
	BuscadorPorTitulo buscadorPorTitulo;   
    
	@BeforeEach
    void setUp() { 
      when(proyecto1.getNombre()).thenReturn("Alrededor del mundo.");
      when(proyecto2.getNombre()).thenReturn("Evolución y procesos geológicos y geoambientales en la región pampeana.");
      when(proyecto3.getNombre()).thenReturn("Separando las Aguas.");
      when(proyecto4.getNombre()).thenReturn("Creando un tornado.");

        proyectosAFiltrar.add(proyecto1);
		proyectosAFiltrar.add(proyecto2);     
		proyectosAFiltrar.add(proyecto3);
		proyectosAFiltrar.add(proyecto4);
    }
    
    
   
    @Test
    void testBuscadorPorTituloEncontrado(){
    	this.fraseABuscar = "procesos geológicos";
    	
    	assertTrue(proyectosAFiltrar.stream().filter(proyecto->proyecto.getNombre().contains(this.fraseABuscar)).toList().contains(proyecto2));
    }

    @Test
    void testBuscadorPorTituloNoEncontrado(){
    	this.fraseABuscar = "titulo  inexistente";
    	
    	assertFalse(proyectosAFiltrar.stream().filter(proyecto->proyecto.getNombre().contains(this.fraseABuscar)).toList().contains(proyecto2));
    }
	 
	 

	
	
 }
