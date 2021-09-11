package execoes;

import java.sql.SQLException;
import java.util.Locale;

public class FuncaoExemplo {
    public static void aumentaFrase(String frase){
        String novaFrase  = null;
        try{
            novaFrase = frase.toUpperCase();
            System.out.println("Frase antiga: " + frase);
            System.out.println("Frase nova" + novaFrase);
        }catch (NullPointerException e){
            System.out.println("Metodo não pode ser executado com valor nullo!!!");
        }finally {
            System.out.println("Aqui sempre executa!!!");
        }
    }

    public static void diminuirFrase(String frase) throws NullPointerException, SQLException{
        String novaFrase = frase.toLowerCase();
        System.out.println("Frase antiga"+frase);
        System.out.println("Frase nova"+novaFrase);
    }
    
    //exemplo vom exeção propria
    //new BethaCodeExeception();
}
