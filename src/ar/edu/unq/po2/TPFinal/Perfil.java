package ar.edu.unq.po2.TPFinal;

import java.util.List;


public abstract class Perfil {
	private List gustos;
	private List preferencias;
	private List comportamientos;
	
	
	public List getGustos() {
		return gustos;
	}
	public List getPreferencia() {
		return preferencias;
	}
	public List getComportamientos() {
		return comportamientos;
	}
	public Perfil(List gustos, List preferencias, List comportamientos) {
		this.gustos = gustos;
		this.preferencias = preferencias;
		this.comportamientos = comportamientos;
	}
	
	

}
