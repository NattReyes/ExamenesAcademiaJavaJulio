
public class Principal {
	// Se simula una conexión a base de datos para ejecutar una consulta
	public static void main(String[] args) {
		try (ConexionBaseDatos conexionDatos = new ConexionBaseDatos()) {
			conexionDatos.ejecutaConsulta("SELECT * FROM usuarios");
        }

	}

}
