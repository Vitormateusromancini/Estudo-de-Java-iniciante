//As referências são variáveis que declara para associar a um objeto, elas não guardam o object mas sim é uma maneira de acessar. Diferente de tipos primitivos como int e long, precisa-se dar new depois de declarar a variável, como no exemplo abaixo: 


public static void main(String[] args) {
    Conta c1;
    c1 = new Conta();
    Conta c2;
    c2 = new Conta();
}

// exemplo de refencia igual de c1 e c2 

class TestaReferencias {
  public static void main(String[] args) {
    Conta c1 = new Conta(); 
    c1.deposita(100); 
    
