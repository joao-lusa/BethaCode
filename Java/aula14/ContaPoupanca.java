package aula14;

import java.util.Scanner;

public class ContaPoupanca implements Taxa{
	Scanner sc = new Scanner(System.in);
	
	private double saldo;
	
	public ContaPoupanca (double saldo) {
		this.saldo = saldo;
	}

	@Override
	public double CalcularTaxa() {
		double soma = this.saldo;
		soma *= 0.02;
		this.saldo -= soma;
		return this.saldo;
	}

	public void Depositar(){
		System.out.print("Valor a ser depositado: ");
		this.saldo += sc.nextDouble();
		
	}
	public void MostrarDados() {
		System.out.println(this.saldo);
	}
}
