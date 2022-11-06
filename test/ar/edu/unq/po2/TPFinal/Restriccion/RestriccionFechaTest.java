package ar.edu.unq.po2.TPFinal.Restriccion;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.TPFinal.Muestra;

class RestriccionFechaTest {

	private RestriccionFecha restriccion;
	private LocalDateTime fechaActual;
	private LocalDateTime fechaDesde;
	private LocalDateTime fechaHasta;

	@Mock
	private Muestra muestraValida = mock(Muestra.class);
	private Muestra muestraFechaSuperior = mock(Muestra.class);
	private Muestra muestraFechaInferior = mock(Muestra.class);

	@BeforeEach
	public void setUp() {
		//Obtengo la fecha actual
		fechaActual = LocalDateTime.now();
		//Para que el test no se rompa, en vez de pasarle una fecha fija, tomo la fecha actual como 
		//referencia y calculo las fechas desde y hasta(1 mes hacia atras y hacia adelante).
		fechaDesde = fechaActual.plusMonths(-1);
		fechaHasta = fechaActual.plusMonths(1);
		
		restriccion = new RestriccionFecha(fechaDesde, fechaHasta);
		
		//Aca instancio una muestra valida.
		when(muestraValida.getFechaYHora()).thenReturn(fechaActual);
		//Aca que la fecha sobrepasa la fecha hasta.
		when(muestraFechaSuperior.getFechaYHora()).thenReturn(fechaActual.plusMonths(2));
		//Aca la fecha esta por debajo de la fecha desde.
		when(muestraFechaInferior.getFechaYHora()).thenReturn(fechaActual.plusMonths(-2));	
	}

	@Test
	void testMuestraValida() {
		System.out.println(muestraValida.getFechaYHora());
		assertEquals(true, restriccion.validar(muestraValida.getFechaYHora()));
	}
	
	@Test
	void testMuestraFechaInferior() {
		System.out.println(muestraFechaInferior.getFechaYHora());
		assertEquals(false, restriccion.validar(muestraFechaInferior.getFechaYHora()));
	}
	
	@Test
	void testMuestraFechaSuperior() {
		System.out.println(muestraFechaSuperior.getFechaYHora());
		assertEquals(false, restriccion.validar(muestraFechaSuperior.getFechaYHora()));
	}
	
	@Test
	void testFechaDesde() {
		assertEquals(this.fechaDesde, restriccion.getFechaDesde());
	}
	@Test
	void testFechHasta() {
		assertEquals(this.fechaHasta, restriccion.getFechaHasta());
	}
	

}
