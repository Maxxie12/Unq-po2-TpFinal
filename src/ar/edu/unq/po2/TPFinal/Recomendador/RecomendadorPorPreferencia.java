package ar.edu.unq.po2.TPFinal.Recomendador;

import java.util.List;

import ar.edu.unq.po2.TPFinal.Usuario;
import ar.edu.unq.po2.TPFinal.Desafio.Desafio;

public class RecomendadorPorPreferencia extends Recomendador {

	@Override
	public List<Desafio> recomendarDesafios(Usuario usuario, List<Desafio> desafios) {
		return this.desafiosOrdenadosPorCoincidencia(usuario, desafios).stream()
				.filter(desafio -> !this.desafioDeDesafioUsuario(usuario).contains(desafio)).limit(5).toList();
	}

}
