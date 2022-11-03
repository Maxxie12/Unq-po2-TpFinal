package ar.edu.unq.po2.TPFinal.Restriccion;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.TPFinal.Muestra;
import ar.edu.unq.po2.TPFinal.Usuario;
import ar.edu.unq.po2.TPFinal.Common.Coordenada;

class RestriccionCombinadaTest {

	private RestriccionCombinada restriccionCombinada;
	private RestriccionFecha restriccionFecha;
	private RestriccionFinSemana restriccionFinSemana;
	private RestriccionSemana restriccionSemana;
	

	private LocalDateTime fechaDesde;
	private LocalDateTime fechaHasta;
	private LocalDateTime diaFinSemana;
	
	private Muestra muestraFinSemana;

	@Mock
	Usuario usuario;
	@Mock
	Coordenada coordenada;

	@BeforeEach
	public void setUp() {
		
		
		fechaDesde =LocalDateTime.parse("2022-10-05T15:15");
		fechaHasta = LocalDateTime.parse("2022-11-28T15:15");
		diaFinSemana = LocalDateTime.parse("2022-11-06T17:30");
		
		this.restriccionCombinada = new RestriccionCombinada();
		this.restriccionFinSemana = new RestriccionFinSemana();
		this.restriccionSemana = new RestriccionSemana();
		this.restriccionFecha = new RestriccionFecha(this.fechaDesde, this.fechaHasta);
		
		this.restriccionCombinada.addRestriccion(restriccionFinSemana);
		
		
		muestraFinSemana = new Muestra(coordenada, usuario, diaFinSemana);
	}
	
	@Test
	void testRestriccionFinSemana() {
		assertEquals(true, restriccionCombinada.validar(muestraFinSemana));
	}

	@Test
	void testAgregandoRestriccionFechas() {
		restriccionCombinada.addRestriccion(restriccionFecha);
		assertEquals(true, restriccionCombinada.validar(muestraFinSemana));
	}
	
	@Test
	void testRestriccionSemana() {
		restriccionCombinada.removeRestriccion(restriccionFinSemana);
		restriccionCombinada.addRestriccion(restriccionSemana);
		assertEquals(false, restriccionCombinada.validar(muestraFinSemana));
	}

	//TODO: Agregar mas test con diferentes muestras 
	
}
