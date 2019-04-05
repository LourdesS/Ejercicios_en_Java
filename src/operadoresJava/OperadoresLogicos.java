package operadoresJava;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
    boolean x,y,z,re;
    x=true;
    y=false;
    z=true;
    
    re=(x&&y)||(x&&z);
    System.out.println("resyultado="+ re+"\n");
    
    re=(x&&!y)&&(!x||z);
    System.out.println("resyultado="+ re+"\n");
    
    re= x||y&&z;
    System.out.println("resyultado="+ re+"\n");
    
    re= x||y&&z;
    System.out.println("resyultado="+ re+"\n");
    
    re=!(x||y)&&z;
    System.out.println("resyultado="+ re+"\n");
    
    re=x||y||x&&!z&&!y;
    System.out.println("resyultado="+ re+"\n");
    
    re=!x||!y||z&&x&&!y;
    System.out.println("resyultado="+ re+"\n");
    
	}

}
