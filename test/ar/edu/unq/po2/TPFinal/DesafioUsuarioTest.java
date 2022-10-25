package ar.edu.unq.po2.TPFinal;


import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.TPFinal.Estado.EstadoCompletado;


import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

public class DesafioUsuarioTest {
	DesafioUsuario desafioUsuario;
	
	@Mock
	Desafio desafio;
	
	
	@BeforeEach
	public void setUp() {
		desafioUsuario = new DesafioUsuario(desafio, 5, LocalDateTime.now());
		
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

}
