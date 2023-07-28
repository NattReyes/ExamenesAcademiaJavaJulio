
public class Principal {

	public static void main(String[] args) {
		GestorNotasConfig config = GestorNotasConfig.getMaxNotas();
		        config.displayConfig();		        
		//Para comprobar el Singleton se crea una nueva configuracion
		        GestorNotasConfig config2 = GestorNotasConfig.getMaxNotas();
		        config.displayConfig();
		 //Se compara si config es igual a config2, debe salir true		        
		        System.out.println(config == config2); 

		    }

	}
