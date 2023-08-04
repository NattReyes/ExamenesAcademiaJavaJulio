
public class estacionAño {
	// Se crea un método que va a imprimir la estación del año según un número dado
	public static void imprimirEstacionAño(int numeroEstacion) {
		try {
			String estacionAño;
		
		//Se crea un switch que va a evaluar el número de estación
		switch (numeroEstacion) {
		case 1: 
			estacionAño = "Primavera";
				break;
		case 2: 
			estacionAño = "Verano";
				break;
		case 3: 
			estacionAño = "Otoño";
				break;
		case 4: 
			estacionAño = "Invierno";
				break;
		// Si el número de estación es inválido, se lanza una excepción
		default:
            throw new IllegalArgumentException("Número de estación inválida");
				
		}
		System.out.println("La estación del año es " + estacionAño);
		}
		// Si ocurre una excepción, se captura y se imprime el error
		catch(IllegalArgumentException | NullPointerException error ) {
			System.err.println("Se produjo una excepción: " + error.getMessage());;
			System.err.println("La estación debe estar entre 1 y 4");;
			
		}
}
}