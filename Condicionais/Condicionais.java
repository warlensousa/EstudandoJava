package Condicionais;


public class Condicionais {
    public static void main(String[] args) {
        
        // ! CONDICIONAIS => são usados para executar diferentes blocos de código com base em certas condições. 
        // Tipos de condicionais: If, if-else, if-else-if, switch, operador ternário etc... (outras ainda ta em processo de estudo);

        // ! 1. if => executa bloco de códico se a condição for verdadeira;
        int idade = 18;
        if(idade >= 18) {
            System.out.println("1: Maior de Idade!");
        }

        // ! 2. if-else => executa um bloco de código se a condição for verdadeira, caso contrário, executa outro bloco de código.
        // Pode se tornar difícil de ler com muitas condições encadeadas (use o switch);
        String nome = "Warlen"; 
        String nome2 = "Lucas";
        if(nome.equalsIgnoreCase(nome2)) {
            System.out.println("2: " + nome +  " é igual a " + nome2 + ". Ambas variaveis possuem valores iguais.");
        } else {
            System.out.println("2: Ambas as variavéis possuem valores diferentes;");
        }

        // 3. O bloco if-else-if permite testar múltiplas condições.
        String palavra = "Naruto";

        if(palavra.length() == 5) {
            System.out.println("3: " + palavra + " tem 5 caracteres.");
        } else if (palavra.length() == 6){
            System.out.println("3: " + palavra + " tem 6 caracteres.");
        } else {
            System.out.println("3: " + palavra + " não tem 5 ou 6 caracteres! Ela tem " + palavra.length() + " caracteres.");
        }
       
        // ! 4. switch => O bloco switch é usado para selecionar um dos muitos blocos de código a serem executados.
        // break => evita para parar codico na condição;
        // Não pode usar switch com tipos de dados long, float, double e boolean.
        // Não aceita tipos complexos (objetos, coleções, expressões booleanas)
        // Não pode usar boolean (true ou false) ou double/float diretamente.
        String diaSemana = "Quarta";

        switch (diaSemana) {
            case "Segunda":
                System.out.println("Ir ao mercado");
                break;
            case "Terça":
            System.out.println("Jogar futebol");
                break;
            case "Quarta":
                System.out.println("Ir para o curso");
                break;
            case "Quinta":
                System.out.println("Fazer a janta");
                break;
            case "Sexta":
                System.out.println("Ver um filme no cinema");
            case "Sabado":
            case "Domingo":
                System.out.println("Final de semana. Dia de descansar!");
                break;
            default:
                System.out.println("Valor inválido");
                break;
        }


        // 5. Operador ternário => forma simples de usar if-else;
        int numero = 12;
        String resultado = numero > 10 && numero < 15 ? "5: (True) Sim, ele é maior que 10 e menor que 15" : " (False) Não, ele nao é maior que 10, porém é menor que 15";
        System.out.println(resultado);
        
        // ! 6. Operadores lógicos:
        // && => (e) ou seja, precisar ser verdadeiro as duas condições para da verdeiro (True && True = True);
        // || => (ou) precisa que apenas uma das condições seja verdadeira para da verdeiro (True || false = True);
        //. ! => negação; ou seja, se for verdadeiro ele vai virar false (!True = false);



        // ! QUANDO USAR E QUAL A MELHOR OPÇÃO;

        // !Situação	                                Melhor Escolha
        // Comparações simples   =>	                    ✔ if-else
        // Muitas condições fixas  =>	                ✔ switch
        // Apenas 2 opções (simples)  =>	            ✔ Operador ternário ? :
        // Comparações booleanas  =>	                ✔ if-else
        // Expressões encadeadas difíceis de ler  =>	✔ switch ou EnumMap
        // Trabalhando com enums   =>	                ✔ EnumMap ao invés de switch
        // Lidando com valores opcionais  =>            ✔ Optional ao invés de if-null
        // Filtragem em listas   =>                     ✔ Stream API ao invés de if


    }
}
