package aula11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProdutoMainVerdadeiro {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Produtos> meusProdutos = new ArrayList<>();
		
		int opcao;
		do {
			System.out.println("Bem vindo ao Nosso Sistema de Produtos");
			System.out.println("1 - Cadastrar Produto");
			System.out.println("2 - Excluir Produto");
			System.out.println("3 - Listar Produtos");
			System.out.println("0 - Encerrar Programa");
			System.out.print("Informe a sua opção: ");
			opcao = sc.nextInt();
			
			if (opcao == 1) {
				System.out.print("Informe o Código do Produto: ");
				int cod = sc.nextInt();
				System.out.print("Informe a Descrição do Produto: ");
				String desc = sc.next();
				System.out.print("Informe o valor do Produto: ");
				double valorProd = sc.nextDouble();
				Produtos produtoCriado = new Produtos(cod, desc, valorProd);
				meusProdutos.add(produtoCriado);
			}else if(opcao == 2) {
				System.out.print("Qual produto deve ser excluido:");
				int codRemovido = sc.nextInt();
				meusProdutos.removeIf(nossoProduto -> nossoProduto.getCodigo() == codRemovido);
			}else if (opcao == 3) {
				for (Produtos nomeProduto : meusProdutos) {
					System.out.println(nomeProduto);
				}
			}else if (opcao == 0) {
				System.out.println("Encerrando Aplicação");
			}else {
				System.out.println("Opção Inválida...");
			}
			
			
		}while(opcao != 0);
	}
}