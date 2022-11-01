package ar.edu.unq.po2.TPFinal;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.TPFinal.Desafio.DesafioUsuario;
import ar.edu.unq.po2.TPFinal.Recomendador.IRecomendador;
import ar.edu.unq.po2.TPFinal.Recomendador.RecomendadorPorCoincidencia;

public class Usuario {

	private String nombre;
	private Preferencia preferencia;
	private List<DesafioUsuario> desafios;
	private IRecomendador tipoRecomendacion;

	public Usuario(String nombre, Preferencia preferencia) {
		this.nombre = nombre;
		this.preferencia = preferencia;
		this.desafios = new ArrayList<DesafioUsuario>();
		this.tipoRecomendacion = new RecomendadorPorCoincidencia();
	}
	
	public String getNombre() {
		return this.nombre;
	}
		
	public Preferencia getPreferencia() {
		return this.preferencia;
	}

	public List<DesafioUsuario> getDesafios() {
		return this.desafios;
	}
	
	public IRecomendador getTipoRecomendacion() {
		return this.tipoRecomendacion;
	}

	public List<DesafioUsuario> desafiosCompletados() {
		return this.getDesafios().stream().filter(desafio -> desafio.getEstado().esDesafioCompletado()).toList();
	}

	public double porcentajeCompletitud(DesafioUsuario desafio) {
		return desafio.getPorcentajeCompletititud();
	}

	public boolean estaCompleto(DesafioUsuario desafio) {
		return desafio.getEstado().esDesafioCompletado();
	}

	public LocalDateTime fechaCompletado(DesafioUsuario desafio) {
		return desafio.getFechaCompletado();
	}

	public double promedioCompletitudGeneral() {
		return desafios.stream().mapToDouble(desafio -> Double.valueOf(desafio.getPorcentajeCompletititud())).average()
				.orElse(0.0);
	}
	
	public void buscarDesafios() {
		this.tipoRecomendacion.recomendarDesafios(this);
	}
	
	public void setTipoRecomendacion(IRecomendador recomendador) {
		this.tipoRecomendacion = recomendador;
		this.buscarDesafios();
	}
	
	public void aceptarDesafio(DesafioUsuario desafioUsuario) {
		desafioUsuario.aceptarDesafio();
	}

}
