package OrientacaoObj;

public class Main {
    public static void main(String[] args) {
        
        // ! Objeto construtor da classe Carro;
        Carro carro = new Carro("Fusca"); //  Uma instancia da Classe carro;

        // Troquei o valor da propriedade/variavel por meio do metodo setModelo(valor);
        carro.setModelo("Porshe");

        //  puxei a propriedade/variavel por meio do metodo getModelo();
        System.out.println(carro.getModelo());

        // Acessando metodos da classe Carro;
        carro.carroDoAno();
        carro.localizacao();
        // carro.acelerar();  metodo é privado so pode acessar na classe;
        carro.acessandoMetodoPrivadoAcelerar(); // joguei metodo acelerar em um metodo public;

        String frase = carro.localizacao(); // Coloquei o retorno da metodo localizacao da classe Carro em uma variavel;
        System.out.println("Variavels: " + frase);



        // ! Objeto construtor da classe Gato sendo instanciado;
        Gato gatinho = new Gato("Alfredo");

        // Chamando método default ta interface Animal sem precisar sobrescrever na classe;
        gatinho.dormir();

        // Para chamar o método static da interface Animal, basta chamá-lo diretamente pelo nome da interface, sem precisar criar uma instância.
        Animal.exibirMensagem(); 


        // Chamando método de assinatura da interface sobrescrito na classe Gato;
        gatinho.fazerSom();

        // Puxando propriedade da interface Animal;
        System.out.println(gatinho.nome1); 

        // Puxando a propriedade da classe Gato; Se fosse private so com metodo getNome()
        System.out.println(gatinho.nome);


        // ! Classe Abstract => Não pode ser instanciada!

        // se p Tipo fosse 'Pessoa' => Não iria poder chamar método que so tem na classe Warlen (warlen.exibirInfo()) para poder chamar teria que ta nas duas classes;
        Warlen warlen = new Warlen("Warlen", 1.79, 22, "Barcelona");

        warlen.respirar();
        warlen.dormir();
        warlen.exibirInfo();
 
        // chamei a propriedade classe Warlen pq ela é protected
        System.out.println(warlen.altura);
        // chamei a propriedade classe Warlen por método pq é private
        System.out.println(warlen.getNome());
        // chamei a propriedade classe mãe Pessoa pq ela é protected
        System.out.println(warlen.idade);
        // chamei a propriedade classe mãe Pessoa por método pq é private
        System.out.println(warlen.getTimeFutebol());



        // ! Interface / herança
        Barco barquinho = new Barco();
        barquinho.navegar(); // Método sobrescrito da interface 'Navegavel';
        barquinho.ancorar();// Método proprio Default da interface 'Navegavel';

        Aviao aviaozinho = new Aviao();
        aviaozinho.pilotar(); // Método sobrescrito da interface 'Pilotavel';
        Pilotavel.aterrissar();//  Método proprio Static da interface 'Pilotavel', mas chama com a classe;

        Hidroaviao hidroAviao = new Hidroaviao();
        hidroAviao.navegar(); //Método sobrescrito da interface 'Navegavel'; que a classe Mãe implementou;
        hidroAviao.ancorar(); // metodo de interface que foi implementada pela classe mãe Barco, entao posso usar quando herdo a classe Barco;


        // ! Classes com Final e métodos com Final;

        Computador pc = new Computador();
        pc.ligarled(); // Posso usar método da classe mãe com final, porém não posso sobrescrever ele na subclasse Computador;
        
        // Computador não pode herdar a classe Teclado porque ela é final;



       




    }
}
