//Se crea una clase abstracta de Superhero para modelar el comportamiento de las clases hijas (superheroes)
public abstract class SuperHeroe {
	protected String nombre;
	protected String poder;

	public SuperHeroe (String nombre, String poder){
		super(); //Se define super porque las clases hijas van a decir cómo van a nacer
		this.nombre= nombre;
		this.poder = poder;
	}
	
//Se crea un método abstracto porque quiero que cada clase hija (superheroe) defina como usará su poder
	public abstract void usarPoder ();
}


