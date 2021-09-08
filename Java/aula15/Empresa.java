package aula15;

public class Empresa extends Contribuinte implements Impostos{
	private String nomeFantasia;
	private double faturamento;
	public Empresa(int codigo, String nome, String cpf, String nomeFantasia, double faturamento) {
		super(codigo, nome, cpf);
		this.nomeFantasia = nomeFantasia;
		this.faturamento = faturamento;
	}
	public void Atividade() {
		System.out.println("A empresa "+this.getNome()+" está trabalhando loucamente");
		System.out.println("e faturou 100000");
		this.faturamento += 100000;
	}
	@Override
	public void calculaImpostos() {
		double soma = this.faturamento;
		soma *= 0.02;
		System.out.println("Empresa tem que pagar "+soma+" de Impostos");
	}
	
}
