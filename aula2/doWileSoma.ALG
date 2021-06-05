Algoritmo "MostraSomaRepita"
//Construa um algoritmo que recebe números, sendo que a sua condição de para
//é valor 0. Depois
//deverá ser demonstrada a soma dos números informados pelos usuários.
Var
// Seção de Declarações das variáveis 
x, soma: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
escreval("--- Para encerrar o programa digite 0!!! ---")
repita
      escreva("digite um número a ser somado: ")
      leia(x)
      
      soma <- soma + x
      
ate x = 0

escreva("a soma dos números é: ", soma)


Fimalgoritmo