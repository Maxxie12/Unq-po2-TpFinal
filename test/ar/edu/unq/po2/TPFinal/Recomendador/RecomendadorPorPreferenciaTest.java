package ar.edu.unq.po2.TPFinal.Recomendador;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.TPFinal.Preferencia;
import ar.edu.unq.po2.TPFinal.Sistema;
import ar.edu.unq.po2.TPFinal.Usuario;
import ar.edu.unq.po2.TPFinal.Common.Circulo;
import ar.edu.unq.po2.TPFinal.Common.Dificultad;
import ar.edu.unq.po2.TPFinal.Desafio.Desafio;
import ar.edu.unq.po2.TPFinal.Restriccion.IRestriccionTemporal;

class RecomendadorPorPreferenciaTest {

	private Usuario usuario1;
	private Preferencia preferenciaUsuario1;
	private RecomendadorPorPreferencia recomendador;
	private List<Desafio> listaDesafios;
	private Desafio desafio1;
	private Desafio desafio2;
	private Desafio desafio3;
	private Desafio desafio4;
	private Desafio desafio5;
	private Desafio desafio6;


	@Mock
	Sistema sistema;
	Circulo area;
	IRestriccionTemporal restriccion;

	@BeforeEach
	public void setUp() {
		
		desafio1 = new Desafio(this.area, restriccion, 3, Dificultad.FACIL, 10); 
		desafio2 = new Desafio(this.area, restriccion, 5, Dificultad.MUYDIFICIL, 10); 
		desafio3 = new Desafio(this.area, restriccion, 3, Dificultad.FACIL, 10);  
		desafio4 = new Desafio(this.area, restriccion, 2, Dificultad.MUYFACIL, 5);
		desafio5 = new Desafio(this.area, restriccion, 3, Dificultad.INTERMEDIO, 8); 
		desafio6 = new Desafio(this.area, restriccion, 3, Dificultad.FACIL, 10);
		

		preferenciaUsuario1 = new Preferencia(3, Dificultad.FACIL, 10);

		usuario1 = new Usuario("Pedro", preferenciaUsuario1, sistema);

		recomendador = new RecomendadorPorPreferencia();
		listaDesafios = new ArrayList<Desafio>();
		listaDesafios.add(desafio1);
		listaDesafios.add(desafio2);
		listaDesafios.add(desafio3);
		listaDesafios.add(desafio4);
		listaDesafios.add(desafio5);
		listaDesafios.add(desafio6);
	}

	@Test
	void testDesafiosRecomendadosUsuario1() {
		assertEquals(5, recomendador.recomendarDesafios(usuario1, this.listaDesafios).size());
		//Estos 5 desafios deben ser recomendados al usuario ya que la diferencia es menor.
		assertTrue(recomendador.recomendarDesafios(usuario1, this.listaDesafios).contains(desafio1));
		assertTrue(recomendador.recomendarDesafios(usuario1, this.listaDesafios).contains(desafio2));
		assertTrue(recomendador.recomendarDesafios(usuario1, this.listaDesafios).contains(desafio3));
		assertTrue(recomendador.recomendarDesafios(usuario1, this.listaDesafios).contains(desafio5));
		assertTrue(recomendador.recomendarDesafios(usuario1, this.listaDesafios).contains(desafio6));
		
		assertFalse(recomendador.recomendarDesafios(usuario1, this.listaDesafios).contains(desafio4));
	}

}
