package TratamentoDeErros;

// Toda classe que herda de Exception, tem que enviar pelo menos a msg
// getMenssage -> menssagem
public class SaldoInsuficienteException extends Exception {
    
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }

}
