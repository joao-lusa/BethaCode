package aula9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Jogador jogador = new Jogador();
		Scanner sc = new Scanner(System.in);
	
		int opcao;
		
		 System.out.print("digite o seu nome: ");
		 String nome = sc.next();
		 jogador.nome = nome;
		
		do {
			 System.out.print("gás: ");
			 System.out.println(jogador.gas());
			 System.out.println("---------------------------------------------");
			 System.out.println();
			 System.out.println("1 - chute");
			 System.out.println("2 - soco");
			 System.out.println("3 - beber água");
			 System.out.println("4 - comer pão");
			 System.out.println("0 - sair do jogo");
			 System.out.print("opção: ");
			 opcao = sc.nextInt();
			 System.out.println("---------------------------------------------");
			 
			 switch(opcao) {
			 case 1:
				 System.out.println(jogador.nome +" mandou um low kick no inimigo.");
				 int chute = -10;
				jogador.chute(chute);
			 break;
			 
			 case 2:
				 System.out.println(jogador.nome + " um direto no queixo inimigo.");
				 int soco = -5;
				 jogador.soco(soco);
		     break;
		     
			 case 3:
				 System.out.println(jogador.nome + " molhou o bico e ganhou um gás.");
				 int beberAgua = 15;
				 jogador.beberAgua(beberAgua);
			 break;
			 
			 case 4:
				 System.out.println(jogador.nome + " comeu um pão e agora ta pronto pra sair da jaula.");
				 int comerPao = 30;
				 jogador.comerPao(comerPao);
			 break;
			 }

		}while(jogador.forca >= 0);
		System.out.println("O.K");
		System.out.println("Você cansou e acabou sendo nocauteado");
		System.out.println("Game over");
	}

}
