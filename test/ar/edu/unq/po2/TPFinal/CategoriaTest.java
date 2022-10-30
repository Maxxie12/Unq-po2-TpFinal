package ar.edu.unq.po2.TPFinal;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.TPFinal.Common.Categoria;

public class CategoriaTest {
	
	Categoria categoria;
	
	@BeforeEach
	public void setUp() {
		categoria = new Categoria("Plantas");
	}
	
	@Test
	public void testConstructorCategoria() {
		assertEquals(categoria.getDescripcion(), "Plantas");
	}

}
