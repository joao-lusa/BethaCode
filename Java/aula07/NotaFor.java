package aula7;

import java.util.Scanner;

public class NotaFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int qtdNotas = 0;
		double notas = 0, newNota = 0;
		String informarNota = "";
		 
		System.out.println("quantas notas serão informadas: ");
		qtdNotas = sc.nextInt();
		
		for (int i = 1; i < qtdNotas +1; i++) {
			
			System.out.println("infome a nota: ");
			notas = sc.nextDouble();
			
			if(informarNota.trim() != "") {
				informarNota += ",";
			}
			informarNota += notas;
			
			newNota = newNota + notas;
		}
		
		double media = newNota / qtdNotas;
		
		System.out.println("notas informadas: (" + informarNota + ")");
		System.out.println("média: " + media);
	}
}
