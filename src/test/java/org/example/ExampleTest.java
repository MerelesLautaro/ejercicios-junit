package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ExampleTest {

    private Example example;

    @BeforeEach
    public void init(){
        this.example = new Example();
    }

    @Test
    public void testSumar(){
        // Given - Teniendo
        // Example example = new Example();
        int numberA = 5;
        int numberB = 3;

        //When  - Cuando
        int result = example.sumar(numberA,numberB);

        //Then - entonces
        assertEquals(8,result);
    }

    @Test
    public void testCheckPositivo(){
        int number = 4;

        boolean result = example.checkPositivo(number);

        assertTrue(result);
    }

    @Test
    public void testCheckPositivoError(){
        int number = -4;

        assertThrows(IllegalArgumentException.class, ()->
                example.checkPositivo(number)
        );
    }

    @Test
    public void testContarLetrasA(){
        String cadena = "Hola muchachos anashe";
        int result = example.contarLetrasA(cadena);
        assertEquals(4,result);
    }

    @Test
    public void testContieneElemento(){
        List<String> lista = List.of("perritos","jamon","gatitos");
        String elemento = "perritos";
        boolean result = example.contieneElemento(lista,elemento);
        assertTrue(result);
    }

    @Test
    public void testRevertirCadena(){
        String cadena = "Gato";
        String result = example.revertirCadena(cadena);
        assertEquals("otaG",result);
    }

    @Test
    public void testFactorial(){
        int numero = 3;
        long result = example.factorial(3);
        assertEquals(6L,result);
    }

    @Test
    public void testFactorialError(){
        int numero = -3;
        assertThrows(IllegalArgumentException.class, ()->
                example.factorial(numero));
    }

    @Test
    public void testEsPrimoNegative(){
        int numero = -3;
        boolean result = example.esPrimo(numero);
        assertFalse(result);
    }

    @Test
    public void testEsPrimoFalse(){
        int numero = 4;
        boolean result = example.esPrimo(numero);
        assertFalse(result);
    }

    @Test
    public void testEsPrimo(){
        int numero = 3;
        boolean result = example.esPrimo(numero);
        assertTrue(result);
    }

    @Test
    public void testMensajeConRetraso() throws InterruptedException{
        String result = example.mensajeConRetraso();
        assertEquals("Listo después de retraso",result);
    }

    @Test
    public void testConvertirAString(){
        List<Integer> lista = List.of(1,5,8,10,15,1345);
        List<String> listaConvertida = example.convertirAString(lista);
        assertEquals(List.of("1","5","8","10","15","1345"),listaConvertida);
    }

    @Test
    public void testCalcularMediaError(){
        List<Integer> lista = List.of();
        assertThrows(IllegalArgumentException.class, ()->example.calcularMedia(lista));
    }

    @Test
    public void testCalcularMediaNull(){
        List<Integer> lista = null;
        assertThrows(IllegalArgumentException.class,()->example.calcularMedia(lista));
    }

    @Test
    public void testCalcularMedia(){
        List<Integer> lista = List.of(9,9,9);
        double result = example.calcularMedia(lista);
        assertEquals(9,result);
    }

    @Test
    public void testConvertirListaAString(){
        List<String> lista = List.of("jorge","el","curioso");
        String result = example.convertirListaAString(lista);
        assertEquals("JORGE,EL,CURIOSO",result);
    }
}
