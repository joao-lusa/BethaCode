package ContaBanco;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		
		System.out.print("digite seu nome: ");
		String nome = sc.next();
		System.out.println("informe o numero da sua conta: ");
		String numConta = sc.next();
		
		Conta novaConta = new Conta(nome, numConta);
		
		System.out.println("Bem vindo " + nome + ", a sua conta do jlBanco ");
		System.out.println("Você deseja fazer uma conta corrente ou uma conta poupança");
		System.out.print("1 - Conta Corrente 2 - conta poupança: ");
		int opcaoConta = sc.nextInt();
		
		switch(opcaoConta){
			case 1:
				do {
					System.out.println("-----------------------------------------------------");
					System.out.println("Você tem as seguintes operacões.");
					System.out.println("1 - Depositar");
					System.out.println("2 - Sacar");
					System.out.println("3 - tirar extrato ");
					System.out.println("0 - ecerrar o programa ");
					System.out.println("-----------------------------------------------------");
					System.out.print("Escolha a operação: ");
					opcao = sc.nextInt();												
					switch (opcao) {
						case 1: 
							novaConta.depositar();
						break;
						case 2: 
							novaConta.sacar();
						break;
						case 3:
							novaConta.MostrarDados();
						break;
						case 0:
							System.out.println("Programa encerrado!!");
						break;
						default:
							System.out.println("Essa operação não existe");
						break;		
					}
				}while(opcao != 0);
			break;
			case 2:
				
			break;
		}
		
		
		
		
		
	}

}
