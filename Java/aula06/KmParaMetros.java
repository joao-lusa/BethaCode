package aula6;

import java.util.Scanner;

public class KmParaMetros {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		
		double metros;
		
		System.out.print("informe o nome da rua: ");
		String nome = sc.nextLine();
		System.out.print("digite quantos KM tem a rua: ");
		double km = sc.nextDouble();
		
		metros = km * 1000;
		
		System.out.println("rua:  " + nome);
		System.out.println("a extensao em KM é : " + km);
		System.out.println("a extensao em metros é : " + metros);

	}
}
