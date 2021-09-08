package aula15;

public class Gato extends Animal{
	public Gato(String tipo, String nome) {
		super(tipo, nome);
	}
	
	@Override
	public void andar() {
		System.out.println("Est� andando com as patas de uma maneira agil");
	}
	@Override
	public void falar() {
		System.out.println("O bichano est� falando!! MIAU");
	}
}
