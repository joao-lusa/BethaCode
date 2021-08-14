package aula12;

public class Gato extends Animal{
	
	private int quantidadeDeVidas;

	public Gato(String nome, String raca, int quantidadeDeVidas) {
		super(nome, raca);
		this.quantidadeDeVidas = quantidadeDeVidas;
	}
	
	public String miar() {
		return this.getNome() + " Está miando -- MIAU MIAU MIAU MIAU";
	}
	
	
	public int getQuantidadeDeVidas() {
		return quantidadeDeVidas;
	}

	public void setQuantidadeDeVidas(int quantidadeDeVidas) {
		this.quantidadeDeVidas = quantidadeDeVidas;
	}

	@Override
	public String caminha() {
		if(this.quantidadeDeVidas > 1) {
			return this.getNome() + " Está correndo e pulando que nem louco" ; 
		}
		return super.caminha();
		
	}
	
}
