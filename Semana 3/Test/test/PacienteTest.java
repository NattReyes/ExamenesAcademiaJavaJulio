package test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import main.Paciente;
import main.PacienteRegistrado;

public class PacienteTest {
	private Paciente paciente;
		
	@BeforeEach
	public void setUp() {
		paciente = new Paciente();
		paciente.crearPaciente(0L, "Sara");
		paciente.crearPaciente(1L, "Luis");
		
	}
	
	// Anotación para el nombre del test
	@DisplayName("Dado un paciente que queremos crear "
			+ "Cuando llamamos a crearPaciente "
			+ "Esperamos que el paciente este creado")
	@Test
	public void test1() {
		PacienteRegistrado esperado = new PacienteRegistrado (1L, "Sara");
		final PacienteRegistrado resultado = paciente.crearPaciente(1L,"Sara");
		
		// Se comparan atributos del paciente creado con el esperado para ver si son iguales
		Assertions.assertEquals(esperado.getId(), resultado.getId());
		Assertions.assertEquals(esperado.getNombre(), resultado.getNombre(),"Los nombres son iguales");
		Assertions.assertEquals(esperado, resultado);
	}
	
	@DisplayName("Comparación del paciente creado con el esperado; paciente con nombre diferente ")
			
	 @Test
	    public void test2() {
		PacienteRegistrado esperado = new PacienteRegistrado(1L, "Sara");
	        final PacienteRegistrado resultado = paciente.crearPaciente(1L, "Luisa");
	        
	        Assertions.assertEquals(esperado.getId(), resultado.getId());
	     // Se comparan atributos del paciente creado con el esperado para ver si son diferentes
	        Assertions.assertNotEquals(esperado.getNombre(), resultado.getNombre(), "Los nombres son diferentes");
	        Assertions.assertNotEquals(esperado, resultado);
	    }
	 
	 @DisplayName("Prueba para obtenerPaciente: paciente inexistente")
	 @Test
	    public void test3() {
	        Paciente paciente = new Paciente();
	        final PacienteRegistrado resultado = paciente.obtenerPaciente(2L);
	     // Se verifica si el método obtenerPaciente obtiene la información de un paciente que no existe, se espera que sea nulo
	        Assertions.assertEquals(null, resultado);
	    }
	
	 @DisplayName("Prueba para obtenerPaciente: paciente existente")
	 @Test
	    public void test4() {
		 PacienteRegistrado esperado = new PacienteRegistrado(0L, "Sara");
	        final PacienteRegistrado resultado = paciente.obtenerPaciente(0L);
	     // Se verifica si el método obtenerPaciente obtiene la información de un paciente existente
	        Assertions.assertEquals(esperado, resultado);
	    }

}
