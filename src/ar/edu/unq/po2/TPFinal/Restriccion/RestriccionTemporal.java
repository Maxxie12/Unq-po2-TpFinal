package ar.edu.unq.po2.TPFinal.Restriccion;

import java.time.LocalDateTime;

import ar.edu.unq.po2.TPFinal.Muestra;

public abstract class RestriccionTemporal {

	private int num;
	private LocalDateTime fechaDesde;
	private LocalDateTime fechaHasta;
	
	public void setFechaDesde(LocalDateTime fechaDesde) {
		this.fechaDesde = fechaDesde;
	}
	public void setFechaHasta(LocalDateTime fechaHasta) {
		this.fechaHasta = fechaHasta;
	}
	public RestriccionTemporal() {
	
	}
	public RestriccionTemporal(int numero, LocalDateTime fechaDesde, LocalDateTime fechaHasta) {
		this.num = numero;
		this.fechaDesde = fechaDesde;
		this.fechaHasta = fechaHasta;
	}
	
	public abstract boolean validar(Muestra muestra);
	
	
	
}
