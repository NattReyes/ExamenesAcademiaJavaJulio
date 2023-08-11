package com.curso.v1;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {
	public static void main(String[] args) {
		//Se crea un stream de objetos Persona 
		Stream<Persona>personasStream = Stream.of(
				new Persona(2, 5, Sexo.F),
				new Persona(5, 15, Sexo.M),
				new Persona(3, 10, Sexo.M),
				new Persona(4, 10, Sexo.F),
				new Persona(1, 5, Sexo.M));
		
		List<Long> listaStreams = personasStream
				//Se filtran los objetos Persona por Sexo=M 
				.filter(p -> p.getSexo().equals(Sexo.M))
				//Se filtran los objetos Persona edad<=10
				.filter(p -> p.getEdad()<=10)
				//Se ordenan los objetos Persona en orden ascendente de acuerdo a su Id
				.sorted(Comparator.comparing(Persona::getId))
				//Se obtienen solo los Id de los objetos Persona
				.map(Persona::getId)
				//Se recolectan los elementos en la listaStreams
				.collect(Collectors.toList());
				
		 // Se itera la listaStreams y se imprime el resultado		
		listaStreams.forEach(System.out::print);
	}
}
