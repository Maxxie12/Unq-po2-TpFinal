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

class BuscadorPorCategoriasTest {
    
	private List<Categoria> categorias = new ArrayList<Categoria>();

	@Mock
	BuscadorPorCategorias buscadorPorCategorias;
	Categoria categoria1 = mock(Categoria.class);
    Categoria categoria2 = mock(Categoria.class);
    Categoria categoria3 = mock(Categoria.class);
    Categoria categoria4 = mock(Categoria.class);
    
	@BeforeEach
	void setUp() {
		when(categoria1.getDescripcion()).thenReturn("Geografía");
	    when(categoria2.getDescripcion()).thenReturn("Geología");
	    when(categoria3.getDescripcion()).thenReturn("Química");
	    when(categoria4.getDescripcion()).thenReturn("Química");
	    categorias.add(categoria1);
	    categorias.add(categoria2);
	    categorias.add(categoria3);
	    categorias.add(categoria4);
	    
	}
    
    
    @Test
    void testBuscadorPorCategorias() {
 assertTrue(buscadorPorCategorias.getCategorias().contains(categoria2));
    }
    

}