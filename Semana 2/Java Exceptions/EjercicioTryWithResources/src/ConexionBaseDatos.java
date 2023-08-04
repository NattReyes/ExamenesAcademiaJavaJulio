
public class ConexionBaseDatos implements AutoCloseable{
	public ConexionBaseDatos() {
        System.out.println("Conexión a la base de datos establecida.");
    }

    public void ejecutaConsulta(String consulta) {
        System.out.println("Ejecutando consulta: " + consulta);
    }

    //Después de ejecutar la consulta se llama el método close para que cierre la conexión a la base de datos
    @Override
    public void close() {
        System.out.println("Conexión a la base de datos cerrada");
    }

}
