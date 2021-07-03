package aula6;

import java.util.Scanner;

public class CalculaIdade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = sc.next();
		
		System.out.print("Digite o ano de nascimento:");
		int anoNascimento = sc.nextInt();
		
		int idadeAtual = 2021 - anoNascimento;
		int idadeEm2050 = 2050 - anoNascimento;
		
		System.out.println(nome + " nasceu em " + anoNascimento + "!");
		System.out.println("Atualmente têm " + idadeAtual + " anos.");
		System.out.println("Em 2050 terá " + idadeEm2050 + " anos.");
	}
}
