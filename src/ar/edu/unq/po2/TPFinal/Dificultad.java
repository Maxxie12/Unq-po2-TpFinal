package ar.edu.unq.po2.TPFinal;

public enum Dificultad {
	MUYFACIL(1), FACIL(2), INTERMEDIO(3), DIFICIL(4), MUYDIFICIL(5);
	
	private int valorDificultad;

	private Dificultad(int valorDificultad) {
		this.valorDificultad = valorDificultad;
	}
	
	public int getValorDificultad() {
		return this.valorDificultad;
	}
}
