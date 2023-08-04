package com.curso.observer;
import com.curso.observer.obs.Like;
import com.curso.observer.sub.Publicacion;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Publicacion publicacion = new Publicacion();
		Like likeSara = new Like("Sara ", publicacion);
		// Se llama al método darLike, que notificará que se recibió un Like de Sara en la publicación
		publicacion.darLike();
		System.out.println("-------------");
		Publicacion publicacion1 = new Publicacion();
		Like likeRamon = new Like("Ramón ", publicacion1);
		// Se llama al método darLike, que notificará que se recibió un Like de Ramón en la publicación
		publicacion1.darLike();
		System.out.println("-------------");
		// Se llama al método darLike, que notificará que se recibió un Like de Ramón en la publicación
		Publicacion publicacion3 = new Publicacion();
		Like likeLuis = new Like("Luis ", publicacion3);
		publicacion3.darLike();
	}

}


