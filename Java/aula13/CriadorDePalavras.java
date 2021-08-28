package aula13;

import java.util.ArrayList;
import java.util.List;

public class CriadorDePalavras {

	public static void main(String[] args) {
		String joao = "João Lucas Pereira Rafael";
		int quantidade = Palavras.NumeroDeCaracteres(joao);
		
		System.out.println(joao +"têm "+ quantidade + " Caracteres!!");
		
		List<String> minhaLista = new ArrayList<>();
		minhaLista.add("jão");
		minhaLista.add("luska");
		minhaLista.add("pereira");
		minhaLista.add("rafael");
		
		String palavrasSomadas = Palavras.somaPalavras(minhaLista);
		System.out.println(palavrasSomadas);
		
		System.out.println(Palavras.inverte("João Lucas Pereira"));
		
		System.out.println("Joao tem " + Palavras.contaVogais("joao") + " vogais");
		
		Palavras palavras = new Palavras();
		System.out.println(palavras.quantidadePalavras);
	}

}
