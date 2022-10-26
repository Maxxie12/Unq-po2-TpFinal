package ar.edu.unq.po2.TPFinal;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.TPFinal.Common.Coordenada;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

public class MuestraTest {
	
	Muestra muestra;
	
	@Mock
	Coordenada coordenada;
	
	@Mock
	Usuario usuario;
	
	
	@BeforeEach
	public void setUp() {
		muestra = new Muestra(coordenada, usuario, LocalDateTime.now());
		
	}
	
	@Test
	public void testConstuctorUsuarioMuestra() {
		assertEquals(usuario, muestra.getUsuario());
		
	}
	
	@Test
	public void testConstuctorUsuarioCoordenada() {
		assertEquals(coordenada, muestra.getCoordenada());
		
	}
	
	
	

}
