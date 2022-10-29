package ar.edu.unq.po2.TPFinal;

import java.util.ArrayList;
import java.util.Collection;



public class Sistema {
	private Collection<Desafio>  desafios  = new ArrayList<Desafio>();
	private Collection<Proyecto> proyectos = new ArrayList<Proyecto>();
	private Collection<Usuario>  usuarios  = new ArrayList<Usuario>();
	
		
	public Sistema(Collection<Desafio> desafios, Collection<Proyecto> proyectos, Collection<Usuario> usuarios) {
		this.desafios = desafios;
		this.proyectos = proyectos;
		this.usuarios = usuarios;
	}
	public Collection<Desafio> getDesafios() {
		return desafios;
	}
	public void setDesafios(Collection<Desafio> desafios) {
		this.desafios = desafios;
	}
	public Collection<Proyecto> getProyectos() {
		return proyectos;
	}
	public void setProyectos(Collection<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}
	public Collection<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(Collection<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	
	
	
	
	
}
