package aula15;

import java.util.Scanner;

public class Imovel extends Contribuinte implements Impostos{

	public Imovel(int codigo, String nome, String cpf) {
		super(codigo, nome, cpf);
	}
	Scanner sc = new Scanner(System.in);

	@Override
	public void calculaImpostos() {
		System.out.print("Quantos M2 tem o seu imovel: ");
		double m2 = sc.nextDouble();
		System.out.print("Qual é a area do seu imovel: ");
		double area = sc.nextDouble();
		
		double imposto = m2 * area;
		System.out.println("Você tem que pagar "+imposto+ " de imposto");
	}
}
