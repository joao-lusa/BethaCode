package aula14;

public class Conta {
	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente(0);
		contaCorrente.Depositar();
		contaCorrente.CalcularTaxa();
		contaCorrente.MostrarDados();
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(0);
		contaPoupanca.Depositar();
		contaPoupanca.CalcularTaxa();
		contaPoupanca.MostrarDados();
		
	}
}
