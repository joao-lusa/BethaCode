package aula7;

import java.util.Scanner;

public class NotaArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("quantas notas serão informadas: ");
		int infoNotas = sc.nextInt();
		
		int nota = 0;
		int[]notas = new int[infoNotas];
		
		double newNota = 0, media = 0;
	
		for (int i = 0; i < notas.length; i++) {
					
			System.out.println("infome a nota: ");
			nota = sc.nextInt();
			
			notas[i] = nota;
			
			newNota = newNota + nota;
		}
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		media = newNota / infoNotas;
		System.out.println("a media é: " + media);
	}		
}
