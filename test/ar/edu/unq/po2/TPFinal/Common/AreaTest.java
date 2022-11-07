package ar.edu.unq.po2.TPFinal.Common;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.TPFinal.Area;
import ar.edu.unq.po2.TPFinal.Common.Coordenada;

public class AreaTest {
	
	Area area;
	
	@Mock
	Coordenada cordenada;
	
	@BeforeEach
	public void setUp() {
		area = new Area(cordenada, 7);
	}
	
	@Test
	public void testConstructorCoordenada() {
		assertEquals(area.getCoordenada(), cordenada);
	}
	
	@Test
	public void testConstructorRadio() {
		assertEquals(area.getRadio(), 7);
	}

}
