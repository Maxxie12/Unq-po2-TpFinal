package ar.edu.unq.po2.TPFinal.Estado;

import ar.edu.unq.po2.TPFinal.Muestra;
import ar.edu.unq.po2.TPFinal.Desafio.DesafioUsuario;

public class EstadoSinIniciar implements IEstadoDesafio{

	@Override
	public void aceptarDesafio(DesafioUsuario desafioUsuario) {
		desafioUsuario.setEstadoDesafio(new EstadoAceptado());
		
	}

	@Override
	public void votarDesafio(DesafioUsuario desafioUsuario, Integer voto) {
		//Solo se puede votar cuando el desafio esta completado
		
	}

	@Override
	public double getPorcentajeCompletititud(DesafioUsuario desafioUsuario) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void agregarMuestra(Muestra muestra, DesafioUsuario desafioUsuario) {
		// Solo puede agregar muestra en el estado Aceptado y no Completado
		
	}

	


}
