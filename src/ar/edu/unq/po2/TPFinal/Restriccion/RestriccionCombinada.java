package ar.edu.unq.po2.TPFinal.Restriccion;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class RestriccionCombinada implements IRestriccionTemporal {

	private List<IRestriccionTemporal> restriccionesList = new ArrayList<IRestriccionTemporal>();
	
	public List<IRestriccionTemporal> getRestricciones(){
		return this.restriccionesList;
	}
	
	@Override
	public boolean validar(LocalDateTime fechaMuestra) {
		return getRestricciones().stream().allMatch(restriccion -> restriccion.validar(fechaMuestra));
	}
	
	public void addRestriccion(IRestriccionTemporal restriccion) {
		this.restriccionesList.add(restriccion);
	}
	
	public void removeRestriccion(IRestriccionTemporal restriccion) {
		this.restriccionesList.remove(restriccion);
	}

}
