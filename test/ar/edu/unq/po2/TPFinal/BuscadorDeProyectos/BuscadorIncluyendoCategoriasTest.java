package ar.edu.unq.po2.TPFinal.BuscadorDeProyectos;

import static org.junit.Assert.assertTrue;
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
	
	BuscadorIncluyendoCategorias buscadorIncluyendoCategorias;

	List<Proyecto> proyectosAFiltrar = new ArrayList<Proyecto>();
	List<Categoria> categorias = new ArrayList<Categoria>();
 
	@Mock
	Proyecto proyecto1   = mock(Proyecto.class);
    Proyecto proyecto2 	 = mock(Proyecto.class);
    Proyecto proyecto3   = mock(Proyecto.class);
    Proyecto proyecto4   = mock(Proyecto.class);
	Categoria categoria1 = mock(Categoria.class);
    Categoria categoria2 = mock(Categoria.class);
    Categoria categoria3 = mock(Categoria.class);
    Categoria categoria4 = mock(Categoria.class);
	
	
	@BeforeEach
	void setUp() {
		List<Categoria> categoriasProyecto1  = new ArrayList<Categoria>();
		List<Categoria> categoriasProyecto2  = new ArrayList<Categoria>();
		List<Categoria> categoriasProyecto3  = new ArrayList<Categoria>();
		List<Categoria> categoriasProyecto4  = new ArrayList<Categoria>();
		
		  when(proyecto1.getCategorias()).thenReturn(categoriasProyecto1);
	      when(proyecto2.getCategorias()).thenReturn(categoriasProyecto2);
	      when(proyecto3.getCategorias()).thenReturn(categoriasProyecto3);
	      when(proyecto4.getCategorias()).thenReturn(categoriasProyecto4);
	      when(categoria1.getDescripcion()).thenReturn("Geografía");
		  when(categoria2.getDescripcion()).thenReturn("Geología");
		  when(categoria3.getDescripcion()).thenReturn("Química");
		  when(categoria4.getDescripcion()).thenReturn("Fisica");
		  proyectosAFiltrar.add(proyecto1);
		  proyectosAFiltrar.add(proyecto2);     
		  proyectosAFiltrar.add(proyecto3);
		  proyectosAFiltrar.add(proyecto4);
		  categoriasProyecto1.add(categoria1);
		  categoriasProyecto2.add(categoria1);
		  categoriasProyecto2.add(categoria2);
		  categoriasProyecto3.add(categoria3);
		  categoriasProyecto4.add(categoria4);
		  buscadorIncluyendoCategorias = new BuscadorIncluyendoCategorias();
		  buscadorIncluyendoCategorias.setCategorias(categorias);

	
	}
	
	
	@Test
	void testIncluyendoCategorias() {
		this.categorias.add(categoria3);
		assertTrue(buscadorIncluyendoCategorias.filtrar(this.proyectosAFiltrar).contains(this.proyecto3));

	}
	
	@Test
	void testConVariasCategorias() {
		this.categorias.add(categoria1);
		this.categorias.add(categoria2);
		assertTrue(buscadorIncluyendoCategorias.filtrar(this.proyectosAFiltrar).contains(this.proyecto2));
	}
	
	@Test
	void testConVariasCategoriasNoContieneElemento() {
		this.categorias.add(categoria1);
		this.categorias.add(categoria2);
		assertFalse(buscadorIncluyendoCategorias.filtrar(this.proyectosAFiltrar).contains(this.proyecto4));
	}
	
	
	
}
