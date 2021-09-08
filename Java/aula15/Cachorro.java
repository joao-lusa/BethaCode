package aula15;

public class Cachorro extends Animal implements Fala{
	
	public Cachorro(String tipo, String nome) {
		super(tipo, nome);
	}
	
	@Override
	public void andar() {
		System.out.println("andando com as patas!!");
	}
	@Override
	public void falar() {
		System.out.println("Cachorro acuando !! Wolf");
	}
	@Override
	public void formaDeFalar() {
		falar();
	}
	
}
