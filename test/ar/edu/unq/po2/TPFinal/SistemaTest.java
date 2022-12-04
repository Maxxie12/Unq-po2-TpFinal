package ar.edu.unq.po2.TPFinal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.TPFinal.Desafio.Desafio;

public class SistemaTest {
	
	Sistema sistema;
	
	@Mock
	private List<Desafio> desafios;
	
	@Mock
	private List<Proyecto> proyectos;
	
	@Mock
	private List<Usuario> usaurios;
	
	@Mock
	private Desafio desafioA;
	@Mock
	private Desafio desafioB;
	@Mock
	private Desafio desafioC;
	
	@Mock
	private Proyecto proyectoA;
	
	@Mock
	private Usuario usuarioA;
	@Mock
	private Usuario usuarioB;
	
	@BeforeEach
	public void setup() {
		sistema = new Sistema();
		desafios = new ArrayList<>();
		proyectos = new ArrayList<>();
		usaurios = new ArrayList<>();
		
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

}
