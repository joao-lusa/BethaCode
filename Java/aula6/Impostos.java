package aula6;

import java.util.Scanner;

public class Impostos {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		
		System.out.print("Digite o nome da empresa: ");
		String nome = sc.nextLine();
		System.out.print("informe quantos funcionarios tem: ");
		int qnt_funcionarios = sc.nextInt();
		
		System.out.println("a empresa: " + nome );
		if(qnt_funcionarios <= 5) {
			System.out.print(" Isenta de impostos.");
		}else if(qnt_funcionarios <= 20) {
			System.out.print(" 5% sobre o Faturamento.");
		}else {
			System.out.print(" Valor Fixo de R$ 5.000,00");
		}
	
	}

}
