package ContaBanco;

public class ContaPoupanca extends Conta{
	private double taxa;

	public ContaPoupanca(String correntista, String numero, double saldo, double taxa) {
		super(correntista, numero, saldo);
		this.taxa = taxa;
	}

	@Override
	public void depositar() {
		double taxaSaldo;
		double novoSaldo;
		taxaSaldo = this.getSaldo();
		novoSaldo = this.getSaldo();
		if(this.getSaldo() >= 1000) {
			this.taxa = 0.1;
			taxaSaldo *= taxa;
			novoSaldo += taxaSaldo;
			this.setSaldo(novoSaldo);
		}else if(this.getSaldo() >= 4000) {
			this.taxa = 0.15;
			taxaSaldo *= taxa;
			novoSaldo += taxaSaldo;
			this.setSaldo(novoSaldo);
		}else if(this.getSaldo() >= 10000) {
			this.taxa = 0.2;
			taxaSaldo *= taxa;
			novoSaldo += taxaSaldo;
			this.setSaldo(novoSaldo);
		}
		super.depositar();
	}
	
	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	


}
