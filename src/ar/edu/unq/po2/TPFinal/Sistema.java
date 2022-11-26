package ar.edu.unq.po2.TPFinal;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.TPFinal.BuscadorDeProyectos.IBuscadorProyectos;
import ar.edu.unq.po2.TPFinal.Common.Categoria;
import ar.edu.unq.po2.TPFinal.Desafio.Desafio;

public class Sistema {
	private List<Desafio> desafios;
	private List<Proyecto> proyectos;
	private List<Usuario> usuarios;
	private List<Categoria> categorias;
	private IBuscadorProyectos buscadorProyectos;

	public Sistema() {
		this.desafios = new ArrayList<Desafio>();
		this.proyectos = new ArrayList<Proyecto>();
		this.usuarios = new ArrayList<Usuario>();
		this.categorias = new ArrayList<Categoria>();
	}

	public List<Desafio> getDesafios() {
		return this.desafios;
	}

	public void addDesafio(Desafio desafio) {
		this.getDesafios().add(desafio);
	}

	public List<Proyecto> getProyectos() {
		return this.proyectos;
	}

	public void addProyecto(Proyecto proyecto) {
		this.getProyectos().add(proyecto);
	}

	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void addUsuario(Usuario usuario) {
		this.getUsuarios().add(usuario);
	}

	public List<Categoria> getCategorias() {
		return this.categorias;
	}

	public void addCategoria(Categoria categoria) {
		this.getCategorias().add(categoria);
	}

	public IBuscadorProyectos getBuscadorProyectos() {
		return buscadorProyectos;
	}

	public void setBuscadorProyectos(IBuscadorProyectos buscadorProyectos) {
		this.buscadorProyectos = buscadorProyectos;
	}

}
