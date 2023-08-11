package com.curso.v1;

public class Persona {
	private long id;
	private int edad;
	private Sexo sexo;
	
	Persona(long id, int edad, Sexo sexo){
		this.id = id;
		this.edad = edad;
		this.sexo = sexo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	
	

}
