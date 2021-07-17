package aula8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Animais animal = new Animais();
		int operacao;
		
		do {
			System.out.println("-------------------------------------------------");
			System.out.println("escolha a operação a ser realiada caso deseja parar digite 0 !!");
			System.out.println("1 - tipo do animal ");
			System.out.println("2 - dar um nome ao animal ");
			System.out.println("3 - mostrar animal ");
			System.out.println("4 - alimentar animal");
			System.out.println("5 - fazer o animal dormir ");
			System.out.println("-------------------------------------------------");
			System.out.print("digite aqui a operação: ");
			operacao = sc.nextInt();

			switch(operacao) {
				case 1:
					System.out.print("digite o tipo do animal: ");
					String tipo = sc.next();
					animal.tipo = tipo;
				break;
				
				case 2:
					System.out.print("digite o nome do animal: ");
					String nome = sc.next();
					animal.nome = nome;
				break;
				
				case 3:
					animal.mostrar();
				break;
				
				case 4:
					animal.alimentar();
				break;
				
				case 5: 
					animal.dormir();
				break;
			}
			
		}while(operacao !=0);
		
	}

}
