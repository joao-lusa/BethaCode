package OrcamentoLaboratorio;

public class Exames extends Laboratorio implements Fidelidade{
	private int fiel;
	private double soma = 0;
	public Exames(String nome, String cnpj, String endereco) {
		super(nome, cnpj, endereco);
	}
	
	@Override
	public void clienteFiel(int fiel) {
		this.fiel = fiel;
	}
	
	public void mostrarSoma() {
		System.out.println("Valor total: R$"+soma);
	}
	
	//exames
	public String hemogramaCompleto() {
		if(this.fiel >= 5) {
			soma += 15;
			return " *HEMOGRAMA COMPLETO R$15,00";
		}
		soma+=30;
		return " HEMOGRAMA COMPLETO R$30,00";
	}
	
	public String creatinina() {
		if(this.fiel >= 5) {
			soma+=10;
			return " *CREATININA R$10,00";
		}
		soma+=20;
		return " CREATININA R$20,00";
	}
	
	public String ureia() {
		if(this.fiel >= 5) {
			soma+=10;
			return " *UREIA R$10,00";
		}
		soma+=20;
		return " UREIA R$20,00";
	}
	
	public String colesterolTotalEFracoes(){
		if(this.fiel >= 5) {
			soma+=32;
			return " *COLESTEROL TOTAL E FACOES R$32,00";
		}
		soma+=65;
		return " COLESTEROL TOTAL E FACOES R$65,00";
	}
	
	public String vitaminaD3(){
		if(this.fiel >= 5) {
			soma+=30;
			return " *VITAMINA D-3 R$30,00";
		}
		soma+=60;
		return " VITAMINA D-3 R$30,00";
	}
	
	public String vitaminaB12() {
		if(this.fiel >= 5) {
			soma=+25;
			return " *VITAMINA B12 R$25,00";
		}
		soma=+50;
		return " VITAMINA B12 R$50,00";
	}
	
	public String glicose() {
		if(this.fiel >= 5) {
			soma+=10;
			return " *GLICOSE R$10,00";
		}
		soma+=20;
		return " GLICOSE R$20,00";
	}
	
	public String calcio() {
		if(this.fiel >= 5) {
			soma+=15;
			return " *CALCIO R$15,00";
		}
		soma+=30;
		return " CALCIO R$30,00";
	}
	
	public String sodio() {
		if(this.fiel >= 5) {
			soma+=10;
			return " *SÓDIO R$10,00";
		}
		soma+=20;
		return " SÓDIO R$20,00";
	}
}








