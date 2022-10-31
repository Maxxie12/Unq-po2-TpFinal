package ar.edu.unq.po2.TPFinal.Estado;

import ar.edu.unq.p02.TPFinal.Desafio.DesafioUsuario;

public class EstadoCompletado implements IEstadoDesafio{

	@Override
	public void aceptarDesafio(DesafioUsuario desafioUsuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desafioCompletado(DesafioUsuario desafioUsuario) {
		desafioUsuario.setEstadoDesafio(this);
		
	}

	@Override
	public void desafioVencido(DesafioUsuario desafioUsuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean esDesafioCompletado() {
		return true;
	}

	

}
