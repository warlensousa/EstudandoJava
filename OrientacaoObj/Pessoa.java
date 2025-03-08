package OrientacaoObj;

// ! Uma classe abstrata em Java é uma classe que não pode ser instanciada diretamente e serve como um modelo para outras classes. Ela pode conter métodos abstratos (sem implementação) e métodos concretos (com implementação).

// ! ✅ Pode:
// ✔️ Ter métodos abstratos (que obrigam as subclasses a implementá-los).
// ✔️ Ter métodos concretos (com implementação normal).
// ✔️ Ter atributos, construtores e métodos normais como uma classe comum.
// ✔️ Implementar interfaces.

// ! ❌ Não pode:
// 🚫Ser instanciada diretamente (ou seja, não pode fazer new Pessoa() se Pessoa for abstrata).
// 🚫Ter métodos abstratos sem implementação sem que a classe também seja abstrata.
// 🚫Criar objetos diretamente da classe abstrata.


public abstract class Pessoa {
    
    protected int idade;
    private String timeFutebol;

    public Pessoa(int idade, String time) {
        this.idade = idade;
        this.timeFutebol = time;
    }

    // Assinatura de método abstract sem implementação;
    public abstract void respirar();

    // Não pode ter método abstract com implementação;
    //// public abstract void comer() {
    ////     System.out.println("Comendo.");
    //// }

    // Método comum (concretos) com implementação
    public void dormir() {  
        System.out.println("Dormindo");
    }

    // Classe normal com retorno da propriedade;
    public String getTimeFutebol() {
        return this.timeFutebol;
    }

}
