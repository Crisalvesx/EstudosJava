package excecoesPersonalizadas;

public class SaldoInsuficienteException extends Exception {
    // Construtor que recebe uma mensagem de erro
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem); // passa a mensagem para a superclasse Exception
    }
}
 


