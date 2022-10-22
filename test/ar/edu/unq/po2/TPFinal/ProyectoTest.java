package ar.edu.unq.po2.TPFinal;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProyectoTest {
	
	Proyecto proyecto;
	
	@Mock
	Usuario usuario1;
	
	@Mock
	Usuario usuario2;
	
	@Mock
	Muestra muestra;
	
	@BeforeEach
	public void setUp() {
		
		proyecto = new Proyecto("Plantas", "Investigacion plantas");
		
	}
	
	@Test
	public void testUsuariosSubscriptos() {
		this.proyecto.suscribirParticipante(usuario1);
		this.proyecto.suscribirParticipante(usuario1);
		
		assertEquals(proyecto.getparticipantesActivos().size(), 2);
	}
	
	@Test
	public void testMuestrasDelProycto() {
		this.proyecto.agregarMuestra(muestra);
		
		assertEquals(proyecto.getMuestras().size(), 1);
	}
	
	@Test
	public void testConstructorNombre() {
		assertEquals(proyecto.getDescripcion(), "Investigacion plantas");
	}
	
	@Test
	public void testConstructorApellido() {
		assertEquals(proyecto.getNombre(), "Plantas");
	}

}
