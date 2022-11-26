package ar.edu.unq.po2.TPFinal.Estado;

import ar.edu.unq.po2.TPFinal.Desafio.DesafioUsuario;

public interface IEstadoDesafio {
	
	public void aceptarDesafio(DesafioUsuario desafioUsuario);
	public void desafioCompletado(DesafioUsuario desafioUsuario);
	public void votarDesafio(DesafioUsuario desafioUsuario, Integer voto);
	public boolean esDesafioCompletado(DesafioUsuario desafioUsuari);
	public boolean esDesafioVencido();
}
