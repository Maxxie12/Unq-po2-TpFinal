package ar.edu.unq.po2.TPFinal.Recomendador;

import java.util.List;

import ar.edu.unq.p02.TPFinal.Desafio.DesafioUsuario;
import ar.edu.unq.po2.TPFinal.Usuario;

public interface IRecomendador {
	public List<DesafioUsuario> recomendarDesafios(Usuario usuario, List<Desafio> desafios);
}