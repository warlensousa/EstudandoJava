package TratamentoDeErros;
public class Banco {
    
    private double saldo;

    public Banco(double saldo) {
        this.saldo = saldo;
    }

// throws SaldoInsuficienteException ativa esse erro;
    public void sacar(double valor) throws SaldoInsuficienteException {
        if(valor > saldo) {
            // expetion
            throw new SaldoInsuficienteException("Saldo insufiente para sacar: " + valor);
        }

        System.out.println("Saque realizado com sucesso, de :" + valor);
        System.out.println("Valor restante: " + (saldo - valor));
    }
}
