
public class ClaseConstructor {
	private int [] array;
	
	public ClaseConstructor(int[] array) {
        this.array = array;
	}
	public String arrayNuloOVacio() {
		String resultado = " " ;
		int multiplo5 = 0;
		int pares = 0;
		int impares = 0;
		int mayor = 0;
		
	if(array == null ) {
			resultado = "Array Nulo";
		}
				
	else if(array.length == 0){
		resultado = "Array Vacio";
	}else {
	
		for (int i=0 ; i<array.length; i++) {
			if(array[i] %5 ==0) {
				multiplo5 ++;
				
			}
			if (array [i] %2==0) {
				pares ++;
				
			}
			if (array[i] %2!= 0) {
				impares ++;
			}
			if (array[i] > mayor) {
				mayor = array[i];
				
				
			}
			
		
		}
			resultado = "mensaje "; 

	}	
	return resultado;	
	}
}