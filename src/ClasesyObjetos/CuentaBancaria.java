package ClasesyObjetos;

public class CuentaBancaria {

	//Variables
	long numero;
	String titular;
	long saldo;
	
	//Constructores
	
	public CuentaBancaria() {
		numero = 0;
		titular ="";
		saldo = 0;
		
	}
	
	public CuentaBancaria(long numero,String titular, long saldo) {
		this.numero =numero;
		this.titular =titular;
		this.saldo = saldo;
		
	}
	
	//Metodos
	void ingresar(long cantidad) {
		saldo=saldo +cantidad;
		
	
	}
	
	void retirar(long cantidad) {
		if (cantidad<=saldo) {
		saldo=saldo -cantidad;
		
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      CuentaBancaria obj1= new CuentaBancaria();
      obj1.ingresar(3000);
      System.out.println("Ha ingresado "+obj1.saldo+"\n   su saldo es :" + obj1.saldo);
      CuentaBancaria obj2= new CuentaBancaria(8,"Lourdes",obj1.saldo);
      obj2.retirar(1000);
      System.out.println("Ha retirado:"+obj2.saldo+"\n   su saldo es :" +obj2.saldo);
      
      
	}

}
