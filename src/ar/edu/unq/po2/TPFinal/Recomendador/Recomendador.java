package ar.edu.unq.po2.TPFinal.Recomendador;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.TPFinal.Usuario;
import ar.edu.unq.po2.TPFinal.Desafio.Desafio;

public abstract class Recomendador {
	
	public abstract List<Desafio> recomendarDesafios(Usuario usuario, List<Desafio> desafios);	
	
	public List<Desafio> desafioDeDesafioUsuario(Usuario usuario){
		List<Desafio> desafiosUsuario = new ArrayList<Desafio>();
		desafiosUsuario= usuario.getDesafios().stream().map(desafio -> desafio.getDesafio()).toList();
		return desafiosUsuario;
	}
	
	public int diferenciaEntre(int caractPreferencia, int caractDesafio) {
		return Math.abs(caractPreferencia- caractDesafio);
	}
}