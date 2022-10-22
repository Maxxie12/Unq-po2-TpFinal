package ar.edu.unq.po2.TPFinal;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DesafioUsuario {
	private Desafio		  desafio;
	private List<Muestra> muestras = new ArrayList<Muestra>(); 
	private double 		  porcentajeCompletititud;
	private LocalDateTime momentoSuperacion;
	//El estado lo tenemos que cambiar con el patron state
	private EstadoDesafio estado;
	
	public DesafioUsuario(Desafio desafio, double porcentajeCompletititud, LocalDateTime momentoSuperacion, EstadoDesafio estado) {
		this.desafio = desafio;
		this.porcentajeCompletititud = porcentajeCompletititud;
		this.momentoSuperacion = momentoSuperacion;
		this.estado = estado;
	}

	public Desafio getDesafio() {
		return desafio;
	}

	public double getPorcentajeCompletititud() {
		return porcentajeCompletititud;
	}

	public LocalDateTime getMomentoSuperacion() {
		return momentoSuperacion;
	}

	public EstadoDesafio getEstado() {
		return estado;
	}
	
	//Aca el usuario acepta el desafio y cambia el estado
	//(chequear si va aca o en el usuario el metodo)
	public void aceptarDesafio() {
		this.estado = new EstadoAceptado();
		
	}
	
	//Aca el usuario votaria el desafio 
	//Ver como se acumula el voto para las recomendaciones
	public void votarDesafio() {
		
	}
	
	public void setEstadoDesafio(EstadoDesafio estado) {
		this.estado = estado;
	}
	
	public void agregarMuestra(Muestra muestra) {
		this.muestras.add(muestra);
	}
}
