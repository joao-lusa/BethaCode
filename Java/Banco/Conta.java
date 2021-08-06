package Banco;

import java.util.Scanner;

public class Conta {
	Scanner sc = new Scanner(System.in);
	
	private String correntista;
	private String numero;
	private double saldo;

	public Conta(String correntista, String numero, double saldo) {
		this.correntista = correntista;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public void sacar() {
		System.out.print("informe o valor a ser sacado: ");
		double verificaSaldo = sc.nextDouble();
		if(verificaSaldo <= saldo) {
			System.out.println("saque efetuado com sucesso!!!");
			saldo -= verificaSaldo;
			verificaSaldo = saldo;
		}else {
			System.out.println("Saque negado!!!" + correntista + " você não tem o saldo suficiente para efetuar este saque...");
			verificaSaldo = 0;
		}

		
	}
	
	public void depositar() {
		System.out.print("Informe o valor do deposito: ");
		saldo += sc.nextDouble();
		
		System.out.println("depositado com sucesso. ");
	}
	
	public void MostrarDados() {
		System.out.println("Correntista: " + correntista + ", Numero: " + numero + ", Saldo: " + saldo);
	}
	
}
