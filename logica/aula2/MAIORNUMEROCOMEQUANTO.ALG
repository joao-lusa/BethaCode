Algoritmo "MaiorNumeroComEquanto"

Var
numeroIformado, maiorNumero, menorNumero : inteiro
informouPrimeiro : logico


Inicio
escreval("----- para encerrar o programa digite 0, e o '0' ser� considerado como menor n�mero tamb�m !!! -----")
informouPrimeiro <- falso
repita
      escreva("Informe o n�mero: ")
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
Escreval("Maior n�mero informado", maiorNumero)
escreva("Menor n�mero informado", menorNumero)

Fimalgoritmo