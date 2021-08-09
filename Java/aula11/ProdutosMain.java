package aula11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProdutosMain {
	public static void main(String[] args) {
		
		List<Produtos> listaDeProdutos = new ArrayList<>();
		
		Produtos produto01 = new Produtos(1, "Computador Dell", 5000);
		Produtos produto02 = new Produtos(2, "Teclado Computador", 100);
		Produtos produto03 = new Produtos(3, "Iphone 12", 5700);
		Produtos produto04 = new Produtos(4, "Mouse", 60);
		
		//Adicionando sem informar a posição, coloca o objeto no final da lista
		listaDeProdutos.add(produto01);
		listaDeProdutos.add(produto02);
		listaDeProdutos.add(produto03);
		
		//Adicionando com indice, reorganiza a lista conforme a posição informada.
		listaDeProdutos.add(1, produto04);
		
		//Pega o objeto de uma posição da lista
		Produtos teste = listaDeProdutos.get(0);
		
		//Remove a posição informada e a lista se auto-dimensiona
		//listaDeProdutos.remove(1);
		

		//RemoveIf usa expressão lambda para remover objetos conforme a condição
		listaDeProdutos.removeIf(produto -> produto.getValor() > 5000);

		//For na lista de produtos
		for (Produtos nomeQualquer : listaDeProdutos) {
			//nomeQualquer.alteraValor(nomeQualquer.getValor() + 10);
			System.out.println(nomeQualquer);
		}
		
		//For Each com expressão lambda
		listaDeProdutos.forEach(produto -> produto.alteraValor(produto.getValor() + 200));
		
		
		//Faz um filtro utilizando expressao lambda, gerando uma nova lista
		List<Produtos> novaLista = 
				listaDeProdutos.stream().filter(produto -> produto.getValor() >= 5000).collect(Collectors.toList());
		System.out.println(novaLista);
		System.out.println("");
		
	}
}