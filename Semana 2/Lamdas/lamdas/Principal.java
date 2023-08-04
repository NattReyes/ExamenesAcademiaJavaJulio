package com.curso.lamdas;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

public class Principal {

	public static void main(String[] args) {
		//Vamos a evaluar una lambda Predicate donde vamos a pasar 
		//un valor entero y la lambda va a evaluar si es un un número par (true)
		//o impar (false)
				
		Predicate<Integer> pre = i -> (i%2==0) ? true : false ;
				
		boolean r = pre.test(6);
				
		if (r)
			System.out.println("Es par");
		else 
			System.out.println("Es impar");
		System.out.println("**********");
		
		//Vamos a evaluar una lambda Function donde vamos a pasar 
		//un valor entero y regresar un String, 
		//la lambda va a evaluar si es un un número par (regresa: "Es par")
		//o impar (regresa: "Es Impar")
						
		Function<Integer,String> fun = i -> (i%2==0) ? "Es par" : "Es impar" ;
				
		System.out.println(fun.apply(8));
		System.out.println("**********");
		
		//Se evaluara una lambda Consumer donde le vamos a pasar
      	//un String y va a devolver un método print,
      	//la lamda va a imprimir el mensaje en consola
		
        Consumer<String> imprimeMensaje = mensaje -> System.out.println(mensaje);
        String mensajeImprimir = "¡Bienvenido!";
        imprimeMensaje.accept(mensajeImprimir);
        
        System.out.println("**********");
        
        //Se evaluara una lambda BiConsumer donde la vamos a pasar
		//dos String y regresa un método
		//la lambda va a concatenar los Strings e imprimir el resultado
        
        BiConsumer<String, String> imprimirString = (str1, str2) -> System.out.println(str1 + " " + str2);
        imprimirString.accept("Buenos", "días");
        
        System.out.println("**********");
		
		//Se evaluará una Lambda BinaryOperator donde le vamos a pasar
		//dos valores enteros y regresa un valor entero,
		//la lambda va a sumar dos números y regresará el resultado de la suma
        	
		BinaryOperator<Integer> sum = (x, y) -> x + y;
		
		System.out.println(sum.apply (150,350));
		System.out.println("**********");
		
		//Se evaluara una lambda Predicate donde le vamos a pasar
		//un valor entero y la lamda va a evaluar si es un número positivo (true)
		//o negativo (false)
		
		Predicate<Integer> esPositivo = num -> num > 0;
        int number = -5;
        boolean resultado = esPositivo.test(number);
       
        System.out.println("¿Es " + number + " positivo? " + resultado);
        System.out.println("**********");
		
        //Se evaluara una lambda UnaryOperator donde le vamos a pasar
      	//un valor entero y va a devolver un valor entero,
      	//la lamda va a imprimir el resultado del valor que se le pase X2
        
        UnaryOperator<Integer> multiplicarPor2 = x -> x * 2;
        int resultado2 = multiplicarPor2.apply(5); 
        
        System.out.println("El resultado es: " + resultado2);
        System.out.println("**********");
        
		//Se evaluara una lambda BiFunction donde la vamos a pasar
		//dos String y regresa un resultado String
		//la lambda va a concatenar los Strings
		
        BiFunction <String, String, String> concat = (str1, str2) -> (str1+str2);
		
        System.out.println(concat.apply("Hola ", "mundo"));
		System.out.println("**********");
		
		//Se evaluará una Lambda BinaryOperator donde le vamos a pasar
		//dos valores enteros y regresa un valor entero,
		//la lambda va a dividir dos números y regresará el resultado de la división
        	
		BinaryOperator<Integer> div = (x, y) -> x / y;
		
		System.out.println(div.apply (600,50));
		System.out.println("**********");
		
		//Vamos a evaluar una lambda Function donde vamos a pasar 
		//un String y regresar un String, 
		//la lambda va a concatenar el nombre que le pasemos con el mensaje
							
		Function<String, String> saludo = name -> "Hola, " + name + " ¿Cómo estás?";
		String name = "Luis";
        System.out.println(saludo.apply(name));
		
	}	
}
