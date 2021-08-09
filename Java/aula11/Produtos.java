package aula11;

public class Produtos {
	
	private int codigo;
	private String descricao;
	private double valor;
	
	public Produtos(int codigo, String descricao, double valor) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public void alteraValor(double novoValor) {
		this.valor = novoValor;
	}
	
	@Override
	public String toString() {
		return "Codigo: " + this.codigo + " Descrição: " + this.descricao + " Valor R$: " + this.valor;
	}
}