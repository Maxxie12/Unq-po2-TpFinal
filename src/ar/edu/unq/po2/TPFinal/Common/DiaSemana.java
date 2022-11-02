package ar.edu.unq.po2.TPFinal.Common;

public enum DiaSemana {
	LUNES(1), MARTES(2), MIERCOLES(3), JUEVES(4), VIERNES(5), SABADO(6), DOMINGO(7);

	private int numeroDia;

	private DiaSemana(int numeroDia) {
		this.numeroDia = numeroDia;
	}

	public int getNumeroDia() {
		return this.numeroDia;
	}
}
