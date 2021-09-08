package aula15;

public class Gato extends Animal{
	public Gato(String tipo, String nome) {
		super(tipo, nome);
	}
	
	@Override
	public void andar() {
		System.out.println("Está andando com as patas de uma maneira agil");
	}
	@Override
	public void falar() {
		System.out.println("O bichano está falando!! MIAU");
	}
}
