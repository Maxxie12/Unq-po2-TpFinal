package ar.edu.unq.po2.TPFinal;

import java.time.LocalDateTime;

public class RestriccionTemporal {

	private LocalDateTime fechaInicio;
	private LocalDateTime fechaFin;
	//duranteSemana (consultar que seria)
	//duranteFinSemana (tambien consultar)
	
	public RestriccionTemporal(LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		super();
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}

	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}

	public LocalDateTime getFechaFin() {
		return fechaFin;
	}
	
	
	
}
