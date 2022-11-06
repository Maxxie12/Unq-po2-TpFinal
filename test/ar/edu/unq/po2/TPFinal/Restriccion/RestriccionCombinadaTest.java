package ar.edu.unq.po2.TPFinal.Restriccion;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.TPFinal.Muestra;

class RestriccionCombinadaTest {

	private RestriccionCombinada restriccionCombinada;
	private RestriccionFecha restriccionFecha;
	private RestriccionFinSemana restriccionFinSemana;
	private RestriccionSemana restriccionSemana;
	

	private LocalDateTime fechaDesde;
	private LocalDateTime fechaHasta;
	private LocalDateTime diaFinSemana;
	private LocalDateTime diaSemana;
	private LocalDateTime diaFueraDeFecha;

	@Mock
	private Muestra muestraFinSemana = mock(Muestra.class);
	private Muestra muestraSemana = mock(Muestra.class);
	private Muestra muestraFueraDeFecha = mock(Muestra.class);

	@BeforeEach
	public void setUp() { 	
		fechaDesde =LocalDateTime.parse("2022-10-05T15:15");
		fechaHasta = LocalDateTime.parse("2022-11-28T15:15");
		diaFinSemana = LocalDateTime.parse("2022-11-06T17:30");
		diaSemana = LocalDateTime.parse("2022-11-09T07:30");
		//Dia Jueves
		diaFueraDeFecha = LocalDateTime.parse("2022-05-07T13:30");
		
		this.restriccionCombinada = new RestriccionCombinada();
		this.restriccionFinSemana = new RestriccionFinSemana();
		this.restriccionSemana = new RestriccionSemana();
		this.restriccionFecha = new RestriccionFecha(this.fechaDesde, this.fechaHasta);
		
		this.restriccionCombinada.addRestriccion(restriccionFinSemana);
		
		when(muestraFinSemana.getFechaYHora()).thenReturn(diaFinSemana);
		when(muestraSemana.getFechaYHora()).thenReturn(diaSemana);
		when(muestraFueraDeFecha.getFechaYHora()).thenReturn(diaFueraDeFecha);
	}
	
	@Test
	void testRestriccionFinSemanaValida() {
		//Aca tiene la restriccion de que sea fin se semana
		assertTrue(restriccionCombinada.validar(muestraFinSemana.getFechaYHora()));
	}

	@Test
	void testAgregandoRestriccionFechasValida() {
		//Aca ademas de la restriccion de finde semana, se le agrega que sea una muestra tomada entre 2 fechas
		restriccionCombinada.addRestriccion(restriccionFecha);
		assertTrue(restriccionCombinada.validar(muestraFinSemana.getFechaYHora()));
	}
	
	@Test
	void testRestriccionSemanaInvalida() {
		//Le reemplazamos la restriccion para que valide si es una muestra durante la semana, cosa que deberia dar false
		restriccionCombinada.removeRestriccion(restriccionFinSemana);
		restriccionCombinada.addRestriccion(restriccionSemana);
		assertFalse(restriccionCombinada.validar(muestraFinSemana.getFechaYHora()));
	}

	@Test
	void testRestriccionSemanavalida() {
		//Validamos que la muestra de semana sea valida
		restriccionCombinada.removeRestriccion(restriccionFinSemana);
		restriccionCombinada.addRestriccion(restriccionSemana);
		assertTrue(restriccionCombinada.validar(muestraSemana.getFechaYHora()));
	} 
	
	@Test
	void testConMuestraFueraDeFechaYDeFinSemana() {
		//Aca ademas de la restriccion de finde semana, se le agrega que sea una muestra tomada entre 2 fechas
		restriccionCombinada.addRestriccion(restriccionFecha);
		assertFalse(restriccionCombinada.validar(muestraFueraDeFecha.getFechaYHora()));
	}
	
}
