Algoritmo "semnome"
//Implemente um algoritmo para calcular o imposto de renda de um trabalhador.
// No caso o sistema
//dever� solicitar a informa��o do sal�rio do funcion�rio.
//Se o sal�rio for superior a R$: 3000,00 deve
//pagar 15% de imposto para os demais valores deve ser 2%.
Var
salario, salarioF: real


Inicio

escreva("por favor, informar salario: R$")
leia (salario)
se salario >= 3000.00 ent�o
   salarioF <- (salario*0.15)
   escreva("seu salario de ", salario, " deve ser pago 15% de imposto, que ficara", salarioF)
sen�o
     salarioF <- (salario*0.02)
     escreva("seu salario de ", salario, " deve ser pago 2% de imposto, que ficara", salarioF)
fimse



Fimalgoritmo