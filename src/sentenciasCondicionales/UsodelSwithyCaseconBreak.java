package sentenciasCondicionales;
import java.util.Scanner;


public class UsodelSwithyCaseconBreak {
    private static Scanner entrada= new Scanner(System.in);
    
    	public static void main(String[] args) {
    	System.out.println("Ingrese la nota para clasificar \n");
		String  entradaTeclado= entrada.nextLine();
		String laNota= ingresarNota(entradaTeclado);
		comprobarNota(laNota);
		

	}
	
	private static void comprobarNota(String laNota) {
		switch(laNota)
		{
		
		case "1-4": System.out.println("SUSPENSO  \n");break;
		case "5": System.out.println("SUFICIENTE  \n");break;
		case "6": System.out.println("BIEN  \n");break;
		case "7-8": System.out.println("NOTABLE  \n");break;
		case "9-10": System.out.println("SOBRESALIENTE  \n");break;
		default:    System.out.println("Realizada revisión de notas  \n");
		
		
		}
	}

	private static String ingresarNota(String entradaTeclado) {
		int miNota= Integer.parseInt(entradaTeclado); 
		String rango="";
		if (miNota>=0 & miNota<=4) {
			
			 rango ="1-4";
			 
		}
	    if(miNota==5) { rango="5"; }
	    if(miNota==6) { rango="6"; }
	    if (miNota>=7 & miNota<=8) {
			
			  rango="7-8";
		}
	    if (miNota>=9 & miNota<=10) {
			
			  rango="9-10";
		}
		return rango;
		
				
	}

}

