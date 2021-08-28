package aula13;

import java.util.List;

public class Numeros {
	
	public static int quantidadeDeNumeros;
	
	public Numeros() {
		this.quantidadeDeNumeros = this.quantidadeDeNumeros + 1;
	}

	public static void ehPar(int numero) {
		if(numero % 2 == 0) {
			System.out.println(numero+" é par");
		}else {
			System.out.println(numero+" é impar");
		}
	}
	
	public static int somaNumeros(List<Integer> meusNumeros) {
		int soma = 0;
		
		for(Integer meuNumero : meusNumeros){
			soma+=meuNumero;
		}
		return soma;
	}
	
	public static int ContaPositivos(List<Integer> meusNumeros) {
		int positivos = 0;
		
		for(Integer meuNumero : meusNumeros){
			if(meuNumero >=0) {
				positivos = positivos + 1;
			}
		}
		return positivos;
	}
	
	
	
	
}














