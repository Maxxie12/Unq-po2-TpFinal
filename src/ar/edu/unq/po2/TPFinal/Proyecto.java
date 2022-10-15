package ar.edu.unq.po2.TPFinal;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {

	private String nombre;
	private String descripcion;
	private List<Categoria> categorias = new ArrayList<Categoria>();
	private List<Muestra> muestras = new ArrayList<Muestra>();
	private List<Usuario> participantesActivos = new ArrayList<Usuario>();
	
	public Proyecto(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public List<Categoria> getCategorias() {
		return this.categorias;
	}

	public void suscribirParticipante(Usuario usuario) {
		this.participantesActivos.add(usuario);
	}
	
	public List<Usuario> getparticipantesActivos() {
		return this.participantesActivos;
	}

	public void agregarMuestra(Muestra muestra) {
		this.muestras.add(muestra);
	}
	
	public List<Muestra> getMuestras() {
		return this.muestras;
	}

}
