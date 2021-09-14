package aplicacao;
import java.util.Scanner;
import model.CalculoMatematico;
import excecoes.DivisorZeroException;


public class MainExecoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculoMatematico calculo = new CalculoMatematico();

        System.out.print("digite primeiro numero da divisao: ");
        int a = sc.nextInt();
        System.out.print("Segundo numero: ");
        int b = sc.nextInt();
        try {
            calculo.dividir(a, b);
        }catch (DivisorZeroException e){
            System.out.println(calculo.dividir(a,b));
        }

    }
}
