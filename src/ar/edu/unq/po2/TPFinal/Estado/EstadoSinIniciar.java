package ar.edu.unq.po2.TPFinal.Estado;

import ar.edu.unq.po2.TPFinal.DesafioUsuario;

public class EstadoSinIniciar implements IEstadoDesafio{

	@Override
	public void aceptarDesafio(DesafioUsuario desafioUsuario) {
		desafioUsuario.setEstadoDesafio(new EstadoAceptado());
	}

	@Override
	public void desafioCompletado(DesafioUsuario desafioUsuario) {
		//No hace nada porque se completa desde otro estado.
	}

	@Override
	public void desafioVencido(DesafioUsuario desafioUsuario) {
		//No hace nada porque se completa desde otro estado.	
	}

	@Override
	public boolean esDesafioCompletado() {
		return false;
	}
}
