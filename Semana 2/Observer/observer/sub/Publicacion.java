package com.curso.observer.sub;

// Se crea una clase abstarcta que se extiende de Subject
public class Publicacion extends Subject {
	public void darLike() {
		// Se llama al método notificar para informar las actualizaciones a los observadores
		notificar();
	}
}

