package ar.edu.unq.po2.TPFinal.Restriccion;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.TPFinal.Muestra;

public class RestriccionCombinada implements IRestriccionTemporal {

	private List<IRestriccionTemporal> restriccionesList = new ArrayList<IRestriccionTemporal>();
	
	public List<IRestriccionTemporal> getRestricciones(){
		return this.restriccionesList;
	}
	
	@Override
	public boolean validar(Muestra muestra) {
		return getRestricciones().stream().allMatch(restriccion -> restriccion.validar(muestra));
	}
	
	public void addRestriccion(IRestriccionTemporal restriccion) {
		this.restriccionesList.add(restriccion);
	}
	
	public void removeRestriccion(IRestriccionTemporal restriccion) {
		this.restriccionesList.remove(restriccion);
	}

}
