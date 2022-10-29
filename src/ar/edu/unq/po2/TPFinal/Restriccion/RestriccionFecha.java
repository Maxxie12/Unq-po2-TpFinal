package ar.edu.unq.po2.TPFinal.Restriccion;

import java.time.LocalDateTime;
import java.util.stream.Stream;

import ar.edu.unq.po2.TPFinal.Muestra;

public class RestriccionFecha extends RestriccionTemporal {

	
	public RestriccionFecha( LocalDateTime fechaDesde, LocalDateTime fechaHasta) {
		super.setFechaDesde(fechaDesde);
		super.setFechaHasta(fechaHasta);
	}

	@Override
	public boolean validar(Muestra muestra) {
		// TODO Auto-generated method stub
		return false;
	}

	
		
	
	
}



