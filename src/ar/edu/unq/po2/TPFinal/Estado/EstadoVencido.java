package ar.edu.unq.po2.TPFinal.Estado;

import ar.edu.unq.po2.TPFinal.Desafio.DesafioUsuario;

public class EstadoVencido implements IEstadoDesafio{

	@Override
	public void aceptarDesafio(DesafioUsuario desafioUsuario) {
		//No hace nada porque se completa desde otro estado.
		
	}

	@Override
	public void desafioCompletado(DesafioUsuario desafioUsuario) {
		//No hace nada porque se completa desde otro estado.
		
	}


	@Override
	public void votarDesafio(DesafioUsuario desafioUsuario, Integer voto) {
		//solo se puede votar cuando el desafio esta completado
		
	}

	@Override
	public boolean esDesafioVencido() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean esDesafioCompletado(DesafioUsuario desafioUsuario) {
		// TODO Auto-generated method stub
		return false;
	}


}
