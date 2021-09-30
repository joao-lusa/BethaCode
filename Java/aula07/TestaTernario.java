package aula7;

import java.util.Scanner;

public class TestaTernario {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de funcionarios: ");
		int numeroDeFuncionarios = sc.nextInt();
		
		System.out.print("Informe o Faturamento Mensal: ");
		double valorFaturamento = sc.nextDouble();
		
		double valorDoImposto;
		valorDoImposto = valorFaturamento * (numeroDeFuncionarios > 10 ? 0.05 : 0.02);
		System.out.println("Valor do Imposto R$: " + valorDoImposto);
	}
	

}