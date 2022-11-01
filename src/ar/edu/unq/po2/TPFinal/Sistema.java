package ar.edu.unq.po2.TPFinal;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.TPFinal.Desafio.Desafio;




public class Sistema {
	private List<Desafio>  desafios;
	private List<Proyecto> proyectos; 
	private List<Usuario>  usuarios;  
	
		
	public Sistema() {
		this.desafios  = new ArrayList<Desafio>(); 
		this.proyectos = new ArrayList<Proyecto>();
		this.usuarios  = new ArrayList<Usuario>();
	}
	public List<Desafio> getDesafios() {
		return desafios;
	}
	public void setDesafios(List<Desafio> desafios) {
		this.desafios = desafios;
	}
	public List<Proyecto> getProyectos() {
		return proyectos;
	}
	public void setProyectos(List<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	
	
	
}
