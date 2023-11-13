//código ensinado
// as classes tem que ser públicas para que sejam acessadas pela máquina virtual Java fora do arquivo onde as escrevermos.

public class Exemplo01 { 

  //O conteúdo da classe deve ser sempre envolvido por chaves ({ }).
  //Esse caractere de abertura de chaves pode estar grudado ao nome da classe ou separado dele por qualquer número de espaços e linhas em branco, 
  //pois esses espaços são ignorados pelo compilador Java. 
  //Essa regra dos espaços em branco também vale entre as palavras public e class e class e o nome da classe. Por exemplo, a linha abaixo também estaria correta:

public       class      Exemplo01 {
  
//Na terceira linha de código temos um método especial chamado main. É nele que a máquina virtual espera encontrar as instruções do programa para execução
// Aqui novamente encontramos a palavra public. Neste caso, esta palavra define que o método main pode ser acessado fora da classe. 
//A palavra void indica que o método main não gera uma resposta após a sua execução. 
  
     public static void main(String[] args) {

          double N1, N2, N3, N4, RES;     

          N1 = Double.parseDouble(System.console().readLine());

          N2 = Double.parseDouble(System.console().readLine());

          N3 = Double.parseDouble(System.console().readLine());

          N4 = Double.parseDouble(System.console().readLine());

        

          RES = (N1 + N2 + N3 + N4) / 4;       

          System.out.println(RES);

     }
}

//A linguagem Java permite ainda que se atribua um valor a uma variável no momento de sua declaração. Por exemplo, poderíamos escrever o seguinte em um programa Java:


double precoUnit = 10; 

int quant = 0;

double precoTot = precoUnit;
  
//System.console().readLine() é um dos métodos para realizar entrada de dados.
//System.console().readLine() não permite ler mais de um valor na mesma instrução. Temos que escrever uma instrução para cada dado de entrada.
//A linguagem Java ainda oferece outros métodos de conversão, que permitem transformar valores String em outros tipos. Como exemplo: 
  
  Boolean.parseBoolean
  Byte.parseByte
  Double.parseDouble
