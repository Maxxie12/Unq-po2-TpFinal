package ar.edu.unq.po2.TPFinal;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String 		nombre;
	private Preferencia		preferencia;
	private List<DesafioUsuario> desafios = new ArrayList<DesafioUsuario>();
	
	public Usuario(String nombre, Preferencia preferencia) {
		this.nombre = nombre;
		this.preferencia = preferencia;
	}

	public String getNombre() {
		return nombre;
	}

	public Preferencia getPreferencia() {
		return preferencia;
	}

	public List<DesafioUsuario> getDesafios() {
		return desafios;
	}
	
	//TODO: Consultar si deberia devolver un desafio o un desafioUsuario 
	public List<DesafioUsuario> desafiosCompletados(){
		return this.getDesafios().stream().filter(desafio -> desafio.getEstado()).toList();
	}
	
	public float porcentajeCompletitud(DesafioUsuario desafio) {
		return desafio.getPorcentajeCompletititud();
	}
	
	public boolean estaCompleto(DesafioUsuario desafio) {
		return desafio.getEstado();
	}
	
	public LocalDateTime fechaCompletado(DesafioUsuario desafio) {
		return desafio.getMomentoSuperacion();
	}
	
	//TODO: hacer el calculo de promedio de todos los desafios(incluye hechos y sin terminar)
	public float promedioCompletitudGeneral(DesafioUsuario desafio) {
		return 0;
	}

	
}
