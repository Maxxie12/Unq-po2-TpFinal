package ar.edu.unq.po2.TPFinal;


import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.TPFinal.Common.Coordenada;
import ar.edu.unq.po2.TPFinal.Common.Dificultad;
import ar.edu.unq.po2.TPFinal.Desafio.Desafio;
import ar.edu.unq.po2.TPFinal.Desafio.DesafioUsuario;
import ar.edu.unq.po2.TPFinal.Estado.EstadoCompletado;
import ar.edu.unq.po2.TPFinal.Restriccion.RestriccionFecha;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.RETURNS_DEEP_STUBS;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;

public class DesafioUsuarioTest {
	DesafioUsuario desafioUsuario;
	
	@Mock
	Desafio desafio;
	
	//Prueba para agregar una Muestra
	DesafioUsuario desafioUsuario2;
	Desafio desafio2;
	Area area;
	Coordenada coordenada;
	RestriccionFecha restriccionFecha;
	Muestra muestra;
	
	@Mock
	Usuario usuario;
	
	@BeforeEach
	public void setUp() {
		desafioUsuario = new DesafioUsuario(desafio, 5, LocalDateTime.now());
		
		//Prueba para agregar una Muestra
		coordenada = new Coordenada(2, 3);
		area = new Area(coordenada, 5);
		restriccionFecha = new RestriccionFecha(LocalDateTime.now(), LocalDateTime.now());
		
		desafio2 = new Desafio(area, restriccionFecha, 1, Dificultad.FACIL, 2);
		desafioUsuario2 = new DesafioUsuario(desafio2, 3, LocalDateTime.now());
		muestra = new Muestra(coordenada, usuario, LocalDateTime.now());
		
		
	}
	
	@Test
	public void testEsDesafioAceptadoEstado() {
		desafioUsuario.aceptarDesafio();
		assertEquals(desafioUsuario.getEstado().esDesafioCompletado(), false);
	}
	
	@Test
	public void testEsDesafioCompletado() {
		desafioUsuario.setEstadoDesafio(new EstadoCompletado());
		assertEquals(desafioUsuario.getEstado().esDesafioCompletado(), true);
	}
	
	@Test
	public void votarDesafioTest() {
		desafioUsuario.setEstadoDesafio(new EstadoCompletado());
		desafioUsuario.votarDesafio(3);
		desafioUsuario.votarDesafio(2);
		assertEquals(desafioUsuario.getVotos(), 5);
	}
	
	@Test
	public void testAgregarMuestra() {
		desafioUsuario2.agregarMuestra(muestra);
		assertEquals(desafioUsuario2.getMuestras().size(), 1);
	}
	
	@Test
	public void testesDesafioCompletado() {
		desafioUsuario2.aceptarDesafio();
		desafioUsuario2.agregarMuestra(muestra);
		assertEquals(desafioUsuario2.getEstado().esDesafioCompletado(), new EstadoCompletado().esDesafioCompletado());
		
	}
	

}
