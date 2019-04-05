package tipodeDato;

public class Ejercicio2 {
   //Tipos de datos primitivos
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* declaracion devariables*/
		int A,B,C,D;
		A=1; 
		B=2;
		C=3;
		D=4;
		int tempB;
		/*Valores iniciales*/
		System.out.println("Valores iniciales \n A="+A+"\n B="+B+"\n C="+C+"\n D="+D+"\n");
		tempB=B;
		B=C;
		C=A;
		A=D;
		D=tempB;
		/*Intercambio de valores*/
		System.out.println("Valores finales \n A="+A+"\n B="+B+"\n C="+C+"\n D="+D+"\n");
		
		// llamado de metodos estaticos  clase Math
	 double op= Math.pow(2, 3);
	 System.out.print(op);
	 
	
	 
	 
		

	}

}
