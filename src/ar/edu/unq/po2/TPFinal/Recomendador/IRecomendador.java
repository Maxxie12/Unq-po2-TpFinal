package ar.edu.unq.po2.TPFinal.Recomendador;

import java.util.List;

import ar.edu.unq.po2.TPFinal.Usuario;
import ar.edu.unq.po2.TPFinal.Desafio.Desafio;
import ar.edu.unq.po2.TPFinal.Desafio.DesafioUsuario;
import ar.edu.unq.po2.TPFinal.Desafio.DesafioUsuario;

public abstract class IRecomendador {
	public abstract List<DesafioUsuario> recomendarDesafios(Usuario usuario, List<Desafio> desafios);
}