package ContaBanco;

import java.util.Scanner;

public class Conta {
	
	Scanner sc = new Scanner(System.in);
	
	private String correntista;
	private String numero;
	private double saldo;

	public Conta(String correntista, String numero, double saldo) {
		this.saldo = saldo;
		this.correntista = correntista;
		this.numero = numero;
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
		this.saldo += sc.nextDouble();
		System.out.println("depositado com sucesso. ");
	}
	
	public void MostrarDados() {
		System.out.println("Correntista: " + correntista + ", Numero: " + numero + ", Saldo: " + this.saldo);
	}
	
	public String getCorrentista() {
		return correntista;
	}

	public void setCorrentista(String correntista) {
		this.correntista = correntista;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
