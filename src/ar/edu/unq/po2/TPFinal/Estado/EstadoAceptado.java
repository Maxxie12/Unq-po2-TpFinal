package ar.edu.unq.po2.TPFinal.Estado;

import ar.edu.unq.po2.TPFinal.Desafio.DesafioUsuario;

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
	public void votarDesafio(DesafioUsuario desafioUsuario, Integer voto) {
		//No se hace nada porque se completa desde otro estado
		
	}

	@Override
	public boolean esDesafioVencido() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean esDesafioCompletado(DesafioUsuario desafioUsuario) {
		// TODO Auto-generated method stub
		return false;
	}


	


	
}
