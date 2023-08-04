package com.curso.dep;

// Se crea una clase Usuario que tendrá el nombre del usuario y un CloudService
public class Usuario {
	private String nombre;
	private CloudService cloudService;
	
	// Se crea un constructor que recibe el nombre del usuario
	public Usuario(String nombre){
		this.nombre = nombre;
	}
	
	// Se crea un método para obtener el nombre del usuario
	public String getNombre(){
		return nombre;
	}
	
	// Se crea un método para establecer el nombre del usuario
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// Se crea un método para obtener el CloudService
	public CloudService getCloudService() {
		return cloudService;
	}
	
	// Se crea un método para establecer el nombre del usuario
	public void setCloudService(CloudService cloudService) {
		this.cloudService = cloudService;
	}
	
	// Se crea un método que devuelve un boolean cuando el usuario usa el CloudService
	public boolean usoService() {
		System.out.println("El usuario "+nombre);
		cloudService.ejecutaService();
		return true;
		
	}
	

}
