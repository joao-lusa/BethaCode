package ContaBanco;

import java.util.Scanner;

public class ContaCorrente extends Conta{
	Scanner sc = new Scanner(System.in);
	private double cartaoCredito;
	private double cartaoDebito;
	private double cheque;

	public ContaCorrente(String correntista, String numero, double saldo, double cartaoCredito, double cartaoDebito, double cheque) {
		super(correntista, numero, saldo);
		this.cartaoCredito = cartaoCredito;
		this.cartaoDebito = cartaoDebito;
		this.cheque = cheque;
		
	}
	
	public void PagarCheque(){
		System.out.print("informe o valor: ");
		this.cheque = sc.nextDouble();
		if(this.getSaldo() >= this.cheque) {
			System.out.println("você pagou com o cheque");
			double saldo = this.getSaldo();
			saldo -= cheque;
			this.setSaldo(saldo);
		}else {
			System.out.println("Cheque sem fundo O-o velhaco");
		}
	}
	
	public void CartaoDebito(){
		System.out.print("informe o valor: ");
		this.cartaoDebito = sc.nextDouble();
		if(this.getSaldo() >= this.cartaoDebito) {
			System.out.println("você pagou com Debito");
			double saldo = this.getSaldo();
			saldo -= this.cartaoDebito;
			this.setSaldo(saldo);
		}else {
			System.out.println("Cartão negado!!!");
		}
	}
	
	public void CartaoCredito() {
		double limite = 4500;
		System.out.print("informe o valor:");
		double verificaCredito = sc.nextDouble();
		if(limite >= verificaCredito) {
			System.out.println("pago com o cartão de credito");
			this.cartaoCredito = verificaCredito;
			verificaCredito = 0;
		}else {
			verificaCredito = 0;
			System.out.println("Estourou o limite de credito.");
		}
	}
	
	public void PagarCartaoCredito() {
		if(this.getSaldo() >= this.cartaoCredito) {
			System.out.println("Cartão foi pago");
			double saldo = this.getSaldo();
			saldo -= this.cartaoCredito;
			this.setSaldo(saldo);
		}else {
			System.out.println("saldo insuficiente!!!");
		}
	}
	
	public double getCartaoCredito() {
		return cartaoCredito;
	}

	public void setCartaoCredito(double cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}

	public double getCartaoDebito() {
		return cartaoDebito;
	}

	public void setCartaoDebito(double cartaoDebito) {
		this.cartaoDebito = cartaoDebito;
	}

	public double getCheque() {
		return cheque;
	}

	public void setCheque(double cheque) {
		this.cheque = cheque;
	}
	
}
