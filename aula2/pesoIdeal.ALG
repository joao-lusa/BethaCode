Algoritmo "semnome"
 //Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um
 //algoritmo que calcule
//seu peso ideal, utilizando as seguintes fórmulas:
//Para homens: (72.7*h) - 58
//Para mulheres: (62.1*h) - 44.7 (h = altura)
Var
altura, pesoIdeal: real
sexo : caractere


Inicio
escreva("esceva sua altura: ")
leia(altura)

escreva("informa seu sexo 'm' para masculino 'f' para feminino: ")
leia(sexo)

se (sexo = "m") ou (sexo = "M") entao
   pesoIdeal <- (altura*72.7) - 58
senao (sexo = "f") ou (sexo = "F") entao
     pesoIdeal <- (altura*62.1) - 44.7
senao
escrava("sexo não encontrado")
fimse

escreva("sua  altura é ", altura, " seu peso ideal será", pesoIdeal)

Fimalgoritmo