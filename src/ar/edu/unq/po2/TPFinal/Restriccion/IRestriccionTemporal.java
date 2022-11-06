package ar.edu.unq.po2.TPFinal.Restriccion;

import java.time.LocalDateTime;


public interface IRestriccionTemporal {
	public boolean validar(LocalDateTime fechaMuestra);	
}
