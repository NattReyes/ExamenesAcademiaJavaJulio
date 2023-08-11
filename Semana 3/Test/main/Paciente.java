package main;
import java.util.HashMap;

public class Paciente {
	private final HashMap<Long, PacienteRegistrado> pacientes = new HashMap <>();
	
	public PacienteRegistrado crearPaciente (Long id, String nombre) {
		pacientes.put(id, new PacienteRegistrado(id, nombre));
		return pacientes.get(id);
	}
	
	public PacienteRegistrado obtenerPaciente(Long id) {
		return pacientes.get(id);
	}
	
	public PacienteRegistrado actualizarPaciente (Long id, String nombre) {
		return pacientes.put(id, new PacienteRegistrado(id, nombre));
	}

}
