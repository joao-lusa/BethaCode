package aula09;

import java.util.Scanner;

public class CarrosFactory {
	public static void main(String[] args) {
		
		Carro carro01 = new Carro();
		
		carro01.modelo = "Ferrari";
		carro01.cor = "Amarela";
		carro01.ano = 2022;
		carro01.velocidade_maxima = 200;
		
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		
		do {
			
			System.out.println("Menu Carro:");
			System.out.println("1 - Ligar");
			System.out.println("2 - Desligar");
			System.out.println("3 - Acelerar");			
			System.out.println("4 - Desacelerar");
			System.out.println("5 - Mostrar Dados");			
			System.out.println("0 - Encerrar Programa");		
			System.out.print("Opção:");
			
			opcao = sc.nextInt();
			if(opcao == 1) {
				if(carro01.ligar()) {
					System.out.println(carro01.modelo + " foi ligado com sucesso!!!");
				}else {
					System.out.println(carro01.modelo + " não foi ligado!! Pois já estava nesta situação!!!");
				}
			}else if(opcao == 2) {
				if(carro01.desligar()) {
					System.out.println(carro01.modelo + " foi desligado com sucesso!!!");
				}else {
					System.out.println(carro01.modelo + " não foi desligado!! Pois já estava nesta situação!!!");
				}
			}else if(opcao == 3) {
				System.out.print("Qual velocidade: ");
				int velocidadeUsuario = sc.nextInt();
				carro01.acelerar(velocidadeUsuario);
			}else if(opcao == 4) {
				System.out.print("Deseja para o carro(S-Sim/N-Não): ");
				String paraCarro = sc.next();
				if(paraCarro.equals("S")) {
					carro01.desacelerar();
				}else {
					System.out.print("Qual velocidade: ");
					int velocidadeUsuario = sc.nextInt();
					carro01.desacelerar(velocidadeUsuario);
				}
			}else if(opcao == 5) {
				System.out.println(carro01);
			}
		}while(opcao != 0);
	}
}
