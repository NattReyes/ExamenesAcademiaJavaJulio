package com.curso.concatenar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import com.curso.concatenar.ConcantenaString;
import com.curso.concatenar.Concatenar;

public class ConcatenarTest {

    @InjectMocks
    private Concatenar concatenar;

    @Mock
    private ConcantenaString concatenaString;

    // Se  inicializan el mocks y la inyeccion
    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this); 
    }

    @Test
    public void testConcatenar() {
    	String a = "Hola";
    	String b= "mundo";

        // Se define el comportamiento del mock
        Mockito.when(concatenaString.ejecutaConcatenar(a, b)).thenReturn("Hola mundo");

        // Se llama al método a probar
        String resultado = concatenar.calculaConcatenar(a, b);

        // Se verifica que el resultado sea igual al valor esperado
        Assertions.assertEquals("Hola mundo", resultado);
    }

}
