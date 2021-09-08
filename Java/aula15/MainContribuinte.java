package aula15;

import java.util.Scanner;

public class MainContribuinte {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bem vindo");
		System.out.print("você deseja cadastrar uma empresa um imovel? (1-empresa 2-imovel): ");
		int opcao = sc.nextInt();
		switch (opcao) {
			case 1:
				Empresa empresa = new Empresa(0, "BethaSistemas", "143234", "Betha", 0);
				do {
					System.out.println("-------------------------------------------------");
					System.out.println("Digite 0 para cancelar!!");
					System.out.println("Dite o que pretende fazer ");
					System.out.println("1 - fazer alguma atividade");
					System.out.println("2 - calcular imposto");
					opcao = sc.nextInt();
					System.out.println("-------------------------------------------------");
					switch (opcao) {
						case 1: 
							empresa.Atividade();
						break;
						case 2:
							empresa.calculaImpostos();
						break;
						case 0:
							System.out.println("Programa encerrado");
						break;
						default:
							System.out.println("Algo deu errado, favor verifique os numeros a serem inseridos no programa");
						break;
					}
					
				}while(opcao !=0);
			break;
			case 2:
				Imovel imovel = new Imovel(0, "Espaço Betha", "3123122");
				imovel.calculaImpostos();
			break;
			case 0:
				System.out.println("Programa encerrado");
			break;
			
			default:
				System.out.println("Tipo de cadastro não é possivel verifique se você informou corretamente!");
			break;
	}  
	} 

}
