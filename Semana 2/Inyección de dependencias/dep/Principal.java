package com.curso.dep;

// Se crea una interfaz que definirá el Cloud Service que utilizará cada usuario
interface CloudService{
	void ejecutaService();
}

public class Principal {

	public static void main(String[] args) {
		// Se crea un nuevo usuario1 
		Usuario usuario1 = new Usuario("Juan");
				
		// Se inyecta el Cloud Service Amazon al usuario1, sobreescribiendo el método ejecutaService
		Inyector.inyectarService(usuario1, new CloudService(){
			@Override
			public void ejecutaService() {
				System.out.println("Utiliza Amazon Storage");
			}
		});
		
		//Se evalua si el usuario utiliza el Servicio
		boolean usoService = usuario1.usoService();
		
		// Se muestra un mensaje de acuerdo a si uso o no el servicio
		if(usoService)
			System.out.println("Gracias por usar nuestro Cloude Service");
		else {
			System.out.println("Lo sentimos, no puedes usar este Cloud Service");
			System.out.println("Contacta a un ejecutivo");
		}
		
		System.out.println("***************");
		
		// Se inyecta el Cloud Service Microsoft al usuario1
		Inyector.inyectarService(usuario1, new CloudService(){
			@Override
			public void ejecutaService() {
				System.out.println("Utiliza Microsoft Azure");
			}
		});
		
		usoService = usuario1.usoService();
		
		// Se muestra un mensaje de acuerdo a si uso o no el servicio
		//en este caso como no lo usa la condición se evalúa en false
		if(usoService=false)
			System.out.println("Gracias por usar nuestro Cloude Service");
		else {
			System.out.println("Lo sentimos, no puedes usar este Cloud Service");
			System.out.println("Contacta a un ejecutivo");
		}
		
		// Se crea un nuevo usuario2
		Usuario usuario2 = new Usuario("Andrés");
		
		System.out.println("***************");
		
		// Se inyecta el Cloud Service Microsoft al usuario2, sobreescribiendo el método ejecutaService
		Inyector.inyectarService(usuario2, new CloudService(){
			@Override
			public void ejecutaService() {
				System.out.println("Utiliza Microsoft Azure");
			}
		});
		usoService = usuario2.usoService();
		
		// Se muestra un mensaje de acuerdo a si uso o no el servicio
		if(usoService)
			System.out.println("Gracias por usar nuestro Cloude Service");
		else {
			System.out.println("Lo sentimos, no puedes usar este Cloud Service");
			System.out.println("Contacta a un ejecutivo");
		}
		//aplicoService = usuario1.aplicarService();
		
		System.out.println("***************");
		
		// Se crea un nuevo usuario3
		Usuario usuario3 = new Usuario("Luis"); 
		
		// Se inyecta el Cloud Service Google al usuario3, sobreescribiendo el método ejecutaService
		Inyector.inyectarService(usuario3, new CloudService(){
			@Override
			public void ejecutaService() {
				System.out.println("Utiliza Google Cloud");
			}
		});
		usoService = usuario3.usoService();
		
		// Se muestra un mensaje de acuerdo a si uso o no el servicio
		if(usoService)
			System.out.println("Gracias por usar nuestro Cloude Service");
		else {
			System.out.println("Lo sentimos, no puedes usar este Cloud Service");
			System.out.println("Contacta a un ejecutivo");
		}
		
		}
	
		

	}





