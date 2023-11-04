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
 System.out.println("Não	pode	entrar");
} else	{
 System.out.println("Pode	entrar");
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
  System.out.println("Não	pode	entrar");
}else{
  System.out.println("Pode	entrar");
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

Considerando um um programa para	um banco. É bem fácil perceber	que	uma	 entidade	 extremamente importante	ao	nosso	sistema	é	a	conta. Nossa	ideia	aqui	é	generalizarmos	alguma	informação	juntamente com	as	funcionalidades	que	toda	conta	deve ter . 

O	que	toda	conta	tem	que	é	importante	para	nós?

Número	da	conta;

Nome	do	titular	da	conta;

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
