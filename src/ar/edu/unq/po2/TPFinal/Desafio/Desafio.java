
package ar.edu.unq.po2.TPFinal.Desafio;

import ar.edu.unq.po2.TPFinal.Common.Circulo;
import ar.edu.unq.po2.TPFinal.Common.Dificultad;
import ar.edu.unq.po2.TPFinal.Restriccion.IRestriccionTemporal;


public class Desafio {
	private 	Circulo area;
	private 	IRestriccionTemporal restriccionTemporal;
	private int cantidadMuestrasARecolectar;
	private Dificultad dificultad;
	private int recompensa;
	
	public Desafio(Circulo area, IRestriccionTemporal restriccionTemporal, int cantidadMuestrasARecolectar, Dificultad dificultad, int recompensa) {
		this.area = area;
		this.restriccionTemporal = restriccionTemporal;
		this.cantidadMuestrasARecolectar = cantidadMuestrasARecolectar;
		this.dificultad = dificultad;
		this.recompensa = recompensa;
		
	}

	public Circulo getArea() {
		return area;
	}

	public IRestriccionTemporal getRestriccionTemporal() {
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
