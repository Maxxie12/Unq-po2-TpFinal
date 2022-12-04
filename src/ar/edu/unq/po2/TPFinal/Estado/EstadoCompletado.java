package ar.edu.unq.po2.TPFinal.Estado;

import ar.edu.unq.po2.TPFinal.Muestra;
import ar.edu.unq.po2.TPFinal.Desafio.DesafioUsuario;

public class EstadoCompletado implements IEstadoDesafio{

	@Override
	public void aceptarDesafio(DesafioUsuario desafioUsuario) {
		// No hace nada porque ya esta aceptado
		
	}

	@Override
	public void votarDesafio(DesafioUsuario desafioUsuario, Integer voto) {
		if(voto <= 5) {
			desafioUsuario.setVotos(desafioUsuario.getVotos() + voto);
		}
		
	}

	@Override
	public double getPorcentajeCompletititud(DesafioUsuario desafioUsuario) {
		// TODO Auto-generated method stub
		return 100;

	}

	@Override
	public void agregarMuestra(Muestra muestra, DesafioUsuario desafioUsuario) {
		//No hace nada porque ya se completo
		
	}



	

}
