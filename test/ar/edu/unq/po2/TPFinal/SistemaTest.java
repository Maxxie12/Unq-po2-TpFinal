package ar.edu.unq.po2.TPFinal;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.TPFinal.BuscadorDeProyectos.IBuscadorProyectos;
import ar.edu.unq.po2.TPFinal.Common.Categoria;
import ar.edu.unq.po2.TPFinal.Desafio.Desafio;

public class SistemaTest {
	
	Sistema sistema;
	
	@Mock
	private Desafio desafioA;
	private Desafio desafioB;
	private Desafio desafioC;
	private Proyecto proyectoA;
	private Usuario usuarioA;
	private Usuario usuarioB;
	private Categoria categoria1;
	private Categoria categoria2;
	private Categoria categoria3;
	private Categoria categoria4;
	private IBuscadorProyectos buscadorProyectos;
	
	@BeforeEach
	public void setup() {
		sistema = new Sistema();
	}
	
	@Test
	public void testDesafiosAgregados() {
		sistema.addDesafio(desafioA);
		sistema.addDesafio(desafioB);
		sistema.addDesafio(desafioC);
		
		assertEquals(sistema.getDesafios().size(), 3);
	}
	
	@Test
	public void testProyectosAgregados() {
		sistema.addProyecto(proyectoA);
		
		assertEquals(sistema.getProyectos().size(), 1);
	}
	
	@Test
	public void testUsuariosAgregados() {
		sistema.addUsuario(usuarioA);
		sistema.addUsuario(usuarioB);
		
		assertEquals(sistema.getUsuarios().size(), 2);
	}

	@Test 
	public void testCategoriasAgregadas() {
		sistema.addCategoria(categoria1);
		sistema.addCategoria(categoria2);
		sistema.addCategoria(categoria3);
		sistema.addCategoria(categoria4);
		
		assertTrue(this.sistema.getCategorias().size() == 4);
	}
	
	@Test
	public void testAgregaBuscadorProyectos() {
		sistema.setBuscadorProyectos(buscadorProyectos);
		
		assertTrue(this.sistema.getBuscadorProyectos() == buscadorProyectos);
	}
}
