package ar.edu.unq.po2.TPFinal;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.TPFinal.Estado.EstadoSinIniciar;
import ar.edu.unq.po2.TPFinal.Estado.IEstadoDesafio;

public class DesafioUsuario {
	private Desafio desafio;
	private List<Muestra> muestras;
	private double porcentajeCompletititud;
	private LocalDateTime fechaCompletado;
	private IEstadoDesafio estado;
	private int votos;

	public DesafioUsuario(Desafio desafio, double porcentajeCompletititud, LocalDateTime momentoSuperacion) {
		this.desafio = desafio;
		this.muestras = new ArrayList<Muestra>();
		this.porcentajeCompletititud = porcentajeCompletititud;
		this.fechaCompletado = momentoSuperacion;
		this.estado = new EstadoSinIniciar(); //Seteamos siempre el estado inicial
		this.votos = 0;
	}

	public Desafio getDesafio() {
		return desafio;
	}
	
	public List<Muestra> getMuestras(){
		return this.muestras;
	}

	public double getPorcentajeCompletititud() {
		return this.porcentajeCompletititud;
	}

	public LocalDateTime getFechaCompletado() {
		return this.fechaCompletado;
	}

	public IEstadoDesafio getEstado() {
		return this.estado;
	}
	
	public int getVotos() {
		return this.votos;
	}

	public void aceptarDesafio() {
		this.getEstado().aceptarDesafio(this);
	}

	public void votarDesafio() {
		this.votos += 1;
	}

	public void setEstadoDesafio(IEstadoDesafio estado) {
		this.estado = estado;
	}
	

	public void agregarMuestra(Muestra muestra) {
		this.muestras.add(muestra);
		
		//Valida si ya esta cumplida la cantidad de muestras que pide el Desafio, lo cambia de estado a Completo-.
		if(this.getMuestras().size() == this.getDesafio().getCantidadMuestrasARecolectar()) {
			this.getEstado().desafioCompletado(this);
		}
	}
}
