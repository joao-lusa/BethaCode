package aula7;

import java.util.Scanner;

public class TestaFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe um número qualquer: ");
		int numero = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			int multiplicacao = numero * i;
			System.out.println(numero + " * " + i + " = " + multiplicacao);
		}
	}
}