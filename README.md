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
