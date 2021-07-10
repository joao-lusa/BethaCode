package aula7;

import java.util.Scanner;

public class TestaCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o dia da semana de 1 a 7:");
		int diaDaSemana = sc.nextInt();
		
		switch (diaDaSemana) {
		case 1:
			System.out.println(diaDaSemana + " - Segunda-Feira");
			break;
		case 2:
			System.out.println(diaDaSemana + " - Terça-Feira");
			break;			
		case 3:
			System.out.println(diaDaSemana + " - Quarta-Feira");
			break;
		case 4:
			System.out.println(diaDaSemana + " - Quinta-Feira");
			break;			
		case 5:
			System.out.println(diaDaSemana + " - Sexta-Feira");
			break;			
		case 6:
			System.out.println(diaDaSemana + " - Sabado");
			break;
		case 7:
			System.out.println(diaDaSemana + " - Domingo");
			break;			
		default:
			System.out.println(diaDaSemana + " - Dia Inválido. Deve ser informado de 1 a 7!!!");
			break;
		}
	}
}