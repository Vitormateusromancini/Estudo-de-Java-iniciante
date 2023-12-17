//Criando método que saca uma determinada quantidade e não devolve nenhuma informação pra quem acionar esse método:

class Conta{
  double salario;
  //outros atributos 

void saca(double quantidade){
  doble novoSaldo = this.saldo -quantidade; 
  this.saldo = novoSaldo;
}
}
//Método de depositar alguma quantidade 

class Conta{
  double salario;
  //outros atributos 

void deposita(double quantidade) {
  this.saldo +=quantidade; 
}
}

//Criando os métodos podemos mandar uma mensagem ao objeto e pedir que ele execute um método, também usnado o ponto. 

class Programa{
	public static void main (String[] args) {
    Conta minhaConta;
		minhaConta = new Conta(); 

		minhaConta.titular = "Vitor Mateus";
		minhaConta.saldo = 1000.0; 
//saca 200
    minhaConta.saca(200);
//deposita 500
    minhaConta.deposita(500);
    System.out.println(minhaConta.saldo);
  }
}

//métodos sempre tem de estabelecer o que retorna, mesmo definindo que não há retorno, como exemplo void 

class Conta{
  double salario;
  //outros atributos 
boolean saca(double valor) {
  if(this.saldo <valor) {
    return false; 
  }else{
    this.saldo = this.saldo - valor; 
     return true 
       }
  }
}

//no exemplo acima o método saca não tem void na frente, portanto quando é acessado ele devolve algum tipo de informação. 
