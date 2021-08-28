package aula13;

import java.util.ArrayList;
import java.util.List;

public class FabricaDeNumeros {
	public static void main(String[] args) {
		Numeros.ehPar(7); 
		Numeros.ehPar(4);
		
		List<Integer>listaASerSomado = new ArrayList<>();
		listaASerSomado.add(10);
		listaASerSomado.add(10);
		listaASerSomado.add(13);
		System.out.println("soma= "+ Numeros.somaNumeros(listaASerSomado));
		
		List<Integer>NumerosQuePodemSerPositivos = new ArrayList<>();
		NumerosQuePodemSerPositivos.add(50);
		NumerosQuePodemSerPositivos.add(-90);
		NumerosQuePodemSerPositivos.add(4);
		System.out.println("A quantidade de numeros positivos: "+ Numeros.ContaPositivos(NumerosQuePodemSerPositivos));
		
		Numeros n1 = new Numeros();
		System.out.println(n1.quantidadeDeNumeros);
		Numeros n2 = new Numeros();
		System.out.println(n2.quantidadeDeNumeros);
		Numeros n3 = new Numeros();
		System.out.println(n3.quantidadeDeNumeros);
		
		System.out.println("===============================================S");
		System.out.println(n1.quantidadeDeNumeros);
		System.out.println(n2.quantidadeDeNumeros);
		System.out.println(n3.quantidadeDeNumeros);
	
	}
}
