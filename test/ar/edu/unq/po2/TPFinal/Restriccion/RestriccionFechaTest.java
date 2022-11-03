package ar.edu.unq.po2.TPFinal.Restriccion;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.TPFinal.Muestra;
import ar.edu.unq.po2.TPFinal.Usuario;
import ar.edu.unq.po2.TPFinal.Common.Coordenada;

class RestriccionFechaTest {

	private IRestriccionTemporal restriccion;
	private LocalDateTime fechaActual;
	private LocalDateTime fechaDesde;
	private LocalDateTime fechaHasta;
	
	private Muestra muestraValida;
	private Muestra muestraFechaSuperior;
	private Muestra muestraFechaInferior;
	
	@Mock
	Usuario usuario;
	@Mock
	Coordenada coordenada;

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
		muestraValida = new Muestra(coordenada, usuario, fechaActual);
		//Aca que la fecha sobrepasa la fecha hasta.
		muestraFechaSuperior = new Muestra(coordenada, usuario, fechaActual.plusMonths(2));
		//Aca la fecha esta por debajo de la fecha desde.
		muestraFechaInferior = new Muestra(coordenada, usuario, fechaActual.plusMonths(-2));
		
	}

	@Test
	void testMuestraValida() {
		System.out.println(muestraValida.getFechaYHora());
		assertEquals(true, restriccion.validar(muestraValida));
	}
	
	@Test
	void testMuestraFechaInferior() {
		System.out.println(muestraFechaInferior.getFechaYHora());
		assertEquals(false, restriccion.validar(muestraFechaInferior));
	}
	
	@Test
	void testMuestraFechaSuperior() {
		System.out.println(muestraFechaSuperior.getFechaYHora());
		assertEquals(false, restriccion.validar(muestraFechaSuperior));
	}
	

}
