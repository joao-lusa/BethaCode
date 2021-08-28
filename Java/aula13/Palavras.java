package aula13;

import java.util.Iterator;
import java.util.List;

public class Palavras {
	public static int quantidadePalavras;
	private int cod;
	
	public Palavras() {
		this.quantidadePalavras = this.quantidadePalavras + 1;
		this.cod = quantidadePalavras;
	}
	
	public static int NumeroDeCaracteres(String palavra) {
		//trim -> retira esços em branco;
		//length -> Conta Quantidade de caracteres
		
		return palavra.trim().length();
	}
	public static String somaPalavras(List<String> palavrasASeremSomadas) {
		String retorno = "";
		for(String variavelLocalDoFor : palavrasASeremSomadas) {
			retorno = retorno + variavelLocalDoFor + " ";
		}
		return retorno;	
	}
	public static String inverte(String palavra) {
		String palavraInvertida = "";
		int tamanhoDaPalavra = palavra.trim().length();
		
		for(int i = tamanhoDaPalavra - 1; i >= 0; i--) {
			palavraInvertida = palavraInvertida + palavra.charAt(i);
		}
		return palavraInvertida;
	}
	
	public static int contaVogais(String palavra) {
		int quantidadeDeCaracteres = palavra.trim().length();
		int numeroDeVogais = 0;
		
		for(int posicao = 0; posicao < quantidadeDeCaracteres; posicao++) {
			if(palavra.toUpperCase().charAt(posicao)=='A') {
				numeroDeVogais = numeroDeVogais + 1;
			}
			if(palavra.toUpperCase().charAt(posicao)=='E') {
				numeroDeVogais = numeroDeVogais + 1;
			}
			if(palavra.toUpperCase().charAt(posicao)=='I') {
				numeroDeVogais = numeroDeVogais + 1;
			}
			if(palavra.toUpperCase().charAt(posicao)=='O') {
				numeroDeVogais = numeroDeVogais + 1;
			}
			if(palavra.toUpperCase().charAt(posicao)=='U') {
				numeroDeVogais = numeroDeVogais + 1;
			}
		}
		return numeroDeVogais;
	}
}
