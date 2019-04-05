package operadoresJava;

public class OperadoresJava {
	
	
	
	static int i,j,k;
	
	
	public static  void inicializar () {
		System.out.println("Valores iniciales \n i="+i+" \n j="+j+" \n k="+k);	
		
		i=1;
		j=1;
		k=1;
			
	}
	
	
	
	
		
	public static void main(String[] args) {
		
		inicializar();
		i=++j;//a
		
		inicializar();
	    i=k++;//b
	    
	    inicializar();
	    i=k + (++j);//c
	    
	    inicializar();
	    i=i + j++;//d
	    
	    inicializar();
	    i=j + ++k;//e
	    
	    inicializar();
	    i=++j + k++;//f
	    
	    inicializar();
	    j=k-- + --i;//g
	    
	    inicializar();
	    i=k+1 + ++j;//h
	    
	    inicializar();
	    i=++i + --j + k--;//i
	    
	    inicializar();//j
	    k=j-- + ++k;
	
	    
	    
	    
	 
	}

}
