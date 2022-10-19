package ar.edu.unq.po2.TPFinal;

public class Desafio {
	private 	Area area;
	private 	RestriccionTemporal restriccionTemporal;
	private int cantidadMuestrasARecolectar;
	private int dificultad;
	private int recompensa;

	public Desafio(Area area, RestriccionTemporal restriccionTemporal, int cantidadMuestrasARecolectar, int dificultad, int recompensa) {
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

	public int getDificultad() {
		return dificultad;
	}

	public int getRecompensa() {
		return recompensa;
	}

}
