package tipodeDato;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Metodo compareTo de INSTANCIA DE LA CLASE Integer
		 * , dado compareTo es metodo de instancia debo crear 
		 * un objeto=neww Integer por eso es instanciado en la Clase*/
		
		Integer objE1=new Integer(1);
		Integer objE2=new Integer(1);
		Integer objE3=new Integer("2");
		
		System.out.println("Son iguales----> "+objE1.compareTo(objE2));//0
		System.out.println("el primero es menor----> "+objE1.compareTo(objE3));//-1
		System.out.println("El primero es mayor----> "+objE3.compareTo(objE1));//1
		
		/*Metodo Decode METODO DE LA CLASE Integer  ,
		 *  dado decode es metodo static, se invoca Clase.metodo*/
		
		String decimal="2015";
		String octal="03737";
		String hexadecimal="0x7DF";
		
		System.out.println(decimal+"(en base 10)="+Integer.decode(decimal)+"(en base10)");
		System.out.println(octal+"en base 8)="+Integer.decode(octal)+"(en base10)");
		System.out.println(hexadecimal+"en base 16)="+Integer.decode(hexadecimal)+"(en base10)");

		
	}

}
