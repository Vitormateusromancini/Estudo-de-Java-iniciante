## Estudo de Java iniciante

Códigos aprendidos com material disponível pela Alura e da disciplina de paradigmas de programação. 

Na programação Java a estrutura inicial do programa é constituida pelo seguinte código: 

```Java
class Meuprograma {
  public static void main(String[] args) {

    //miolo do programa começa aqui 

    System.out.println("Meu primeiro programa");

    //fim do miolo do programa 
  }

}

```
Que logo mais seráexplicado, mas o mais importante é que para fazer o famoso printf se usa:


```Java
 System.out.println("Meu primeiro programa");
```

As variáveis são constituidas na mesma forma em C como exemplo: 

```Java
//	declara	a	idade.
int	idade;
idade	=	15;
//	imprime	a	idade.
System.out.println(idade);

int quatro = 2 + 2 

int um = 5 % 2; // 5 dividido por 2 dá 2 e tem resto 1 e o % pega o resto da divisão inteira 

// double, long e float são pontos flutuantes 

double pi = 3.14; 

boolean menordeidade = idade < 18;

```

# Condicionamento  

A sintaxe em Java do if é: 

```Java
if(condicaobooleana) {
  codigo;
}
```
Nas condições booleanas existem seus operadores lógicos.

Não se pode esquecer também do else que indica o cpmportamento booleano falso. Exemplos abaixo: 

```Java

int idade = 15;
if (idade < 18)	{
 System.out.println("Não pode entrar");
} else	{
 System.out.println("Pode entrar");
}

// uso de operadores lógicos dentro do if 

int idade = 15; 
boolean amigoDoDono = false;
if(idade < 18 && !amigoDoDono) { //ser maior de idade e nao ser o amigo do dono) - vai dar não pode entrar 
  System.out.println("Não pode entrar");
}else{
  System.out.println("Pode entrar");
}

int idade = 15; 
boolean amigoDoDono = false;
if(idade < 18 || !amigoDoDono) { //ser maior de idade ou nao ser o amigo do dono) - vai dar não pode entrar 
  System.out.println("Não pode entrar");
}else{
  System.out.println("Pode entrar");
}

// Utilização do operador == no if 

int mes=1;
if (mes==1) {
 System.out.println("Você deveria estar de férias");
}

```
O uso do while é um comando para fazer laços (loops) repetindo um trecho de código algumas vezes, o qual é a mesma situação para o comando for mas para ele tem um espaço para incializar suas variáveis. 

```Java
int idade = 15; 

while (idade < 18) {
  System.out.println(idade);
  idade = idade + 1;
}

//Uso do for 

for (inicializacao; condicao; incremento) {
  codigo;
}

for (int i = 0; i < 10; i = i + 1) {
   System.out.println("olá!");
}

//codigo igual a 

int i = 0;
while( i < 10){
 System.out.println("olá!");
 i = i + 1;
}
```
# Programação Orientada a Objetos em Java 

Considerando um um programa para um banco. É bem fácil perceber	que uma	entidade extremamente importante ao nosso sistema é a conta. Nossa ideia aqui é	generalizarmos	alguma	informação juntamente com as funcionalidades	que	toda	conta	deve ter . 

O que toda conta tem que é importante	para	nós?

Número da conta;

Nome do titular	da conta;

Saldo.

O	que	toda	conta	faz	que	é	importante	para	nós?	Isto	é,	o	que	gostaríamos	de	"pedir	à	conta"?

Saca	uma	quantidade	x;

Deposita	uma	quantidade	x;

Imprime	o	nome	do	titular	da	conta;

Devolve	o	saldo	atual;

Transfere	uma	quantidade	x	para	uma	outra	conta	y;

Devolve	o	tipo	de	conta.

Com	isso,	temos	o	projeto	de	uma	conta	bancária.	Podemos	pegar	esse	projeto	e	acessar	seu	saldo? Não.	O	que	temos	ainda	é	o	projeto.	Antes,	precisamos	construir	uma	conta	para	poder	acessar	o	que ela	tem	e	pedir	a	ela	que	faça	algo.

