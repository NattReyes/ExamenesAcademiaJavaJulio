package com.curso.observer.obs;
import com.curso.observer.sub.Subject;

// Se crea una clase Like (observer) 
public class Like extends Observer {
	 private String nombre;

	// Se crea un constructor que recibe un nombre y el Subject 
	 public Like(String nombre, Subject sub) {
	    	super(sub);
	        this.nombre = nombre;
	    }

	// Se crea un método que muestra cuando se recibe un like 
	 public void recibirLike() {
	        System.out.println(nombre + "le dio like a tu Publicación ");
	    }
	    
	    @Override
	    public void update() {
	    	recibirLike();
		}
}



