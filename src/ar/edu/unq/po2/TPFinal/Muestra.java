package ar.edu.unq.po2.TPFinal;

import java.time.LocalDateTime;

public class Muestra {

	private Coordenada coordenada;
	private String usuario;
	private LocalDateTime fechaYHora;

	public Muestra(Coordenada coordenada, String usuario, LocalDateTime fechaYHora) {
		this.coordenada = coordenada;
		this.usuario = usuario;
		this.fechaYHora = fechaYHora;
	}

	public Coordenada getCoordenada() {
		return coordenada;
	}

	public String getUsuario() {
		return usuario;
	}

	public LocalDateTime getFechaYHora() {
		return fechaYHora;
	}

}
