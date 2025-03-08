package OrientacaoObj;

// Uma interface define um conjunto de métodos que uma classe deve implementar. Ela serve como um contrato, garantindo que as classes que a utilizam sigam um determinado comportamento.

// ! ✅ O QUE UMA INTERFACE PODE FAZER?
// ✔️ Definir métodos abstratos (public abstract é implícito).
// ✔️ Ter métodos default e static (a partir do Java 8).
// ✔️ Conter constantes (public static final é implícito).
// ✔️ Extender outra interface (interface pode herdar outra interface):
// ✔️ Ser usada como tipo de referência para objetos.
// ✔️ Classe pode implementar varias interfaces so colocar , ;


// ! ❌ NÃO PODE:
// 🚫 Criar objetos diretamente
// 🚫 Ter construtores
// 🚫 Ter atributos mutáveis (final é obrigatório)
// 🚫 Extender classes
// 🚫 Declarar atributos que não sejam static e final (todas as variáveis são automaticamente public static final);
// 🚫 Estender classes (interface só pode herdar outra interface, não uma classe):

public interface Animal {

    // Propriedade da interface;
    public static final String  nome1 = "Gato_Interface";

    // Assinatura de método;
    void fazerSom();



    // Método 'default';
    default void dormir() {
        System.out.println("Default: Animal dormindo...");
    }


    // Método 'static';
    static void exibirMensagem() {
        System.out.println("Static: Mensagem da interface!");
        System.out.println("Variavel da interface: " + nome1);
    }


    





} 
