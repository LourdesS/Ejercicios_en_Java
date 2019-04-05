package HerenciayPolimorfismo;

public class Canine {
	public double getAverageWeight() {return 50;}
 public static void main(String[] args) {
		 
		 Wolf obj=new Wolf();
		 System.out.println(obj.getAverageWeight());
		  
 }

}


class Wolf extends Canine{
	 public  double getAverageWeight() {
		 return super.getAverageWeight()+20;
		 
		
	     }
	 
	 
		 
	
}