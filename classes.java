//classe conta 
class Conta	{
 int numero;
 String titular;
 double saldo;
  //	..
				}

// construir conta 

class Programa	{
 public static void main(String[] args) {
  new	Conta();				
		}
}

// acessanto a classe conta 

class Programa {
  public static void main(String[] args) {
   Conta minhaCont; 
   minhaConta = new Conta();
  }
}

//acesso a objeto recém criado para alterar os dados 

class Programa{
	public static void main (String[] args) {
		Conta minhaConta;
		minhaConta = new Conta(); 

		minhaConta.titular = "Vitor Mateus";
		minhaConta.saldo = 1000.0; 

		System.out.println("Saldo atual: + minhaConta.saldo);
	}
}


	
