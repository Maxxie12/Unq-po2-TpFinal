package ar.edu.unq.po2.TPFinal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.TPFinal.Desafio.Desafio;
import ar.edu.unq.po2.TPFinal.Desafio.DesafioUsuario;
import ar.edu.unq.po2.TPFinal.Estado.EstadoAceptado;
import ar.edu.unq.po2.TPFinal.Estado.EstadoCompletado;

public class EstadoCompletadoTest {
	
	EstadoCompletado estadoCompletado;
	DesafioUsuario desafioUsuario;
	
	@Mock
	Desafio desafio;
	
	@BeforeEach
	public void setUp() {
		estadoCompletado = new EstadoCompletado();
		desafioUsuario = new DesafioUsuario(desafio, 4, LocalDateTime.now());
	}
	
	@Test
	public void testDesafoCompletadop() {
		estadoCompletado.desafioCompletado(desafioUsuario);
		assertEquals(estadoCompletado.esDesafioCompletado(), new EstadoCompletado().esDesafioCompletado());
	}

}
