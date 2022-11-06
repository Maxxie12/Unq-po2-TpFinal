package ar.edu.unq.po2.TPFinal.BuscadorDeProyectos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.TPFinal.Proyecto;

class BuscadorIncluyendoCategoriasTest {

	@Mock
	Proyecto proyecto1;
	@Mock
    Proyecto proyecto2;
	@Mock
    Proyecto proyecto3;
	@Mock
    Proyecto proyecto4;
	@Mock
	BuscadorIncluyendoCategorias buscadorIncluyendoCategorias;
	
	
	@BeforeEach
	void setUp() {
		List<Proyecto> proyectosAFiltrar = new ArrayList<Proyecto>();
	}
	
	
	@Test
	void buscadorIncluyendoCategorias(List<Proyecto> proyectosAFiltrar) {
		
	}

}
