package com.curso.dep;

//// Se crea el Inyector que va a inyectar un CloudService a cada usuario
public class Inyector {
	public static void inyectarService(Usuario usuario1, CloudService cloudService) {
		usuario1.setCloudService(cloudService);
	}

}
