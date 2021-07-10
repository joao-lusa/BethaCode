package aula7;

import java.util.Scanner;

public class TestaWhile {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numeroInformado, maiorNumero = 0;
		String numerosInformados = "";
		
		do {
			System.out.print("Informe um numero Qualquer: ");
			numeroInformado = sc.nextInt();
			
			if (numeroInformado > maiorNumero) {
				maiorNumero = numeroInformado;
			}
			
			//Concatenar os numeros informados pelo user
			if (numerosInformados.trim() != "") {
				numerosInformados += ",";
			}
			numerosInformados += numeroInformado;
		} while (numeroInformado != 0);
		System.out.println("Números informados(" + numerosInformados + ")");
		System.out.println("Maior Número: " + maiorNumero);
	}

}