
public class Flash extends SuperHeroe {
	Flash(String nombre, String poder){
		//Se pone super porque indica que va a nacer con un nombre y un poder
		super(nombre, poder);
	}

	//Se utiliza el override para definir el tipo de comportamiento que tendrá flash
	@Override
	public void usarPoder() {
		System.out.println(nombre + " usa su poder: " + poder + ", para combatir a Zoom");
	}
}
