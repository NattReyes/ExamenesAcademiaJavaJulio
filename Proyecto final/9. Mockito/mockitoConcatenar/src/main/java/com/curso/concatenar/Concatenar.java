package com.curso.concatenar;

public class Concatenar {
	
	// Se crea la referencia de la interfaz para la inyección de dependencia
	ConcantenaString concatenaString; 

	// Se crea el método para concatenar dos string
	String calculaConcatenar(String a, String b) {
		String resultado = concatenaString.ejecutaConcatenar(a, b);
		return resultado;
	}

}
