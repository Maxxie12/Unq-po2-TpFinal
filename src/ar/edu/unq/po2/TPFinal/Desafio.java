package ar.edu.unq.po2.TPFinal;

import ar.edu.unq.po2.TPFinal.Common.Dificultad;
import ar.edu.unq.po2.TPFinal.Restriccion.RestriccionTemporal;

public class Desafio {
	private 	Area area;
	private 	RestriccionTemporal restriccionTemporal;
	private int cantidadMuestrasARecolectar;
	private Dificultad dificultad;
	private int recompensa;
	
	public Desafio(Area area, RestriccionTemporal restriccionTemporal, int cantidadMuestrasARecolectar, Dificultad dificultad, int recompensa) {
		this.area = area;
		this.restriccionTemporal = restriccionTemporal;
		this.cantidadMuestrasARecolectar = cantidadMuestrasARecolectar;
		this.dificultad = dificultad;
		this.recompensa = recompensa;
		
	}

	public Area getArea() {
		return area;
	}

	public RestriccionTemporal getRestriccionTemporal() {
		return restriccionTemporal;
	}

	public int getCantidadMuestrasARecolectar() {
		return cantidadMuestrasARecolectar;
	}

	public Dificultad getDificultad() {
		return dificultad;
	}

	public int getRecompensa() {
		return recompensa;
	}

}
