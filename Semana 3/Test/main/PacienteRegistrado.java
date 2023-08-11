package main;

import java.util.Objects;

public class PacienteRegistrado {
	final Long id;
	final String nombre;
	
	public PacienteRegistrado(Long id, String nombre){
		this.id = id;
		this.nombre = nombre;
	}
	
	
	public Long getId(){
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id, nombre);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass () != obj.getClass()) return false;
		PacienteRegistrado that = (PacienteRegistrado) obj;
		return Objects.equals(id, that.id) && Objects.equals(nombre, that.nombre);
	}
	
	

}
