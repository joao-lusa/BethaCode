package aula11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PessoaMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Pessoa> listaDePessoas = new ArrayList<>();

		int opcao; 
		do {
			System.out.println("----------------------------------------------");
			System.out.println("Menu de interação ");
			System.out.println("1 - Adicionar pessoa");
			System.out.println("2 - Excluir pessoa");
			System.out.println("3 - Vizualizar as pessoas existentes");
			System.out.println("0 - Parar programa");
			System.out.println("----------------------------------------------");
			System.out.print("Opção: ");
			opcao = sc.nextInt();
			switch (opcao) {
				case 1: 
					System.out.print("Informe seu nome: ");
					String nome = sc.next();
					System.out.print("Informe o Codigo: ");
					int codigo = sc.nextInt();
					System.out.print("Informe o endereço: ");
					String endereco = sc.next();
					Pessoa pessoa = new Pessoa(codigo, nome, endereco);
					listaDePessoas.add(pessoa);
				break;
				case 2:
					System.out.print("Codigo da pessoa que deve ser excluida(o):");
					int codRemovido = sc.nextInt();
					listaDePessoas.removeIf(talPessoa -> talPessoa.getCodigo() == codRemovido);
				break;
				case 3:
					for (Pessoa mostraPessoa : listaDePessoas) {
						System.out.println(mostraPessoa);
					}
				break;
				default:
					System.out.println("Opção não existe!!");
				break;
			}
		}while(opcao != 0);
	}
}
