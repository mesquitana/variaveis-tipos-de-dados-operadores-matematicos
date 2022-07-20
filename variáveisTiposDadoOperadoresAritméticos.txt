# Variáveis, Tipos de dado e Operadores aritméticos

### Conceituação e criação

Variável é um espaço na memória do computador, onde se pode guardar valores.
Existem 4 tipos:
- Instância: Pertence a um objeto
- Classe: Pertence a classe
Essas duas classes acima estão muito ligadas a orientação a objeto
- Local: Dentro de métodos
- Parâmetro: Na assinatura do método

Padrão de definição:

<?visibilidade?><?modificador?>tipo nome<?=valorInicial?>;
O que está entre interrogações é opcional, pode-se criar uma variável sem necessidade de declararação. O que influencia se declara ou não, é o tipo de variável
V: "public", "protected" e "private"
M: "static" e  "final"(essa variável é constante, seu valor não muda)
T: tipo de dado
N: nome que é fornecido a variável
VI: valor inicial, caso deseje

Convenções e regras:

- Variáveis não podem começar com números
- Embora permitido, "$" e "_" devem ser evitados;
- Diferencia maiúsculos de minúsculos;
- Não pode usar espaço no nome da varíavel;
- Não pode usar as palavras reservados do Java.

Boas práticas:

- Sempre começar com letra minúscula;
- Nomes expressivos, para ver de forma clara para que serve a variável;
- Notação camelo: primeira letra de cada palavra em maiúsculo para poder visualizar o nome de maneira mais fácil
- Quando for variável final: tudo em maiúsculo separado por "_"

### Tipos de dados

São os valores e consequentemente operações que as variáveis podem assumir e sofrer, respectivamente.

Tipificação:
- Estática (forte, quando a linguagem obriga que defina o tipo da variável no momento da criação) x Dinâmica (fraco, não é obrigado a definir o tipo da variável na criação; durante a execução da aplicação a linguagem detecta o valor na avriável e assumirá que a variável é daquele tipo)
- Primitivo (dados mais básicos, são heterogêneos. São valores numéricos, textuais..) x Composto (ligado a orientaçãoa objeto, por exemplo o struct na linguagem C)

Opções de tipos:
- Textual;
	char: caracteres de 16-bit unicode → cchar c = '\u0084' (esse código é a letra T maiuscula); ou char c = 'T' (caracter de forma isolada usa aspas simples);
	string: tipo "especial", é um objeto → String s = "T"
- Numeral;
	byte: -128 até 127 → byte b = 15;
	short: -32768 até 32767 → short s = -15785;
	int: -247483648 até -247483647 → int i = 8515785;
	long: -9*10^18 até 9*10^18 → long l = 5938515785L;
	float: +- 3,40282347E+38F → float f = 3.14...(f); (Precisa colocar o f se quiser explicitar que é float, se não colcoar ele considera como uma variável double)
	double: +-1.797693134...E+308 → double d = 3.14.. (d); (O d no final é opcional)
- Lógico;
	boolean: true ou false → boolean s = false;
- Objeto.

### Operadores aritméticos

São símbolos especiais quais são capazes de realizar ações específicas em um, dou ou mais operandos e, em seguida, retorna um resultado.

Tipos:
- pós-fixado: exp++ ou exp-- (primeiro usa a expressão para então fazer a operação aritmética)
- prefixado: ++exp ou --exp (primeiro faz a operação aritméetica e depois usa a expressão)
- aritmético: +, -, *, / e %
- atribuição: =, +=, -=, *=, /= e %=

Precedências:
1- Pós-fixado (exp++, exp--)
2- Prefixado (++exp, --exp)
3- Multiplicativo (*, /, %)
4- Aditivo (+, -)
5- Atribuição (=, +=, -=, *=, /=, %=)

### Conversões (casting)

É a transformação de uma determinada variável de tipo menos específico para um tipo mais específico ou vice-versa.

Tipos:
- Upcast (implícito): É a "pomoção" de um tipo de dado de menor capacidade de armazenamento para um tipo maior. Não preciso dizer para qual tipo estou indo, por isso implícito, não gera problemas.
- Downcast(explícito): É o "rebaixamento" de um tipo de dado para uma menor capacidade de armazenamento.

Exemplos:
- long l; int i = 10; l = i;
- int i; long l = 100; i = (int) l;
- double d; float f = 10.5f; d = f;
- float f; double d = 10.5d; f = (float) d;
- int i; float f = 10.5f; i = (int) f;