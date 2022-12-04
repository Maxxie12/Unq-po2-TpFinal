package ar.edu.unq.po2.TPFinal.Common;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CoordenadaTest {
	Coordenada coordenada;
	
	@BeforeEach
	public void setUp() {
		coordenada = new Coordenada(0,0);
	}
	
	@Test
	public void testCoordenadaInicial() {
		assertEquals(0, coordenada.getX());
		assertEquals(0, coordenada.getY());
	}
	
	@Test
	public void testNuevaCoordenada() {
		
		Coordenada coordenadaNueva = new Coordenada(12,46);
		
		assertEquals(12, coordenadaNueva.getX());
		assertEquals(46, coordenadaNueva.getY());
	}
	
	@Test
	public void testCambioPosicionCoordenada() {
		
		coordenada.setX(2);
		coordenada.setY(5);
		
		assertEquals(2, coordenada.getX());
		assertEquals(5, coordenada.getY());
	}

}
