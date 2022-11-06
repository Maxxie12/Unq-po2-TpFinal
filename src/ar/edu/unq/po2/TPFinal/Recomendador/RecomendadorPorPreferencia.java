package ar.edu.unq.po2.TPFinal.Recomendador;

import java.util.List;

import ar.edu.unq.po2.TPFinal.Preferencia;
import ar.edu.unq.po2.TPFinal.Usuario;
import ar.edu.unq.po2.TPFinal.Desafio.Desafio;

public class RecomendadorPorPreferencia extends Recomendador {

	@Override
	public List<Desafio> recomendarDesafios(Usuario usuario, List<Desafio> desafios) {
		return this.desafiosOrdenadosPorCoincidencia(usuario, desafios).stream()
				.filter(desafio -> !this.desafioDeDesafioUsuario(usuario).contains(desafio)).limit(5).toList();
	}
	
	private Integer coincidenciaDesafio(Preferencia preferencia, Desafio desafio) {

		int diferenciaCantMuestras = diferenciaEntre(preferencia.getCantidadMuestras(),
				desafio.getCantidadMuestrasARecolectar());
		int diferenciaDificultad = diferenciaEntre(preferencia.getDificultad().getValorDificultad(),
				desafio.getDificultad().getValorDificultad());
		int diferenciaRecompensa = diferenciaEntre(preferencia.getRecompensaPreferida(), desafio.getRecompensa());

		return diferenciaCantMuestras + diferenciaDificultad + diferenciaRecompensa;

	}
	
	private List<Desafio> desafiosOrdenadosPorCoincidencia(Usuario usuario, List<Desafio> desafios) {
		List<Desafio> sortDesafios = desafios.stream()
				.sorted((desafio1, desafio2) -> coincidenciaDesafio(usuario.getPreferencia(), desafio1)
				.compareTo(coincidenciaDesafio(usuario.getPreferencia(), desafio2)))
				.toList();
		return sortDesafios;
	}

}
