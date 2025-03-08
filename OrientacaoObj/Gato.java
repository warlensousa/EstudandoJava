package OrientacaoObj;

// Implementei a interface Animal;

public class Gato implements Animal {
    
    protected String nome;

    public Gato(String nome) {
        this.nome = nome;
    }

    // Sobrescrevi o método fazerSom() da Interface Animal;
    @Override 
    public void fazerSom() {
        System.out.println(this.nome + ": Miau Miau Miau..");
    }


}
