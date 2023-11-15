//1. Faça um programa que receba dois números, calcule e mostre a
//subtração do primeiro número pelo segundo.

public class Questao1 {
  
	public static void main(String[] args) {
    
		double numero1, numero2,resultado;
    
		System.out.print("Informe o priemrio valor: ");
		numero1 = Double.parseDouble(System.console().readLine());
    
		System.out.print("Informe o segundo valor: ");
		numero2 = Double.parseDouble(System.console().readLine());
    
		resultado = numero1-numero2;
    
		System.out.printf("Resultado = %f\n", resultado);
	}
}

//2. Faça um programa que receba dois números, calcule e mostre a divisão
//do primeiro pelo segundo. Sabe-se que o segundo número não pode ser
//zero, portanto, não é necessário se preocupar com isso neste exercício.

public class Questao2 {
  
	public static void main(String[] args) {
    
		double numero1, numero2,resultado;
    
		System.out.print("Informe o priemrio valor: ");
		numero1 = Double.parseDouble(System.console().readLine());
    
		System.out.print("Informe o segundo valor: ");
		numero2 = Double.parseDouble(System.console().readLine());
    
		resultado = numero1/numero2;
    
		System.out.printf("Resultado = %f\n", resultado);
	}
}
//3. Faça um programa que receba três notas de um estudante, calcule e
//mostre a média aritmética entre elas (este exercício é similar ao exemplo
//mostrado a neste capítulo, mas leva em consideração três notas e não
//quatro).

public class Questao3 {
	public static void main(String[] args) {

		double numero1, numero2, resultado, numero3;

		System.out.print("Informe o priemrio valor: ");
		numero1 = Double.parseDouble(System.console().readLine());

		System.out.print("Informe o segundo valor: ");
        numero2 = Double.parseDouble(System.console().readLine());

		System.out.print("Informe o segundo valor: ");
		numero3 = Double.parseDouble(System.console().readLine());

		resultado = (numero1+numero2+numero3)/3;

		System.out.printf("Resultado = %f\n", resultado);
	}
}

//4. Faça um programa que receba o preço de um produto, calcule e mostre o novo preço, sabendo-se que este sofreu um desconto de 10%. Por exemplo, se o produto custa R$ 100,00, 
//o novo preço será 100 menos 10% de cem, que é 100 x 10 / 100. Essa conta é igual a 10, ficando o novo preço R$ 90,00.

public class Questao4 {
	public static void main(String[] args) {

		double numero1, resultado;

		System.out.print("Informe o preço do produto: ");
		numero1 = Double.parseDouble(System.console().readLine());

		resultado = numero1 - numero1*10/numero1;

		System.out.printf("Resultado = %f\n", resultado);
	}
}

//5. Faça um programa que receba o salário base de um funcionário, calcule e mostre o salário a receber, sabendo-se que o funcionário tem
//gratificação de 5% sobre o salário base (que será acrescentado ao salário) e paga imposto de 7% sobre este salário (o que será descontado do salário).


public class Questao5 {
	public static void main(String[] args) {

		double salario_base, resultado;

		System.out.print("Salário base do funcionário: ");
		salario_base = Double.parseDouble(System.console().readLine());

		resultado = salario_base - salario_base*5/salario_base - salario_base*7/salario_base ;

		System.out.printf("Resultado = %f\n", resultado);
	}
}
//6. Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas (4% do valor das vendas efetuadas pelo funcionário). Faça um
//programa que receba o salário fixo do funcionário e o valor de suas vendas, calcule e mostre a comissão e seu salário final.

public class Questao6 {
	public static void main(String[] args) {

		double salario_base, vendas, resultado;

		System.out.print("Salário base do funcionário: ");
		salario_base = Double.parseDouble(System.console().readLine());

		System.out.print("Valor de suas vendas: ");
		vendas = Double.parseDouble(System.console().readLine());

		resultado = salario_base + vendas*4/vendas ;

		System.out.printf("Resultado = %f\n", resultado);
	}
}

//7. Faça um programa que receba três notas e seus respectivos pesos, calcule e mostre a média ponderada dessas notas. Para calcular a
//média ponderada, multiplique cada nota por seus respectivos pesos, some todos os resultados e divida pela soma dos pesos. Por exemplo, se as notas forem 10, 5 e 6, e os pesos 1, 2 e 3, a média final do
//estudante seria 10 x 1 + 5 x 2+ 3 x 6, que resulta em 10 + 10 + 18 = 38. Esse valor deve ser dividido pela soma dos pesos (6), resultando em 6,3.

