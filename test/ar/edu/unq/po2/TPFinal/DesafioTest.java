package ar.edu.unq.po2.TPFinal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.TPFinal.Common.Dificultad;
import ar.edu.unq.po2.TPFinal.Desafio.Desafio;
import ar.edu.unq.po2.TPFinal.Desafio.DesafioUsuario;
import ar.edu.unq.po2.TPFinal.Restriccion.RestriccionFecha;

public class DesafioTest {
	
	Desafio desafio;
	
	
	@Mock
	Area area;
	
	@Mock
	RestriccionFecha restriccionFecha;
	
	@BeforeEach
	public void setUp() {
		desafio = new Desafio(area, restriccionFecha, 3, Dificultad.INTERMEDIO, 5);
	}
	
	@Test
	public void testConstructorArea() {
		assertEquals(desafio.getArea(), area);
	}
	
	@Test
	public void testConstructorRestriccion() {
		assertEquals(desafio.getRestriccionTemporal(), restriccionFecha);
	}
	
	@Test
	public void testConstructorDificultad() {
		assertEquals(desafio.getDificultad(), Dificultad.INTERMEDIO);
	}
	
	@Test
	public void testConstructorRecompensa() {
		assertEquals(desafio.getRecompensa(), 5);
	}

}
