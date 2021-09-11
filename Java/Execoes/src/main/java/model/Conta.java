package model;

public class Conta {
    private String dono;
    private double saldo;

    public Conta(String dono) {
        this.dono = dono;
    }

    public void deposito(double valorDeposito){
        if (valorDeposito <= 0){
            throw new IllegalArgumentException("Valor do deposito invalido!!");
        }
        this.saldo = this.saldo + valorDeposito;
    }

    public double getSaldo() {
        return saldo;
    }

    public void saque(double valorSaque){
        if(valorSaque <=0){
            throw new IllegalArgumentException(valorSaque + "invalido para operação");
        }
        if (valorSaque > this.saldo){
            throw new IllegalArgumentException(valorSaque + "é mais que o saldo da conta R$: "+ this.saldo);
        }
        this.saldo = this.saldo - valorSaque;
    }
}
