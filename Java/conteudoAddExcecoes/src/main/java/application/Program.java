package application;

import entities.Account;
import exceptions.BuseinessException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("informe os dados da conta");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        System.out.print("Titular: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Saldo inicial: ");
        double balance = sc.nextDouble();
        System.out.print("Limite de saque: ");
        double withdrawLimir = sc.nextDouble();

        Account acc = new Account(number, holder, balance, withdrawLimir);

        System.out.println();
        System.out.print("Informe a quantia para sacar: ");
        double amount = sc.nextDouble();
        try {
            acc.witchdraw(amount);
            System.out.printf("Novo saldo: %.2f%n", acc.getBalance());
        }catch (BuseinessException e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
