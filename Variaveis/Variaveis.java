
// Classe:
// * Define a estrutura do objeto;
// * Os atributos armazenam informações sobre o objeto;
// * Os métodos definem ações que o objeto podem realizar;
// * Para criar objetos usa operador 'New';
public class Variaveis {

    // Main => Método especial onde a execução do código começa; Ponto de entrada!
    // * Quando executa um programa Java, a JVM (Java Virtual Machine) procura o método main e começa a execução a partir dele.
    public static void main(String[] args) {
        
        // VARIAVÉIS => variável é um espaço na memória do computador usado para armazenar valores que podem ser manipulados pelo programa. Cada variável tem um tipo de dado específico e um nome.

        // 1. Declarar Variável: tipo, nome, atribuir valor;
        int minhaIdade = 22;
        System.out.println("1: Idade: " + minhaIdade);

        // 2. Posso alterar o valor da variável, mas não posso trocar seu tipo! Exemplo: int para String;
        minhaIdade = 21;
        System.out.println("2: Alterei o valor da variável. Idade:" + minhaIdade);

        // 3. Outra forma de declarar uma variável; O proprio Java vai colocar o tipo dela: String, int ou double etc;
        var nomeVariavel = "Warlen";
        System.out.println("3: " + nomeVariavel);




        // NÚMEROS INTEIROS = 100, 1000, 93949596... 
        // Tipos: byte, short, int, long;

        // 4. byte => 8 bits na memória; ou seja, so pode ta entre -128 a 127 ou vai da erro;
        byte inteiroByte = 127; 
        System.out.println("4: byte => 8 bits na memória; ou seja, so pode ta entre -128 a 127 ou vai da erro! | Número: " + inteiroByte);

        // 5. // short => 16 bits na memória; ou seja, so pode ta entre -32768 a 32767 ou vai da erro;
        short inteiroShort = 32767;
        System.out.println("5: short >= 16 bits na memória; ou seja, so pode ta entre -32768 a 32767 ou vai da erro! | Número: " + inteiroShort);

        // 6. int => 32 bits na memória; ou seja, so pode ta entre -2147483648 a 2147483647 ou vai da erro;
        int inteiroInt = 2147483647;
        System.out.println("6: int => 32 bits na memória; ou seja, so pode ta entre -2147483648 a 2147483647 ou vai da erro! | Número: " + inteiroInt);

        // 7. long => 64 bits na memória e tem que ter L no final; ou seja, so pode ta entre -9223372036854775808 a 9223372036854775807 ou vai da erro;
        long inteiroLong = 9223372036854775807L;
        System.out.println("7: long => 64 bits na memória e tem que ter L no final; ou seja, so pode ta entre -9223372036854775808 a 9223372036854775807 ou vai da erro! | Número: " + inteiroLong);



        // NÚMEROS DECIMAIS = 1.2 , 3.14, 0.35465 etc...
        // Tipos: float, double;

         // 8. Float => 32 bits precisão simples e coloca 'f' ao final; Pouco número apenas a virgula; 39.50, 128.48 etc...
         float decimalFloat = 121.14f;
         System.out.println("8: Float => 32 bits precisão simples; Pouco número apenas a virgula; 39.50, 128.48 etc... | Número: " + decimalFloat);

         // 9. Double => 64 bits precisão dupla; varios numeros depois da virgula;
        double decimalDouble = 1345.34556;
        System.out.println("9: Double => 64 bits precisão dupla; varios numeros depois da virgula! | Número: " + decimalDouble);
 

        // STRING => classe da biblioteca padrão usada para representar textos (sequências de caracteres).
        // * Quando declada não pode ter seu valor alterado;
        // * Possui métodos como : length(), replace etc...

        // 10.
        String nome = "Warlen";
        System.out.println("10: String: "+ nome);

        
        // 11. char => representar um único caractere e tem que usar aspas sinples;
        char caractere = 'W';
        System.out.println("11: char: " + caractere);


        // 12. Boolean => True ou false;
        boolean verdadeiro = true;
        System.out.println("12: Verdadeiro: " + verdadeiro);




        









    }
}