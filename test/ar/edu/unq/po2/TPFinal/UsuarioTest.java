package ar.edu.unq.po2.TPFinal;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.TPFinal.Common.Dificultad;
import ar.edu.unq.po2.TPFinal.Desafio.Desafio;
import ar.edu.unq.po2.TPFinal.Desafio.DesafioUsuario;
import ar.edu.unq.po2.TPFinal.Estado.EstadoCompletado;
import ar.edu.unq.po2.TPFinal.Estado.EstadoVencido;
import ar.edu.unq.po2.TPFinal.Recomendador.RecomendadorPorPreferencia;
import ar.edu.unq.po2.TPFinal.Restriccion.RestriccionFecha;

public class UsuarioTest {
	
	Usuario usuario;
	
	@Mock
	Preferencia preferencia;
	
	@Mock
	Sistema sistema;
	
	@Mock
	Area area;
	
	@Mock
	RestriccionFecha restriccionFecha;
	
	@Mock
	RecomendadorPorPreferencia recomendadorPorPreferencia;
	
	DesafioUsuario desafioUsuarioA;
	DesafioUsuario desafioUsuarioB;
	DesafioUsuario desafioUsuarioC;
	
	DesafioUsuario desafioUsuarioD;
	
	Desafio desafioA;
	Desafio desafioB;
	Desafio desafioC;
	
	@BeforeEach
	public void setUp() {
		
	
		
		usuario = new Usuario("Caso01", preferencia, sistema);
		
		
		
		desafioA = new Desafio(area, restriccionFecha, 2, Dificultad.FACIL, 2);
		desafioB = new Desafio(area, restriccionFecha, 3, Dificultad.INTERMEDIO, 3);
		desafioC = new Desafio(area, restriccionFecha, 4, Dificultad.DIFICIL, 4);
		
		
		desafioUsuarioA = new DesafioUsuario(desafioA);
		desafioUsuarioB = new DesafioUsuario(desafioB);
		desafioUsuarioC = new DesafioUsuario(desafioC);
		desafioUsuarioD = new DesafioUsuario(desafioC);
		
		desafioUsuarioA.setEstadoDesafio(new EstadoCompletado());
		desafioUsuarioB.setEstadoDesafio(new EstadoVencido());
		desafioUsuarioC.setEstadoDesafio(new EstadoCompletado());
		
		desafioUsuarioA.setPorcentajeCompletititud(2);
		desafioUsuarioB.setFechaCompletado(LocalDateTime.now());
		
		
		List<Desafio> desafios = new ArrayList<>();
		desafios.add(desafioA);
		desafios.add(desafioB);
		desafios.add(desafioC);
		
		usuario.agregarDesafio(desafios);
		
	
		
		
	}
	
	
	@Test
	public void testConstructorNombre() {
		assertEquals(usuario.getNombre(), "Caso01");
	}
	
	@Test
	public void testConstructorPreferencia() {
		assertEquals(usuario.getPreferencia(), preferencia);
	}

	@Test
	public void testConstructorSistema() {
		assertEquals(usuario.getSistema(), preferencia);
	}
	
	@Test
	public void testDesafiosCompletados() {
		assertEquals(usuario.desafiosCompletados().size(), 0);
		
	}
	
	@Test
	public void testPorcentajeCompletitud() {
		
		assertEquals(usuario.porcentajeCompletitud(desafioUsuarioA), 2);
	}
	
	@Test
	public void testEsDesafioCompleto() {
		assertTrue(usuario.estaCompleto(desafioUsuarioA));
	}
	
	@Test
	public void testFechaCompletadoTest() {

		assertEquals(usuario.fechaCompletado(desafioUsuarioB), LocalDateTime.now());
	}
	
	@Test
	public void testPromedioCompletitud() {
		assertEquals(usuario.promedioCompletitudGeneral(), 0);
		
	}
	
	@Test
	public void testAceptarDesafio() {
		usuario.aceptarDesafio(desafioUsuarioD);
		assertEquals(desafioUsuarioD.getEstado().esDesafioCompletado(), false);
	}

	

}
