public class PrincipalApp {

	public static void main(String[] args) {
		
		int [] array =  {8,90,7,1,78};
	    String resultado;
	    
	    ClaseConstructor repaso = new ClaseConstructor(array);
	
	resultado = repaso.arrayNuloOVacio();
	for (int i=0; i<array.length; i++) {
		int numero;
		numero = array[i]  ;
		System.out.println(numero);
	}
		
		System.out.println(resultado);
	}
	
}