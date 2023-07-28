
public class GestorNotasConfig {
     private String appName;
    private int maxNotas;
  //De acuerdo a Singleton debe tener un atributo privado con el nombre de la misma clase o Singleton
    private static GestorNotasConfig instance;

	//Se crea un constructor privado para que la clase GestorNotasConfig sea la unica con acceso al constructor
    private GestorNotasConfig() {
        appName = "Color Note";
        maxNotas = 1000000;
    }

 // De acuerdo al Singleton debe tener un método público que regrese un Singleton, en este caso NotasConfig
 	//Luego se declara el método como estático para invocar el método sin crear al objeto
    public static GestorNotasConfig getMaxNotas() {
        if (instance == null) {
            instance = new GestorNotasConfig();
        }
        return instance;
    }
    
 // Se crea otro método que muestre en consola los nombre de lo que se obtiene de GestorNotasConfig
    public void displayConfig() {
        System.out.println("App Name: " + appName);
        System.out.println("Maximo numero de notas: " + maxNotas);
    }

	@Override
	public String toString() {
		return "GestorNotasConfig [appName=" + appName + ", maxNotas=" + maxNotas + "]";
	}

}
