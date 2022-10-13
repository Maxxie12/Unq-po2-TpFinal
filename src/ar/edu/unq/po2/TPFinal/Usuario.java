package ar.edu.unq.po2.TPFinal;

public class Usuario {
	
	private String 		nombre;
	private Perfil 		perfil;
	
	public String getNombre() {
		return nombre;
	}
	public Perfil getPerfil() {
		return perfil;
	}

	public Usuario(String nombre, Perfil perfil) {
		this.nombre = nombre;
		this.perfil = perfil;
		
	}
	
	

	
}
