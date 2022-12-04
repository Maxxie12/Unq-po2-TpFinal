package ar.edu.unq.po2.TPFinal.Estado;

import ar.edu.unq.po2.TPFinal.Muestra;
import ar.edu.unq.po2.TPFinal.Desafio.DesafioUsuario;

public interface IEstadoDesafio {
	
	public void aceptarDesafio(DesafioUsuario desafioUsuario);

	public void votarDesafio(DesafioUsuario desafioUsuario, Integer voto);

	public double getPorcentajeCompletititud(DesafioUsuario desafioUsuario);

	public void agregarMuestra(Muestra muestra, DesafioUsuario desafioUsuario);
}
