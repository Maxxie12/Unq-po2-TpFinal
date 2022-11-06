package ar.edu.unq.po2.TPFinal.Recomendador;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.TPFinal.Preferencia;
import ar.edu.unq.po2.TPFinal.Usuario;
import ar.edu.unq.po2.TPFinal.Desafio.Desafio;

public abstract class Recomendador {
	
	public abstract List<Desafio> recomendarDesafios(Usuario usuario, List<Desafio> desafios);

	public List<Desafio> desafiosOrdenadosPorCoincidencia(Usuario usuario, List<Desafio> desafios) {
		List<Desafio> sortDesafios = desafios.stream()
				.sorted((desafio1, desafio2) -> coincidenciaDesafio(usuario.getPreferencia(), desafio1)
				.compareTo(coincidenciaDesafio(usuario.getPreferencia(), desafio2)))
				.toList();
		return sortDesafios;
	}
	
	public List<Desafio> desafioDeDesafioUsuario(Usuario usuario){
		List<Desafio> desafiosUsuario = new ArrayList<Desafio>();
		desafiosUsuario= usuario.getDesafios().stream().map(desafio -> desafio.getDesafio()).toList();
		return desafiosUsuario;
	}

	private Integer coincidenciaDesafio(Preferencia preferencia, Desafio desafio) {

		int diferenciaCantMuestras = diferenciaEntre(preferencia.getCantidadMuestras(),
				desafio.getCantidadMuestrasARecolectar());
		int diferenciaDificultad = diferenciaEntre(preferencia.getDificultad().getValorDificultad(),
				desafio.getDificultad().getValorDificultad());
		int diferenciaRecompensa = diferenciaEntre(preferencia.getRecompensaPreferida(), desafio.getRecompensa());

		return diferenciaCantMuestras + diferenciaDificultad + diferenciaRecompensa;

	}

	public int diferenciaEntre(int caractPreferencia, int caractDesafio) {
		return Math.abs(caractPreferencia- caractDesafio);
	}
}