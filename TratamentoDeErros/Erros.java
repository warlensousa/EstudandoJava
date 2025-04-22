package TratamentoDeErros;

public class Erros {
    public static void main(String[] args) {
        
        // Try catch
        try {
    
            // Exemplo de erro dividindo número por zero;
            int a = 0;
            int b = 10;

            int resultado = b / a;

        } catch (ArithmeticException e) {
            // (ArithmeticException <= tipo de erro que da ao dividir por 0;  e <= é o objeto que vai da recursos para explodar o erro);

            System.out.println("Divisão por 0 não é possivel");  // Assim o usuario vai entender o que aconteceu para dar erro;
            
        }

        try {
            int[] numeros = {1, 2, 3};

            System.out.println(numeros[3]);

        } catch (Exception e) {  //trata o erro;
            System.out.println("Erro genérico");

            System.out.println("Msg: " + e.getMessage());
        }



        try {
            int[] num = {1, 2, 3, 100, 45};

            System.out.println("Acessando indice existente: " + num[3]);

        } catch (ArrayIndexOutOfBoundsException erro) {  //trata o erro;
            System.out.println("Erro genérico finally");

            System.out.println("Msg: " + erro.getMessage());

        } finally { // Sempre vai ser executado inpendente de ter tratado o erro ou ter dado certo.
            System.out.println("Executou o finnaly");
        }


        // Exceções com throw;
        try {

            validarIdade(17);
            
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }


    }

    public static void validarIdade(int idade) {

        if(idade < 18) {
            throw new IllegalArgumentException ("Idade deve ser maior que 18.");  // se for ter caido no erro throw vai ser interrompido o códico;
        }   

        System.out.println("Idade válida: " + idade); // <= ou seja, não vai executar esse aqui;
    }
}
    
