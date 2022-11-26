package ar.edu.unq.po2.TPFinal.Estado;

import ar.edu.unq.po2.TPFinal.Desafio.DesafioUsuario;

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
	public boolean esDesafioCompletado(DesafioUsuario desafioUsuario) {
		return desafioUsuario.getMuestras().size() == desafioUsuario.getDesafio().getCantidadMuestrasARecolectar();
	}

	@Override
	public void votarDesafio(DesafioUsuario desafioUsuario, Integer voto) {
		if(voto <= 5) {
			desafioUsuario.setVotos(desafioUsuario.getVotos() + voto);
		}
		
	}

	@Override
	public boolean esDesafioVencido() {
		// TODO Auto-generated method stub
		return false;
	}

	

}
