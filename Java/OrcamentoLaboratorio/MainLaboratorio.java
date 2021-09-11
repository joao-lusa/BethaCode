package OrcamentoLaboratorio;

import java.util.Scanner;

public class MainLaboratorio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Exames exames = new Exames("Pereira Rafael", "123553221", "São Pedro, Rua são Carlos de almeida da silva");
		
		int fiel = 0;
		int opcao;
		String examesEscolhidos =""; 
		
		System.out.println(exames);
		System.out.println("Bem vindo ao nosso programa de orçamento de exames");
		do {
			fiel += 1;
			exames.clienteFiel(fiel);
			System.out.println("--------------------------------------------------------------");
			System.out.println("Para encerrar o programa digite 0");
			System.out.println("Escolha o exame para seber o seu valor");
			System.out.println("1 - HEMOGRAMA COMPLETO");
			System.out.println("2 - CREATININA");
			System.out.println("3 - UREIA");
			System.out.println("4 - COLESTEROL TOTAL E FACOES");
			System.out.println("5 - VITAMINA D-3");
			System.out.println("6 - VITAMINA B12");
			System.out.println("7 - GLICOSE");
			System.out.println("8 - CALCIO");
			System.out.println("9 - SÓDIO");
			System.out.print("digite o nomero do exame: ");
			opcao = sc.nextInt();
			switch (opcao) {
				case 1:
					examesEscolhidos += exames.hemogramaCompleto();
				break;
				case 2:
					examesEscolhidos += exames.creatinina();
				break;
				case 3:
					examesEscolhidos += exames.ureia();
				break;
				case 4:
					examesEscolhidos += exames.colesterolTotalEFracoes();
				break;
				case 5:
					examesEscolhidos += exames.vitaminaD3();
				break;
				case 6:
					examesEscolhidos += exames.vitaminaB12();
				break;
				case 7:
					examesEscolhidos += exames.glicose();
				break;
				case 8:
					examesEscolhidos += exames.calcio();
				break;
				case 9:
					examesEscolhidos += exames.sodio();
				break;
				case 0:
					System.out.println("Exames selecionados");
					System.out.println("--------------------------------------------------------------");
				break;
				default:
					System.out.println("não foi possivel encontrar o exame selecionado, verifique se você indicou o numero correto!!");
				break;
			}
		}while(opcao != 0);
		if(fiel >= 5) {
			System.out.println("Como você vai realizar varios exames conosco, você recebeu destonto, os exames que tem * no começo estão com desconto.");
		}
		System.out.println(examesEscolhidos);
		exames.mostrarSoma();
	}

}
