Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 05/06/2021
Var
// Se��o de Declara��es das vari�veis 
numero, x: inteiro

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc...
x <- 0
enquanto x < 10 faca
         escreva("informe um n�mero: ")
         leia(numero)
         
         se numero MOD 2 = 0 entao
            escreval(numero, " esse n�mero � par")
         senao
              escreval(numero, " esse n�mero � impar")
         fimse
         x <- x + 1
fimenquanto

Fimalgoritmo