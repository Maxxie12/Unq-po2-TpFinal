package ar.edu.unq.po2.TPFinal.Recomendador;

import java.util.List;

import ar.edu.unq.po2.TPFinal.Usuario;
import ar.edu.unq.po2.TPFinal.Desafio.DesafioUsuario;

public interface IRecomendador {
	public List<DesafioUsuario> recomendarDesafios(Usuario usuario, List<Desafio> desafios);
}