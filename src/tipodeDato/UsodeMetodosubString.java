package tipodeDato;

public class UsodeMetodosubString {
	
	public static void main(String [] args) {
		
		//Sobecarga del metodo con diferentes parametros
		
		String frase = "Mi cadena";
		String subfrase1 = frase.substring(1,5);
		String subfrase2 = frase.substring(4,frase.length());
		String subfrase3 = frase.substring(4);
		//muestra i cad recordar que indice va de 0 a n-1
		System.out.println(subfrase1); 
		//muestra  adena recordar que indice va de 0 a n-1
		System.out.println(subfrase2); 
		System.out.println(subfrase3);
		//retorna la longitud 9, pero el indice en substring va de 0 a n-1
		System.out.println(frase.length());
		System.out.println("Lourdes".length());
	}
	

}
