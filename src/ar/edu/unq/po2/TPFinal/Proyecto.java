package ar.edu.unq.po2.TPFinal;

import java.util.List;

public class Proyecto {

 private	String nombre;
 private	String descripcion;
 private	List categorias;
 private	List usuarios;
 private	List muestras;
 
 public String getNombre() {
	return nombre;
}
 public String getDescripcion() {
	return descripcion;
}
 public List getCategorias() {
	return categorias;
}
 public List getUsuarios() {
	return usuarios;
}
 public List getMuestras() {
	return muestras;
}
 
 public void add(Usuario usuario) {
	 usuario.add(usuario);
 }
 
 public void add(Muestra muestra) {
	 muestra.add(muestra);
 }
 
 
}
