package aplicacao;
import model.Conta;
import execoes.FuncaoExemplo;

import javax.swing.*;
import java.sql.SQLException;
import java.util.Scanner;

public class MinhaApp {
    public static void main(String[] args) {
        //exemplo de try carch
//        FuncaoExemplo.aumentaFrase(" tiago");
//
//        try {
//            FuncaoExemplo.diminuirFrase(" TESTE");
//        } catch (SQLException e) {
//            System.out.println("Gerou erro com o problema no SQL....");
//        }catch (NullPointerException e){
//            System.out.println("Gerou erro com o valor nulo informado.....");
//        }
//    }

        Scanner sc = new Scanner(System.in);
        Conta novaConta = new Conta("joão");
        int opacao = 0;
        do {
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Saldo");
            System.out.println("0 - Finalizar");
            System.out.print("escolha o numero da opção: ");
            opacao = sc.nextInt();
            if (opacao == 1){
                System.out.print("Valor a depositar: ");
                double valorDepositar = sc.nextDouble();
                novaConta.deposito(valorDepositar);
            }else if(opacao == 2){
                System.out.print("digite o valor do saque: ");
                double valorSaque = sc.nextDouble();
                novaConta.saque(valorSaque);
            }else if(opacao == 3){
                System.out.println(novaConta.getSaldo());
            }else if(opacao == 0){
                System.out.println("programa enxerrado!!!");
            }
        }while (opacao != 0);
        try {
            novaConta.deposito(0);
        } catch(IllegalArgumentException e) {

        }
    }
}
