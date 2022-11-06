package ar.edu.unq.po2.TPFinal.Restriccion;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

import ar.edu.unq.po2.TPFinal.Common.DiaSemana;

public class RestriccionFinSemana implements IRestriccionTemporal {

	@Override
	public boolean validar(LocalDateTime fechaMuestra) {
		int numeroDia = numeroDia(fechaMuestra);
		return numeroDia == DiaSemana.SABADO.getNumeroDia() || numeroDia == DiaSemana.DOMINGO.getNumeroDia();
	}

	private int numeroDia(LocalDateTime fecha) {
		// Aca obtenemos el dia
		//Devuelve 1 => Lunes, 2=> Martes, etc
		DayOfWeek dia = fecha.getDayOfWeek();
		return dia.getValue();
	}
}
