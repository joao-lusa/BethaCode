package aula12;

public class Miseravel extends Pessoa{
	public Miseravel(String nome, int idade) {
		super(nome, idade);
	}
	
	public void mendigar(){
		System.out.println(this.getNome()+" est� mendigando e morando embaixo da pote");
	}
}
