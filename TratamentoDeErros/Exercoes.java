package TratamentoDeErros;

public class Exercoes {
    public static void main(String[] args) {
        // Exerções personalizadas;

        Banco minhaConta = new Banco(5000);

        try {
            minhaConta.sacar(6000);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
