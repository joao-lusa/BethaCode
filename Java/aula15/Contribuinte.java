package aula15;

public class Contribuinte {
	private int codigo;
	private String nome;
	private String cpf;
	
	public Contribuinte(int codigo, String nome, String cpf) {
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Nome:"+this.nome+"Codigo: "+this.codigo+"Nome: "+this.cpf;
	}

	public String getNome() {
		return nome;
	}
	
	
}
