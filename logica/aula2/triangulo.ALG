Algoritmo "cassificaTriangulo"


Var
a,b,c:inteiro

Inicio
escreva("escreva um lado do triangulo:")
leia(a)
escreva("escreva outro lado do triangulo:")
leia(b)
escreva("escreva outro lado do triangulo:")
leia(c)

se (a=b) e (b=c)entao
   escreva("triagulo equilataro")
senao
     se (a=b) ou (b=c) ou (a=c) entao
        escreva("triangulo isosceles")
   senao
        escreva("triangulo escaleno")
   fimse
fimse
     

Fimalgoritmo