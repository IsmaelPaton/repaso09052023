public class PrincipalApp {

	public static void main(String[] args) {
		
		int [] array =  {5,6,8,78,69,0};
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