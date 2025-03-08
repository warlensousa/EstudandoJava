package OrientacaoObj;

// Classe Warlen herdando  da super classe mãe Pessoa;
// Obrigado a sobrescrever (implementar) todos os métodos abstratos da classe-mãe Pessoa a não ser que Warlen também seja classe Abstract;

public class Warlen extends Pessoa {
    
    private String nome;
    protected double altura;

    public Warlen(String nome, double altura, int idade, String timeFutebol) {
        super(idade, timeFutebol); // ativar o construtor da classe mãe Pessoa;
        this.nome = nome;
        this.altura = altura;
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public void respirar() {
        System.out.println(this.nome + " está respirando");
    }

    public void exibirInfo() {
        System.out.println("Nome: " + this.nome + " | Altura: " + this.altura + " | Idade: " + idade + " | Time: " + getTimeFutebol()); // so posso usar dessa forma propriedade da classe mãe Pessoa se for (protected ou public) se for privada usar método (getIdade()) => tipo getTimeFutebol() to puxando propriedade privada da classe Pessoa;
    }


}
