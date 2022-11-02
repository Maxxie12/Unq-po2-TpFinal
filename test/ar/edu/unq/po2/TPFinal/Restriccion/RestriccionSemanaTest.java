package ar.edu.unq.po2.TPFinal.Restriccion;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.TPFinal.Muestra;
import ar.edu.unq.po2.TPFinal.Usuario;
import ar.edu.unq.po2.TPFinal.Common.Coordenada;

class RestriccionSemanaTest {

	private IRestriccionTemporal restriccionSemana;
	private IRestriccionTemporal restriccionFinSemana;

	private LocalDateTime diaSemana;
	private LocalDateTime diaFinSemana;

	private Muestra muestraSemana;
	private Muestra muestraFinSemana;

	@Mock
	Usuario usuario;
	@Mock
	Coordenada coordenada;

	@BeforeEach
	public void setUp() {
		diaSemana = LocalDateTime.parse("2022-11-02T15:15");
		diaFinSemana = LocalDateTime.parse("2022-11-06T17:30");

		restriccionSemana = new RestriccionSemana();
		restriccionFinSemana = new RestriccionFinSemana();

		// Muestra tomada en dia de semana.
		muestraSemana = new Muestra(coordenada, usuario, diaSemana);
		// Muestra con fecha fin de semana.
		muestraFinSemana = new Muestra(coordenada, usuario, diaFinSemana);
	}

	@Test
	void testMuestraSemanaValida() {
		assertEquals(true, restriccionSemana.validar(muestraSemana));
	}
	
	@Test
	void testMuestraSemanaInvalida() {
		assertEquals(false, restriccionSemana.validar(muestraFinSemana));
	}
	
	@Test
	void testMuestraFinSemanaInvalida() {
		assertEquals(false, restriccionFinSemana.validar(muestraSemana));
	}
	
	@Test
	void testMuestraFinSemanaValida() {
		assertEquals(true, restriccionFinSemana.validar(muestraFinSemana));
	}

}
