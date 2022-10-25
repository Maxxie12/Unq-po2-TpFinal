package ar.edu.unq.po2.TPFinal;

public class EstadoSinIniciar implements EstadoDesafio{

	@Override
	public Boolean esDesafioCompletado() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void desafioAceptado(DesafioUsuario desafioUsuario) {
		//No puede acpetar un desafio porque no se inicio 
		
	}

}
