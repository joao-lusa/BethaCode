Algoritmo "semnome"
//Implemente um algoritmo para calcular o imposto de renda de um trabalhador.
// No caso o sistema
//deverá solicitar a informação do salário do funcionário.
//Se o salário for superior a R$: 3000,00 deve
//pagar 15% de imposto para os demais valores deve ser 2%.
Var
salario, salarioF: real


Inicio

escreva("por favor, informar salario: R$")
leia (salario)
se salario >= 3000.00 então
   salarioF <- salario/1.15
   escreva("seu salario de ", salario, " deve ser pago 15% de imposto, que ficara", salarioF)
senão
     salarioF <- salario/1.02
     escreva("seu salario de ", salario, " deve ser pago 2% de imposto, que ficara", salarioF)
fimse


Fimalgoritmo