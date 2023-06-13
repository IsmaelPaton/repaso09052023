import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PruebasJunit {

	@Test 
      void testArrayNulo() {
	int[] array = null ;
    ClaseConstructor arraynulo = new ClaseConstructor(array);
    String resultado = arraynulo.arrayNuloOVacio();
    assertEquals("Array Nulo", resultado);
	}
	
     @Test 
      public void testArrayVacio() {
    		 int[] array = { } ;
    		 ClaseConstructor arrayvacio = new ClaseConstructor (array);
    		 String resultado = arrayvacio.arrayNuloOVacio();
    		 assertEquals ("Array Vacio", resultado);
    		 
    	 }
     @Test
     public void testArrayPositivos( ) {
    	 int [] array = {1,5,8,9,78,58,3} ;
    	 ClaseConstructor arraypositivos = new ClaseConstructor (array);
    	 String resultado = arraypositivos.arrayNuloOVacio();
    	 assertEquals ("correcto", resultado); /*aqui deberia de estar el mensaje de resultado*/
     }
     @Test 
     public void testArrayPositivosNegativos () {
    	 int [] array = {-1,8,6,9,-65,-8};
    	 ClaseConstructor arraynumeros = new ClaseConstructor (array);
    	 String resultado = arraynumeros.arrayNuloOVacio();
    	 assertEquals ("correcto", resultado); // aqui deberia esta el mensaje de resultado
    	 
     }
}