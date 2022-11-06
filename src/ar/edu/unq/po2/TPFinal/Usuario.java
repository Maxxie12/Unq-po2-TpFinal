package ar.edu.unq.po2.TPFinal;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.objenesis.instantiator.basic.NewInstanceInstantiator;

import ar.edu.unq.po2.TPFinal.Desafio.Desafio;
import ar.edu.unq.po2.TPFinal.Desafio.DesafioUsuario;
import ar.edu.unq.po2.TPFinal.Estado.EstadoVencido;
import ar.edu.unq.po2.TPFinal.Recomendador.Recomendador;
import ar.edu.unq.po2.TPFinal.Recomendador.RecomendadorPorPreferencia;
import net.bytebuddy.agent.VirtualMachine.ForHotSpot.Connection.Response;

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
		this.sistema= sistema;
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
	
	public Recomendador getTipoRecomendacion() {
		return this.tipoRecomendacion;
	}
	

	public Sistema getSistema() {
		return sistema;
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
		List<Desafio> desafios = this.tipoRecomendacion.recomendarDesafios(this, this.sistema.getDesafios());
		
		if(!desafios.isEmpty()) {
			this.agregarDesafio(desafios);
		}
		
	}
	
	public void setTipoRecomendacion(Recomendador recomendador) {
		this.tipoRecomendacion = recomendador;
		this.buscarDesafios();
	}
	
	public void aceptarDesafio(DesafioUsuario desafioUsuario) {
		desafioUsuario.aceptarDesafio();
	}
	
	public void agregarDesafio(List<Desafio> desafios) {
		
		for(Desafio desafio: desafios) {
			this.getDesafios().add(new DesafioUsuario(desafio));
			
		}
		
		this.limpiarDesafiosVencidos();
	
		
	}

	private void limpiarDesafiosVencidos() {
		int index = 0;
		for(DesafioUsuario desafio: this.getDesafios()) {
			if(desafio.getEstado().equals(new EstadoVencido())) {
				this.getDesafios().remove(index);
				index = index + 1;
			}
		}
		
	}
	

}
