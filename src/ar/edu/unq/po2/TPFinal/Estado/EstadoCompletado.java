package ar.edu.unq.po2.TPFinal;

public class EstadoCompletado implements EstadoDesafio{

	@Override
	public Boolean esDesafioCompletado() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void desafioAceptado(DesafioUsuario desafioUsuario) {
		//no se puede aceptar un desafio ya completado
		
	}

}
