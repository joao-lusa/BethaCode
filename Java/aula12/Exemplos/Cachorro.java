package aula12;

public class Cachorro extends Animal{
	
	private boolean domesticado;

	public Cachorro(String nome, String raca, boolean domesticado) {
		super(nome, raca);
		this.domesticado = domesticado;
	}
	
	public String latir() {
		return this.getNome() + " está latindo -- AU AU AU AU AU AU";
	}

}
