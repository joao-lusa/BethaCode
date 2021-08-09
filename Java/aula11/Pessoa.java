package aula11;

public class Pessoa {
	private int codigo;
	private String nome;
	private String endereco;
	
	public Pessoa(int codigo, String nome, String endereco) {
		this.codigo = codigo;
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public String toString() {
		return "Codigo: " + this.codigo + " nome: " + this.nome + " endereco: " + this.endereco;
	}
	
}
