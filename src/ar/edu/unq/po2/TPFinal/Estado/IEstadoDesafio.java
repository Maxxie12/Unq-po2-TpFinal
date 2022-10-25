package ar.edu.unq.po2.TPFinal.Estado;

import ar.edu.unq.po2.TPFinal.DesafioUsuario;

public interface IEstadoDesafio {
	
	public void aceptarDesafio(DesafioUsuario desafioUsuario);
	public void desafioCompletado(DesafioUsuario desafioUsuario);
	public void desafioVencido(DesafioUsuario desafioUsuario);
	public boolean esDesafioCompletado();
}
