package aula03;

public class FabricaDeCarros {
	public static void main(String[] args) {
		
		//Cria as variaveis/objetos carro01 e carro02 a partir da Classe Carro
		Carro carro01 = new Carro();
		Carro carro02 = new Carro();
		
		//Define os valores dos atributos da variavel carro01
		carro01.modelo = "Fusca";
		carro01.cor = "Azul";
		
		//Define os valores dos atributos da variavel carro02		
		//carro02.modelo = "Gol";
		//carro02.cor = "Vermelho";
		
		carro01.ligar();
		carro01.acelerar();
		carro01.acelerar();
		
	}
}
