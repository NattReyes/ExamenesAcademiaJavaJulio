package com.curso.observer.obs;
import com.curso.observer.sub.Subject;

public abstract class Observer {
		Subject sub;
	
		// Se crea un constructor que recibe un subject y se registra como observador
		public Observer(Subject sub) {
			this.sub = sub;
			// Se registra como observador
			sub.attach(this);
		}

		// Se crea un método abstracto para actualizar el observador
		public abstract void update();
}
