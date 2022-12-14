package ar.edu.unq.po2.TPFinal;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.TPFinal.Common.Circulo;
import ar.edu.unq.po2.TPFinal.Common.Dificultad;
import ar.edu.unq.po2.TPFinal.Desafio.Desafio;
import ar.edu.unq.po2.TPFinal.Desafio.DesafioUsuario;
import ar.edu.unq.po2.TPFinal.Estado.EstadoCompletado;
import ar.edu.unq.po2.TPFinal.Recomendador.RecomendadorPorPreferencia;
import ar.edu.unq.po2.TPFinal.Restriccion.RestriccionFecha;

public class UsuarioTest {
	
	Usuario usuario;
	
	@Mock
	Preferencia preferencia;
	
	Sistema sistema;
	
	@Mock
	Circulo area;
	
	@Mock
	RestriccionFecha restriccionFecha;
	
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
		
	
	
		sistema = new Sistema();
		usuario = new Usuario("Caso01", preferencia, sistema);
		
	
		
		desafioA = new Desafio(area, restriccionFecha, 2, Dificultad.FACIL, 2);
		desafioB = new Desafio(area, restriccionFecha, 3, Dificultad.INTERMEDIO, 3);
		desafioC = new Desafio(area, restriccionFecha, 4, Dificultad.DIFICIL, 4);
		
		recomendadorPorPreferencia = new RecomendadorPorPreferencia();
		
		
		desafioUsuarioA = new DesafioUsuario(desafioA);
		desafioUsuarioB = new DesafioUsuario(desafioB);
		desafioUsuarioC = new DesafioUsuario(desafioC);
		desafioUsuarioD = new DesafioUsuario(desafioC);
		
		desafioUsuarioA.setEstadoDesafio(new EstadoCompletado());
		desafioUsuarioC.setEstadoDesafio(new EstadoCompletado());
		
	
		desafioUsuarioB.setFechaCompletado(LocalDateTime.now());
		
		
		
		List<Desafio> desafios = new ArrayList<>();
		desafios.add(desafioA);
		desafios.add(desafioB);
		desafios.add(desafioC);
		
		usuario.agregarDesafios(desafios);
		usuario.setTipoRecomendacion(recomendadorPorPreferencia);
		
		sistema.addDesafio(desafioA);
		sistema.addDesafio(desafioB);
		sistema.addDesafio(desafioC);
		
	
		
		
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
		assertEquals(usuario.getSistema(), sistema);
	}
	
	@Test
	public void testDesafiosCompletados() {
		assertEquals(usuario.desafiosCompletados().size(), 0);
		
	}
	
	@Test
	public void testPorcentajeCompletitud() {
		
		assertEquals(usuario.porcentajeCompletitud(desafioUsuarioA), 100);
	}
	
	@Test
	public void testEsDesafioCompleto() {
		assertTrue(usuario.estaCompleto(desafioUsuarioA));
	}
	
	@Test
	public void testTipoRecomendacion() {
		assertEquals(usuario.getTipoRecomendacion(), recomendadorPorPreferencia);
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
		assertEquals(desafioUsuarioD.getEstado().getPorcentajeCompletititud(desafioUsuarioD), 0);
	}
	
	@Test
	public void testBuscarDesafio() {
		
		assertEquals(usuario.getDesafios().size(), 3);
		
	}
	
	@Test
	public void testVotarDesafio() {
		usuario.votarDesafioUsuario(desafioUsuarioA);
		assertEquals(desafioUsuarioA.getVotos(), 1);
		
	}
	

	

}
