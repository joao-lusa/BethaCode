package OrcamentoLaboratorio;

public abstract class Laboratorio {
	private String nome;
	private String cnpj;
	private String endereco;
	public Laboratorio(String nome, String cnpj, String endereco) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return "Laboratorio: " + this.nome + ", cnpj: " + this.cnpj + ", endereco: " + this.endereco;
	}
	
	
}
