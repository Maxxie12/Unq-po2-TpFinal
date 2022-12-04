package ar.edu.unq.po2.TPFinal.Desafio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.TPFinal.Muestra;
import ar.edu.unq.po2.TPFinal.Common.Coordenada;
import ar.edu.unq.po2.TPFinal.Estado.EstadoSinIniciar;
import ar.edu.unq.po2.TPFinal.Estado.IEstadoDesafio;

public class DesafioUsuario {
	private Desafio desafio;
	private List<Muestra> muestras;
	private double porcentajeCompletititud;
	private LocalDateTime fechaCompletado;
	private IEstadoDesafio estado;
	private int votos;

	public DesafioUsuario(Desafio desafio) {
		this.desafio = desafio;
		this.muestras = new ArrayList<Muestra>();
		this.porcentajeCompletititud = 0;
		this.estado = new EstadoSinIniciar(); //Seteamos siempre el estado inicial
		this.votos = 0;
	}

	public void aceptarDesafio() {
		this.getEstado().aceptarDesafio(this);
	}

	public void votarDesafio(Integer voto) {
		this.getEstado().votarDesafio(this, voto);
	}

	public void setEstadoDesafio(IEstadoDesafio estado) {
		this.estado = estado;
	}
	

	public void agregarMuestra(Muestra muestra) {
		
		if(this.esAreaAceptada(muestra) && this.cumpleRestriccion(muestra)) {
			//Hacemos que el estado agregue la muestra entonces nos ahorramos tener que preguntar sobre el estado del mismo.
			this.getEstado().agregarMuestra(muestra, this);
		}
	}
	
	public boolean esDesafioCompleto() {
		return this.getPorcentajeCompletititud() == 100;
	}

	private boolean cumpleRestriccion(Muestra muestra) {
		//valido que cumpla las restricciones temporales
		return this.desafio.getRestriccionTemporal().validar(muestra.getFechaYHora());
	}

	private boolean esAreaAceptada(Muestra muestra) {
		//valido si la muestra se encuentra dentro del area del desafio
		
		Coordenada coordeanadaA = this.desafio.getArea().getCoordenada();
		Coordenada coordenadaB = muestra.getCoordenada();
		
		return coordeanadaA.getX() == coordenadaB.getX() &&
				coordenadaB.getY() == coordenadaB.getY();
		
	}

	
	public Desafio getDesafio() {
		return desafio;
	}
	
	public List<Muestra> getMuestras(){
		return this.muestras;
	}

	public double getPorcentajeCompletititud() {
		return this.getEstado().getPorcentajeCompletititud(this);
	}

	public LocalDateTime getFechaCompletado() {
		return this.fechaCompletado;
	}

	public void setPorcentajeCompletititud(double porcentajeCompletititud) {
		this.porcentajeCompletititud = porcentajeCompletititud;
	}
	
	public void setFechaCompletado(LocalDateTime fechaCompletado) {
		this.fechaCompletado = fechaCompletado;
	}
	

	public IEstadoDesafio getEstado() {
		return this.estado;
	}
	
	public int getVotos() {
		return this.votos;
	}

	public void setVotos(int votos) {
		this.votos = votos;
	}
	
	
}
