package ContaBanco;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		
		System.out.print("digite seu nome: ");
		String nome = sc.next();
		System.out.print("informe o numero da sua conta: ");
		String numConta = sc.next();
				
		System.out.println("Bem vindo " + nome + ", a sua conta do jlBanco ");
		System.out.println("Você deseja fazer uma conta corrente ou uma conta poupança");
		System.out.print("1 - Conta Corrente 2 - conta poupança: ");
		int opcaoConta = sc.nextInt();
		
		switch(opcaoConta){
			case 1:
				ContaCorrente contaCorrente = new ContaCorrente(nome, numConta, 0, 0, 0, 0);
				do {
					System.out.println("-----------------------------------------------------");
					System.out.println("Você tem as seguintes operacões.");
					System.out.println("1 - Depositar");
					System.out.println("2 - Sacar");
					System.out.println("3 - tirar extrato");
					System.out.println("4 - pagar com cheque");
					System.out.println("5 - pagar com cartão de debito");
					System.out.println("6 - pagar com cartão de credito");
					System.out.println("7 - pagar o cartão de credito");
					System.out.println("0 - ecerrar o programa ");
					System.out.println("-----------------------------------------------------");
					System.out.print("Escolha a operação: ");
					opcao = sc.nextInt();						  						
					switch (opcao) {
						case 1: 
							contaCorrente.depositar();
						break;
						case 2: 
							contaCorrente.sacar();
						break;
						case 3:
							contaCorrente.MostrarDados();
						break;
						case 4:
							contaCorrente.PagarCheque();
						break;
						case 5:
							contaCorrente.CartaoDebito();
						break;
						case 6:
							contaCorrente.CartaoCredito();
						break;
						case 7:
							contaCorrente.PagarCartaoCredito();
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
				ContaPoupanca contaPoucanca = new ContaPoupanca(nome, numConta, 0, 0);
				do {
					System.out.println("-----------------------------------------------------");
					System.out.println("Você tem as seguintes operacões.");
					System.out.println("1 - Depositar");
					System.out.println("2 - Sacar");
					System.out.println("3 - tirar extrato");
					System.out.println("0 - ecerrar o programa ");
					System.out.println("-----------------------------------------------------");
					System.out.print("Escolha a operação: ");
					opcao = sc.nextInt();	
					switch (opcao) {
					case 1:
						contaPoucanca.depositar();
					break;
					case 2:
						contaPoucanca.sacar();
					break;
					case 3:
						contaPoucanca.MostrarDados();
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
		}
		
		
		
		
		
	}

}
