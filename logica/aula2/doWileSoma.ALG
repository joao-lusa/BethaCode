Algoritmo "MostraSomaRepita"
//Construa um algoritmo que recebe n�meros, sendo que a sua condi��o de para
//� valor 0. Depois
//dever� ser demonstrada a soma dos n�meros informados pelos usu�rios.
Var
// Se��o de Declara��es das vari�veis 
x, soma: real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc...
escreval("--- Para encerrar o programa digite 0!!! ---")
repita
      escreva("digite um n�mero a ser somado: ")
      leia(x)
      
      soma <- soma + x
      
ate x = 0

escreva("a soma dos n�meros �: ", soma)


Fimalgoritmo