package ar.edu.unq.po2.TPFinal.BuscadorDeProyectos;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.TPFinal.Proyecto;

class BuscadorNotTest {

	private BuscadorProyectos buscadorANegar;
	

	@Mock
	Proyecto proyecto1 = mock(Proyecto.class);
    Proyecto proyecto2 = mock(Proyecto.class);
    Proyecto proyecto3 = mock(Proyecto.class);
    Proyecto proyecto4 = mock(Proyecto.class);
	BuscadorNot buscadorNot;
   
	
	@BeforeEach
	void setUp() {
		List<Proyecto> proyectosAFiltrar = new ArrayList<Proyecto>();
	}
}
