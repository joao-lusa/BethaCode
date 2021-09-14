package model;
import excecoes.DivisorZeroException;

public class CalculoMatematico {

    public int dividir(int a, int b) throws DivisorZeroException{
        int divisao;
        if (b == 0){
            throw new DivisorZeroException();
        }
        divisao = a / b;
        return divisao;
    }

}
