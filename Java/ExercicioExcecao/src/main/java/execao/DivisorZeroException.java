package execao;

public class DivisorZeroException extends ArithmeticException{
    @Override
    public String getMessage() {
        return "Divisor não pode ser 0";
    }
}
