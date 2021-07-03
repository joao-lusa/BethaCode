package aula6;

import java.util.Scanner;

public class TestaScanner {

	public static void main(String[] args) {
		
		Scanner nomeQualquer = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = nomeQualquer.next();
		System.out.println("seu nome é: " + nome);

		
	}

}
