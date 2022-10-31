package ar.edu.unq.po2.TPFinal.Estado;

import ar.edu.unq.p02.TPFinal.Desafio.DesafioUsuario;

public class EstadoAceptado implements IEstadoDesafio{

	@Override
	public void aceptarDesafio(DesafioUsuario desafioUsuario) {
		//No hace nada porque se completa desde otro estado.
		
	}

	@Override
	public void desafioCompletado(DesafioUsuario desafioUsuario) {
		desafioUsuario.setEstadoDesafio(new EstadoCompletado());		
	}

	@Override
	public void desafioVencido(DesafioUsuario desafioUsuario) {
		//No hace nada porque se completa desde otro estado.
		
	}

	@Override
	public boolean esDesafioCompletado() {
		// TODO Auto-generated method stub
		return false;
	}

	


	
}
