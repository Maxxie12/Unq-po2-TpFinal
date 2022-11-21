package ar.edu.unq.po2.TPFinal.Recomendador;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.TPFinal.Area;
import ar.edu.unq.po2.TPFinal.Preferencia;
import ar.edu.unq.po2.TPFinal.Sistema;
import ar.edu.unq.po2.TPFinal.Usuario;
import ar.edu.unq.po2.TPFinal.Common.Dificultad;
import ar.edu.unq.po2.TPFinal.Desafio.Desafio;
import ar.edu.unq.po2.TPFinal.Desafio.DesafioUsuario;
import ar.edu.unq.po2.TPFinal.Estado.EstadoCompletado;
import ar.edu.unq.po2.TPFinal.Restriccion.IRestriccionTemporal;

class RecomendadorPorFavoritoTest {

	private Usuario usuario1;
	private Preferencia preferenciaUsuario1;
	private RecomendadorPorFavorito recomendador;
	private List<Desafio> listaDesafios;
	private Desafio desafio1;
	private Desafio desafio2;
	private Desafio desafio3;
	private Desafio desafio4;
	private Desafio desafio5;
	private Desafio desafio6;
	private Desafio desafio7;
	private Desafio desafio8;
	private Desafio desafio9;
	private Desafio desafio10;
	private DesafioUsuario desafioUsuarioMenosVotado;
	private DesafioUsuario desafioUsuarioMasVotado;

	@Mock
	private Sistema sistema;
	private Area area;
	private IRestriccionTemporal restriccion;
	
	

	@BeforeEach
	public void setUp() {
		recomendador = new RecomendadorPorFavorito();
		
		desafio1 = new Desafio(this.area, restriccion, 3, Dificultad.FACIL, 10); 
		desafio2 = new Desafio(this.area, restriccion, 5, Dificultad.MUYDIFICIL, 10);  
		desafio3 = new Desafio(this.area, restriccion, 3, Dificultad.FACIL, 10); 
		desafio4 = new Desafio(this.area, restriccion, 2, Dificultad.MUYFACIL, 5);
		desafio5 = new Desafio(this.area, restriccion, 3, Dificultad.INTERMEDIO, 8); 
		desafio6 = new Desafio(this.area, restriccion, 3, Dificultad.FACIL, 10); 
		desafio7 = new Desafio(this.area, restriccion, 2, Dificultad.MUYFACIL, 5);  
		desafio8 = new Desafio(this.area, restriccion, 2, Dificultad.MUYFACIL, 5); 
		desafio9 = new Desafio(this.area, restriccion, 2, Dificultad.MUYFACIL, 5); 
		desafio10 = new Desafio(this.area, restriccion, 2, Dificultad.MUYFACIL, 5);
		
		listaDesafios = new ArrayList<Desafio>();
		listaDesafios.add(desafio1);
		listaDesafios.add(desafio2);
		listaDesafios.add(desafio3);
		listaDesafios.add(desafio4);
		listaDesafios.add(desafio5);
		listaDesafios.add(desafio6);
		listaDesafios.add(desafio7);
		listaDesafios.add(desafio8);
		listaDesafios.add(desafio9);
		listaDesafios.add(desafio10);
		
		preferenciaUsuario1 = new Preferencia(3, Dificultad.FACIL, 10);
		
		
		desafioUsuarioMenosVotado = new DesafioUsuario(this.desafio1);
		desafioUsuarioMenosVotado.setEstadoDesafio(new EstadoCompletado());
		desafioUsuarioMenosVotado.votarDesafio(2);
		
		desafioUsuarioMasVotado = new DesafioUsuario(this.desafio4);
		desafioUsuarioMasVotado.setEstadoDesafio(new EstadoCompletado());
		desafioUsuarioMasVotado.votarDesafio(5);

		usuario1 = new Usuario("Pedro", preferenciaUsuario1, sistema);
		usuario1.agregarDesafioNuevo(desafioUsuarioMasVotado);
		usuario1.agregarDesafioNuevo(desafioUsuarioMenosVotado);	
	}
	
	

	@Test
	void testDesafiosRecomendadosUsuario1() {
		
		assertEquals(5, recomendador.recomendarDesafios(usuario1, this.listaDesafios).size());
		
		//Estos 5 desafios deben ser recomendados al usuario ya que la diferencia es menor.
		assertTrue(recomendador.recomendarDesafios(usuario1, this.listaDesafios).contains(desafio3));
		assertTrue(recomendador.recomendarDesafios(usuario1, this.listaDesafios).contains(desafio7));
		assertTrue(recomendador.recomendarDesafios(usuario1, this.listaDesafios).contains(desafio8));
		assertTrue(recomendador.recomendarDesafios(usuario1, this.listaDesafios).contains(desafio9));
		assertTrue(recomendador.recomendarDesafios(usuario1, this.listaDesafios).contains(desafio10));
		
		
	}
	
	@Test
	void testDesafioNoRecomendado() {
		//Este desafio cumple con las similitudes del desafio mas votado pero ya lo tiene dentro de la lista de desafiosUsuario
		assertFalse(recomendador.recomendarDesafios(usuario1, this.listaDesafios).contains(desafio4));		
	}

}
