package ar.edu.unq.po2.TPFinal;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.TPFinal.Common.Coordenada;
import ar.edu.unq.po2.TPFinal.Estado.EstadoSinIniciar;
import ar.edu.unq.po2.TPFinal.Estado.EstadoVencido;
import ar.edu.unq.po2.TPFinal.Estado.IEstadoDesafio;
import net.bytebuddy.asm.Advice.This;

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

	public void votarDesafio(Integer voto) {
		if(this.getEstado().esDesafioCompletado() && voto <= 5)
			this.votos = votos + voto;
	}

	public void setEstadoDesafio(IEstadoDesafio estado) {
		this.estado = estado;
	}
	

	public void agregarMuestra(Muestra muestra) {
		
		if(!this.esDesafioVencido() && this.esAreaAceptada(muestra) && this.cumpleRestriccion(muestra)) {
			this.muestras.add(muestra);
		
		
			if(this.esDesafioCompletado()) {
				//cambio de estado el desafio porque fue completado
				this.getEstado().desafioCompletado(this);
			}
		
		}
	}

	private boolean cumpleRestriccion(Muestra muestra) {
		//valido que cumpla las restricciones temporales
		return this.desafio.getRestriccionTemporal().validar(muestra);
	}

	private boolean esAreaAceptada(Muestra muestra) {
		//valido si la muestra se encuentra dentro del area del desafio
		
		Coordenada coordeanadaA = this.desafio.getArea().getCoordenada();
		Coordenada coordenadaB = muestra.getCoordenada();
		
		return coordeanadaA.getX() == coordenadaB.getX() &&
				coordenadaB.getY() == coordenadaB.getY();
		
	}

	private boolean esDesafioVencido() {
		//valido que el desafio no este vencido, para poder agregar una muestra nueva. 
		return this.getEstado().equals(new EstadoVencido());
	}
	
	private boolean esDesafioCompletado(){
		//Valida si ya esta cumplida la cantidad de muestras que pide el Desafio
		return this.getMuestras().size() == this.getDesafio().getCantidadMuestrasARecolectar();
	}
}
