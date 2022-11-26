package ar.edu.unq.po2.TPFinal.Common;

public class Circulo {
	private Coordenada coordenada;
	private int radio;
	
	public Circulo(Coordenada coordenada, int radio) {
		this.coordenada = coordenada;
		this.radio = radio;
	}
	
	public Coordenada getCoordenada() {
		return coordenada;
	}
	public int getRadio() {
		return radio;
	}
	
	
}
