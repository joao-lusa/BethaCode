package aula15;

public abstract class Animal {
	private String tipo;
	private String nome;
	
	public Animal(String tipo, String nome) {
		this.tipo = tipo;
		this.nome = nome;
	}
	
	public abstract void falar();
	public abstract void andar();

	@Override
	public String toString() {
		return "Tipo: " + this.tipo + " Nome: " + this.nome;
	}
	
	

}
