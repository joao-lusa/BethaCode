package aula12;

public class Pobre extends Pessoa{
	public Pobre(String nome, int idade) {
		super(nome, idade);
	}
	public void trbalhar() {
		System.out.println(this.getNome()+" Foi Trabalhar");
	}
}
