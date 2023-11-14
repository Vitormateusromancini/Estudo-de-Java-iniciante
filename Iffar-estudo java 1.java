//código ensinado
// as classes tem que ser públicas para que sejam acessadas pela máquina virtual Java fora do arquivo onde as escrevermos.

public class Exemplo01 { 

  //O conteúdo da classe deve ser sempre envolvido por chaves ({ }).
  //Esse caractere de abertura de chaves pode estar grudado ao nome da classe ou separado dele por qualquer número de espaços e linhas em branco, 
  //pois esses espaços são ignorados pelo compilador Java. 
  //Essa regra dos espaços em branco também vale entre as palavras public e class e class e o nome da classe. Por exemplo, a linha abaixo também estaria correta:

public  class Exemplo01 {
  
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
  Float.parseFloat
  Integer.parseInt
  Long.parseLong
  Short.parseShort
//Note que não existe um método de conversão para o tipo char. Como fazer para ler dados desse tipo? Pode-se fazer a leitura de um valor String e depois extrair o primeiro caractere dessa String, utilizando o método charAt, como mostrado abaixo

System.console.readLine().charAt(0)

//A instrução abaixo mostra o valor que queremos mostrar na saída: 

  System.out.println(RES);

//entrar na pasta onde foi salvo o arquivo com o código fonte do programa 

  javac Exemplo01.java

//Esse comando compila o código-fonte do programa. Para executá-lo o programa, basta digitar o comando:

java Exemplo01

//É possível exibir, em uma única instrução de saída várias linhas de texto. 
//Para isso utilizamos o caractere especial de nova linha, representado pela sequência “\n

public class Bemvindo {

     public static void main(String[] args) {

         System.out.println("Bem-vindo\nao\nmundo\nJava!");

     }

}
  
//Há ainda uma terceira forma de se fazer saída através da janela do terminal de comandos: o método System.out.printf. 
// Este método permite se fazer uma saída de dados formatada. Vamos, em primeiro lugar, ver um exemplo de programa que utiliza System.out.printf. Este exemplo é mostrado abaixo. 

public class Quadrado {

     public static void main(String[] args) {

         double num, quad;

         num = Double.parseDouble(System.console().readLine());

         quad = num * num;

         System.out.printf("%f ao quadrado eh %f\n", num, quad);

     }

}
  
//Nesta saída é possível perceber que cada “%f” presente no valor String passado a System.out.printf foi substituído pelo valor de uma variável. 
//Veja que a ordem de substituição seguiu a ordem das variáveis na lista: primeiro num, e depois quad.

public class Exemplo01 {

     public static void main(String[] args) {

          double N1, N2, N3, N4, RES;                  

          System.out.print("Informe a nota do primeiro bimestre: ");

          N1 = Double.parseDouble(System.console().readLine());

          System.out.print("Informe a nota do segundo bimestre: ");

          N2 = Double.parseDouble(System.console().readLine());

          System.out.print("Informe a nota do terceiro bimestre: ");

          N3 = Double.parseDouble(System.console().readLine());

          System.out.print("Informe a nota do quarto bimestre: ");

          N4 = Double.parseDouble(System.console().readLine());

         

          RES = (N1 + N2 + N3 + N4) / 4;      

         

          System.out.printf("Media das notas = %.1f\n", RES);

     }

}


// programa que determina a area da circunferencia. 

public class AreaCircunferencia {
	public static void main(String[] args) {
		double raio, area;
		System.out.print("Informe o raio da circunferencia: ");
		raio = Double.parseDouble(System.console().readLine());
		area = 3.14159 * raio * raio;
		System.out.printf("Area da circunferencia = %f\n", area);
	}
}

//determinar o novo salario inserindo a porcentagem 
  

public class NovoSalarioFunc {
	public static void main(String[] args) {
		double salario_atual, perc_aumento;
		double novo_sal, val_aumento;
		
		System.out.print("Salário atual do funcionário: ");
		salario_atual = Double.parseDouble(System.console().readLine());
		System.out.print("Percentual de aumento: ");
		perc_aumento = Double.parseDouble(System.console().readLine());
		
		val_aumento = salario_atual * perc_aumento / 100;
		novo_sal = salario_atual + val_aumento;
		
		System.out.printf("Valor do aumento = R$ %.2f\n", val_aumento);
		System.out.printf("Novo salário = R$ %.2f", novo_sal);
	}
}

// determinar o salario liquido de um professor 

public class SalarioLiquidoProf {
	public static void main(String[] args) {
		double valor_hora, perc_inss;
		double sal_bruto, desc_inss, sal_liq;
		int horas_trab;
		
		System.out.print("Valor da hora-aula: ");
		valor_hora = Double.parseDouble(System.console().readLine());
		System.out.print("Numero de horas trabalhadas: ");
		horas_trab = Integer.parseInt(System.console().readLine());
		System.out.print("Percentual de desconto INSS: ");
		perc_inss = Double.parseDouble(System.console().readLine());
		
		sal_bruto = valor_hora * horas_trab;
		desc_inss = perc_inss / 100 * sal_bruto;
		sal_liq = sal_bruto - desc_inss;
		
		System.out.printf("Salario liquido do professor = R$ %.2f", sal_liq);
	}
}
