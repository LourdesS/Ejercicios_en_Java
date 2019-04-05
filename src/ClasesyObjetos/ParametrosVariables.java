package ClasesyObjetos;
public class ParametrosVariables {
  
	
	
	public static void walk2(Integer start, Integer...nums) {
		
	 int longitud=( nums.length);
	 System.out.println("Introdujo tantaos parametros nums");
	 System.out.println(longitud);
	
			 
	  
    }

  
   public static void main() {
	   ParametrosVariables.walk2(4,6,9,9);
	   ParametrosVariables.walk2(4);
	  
	   
   }
  
}