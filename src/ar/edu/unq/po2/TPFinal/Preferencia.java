package ar.edu.unq.po2.TPFinal;

public class Preferencia {
	private int cantidadMuestras;
	private int dificultad;
	private int recompensaPreferida;
	
	public Preferencia(int cantidadMuestras, int dificultad, int recompensaPreferida) {
		this.cantidadMuestras = cantidadMuestras;
		this.dificultad = dificultad;
		this.recompensaPreferida = recompensaPreferida;
	}

	public int getCantidadMuestras() {
		return cantidadMuestras;
	}

	public int getDificultad() {
		return dificultad;
	}

	public int getRecompensaPreferida() {
		return recompensaPreferida;
	}
}
