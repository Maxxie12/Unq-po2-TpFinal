package ar.edu.unq.po2.TPFinal;

public class EstadoAceptado implements EstadoDesafio{
	
	

	@Override
	public Boolean esDesafioCompletado() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void desafioAceptado(DesafioUsuario desafioUsuario) {
	
		desafioUsuario.setEstadoDesafio(new EstadoAceptado());
	}

}
