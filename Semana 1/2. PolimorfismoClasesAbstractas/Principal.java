import java.util.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Se crea un arrayList que guardará cada nuevo superheroe
		ArrayList<SuperHeroe> equipoSuperheroes = new ArrayList<>();
		equipoSuperheroes.add(new Superman("Clark Kent", "Rayos x y vuelo"));
		equipoSuperheroes.add(new Flash("Barry Allen", "Velocidad"));
		equipoSuperheroes.add(new Hulk("Bruce Banner", "Super fuerza"));
		
				//Se usa un ciclo for each para recorrer el ArrayList y traer el método usarPoder de cada superheroe
		        for (SuperHeroe heroe : equipoSuperheroes) {
		            heroe.usarPoder();
		        }
		} 
			
}
