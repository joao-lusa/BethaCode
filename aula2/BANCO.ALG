Algoritmo "banco"


Var
valorASacar, resto, n100, n50, n20, n10, n5, n2, MinhaMoedinha: inteiro

Inicio
escreva("informe o valor a sacar")
leia(valorAsacar)

resto <- valorASacar

se resto >= 100 entao
   n100 <- resto DIV 100
   resto <- resto MOD 100
fimse
se resto >= 50 entao
   n50 <- resto DIV 50
   resto <- resto MOD 50
fimse
se resto >= 20 entao
   n20 <- resto DIV 20
   resto <-resto MOD 100
fimse
se resto >= 10 entao
   n10 <- resto DIV 10
   resto <- resto MOD 10
fimse
se resto >= 5 entao
   n5 <- resto DIV 5
   resto <- resto MOD 5
fimse
se resto >= 2 entao
   n2 <- resto DIV 2
   resto <- resto MOD 2
fimse
se resto >= 1 entao
   resto <- MinhaMoedinha
fimse


se resto >= 1 entao
   escreval (n100, "notas de 100")
fimse
se resto >= 1 entao
   escreval (n50, "notas de 50")
fimse
se resto >= 1 entao
   escreval (n20, "notas de 20")
fimse
se resto >= 1 entao
   escreval (n10, "notas de 10")
fimse
se resto >= 1 entao
   escreval (n5, "notas de 5")
fimse
se resto >= 1 entao
   escreval (n2, "notas de 2")
fimse
se resto >= 1 entao
   escreval(MinhaMoedinha, "moedas de 1 real")
fimse

Fimalgoritmo