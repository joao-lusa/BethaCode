Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 05/06/2021
Var
// Seção de Declarações das variáveis
numero, x: inteiro
descricao : caractere

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
x <- 0
enquanto x < 10 faca
         escreva("informe um número: ")
         leia(numero)

         se numero  >= 0 entao
            descricao <- "positivo"
         senao
              descricao <- "negativo"
         fimse
         escreval(numero, " esse número é ", descricao)
         x <- x + 1
fimenquanto

Fimalgoritmo