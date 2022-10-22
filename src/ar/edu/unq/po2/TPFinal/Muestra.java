package ar.edu.unq.po2.TPFinal;

import java.time.LocalDateTime;

public class Muestra {

	private Coordenada coordenada;
	private Usuario usuario;
	private LocalDateTime fechaYHora;

	public Muestra(Coordenada coordenada, Usuario usuario, LocalDateTime fechaYHora) {
		this.coordenada = coordenada;
		this.usuario = usuario;
		this.fechaYHora = fechaYHora;
	}

	public Coordenada getCoordenada() {
		return coordenada;
	}

	public Usuario getUsuario() {
		return usuario;
	}
	

	public LocalDateTime getFechaYHora() {
		return fechaYHora;
	}

}