![image](https://github.com/Vitormateusromancini/Estudo-de-Java-iniciante/assets/77472862/a217c7c4-3131-49fc-93e9-04595fe2dcb8)

Repare	na	 figura.	Apesar	de	o	papel	do	lado	esquerdo	especificar	uma	Conta,	essa	especificação	é uma	 Conta?	 Nós	 depositamos	 e	 sacamos	 dinheiro	 desse	 papel?	 Não.	 Utilizamos	 a	 especificação	 da Conta	para	poder	criar	instâncias	que	realmente	são	contas,	nas	quais	podemos	realizar	as	operações	que
criamos.

Apesar	de	declararmos	que	toda	conta	tem	um	saldo,	um	número	e	uma	agência	no	pedaço	de	papel (como,	 à	 esquerda,	 na	 figura),	 são	 nas	 instâncias	 desse	 projeto	 em	 que	 realmente	 há	 espaço	 para armazenar	esses	valores.

Ao	projeto	da	conta,	isto	é,	à	definição	da	conta,	damos	o	nome	de	classe.	Ao	que	podemos	construir a	partir	desse	projeto;	às	contas	de	verdade,	damos	o	nome	de	objetos.

As classes escrito em Java, começamos escrevendo o que a classe conta tem, e não o que ela faz 

Um	tipo	desses,	como	o	especificado	de Conta		acima,	pode	ser	facilmente	traduzido	para	Java:
```Java
class Conta	{
  int numero;
  String titular;
  double saldo;
//	..
}
```
Dentro da classe Conta existem os atributos que são as declarações que toda conta deve ter. 

Para criar uma Conta ,	 basta	 usar	 a	 palavra-chave		new	.	 Devemos	 utilizar
também	os	parênteses:
```Java
class Programa {
  public static void main (Sting[] args) {
    Conta minhaConta;
    minhaConta = new Conta();
 }
}
```
Por meio da variável minhaConta, podemos acessar o objeto recém criado para alterar seu titular, seu saldo, etc: 

```Java
class Programa {
  public static void main (Sting[] args) {
    Conta minhaConta;
    minhaConta = new Conta();

    minhaConta.titular = "Vitor Mateus";
    minhaConta.saldo = 1000.0;

    System.out.prinln("Saldo atual: " + minhaConta.saldo); 
 }
}
```

# Métodos 

Os métodos são uma maneir de fazer operções com um objeto. Com o exemplo criar um método que saca uma determinada quantidade e não devolve nenhuma informação pra quem acionar esse método:
```Java
class Conta{
  double salario;
  //outros atributos 

void saca(double quantidade){
  doble novoSaldo = this.saldo -quantidade; 
  this.saldo = novoSaldo;
}
}
```
A palavra-chave void significa que quando pedir qye a conta saque uma quantia, nenhuma informação será enviada de volta a quem pediu. 
Quando pedi o que sacar terá que declarar o método com algo no parênteses - chamado de argumento do método ou parâmetro. Ela é temporária ou local, pois, ao final da execução desse método, ela deixará de existir. 
Assim como dentro do método terá argumentos criados que morrerão no fim do método. 
No momento em que será acessado o atributo, usa-se a palavra-chave this para mostrar que esse é um atributo,e não uma simples variável.

Da mesma forma, cria um método depositar de exemplo: 

```Java
class Conta{
  double salario;
  //outros atributos 

void deposita(double quantidade) {
  this.saldo +=quantidade; 
}
}
```
Criando os métodos podemos mandar uma mensagem ao objeto e pedir que ele execute um método, também usnado o ponto. 

```Java
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
```
métodos sempre tem de estabelecer o que retorna, mesmo definindo que não há retorno, como exemplo void, mas claro eles podem retornar valores como no exemplo abaixo: 

```Java
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
```
No exemplo acima o método saca não tem void na frente, portanto quando é acessado ele devolve algum tipo de informação. O return indica que o método terminará ali, retornando tal informação. 

![image](https://github.com/Vitormateusromancini/Estudo-de-Java-iniciante/assets/77472862/a08a675d-bd7a-4440-ae87-e331b038be01)

## Referências 

As referências são variáveis que declara para associar a um objeto, elas não guardam o object mas sim é uma maneira de acessar. Diferente de tipos primitivos como int e long, precisa-se dar new depois de declarar a variável, como no exemplo abaixo: 

```Java

public static void main(String[] args) {
    Conta c1;
    c1 = new Conta();
    Conta c2;
    c2 = new Conta();
}

```

O correto é dizer que c1 se refere a um objeto. Sempre lembrar que, em Java, uma variável nunca é um objeto. Não há em Java, uma maneira de criar os conhecidos objeto pilha ou objeto local, pois todo objeto na linguagem em questão sem exceção é acessado por uma variável referência. Um exemplo é a figura abaixo:

![image](https://github.com/Vitormateusromancini/Estudo-de-Java-iniciante/assets/77472862/54a54660-78d4-4124-84a3-13a9669b8306)

Essa forma de acessar o dado Conta é parecido com um ponteiro, no entanto não se pode considerar assim, já que a linguagem Java é Tipada :  **exigem que os tipos de dados sejam declarados explicitamente durante a escrita do código**

Exemplo importante: 
```Java 
class TestaReferencias{
    public satatic void main (String[] args){   
       Conta c1 = new Conta(); 
       c1.deposita(100);
       Conta c2 = c1; //atenção
       c2.deposita(200);

       System.out.println(c1.saldo); 
       System.out.println(c2.saldo);
     }

}
```

Neste caso tanto c1 quanto c2 graças ao operador = referenciam ao mesmo endereço Conta. 


O operador == compara o conteúdo das variáveis, mas  essas variáveis não guardam o objeto, e sim o endereço em que ele se encontra. Portanto caso se cria dois endereços com variáveis iguais o operador == vai dar falso, como no exemplo abaixo. 

```Java 
    public satatic void main (String[] args){   
       Conta c1 = new Conta(); 
       c1.titular = "Duke";
       C1.saldo = 227;
   
       Conta c2 = new Conta(); 
       c2.titular = "Duke";
       C2.saldo = 227;

       if(c1==c2){
       System.out.println("Contas iguais");
       }
     }
```


# Método Transfere()

Se quisermos de 



