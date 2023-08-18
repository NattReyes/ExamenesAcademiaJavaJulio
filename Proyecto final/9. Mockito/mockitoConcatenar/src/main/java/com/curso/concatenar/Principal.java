package com.curso.concatenar;

public class Principal {

	public static void main(String[] args) {

		//Se crea una instancia de clase
		Concatenar concatenar = new Concatenar();
		
		// De llama al método calculaConcatenar
		String resultado = concatenar.calculaConcatenar("Hola", "mundo");
		
		System.out.println(resultado);
	}

}
