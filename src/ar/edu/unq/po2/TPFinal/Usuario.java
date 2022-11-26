package ar.edu.unq.po2.TPFinal;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.TPFinal.Desafio.Desafio;
import ar.edu.unq.po2.TPFinal.Desafio.DesafioUsuario;
import ar.edu.unq.po2.TPFinal.Recomendador.Recomendador;
import ar.edu.unq.po2.TPFinal.Recomendador.RecomendadorPorPreferencia;

public class Usuario {

	private String nombre;
	private Preferencia preferencia;
	private List<DesafioUsuario> desafios;
	private Recomendador tipoRecomendacion;
	private Sistema sistema;

	public Usuario(String nombre, Preferencia preferencia, Sistema sistema) {
		this.nombre = nombre;
		this.preferencia = preferencia;
		this.desafios = new ArrayList<DesafioUsuario>();
		this.tipoRecomendacion = new RecomendadorPorPreferencia();
		this.sistema = sistema;
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

	public void agregarDesafioNuevo(DesafioUsuario desafioUsuario) {
		this.getDesafios().add(desafioUsuario);
	}

	public Recomendador getTipoRecomendacion() {
		return this.tipoRecomendacion;
	}

	public Sistema getSistema() {
		return sistema;
	}

	public List<DesafioUsuario> desafiosCompletados() {
		return this.getDesafios().stream().filter(desafio -> desafio.getEstado().esDesafioCompletado(desafio)).toList();
	}

	public double porcentajeCompletitud(DesafioUsuario desafio) {
		return desafio.getPorcentajeCompletititud();
	}

	public boolean estaCompleto(DesafioUsuario desafio) {
		return desafio.getEstado().esDesafioCompletado(desafio);
	}

	public LocalDateTime fechaCompletado(DesafioUsuario desafio) {
		return desafio.getFechaCompletado();
	}

	public double promedioCompletitudGeneral() {
		return desafios.stream().mapToDouble(desafio -> Double.valueOf(desafio.getPorcentajeCompletititud())).average()
				.orElse(0.0);
	}
	
	public void votarDesafioUsuario(DesafioUsuario desafioUsuario) {
		desafioUsuario.votarDesafio(1);
	}

	public void buscarDesafios() {
		List<Desafio> desafios = this.tipoRecomendacion.recomendarDesafios(this, this.sistema.getDesafios());

		if (!desafios.isEmpty()) {
			this.agregarDesafios(desafios);
		}

	}

	public void setTipoRecomendacion(Recomendador recomendador) {
		this.tipoRecomendacion = recomendador;
		this.buscarDesafios();
	}

	public void aceptarDesafio(DesafioUsuario desafioUsuario) {
		desafioUsuario.aceptarDesafio();
	}

	public void agregarDesafios(List<Desafio> desafios) {

		for (Desafio desafio : desafios) {
			this.agregarDesafioNuevo(new DesafioUsuario(desafio));

		}

		this.limpiarDesafiosVencidos();
	}

	private void limpiarDesafiosVencidos() {
		int index = 0;
		while (index <= this.desafios.size()) {
			if (this.desafios.get(index).getEstado().esDesafioVencido()) {
				this.getDesafios().remove(index);
				index = index + 1;
			}
		}

	}

}
