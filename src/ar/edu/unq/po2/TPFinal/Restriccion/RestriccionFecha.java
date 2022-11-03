package ar.edu.unq.po2.TPFinal.Restriccion;

import java.time.LocalDateTime;

import ar.edu.unq.po2.TPFinal.Muestra;

public class RestriccionFecha implements IRestriccionTemporal {

	private LocalDateTime fechaDesde;
	private LocalDateTime fechaHasta;

	public RestriccionFecha(LocalDateTime fechaDesde, LocalDateTime fechaHasta) {
		this.fechaDesde = fechaDesde;
		this.fechaHasta = fechaHasta;
	}

	public LocalDateTime getFechaDesde() {
		return this.fechaDesde;
	}

	public LocalDateTime getFechaHasta() {
		return this.fechaHasta;
	}

	@Override
	public boolean validar(Muestra muestra) {
		return  fechaMayorOIgual(muestra.getFechaYHora()) && fechaMenorOIgual(muestra.getFechaYHora()); 
	}

	private boolean fechaMayorOIgual(LocalDateTime fechaYHora) {
		return fechaYHora.isAfter(this.fechaDesde) || fechaYHora.isEqual(this.fechaDesde); 
	}

	private boolean fechaMenorOIgual(LocalDateTime fechaYHora) {
		return fechaYHora.isBefore(this.fechaHasta) || fechaYHora.isEqual(this.fechaHasta); 
	}

}
