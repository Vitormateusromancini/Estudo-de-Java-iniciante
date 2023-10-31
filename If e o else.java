//sintaxe em java do if 

if(condicaobooleana) {
  codigo;
}

//Uso de condições booleanas

int	idade	=	15;
if	(idade	<	18)	{
				System.out.println("Não	pode	entrar");
}

//Else para indicar comportamento para booleanos falso. 

int	idade	=	15;
if	(idade	<	18)	{
				System.out.println("Não	pode	entrar");
}	else	{
				System.out.println("Pode	entrar");
}

// uso de operadores lógicos dentro do if 

int idade = 15; 
boolean amigoDoDono = false;
if(idade < 18 && !amigoDoDono) { //ser maior de idade e nao ser o amigo do dono) - vai dar não pode entrar 
  System.out.println("Não	pode	entrar");
}else{
  System.out.println("Pode	entrar");
}

int idade = 15; 
boolean amigoDoDono = false;
if(idade < 18 || !amigoDoDono) { //ser maior de idade ou nao ser o amigo do dono) - vai dar não pode entrar 
  System.out.println("Não	pode	entrar");
}else{
  System.out.println("Pode	entrar");
}

// Utilização do operador == no if 

int	mes	=	1;
if	(mes	==	1)	{
				System.out.println("Você	deveria	estar	de	férias");
}


// Uso do While 

int idade = 15; 

while (idade < 18) {
  System.out.println(idade);
  idade = idade + 1;
}

//Uso do for 

for (inicializacao; condicao; incremento) {
  codigo;
}

for	(int	i	=	0;	i	<	10;	i	=	i	+	1)	{
				System.out.println("olá!");
}

//codigo igual a 

int	i	=	0;
while	(i	<	10)	{
				System.out.println("olá!");
				i	=	i	+	1;
}

//Controle de loops

//break 

for	(int	i	=	x;	i	<	y;	i++)	{
				if	(i	%	19	==	0)	{
								System.out.println("Achei	um	número	divisível	por	19	entre	x	e	y");
								break;
				}
}


// no caso abaixo como continue está abaixo do if o loop só vai imprimir os valores fora da condição do if. 

for	(int	i	=	0;	i	<	100;	i++)	{
				if	(i	>	50	&&	i	<	60)	{
								continue;
				}
				System.out.println(i);
}

// escopo das variaveis 

//	aqui,	a	variável	i	não	existe.
int	i	=	5;
//	a	partir	daqui,	ela	existe.
while	(condicao)	{
				//	o	i	ainda	vale	aqui.
				int	j	=	7;
				//	o	j	passa	a	existir.
}
//	aqui,	o	j	não	existe	mais,	porém	o	i	continua	dentro	do	escopo.

// nos casos dos ifs as variaveis declaradas dentro delas só existem dentro delas, não fora delas e isso vale para o for também. 


int	i;
if	(algumBooleano)	{
				i	=	5;
}	
else	{
				i	=	10;
}
System.out.println(i);

//exemplo for 

int	i;
for	(i	=	0;	i	<	10;	i++)	{
				System.out.println("olá!");
}
System.out.println(i);





