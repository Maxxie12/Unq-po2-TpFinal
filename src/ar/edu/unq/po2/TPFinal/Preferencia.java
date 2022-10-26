package ar.edu.unq.po2.TPFinal;

import ar.edu.unq.po2.TPFinal.Common.Dificultad;

public class Preferencia {
	private int cantidadMuestras;
	private Dificultad dificultad;
	private int recompensaPreferida;
	
	public Preferencia(int cantidadMuestras, Dificultad dificultad, int recompensaPreferida) {
		this.cantidadMuestras = cantidadMuestras;
		this.dificultad = dificultad;
		this.recompensaPreferida = recompensaPreferida;
	}

	public int getCantidadMuestras() {
		return cantidadMuestras;
	}

	public Dificultad getDificultad() {
		return dificultad;
	}

	public int getRecompensaPreferida() {
		return recompensaPreferida;
	}
}
