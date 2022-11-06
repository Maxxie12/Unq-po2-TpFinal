package ar.edu.unq.po2.TPFinal.Restriccion;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.TPFinal.Muestra;

class RestriccionSemanaTest {

	private IRestriccionTemporal restriccionSemana;
	private IRestriccionTemporal restriccionFinSemana;

	private LocalDateTime diaSemana;
	private LocalDateTime diaFinSemana;
	
	@Mock
	private Muestra muestraSemana = mock(Muestra.class);
	private Muestra muestraFinSemana = mock(Muestra.class);
	
	@BeforeEach
	public void setUp() {
		//Estos son dias que sabemos que si o si con de dia de la semana y el otro de fin de semana.
		diaSemana = LocalDateTime.parse("2022-11-02T15:15");
		diaFinSemana = LocalDateTime.parse("2022-11-06T17:30");

		restriccionSemana = new RestriccionSemana();
		restriccionFinSemana = new RestriccionFinSemana();

		// Muestra tomada en dia de semana.
		when(muestraSemana.getFechaYHora()).thenReturn(diaSemana);
		// Muestra con fecha fin de semana.
		when(muestraFinSemana.getFechaYHora()).thenReturn(diaFinSemana);
	}

	@Test
	void testMuestraSemanaValida() {
		assertTrue(restriccionSemana.validar(muestraSemana.getFechaYHora()));
	}
	
	@Test
	void testMuestraSemanaInvalida() {
		assertFalse(restriccionSemana.validar(muestraFinSemana.getFechaYHora()));
	}
	
	@Test
	void testMuestraFinSemanaInvalida() {
		assertFalse(restriccionFinSemana.validar(muestraSemana.getFechaYHora()));
	}
	
	@Test
	void testMuestraFinSemanaValida() {
		assertTrue(restriccionFinSemana.validar(muestraFinSemana.getFechaYHora()));
	}

}
