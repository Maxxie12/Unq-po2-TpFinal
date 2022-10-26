package ar.edu.unq.po2.TPFinal;

import ar.edu.unq.po2.TPFinal.Common.Coordenada;

public class Area {
	private Coordenada coordenada;
	private int radio;
	
	public Area(Coordenada coordenada, int radio) {
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
