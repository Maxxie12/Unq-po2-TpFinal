package ar.edu.unq.po2.TPFinal.Restriccion;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

import ar.edu.unq.po2.TPFinal.Muestra;
import ar.edu.unq.po2.TPFinal.Common.DiaSemana;

public class RestriccionSemana implements IRestriccionTemporal {

	@Override
	public boolean validar(Muestra muestra) {
		int numeroDia = numeroDia(muestra.getFechaYHora());
		return numeroDia >= DiaSemana.LUNES.getNumeroDia() && numeroDia <= DiaSemana.VIERNES.getNumeroDia();
	}

	private int numeroDia(LocalDateTime fecha) {
		// Aca obtenemos el dia
		//Devuelve 1 => Lunes, 2=> Martes, etc
		DayOfWeek dia = fecha.getDayOfWeek();
		return dia.getValue();
	}
}
