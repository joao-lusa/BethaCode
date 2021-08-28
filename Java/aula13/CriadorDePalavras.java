package aula13;

import java.util.ArrayList;
import java.util.List;

public class CriadorDePalavras {

	public static void main(String[] args) {
		String joao = "Jo�o Lucas Pereira Rafael";
		int quantidade = Palavras.NumeroDeCaracteres(joao);
		
		System.out.println(joao +"t�m "+ quantidade + " Caracteres!!");
		
		List<String> minhaLista = new ArrayList<>();
		minhaLista.add("j�o");
		minhaLista.add("luska");
		minhaLista.add("pereira");
		minhaLista.add("rafael");
		
		String palavrasSomadas = Palavras.somaPalavras(minhaLista);
		System.out.println(palavrasSomadas);
		
		System.out.println(Palavras.inverte("Jo�o Lucas Pereira"));
		
		System.out.println("Joao tem " + Palavras.contaVogais("joao") + " vogais");
		
		Palavras palavras = new Palavras();
		System.out.println(palavras.quantidadePalavras);
	}

}
