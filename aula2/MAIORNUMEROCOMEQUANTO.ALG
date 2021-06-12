Algoritmo "MaiorNumeroComEquanto"

Var
numeroIformado, maiorNumero, menorNumero : inteiro
informouPrimeiro : logico


Inicio
escreval("----- para encerrar o programa digite 0, e o '0' será considerado como menor número também !!! -----")
informouPrimeiro <- falso
repita
      escreva("Informe o número: ")
      leia(numeroIformado)
      se informouPrimeiro = falso entao
         maiorNumero <- numeroIformado
         informouPrimeiro <- verdadeiro
      senao
           se numeroIformado > maiorNumero entao
              maiorNumero <- numeroIformado
           fimse
           
           se numeroIformado < menorNumero entao
              menorNumero <- numeroIformado
           fimse
      fimse
      
ate numeroIformado = 0
Escreval("Maior número informado", maiorNumero)
escreva("Menor número informado", menorNumero)

Fimalgoritmo