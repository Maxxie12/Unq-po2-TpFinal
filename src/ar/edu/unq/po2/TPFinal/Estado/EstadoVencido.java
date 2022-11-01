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
	public void desafioVencido(DesafioUsuario desafioUsuario) {
		//Ver aca que lanzaria cuando esta vencido.
		System.out.println("El desafio esta vencido");
		
	}

	@Override
	public boolean esDesafioCompletado() {
		return false;
	}

}
