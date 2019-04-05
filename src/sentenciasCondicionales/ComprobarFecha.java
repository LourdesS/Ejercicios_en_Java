package sentenciasCondicionales;
import java.util.Scanner;
//Importacion de la  Clase Scanner desde la biblioteca Java
public class ComprobarFecha {
	
	static String entradaTeclado="";
	
	
	public void validarFecha(String d, String m, String a) {
	  
		int validaDia= Integer.parseInt(d);
		int validaMes= Integer.parseInt(m);
		int validaAnno= Integer.parseInt(m);
		
			if (validaDia>0 & validaDia<32){
				System.out.println("El dia es correcto \n");}
				else {
					System.out.println("El dia No es correcto \n");}			
				
				if (validaMes>0 & validaMes<13){
					System.out.println("El mes es correcto \n");}
					else {
						System.out.println("El mes No es correcto \n");}
					
					if (validaAnno>0 & validaAnno<3000){
						System.out.println("El año es correcto \n");
					}
					else {
						System.out.println("El Año No es correcto \n");
				    }
	}
				
				

            
				
		
	
	
	
	public static void main(String[] args) {
		
		
		
		
		Scanner entradaEscanner=new  Scanner(System.in);
		
		
		
		System.out.println("Por favor introduzca día: \n");
		entradaTeclado= entradaEscanner.nextLine();
		//validaDia(entradaTeclado);
		String dia=entradaTeclado;
		
        System.out.println("Por favor introduzca mes: \n");
		entradaTeclado= entradaEscanner.nextLine();
		//validaMes(entradaTeclado);
		String mes=entradaTeclado;
		
		 System.out.println("Por favor introduzca año: \n");
		 entradaTeclado= entradaEscanner.nextLine();
		 //validaMes(entradaTeclado);
		 String ano=entradaTeclado;
		
		 ComprobarFecha validarMiFecha= new ComprobarFecha();
				 
		 validarMiFecha.validarFecha( dia, mes, ano);
		
		

	  }

	}
