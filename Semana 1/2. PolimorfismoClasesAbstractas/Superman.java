
public class Superman extends SuperHeroe  {
	Superman(String nombre, String poder){
		//Se pone super porque indica que va a nacer con un nombre y un poder
		super(nombre, poder);
	}
		
	//Se utiliza el override para definir el tipo de comportamiento que tendrá superman
	@Override
	public void usarPoder() {
		System.out.println(nombre + " usa su poder: " + poder + ", para combatir a Lex Luttor");
	}
}
