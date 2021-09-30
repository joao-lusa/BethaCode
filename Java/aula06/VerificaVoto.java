package aula6;

import java.util.Scanner;

public class VerificaVoto {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o seu nome:");
		String eleitor = sc.next();
		
		System.out.print("Digite a sua idade: ");
		int idade = sc.nextInt();
		
		String mensagemFinal = eleitor;
		
		if (idade < 16) {
			mensagemFinal += " não precisa votar!!!";
		}else if (idade < 18) {
			mensagemFinal += " seu voto é facultativo!!!";
		}else {
			mensagemFinal += " seu voto é obrigatório!!!";
		}
		
		System.out.println(mensagemFinal);
	}

}