public class Questao7 {
	public static void main(String[] args) {

		double nota1, nota2, nota3, resultado;

		System.out.print("nota1: ");
		nota1 = Double.parseDouble(System.console().readLine());

		System.out.print("nota2: ");
		nota2 = Double.parseDouble(System.console().readLine());

		System.out.print("nota3: ");
		nota3 = Double.parseDouble(System.console().readLine());

		resultado = (nota1*1 + nota2*2 + nota3*3)/6;

		System.out.printf("Resultado = %f\n", resultado);
	}
}

//8. Faça um programa que calcule e mostre a área de um triângulo. Sabe-se que: Área = (base x altura) / 2. A base e altura devem ser informadas pelo usuário.

public class Questao8 {
	public static void main(String[] args) {
		double base, altura, resultado;

		System.out.print("Valor da base:");
		base = Double.parseDouble(System.console().readLine());

		System.out.print("Valor da altura: ");
		altura = Double.parseDouble(System.console().readLine());

		resultado = (base*altura)/2;

		System.out.printf("Resultado = %f\n", resultado);
	}
}
//9. Faça um programa que calcule e mostre a área de um quadrado. Sabe- se que 𝐴 = 𝑙𝑎𝑑𝑜²

public class Questao9 {
	public static void main(String[] args) {
		double base, altura, resultado;

		System.out.print("Valor do lado:");
		base = Double.parseDouble(System.console().readLine());

		resultado = (lado*lado)/2;

		System.out.printf("Resultado = %f\n", resultado);
	}
}

//10. Sabe-se que: 1 pé = 12 polegadas ,1 jarda = 3 pés,1 milha = 1.760 jardas
//Faça um programa que receba uma medida em pés , faça as conversões a seguir e mostre os resultados.
//a. polegadas;
//b. jardas;
//c. milhas.

public class Questao10 {
	public static void main(String[] args) {
		double pes, polegadas, jardas, milhas;

		System.out.print("Valor em pés:");
		pes = Double.parseDouble(System.console().readLine());

		polegadas = pes*12;
		jardas =3*pes;
		milhas = 1760*jardas;

		System.out.printf("polegadas = %f\n", polegadas);
		System.out.printf("jardas = %f\n", jardas);
		System.out.printf("milhas = %f\n", milhas);
	}
}

  
//11. Faça um programa que receba o ano de nascimento de uma pessoa e o ano atual, calcule e mostre:
//a. a idade dessa pessoa em anos;
//b. a idade dessa pessoa em meses;
//c. a idade dessa pessoa em dias (considerando que cada ano possui 365 dias);
//d. a idade dessa pessoa em semanas (cada ano possui 52 semanas).

public class Questao11 {
	public static void main(String[] args) {
		double ano_nascimento, ano_atual, idade_anos, idade_meses,idade_dias, idade_semanas;

		System.out.print("A idade de nasimento:");
		ano_nascimento = Double.parseDouble(System.console().readLine());

		System.out.print("O ano atual:");
		ano_atual = Double.parseDouble(System.console().readLine());

		idade_anos = ano_atual - ano_nascimento;
		idade_meses = idade_anos*12;
		idade_dias = idade_anos*365;
		idade_semanas = idade_anos*52;

		System.out.printf("A idade dessa pessoa em anos= %f\n",idade_anos );
		System.out.printf("A idade dessa pessoa em meses = %f\n",idade_meses );
		System.out.printf("A idade dessa pessoa em dias = %f\n",idade_dias );
		System.out.printf("A idade dessa pessoa em semanas= %f\n",idade_semanas );

	}


//12. O custo ao consumidor de um carro novo é a soma do preço de fábrica com o percentual de lucro do distribuidor e dos impostos aplicados ao preço de fábrica. Faça um programa que receba o preço de fábrica de 
//um veículo, o percentual de lucro do distribuidor e o percentual de impostos, calcule e mostre:
//a. o valor correspondente ao lucro do distribuidor;
//b. o valor correspondente aos impostos;
//c. o preço final do produto.


//13. Faça um programa que receba o número de horas trabalhadas e o valor do salário mínimo, calcule e mostre o salário a receber seguindo estas regras:
//a. a hora trabalhada vale um décimo do salário mínimo;
//b. o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da hora trabalhada;
//c. o imposto equivale a 3% do salário bruto;
//d. o salário a receber equivale ao salário bruto menos o imposto.


//14. Sabe-se que o quilowatt de energia custa um quinto do salário mínimo. Faça um programa que receba o valor do salário mínimo e a quantidade de quilowatts consumida por uma residência, calcule e mostre:
//a. o valor de cada quilowatt;
//b. o valor a ser pago por essa residência;
//c. o valor a ser pago com desconto de 15%.


//15. Faça um programa que receba uma temperatura em Celsius, calcule em mostre essa temperatura em Fahrenheit. Sabe

  
