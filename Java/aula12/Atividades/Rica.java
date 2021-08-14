package aula12;

import java.util.Scanner;

public class Rica extends Pessoa{
	Scanner sc = new Scanner(System.in);
	private double dinheiro;

	public Rica(String nome, int idade, double dinheiro) {
		super(nome, idade);
		this.dinheiro = dinheiro;
	}
	
	public void fazCompas() {
		System.out.println(this.getNome() + " Foi Fazer Compras");
		System.out.print("quantos ele gastou: ");
		double compras = sc.nextDouble();
		dinheiro -= compras;
		System.out.println(this.getNome() + " agora tem um saldo de: " + dinheiro);
	}
		
}
