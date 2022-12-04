package ar.edu.unq.po2.TPFinal;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.TPFinal.Common.Circulo;
import ar.edu.unq.po2.TPFinal.Common.Dificultad;
import ar.edu.unq.po2.TPFinal.Desafio.Desafio;
import ar.edu.unq.po2.TPFinal.Desafio.DesafioUsuario;
import ar.edu.unq.po2.TPFinal.Estado.EstadoCompletado;
import ar.edu.unq.po2.TPFinal.Restriccion.RestriccionFecha;

public class EstadoTest {
	
	EstadoCompletado estadoCompletado;
	DesafioUsuario desafioUsuario;
	
	Desafio desafio;
	
	@Mock
	Circulo area;
	
	@Mock
	RestriccionFecha restriccionFecha;
	
	
	@BeforeEach
	public void setUp() {
		desafio = new Desafio(area, restriccionFecha, 0, Dificultad.INTERMEDIO, 0);
		estadoCompletado = new EstadoCompletado();
		desafioUsuario = new DesafioUsuario(desafio);
	
	}
	
	@Test
	public void testDesafioCompletado() {
		assertEquals(estadoCompletado.getPorcentajeCompletititud(desafioUsuario), new EstadoCompletado().getPorcentajeCompletititud(desafioUsuario));
	}


}
