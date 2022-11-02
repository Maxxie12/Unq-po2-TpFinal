package ar.edu.unq.po2.TPFinal.Restriccion;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import ar.edu.unq.po2.TPFinal.Muestra;
import ar.edu.unq.po2.TPFinal.Common.DiaSemana;

public class RestriccionDias implements IRestriccionTemporal {

	@Override
	public boolean validar(Muestra muestra) {
		// Aca obtenemos el dia
		
		
		boolean validado = false;
			
		for(DiaSemana dia: DiaSemana.values()) {
			validado = dia == DiaSemana.LUNES ? true : false;
		}

		return validado;
	}
}
