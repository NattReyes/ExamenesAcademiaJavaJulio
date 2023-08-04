package com.curso.observer.sub;
import java.util.ArrayList;
import java.util.List;
import com.curso.observer.obs.Observer;

// Se crea una clase abstracta del Subject
public abstract class Subject {
	List <Observer> listaObserver;
	
	// Se crea un constructor que inicializa la lista de observadores
	Subject(){
		listaObserver = new ArrayList<Observer>();
	}
	
	// Se crea un método para agregar los observadores a la lista
	public void attach(Observer o) {
		listaObserver.add(o);
	}
	
	// Se crea un método para eliminar los observadores a la lista
	public void dettach(Observer o) {
		listaObserver.remove(o);
	}
	
	// Se crea un método que notificará  las actualizaciones a los observadores
	public void notificar() {
		for(Observer o: listaObserver) {
			o.update();
		}
	}

}
