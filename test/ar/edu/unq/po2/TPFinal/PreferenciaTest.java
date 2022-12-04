package ar.edu.unq.po2.TPFinal;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.TPFinal.Common.Dificultad;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class PreferenciaTest  {
	Preferencia preferencia;
	
	
	
	@BeforeEach
	public void setUp() {
	
		preferencia = new Preferencia(2, Dificultad.INTERMEDIO, 4);
	}

	
	@Test
	public void testConstuctoCantidadMuestra() {

		assertEquals(preferencia.getCantidadMuestras(), 2);
	}
	
	@Test
	public void testConstructorDificultad() {
		
		assertEquals(preferencia.getDificultad(), Dificultad.INTERMEDIO);
	}
	
	@Test
	public void testConstructorRecompensa() {
		assertEquals(preferencia.getRecompensaPreferida(), 4);
	}
	
	

}