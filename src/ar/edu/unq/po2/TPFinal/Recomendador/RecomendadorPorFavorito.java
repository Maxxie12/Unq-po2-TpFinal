package ar.edu.unq.po2.TPFinal.Recomendador;

import java.util.Comparator;
import java.util.List;

import ar.edu.unq.po2.TPFinal.Usuario;
import ar.edu.unq.po2.TPFinal.Desafio.Desafio;
import ar.edu.unq.po2.TPFinal.Desafio.DesafioUsuario;

public class RecomendadorPorFavorito extends Recomendador {

	@Override
	public List<Desafio> recomendarDesafios(Usuario usuario, List<Desafio> desafios) {
		return obtiene20DesafiosMayorCoincidencia(usuario,desafios).stream().limit(5).toList();
	}
	
	private List<Desafio> obtiene20DesafiosMayorCoincidencia(Usuario usuario, List<Desafio> desafios) {
		return this.desafiosOrdenadosPorSimilitud(usuario, desafios).stream()
				.filter(desafio -> !this.desafioDeDesafioUsuario(usuario).contains(desafio)).limit(20).toList();
	}
	
	private List<Desafio> desafiosOrdenadosPorSimilitud(Usuario usuario, List<Desafio> desafios) {
		List<Desafio> sortDesafios = desafios.stream()
				.sorted((desafio1, desafio2) -> similitudDesafios(desafio1, desafioMasVotado(usuario))
				.compareTo(similitudDesafios(desafio2, desafioMasVotado(usuario))))
				.toList();
		return sortDesafios;
	}
	
	private Desafio desafioMasVotado(Usuario usuario) {
		DesafioUsuario desafioUsuario = usuario.getDesafios().stream().max(Comparator.comparingInt(DesafioUsuario :: getVotos)).get(); 
		return desafioUsuario.getDesafio(); 
	}

	private Double similitudDesafios(Desafio desafio, Desafio desafioMasVotado) {

		int diferenciaCantMuestras = diferenciaEntre(desafio.getCantidadMuestrasARecolectar(),	desafioMasVotado.getCantidadMuestrasARecolectar());
		int diferenciaDificultad = diferenciaEntre(desafio.getDificultad().getValorDificultad(), desafioMasVotado.getDificultad().getValorDificultad());
		int diferenciaRecompensa = diferenciaEntre(desafio.getRecompensa(), desafioMasVotado.getRecompensa());

		return (double) ((diferenciaCantMuestras + diferenciaDificultad + diferenciaRecompensa) / 3);
	}
}
