package ar.edu.unq.po2.TPFinal.Estado;

import java.time.LocalDateTime;

import ar.edu.unq.po2.TPFinal.Muestra;
import ar.edu.unq.po2.TPFinal.Desafio.DesafioUsuario;

public class EstadoAceptado implements IEstadoDesafio{

	@Override
	public void aceptarDesafio(DesafioUsuario desafioUsuario) {
		// // No hace nada porque ya esta aceptado
		
	}

	@Override
	public void votarDesafio(DesafioUsuario desafioUsuario, Integer voto) {
		//Solo se puede votar cuando el desafio esta completado
		
	}

	@Override
	public double getPorcentajeCompletititud(DesafioUsuario desafioUsuario) {
		return (desafioUsuario.getMuestras().size() * 100) / desafioUsuario.getDesafio().getCantidadMuestrasARecolectar();
	}

	@Override
	public void agregarMuestra(Muestra muestra, DesafioUsuario desafioUsuario) {
		//Agrega la muestra porque ya viene validado que cumpla las restricciones
		desafioUsuario.getMuestras().add(muestra);
		if(this.getPorcentajeCompletititud(desafioUsuario) == 100) {
			//Si ya se completo seteamos el nuevo estado y la fecha en que se completo.
			desafioUsuario.setEstadoDesafio(new EstadoCompletado());
			desafioUsuario.setFechaCompletado(LocalDateTime.now());
		}
		
	}

	

	


	
}
