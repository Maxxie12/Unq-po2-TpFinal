package ar.edu.unq.po2.TPFinal.BuscadorDeProyectos;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.TPFinal.Proyecto;

class BuscadorPorTituloTest {
	
	private String fraseABuscar = "";
	
	
	@Mock
	Proyecto proyecto1;
	@Mock
    Proyecto proyecto2;
	@Mock
    Proyecto proyecto3;
	@Mock
    Proyecto proyecto4;
	@Mock
	BuscadorPorTitulo buscadorPorTitulo;   
    
	@BeforeEach
    void setUp() {
      List<Proyecto> proyectosAFiltrar = new ArrayList<Proyecto>();
      
      when(proyecto1.getNombre()).thenReturn("Alrededor del mundo.");
      when(proyecto2.getNombre()).thenReturn("Evolución y procesos geológicos y geoambientales en la región pampeana.");
      when(proyecto3.getNombre()).thenReturn("Separando las Aguas.");
      when(proyecto4.getNombre()).thenReturn("Creando un tornado.");
        
        proyectosAFiltrar.add(proyecto1);
		proyectosAFiltrar.add(proyecto2);     
		proyectosAFiltrar.add(proyecto3);
		proyectosAFiltrar.add(proyecto4);
		System.out.println(proyecto1.getNombre());	
    }
    
    
   
    @Test
    void buscadorPorTitulo(List<Proyecto>proyectosAFiltrar){
    	this.fraseABuscar = "procesos geológicos";
    	
    	assertTrue(proyectosAFiltrar.stream().filter(proyecto->proyecto.getNombre().contains(this.fraseABuscar)).toList().contains(proyecto2));
    }


	 
	 

	
	
 }
