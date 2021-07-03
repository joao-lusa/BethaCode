package aula6;

import java.util.Scanner;

public class ClubFut {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o nome do jogador: ");
		String nome = sc.nextLine();
		System.out.print("Informe a Idade do jogador: ");
		int idade = sc.nextInt();
		
		if((idade >= 10) && (idade <= 12)) {
			System.out.println("o jogador " + nome + " têm vaga no Infanto-Juvenil");
		}else if ((idade>=16) && (idade<=18)) {
			System.out.println("o jogador " + nome + " têm vaga no Aspirante");
		}else if ((idade>=20)&&(idade<=35)) {
			System.out.println("o jogador " + nome + " têm vaga no Profissional");
		}else {
			System.out.println("o jogador " + nome + " não têm vaga para a idade dele");
		}
		
	}

}
