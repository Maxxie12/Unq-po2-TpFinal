package ar.edu.unq.po2.TPFinal.Desafio;


import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.TPFinal.Muestra;
import ar.edu.unq.po2.TPFinal.Usuario;
import ar.edu.unq.po2.TPFinal.Common.Circulo;
import ar.edu.unq.po2.TPFinal.Common.Coordenada;
import ar.edu.unq.po2.TPFinal.Common.Dificultad;
import ar.edu.unq.po2.TPFinal.Estado.EstadoAceptado;
import ar.edu.unq.po2.TPFinal.Estado.EstadoCompletado;
import ar.edu.unq.po2.TPFinal.Restriccion.RestriccionFecha;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

public class DesafioUsuarioTest {
	DesafioUsuario desafioUsuario;
	
	Desafio desafio;
	
	//Prueba para agregar una Muestra
	DesafioUsuario desafioUsuario2;
	Desafio desafio2;
	Circulo area;
	Coordenada coordenada;
	RestriccionFecha restriccionFecha;
	Muestra muestra;
	
	@Mock
	Usuario usuario;
	
	@BeforeEach
	public void setUp() {
		
		coordenada = new Coordenada(2, 3);
		area = new Circulo(coordenada, 5);
		restriccionFecha = new RestriccionFecha(LocalDateTime.now(), LocalDateTime.now());
		
		desafio = new Desafio(area, restriccionFecha, 1, Dificultad.INTERMEDIO, 2);
		desafioUsuario = new DesafioUsuario(desafio);
		
		//Prueba para agregar una Muestra
		
		
		desafio2 = new Desafio(area, restriccionFecha, 1, Dificultad.FACIL, 2);
		desafioUsuario2 = new DesafioUsuario(desafio2);
		muestra = new Muestra(coordenada, usuario, LocalDateTime.now());
		
		
	}
	
	@Test
	public void testEsDesafioAceptadoEstado() {
		desafioUsuario.aceptarDesafio();
		desafioUsuario.agregarMuestra(muestra);
		assertEquals(desafioUsuario.getEstado().getPorcentajeCompletititud(desafioUsuario), 0);
	}
	

	@Test
	public void votarDesafioTest() {
		desafioUsuario.setEstadoDesafio(new EstadoCompletado());
		desafioUsuario.votarDesafio(3);
		desafioUsuario.votarDesafio(2);
		assertEquals(desafioUsuario.getVotos(), 5);
	}
	
	@Test
	public void testAgregarMuestra() {
		desafioUsuario2.setEstadoDesafio(new EstadoAceptado());
		desafioUsuario2.agregarMuestra(muestra);
		assertEquals(desafioUsuario2.getMuestras().size(), 1);
	}
	
	@Test
	public void testesDesafioCompletado() {
		desafioUsuario2.setEstadoDesafio(new EstadoCompletado());
		desafioUsuario2.aceptarDesafio();
		desafioUsuario2.agregarMuestra(muestra);
		assertEquals(desafioUsuario2.getEstado().getPorcentajeCompletititud(desafioUsuario2), 100);
		
	}
	

}
