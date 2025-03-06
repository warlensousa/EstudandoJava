package LaçosDeRepetição;

public class LacosRepeticao {
    public static void main(String[] args) {
        
        // ! Laços de Repetição => Os laços de repetição (ou loops) são estruturas fundamentais na programação, permitindo executar um bloco de código múltiplas vezes com base em uma condição;

        // !  ✔   QUANDO USAR:
        // ✔ Quando precisar repetir um bloco de código várias vezes.
        // ✔ Quando for percorrer arrays, listas e coleções.
        // ✔ Quando precisar aguardar uma condição ser verdadeira (while).
        // ✔ Quando precisar garantir ao menos uma execução (do-while).

        // !  ❌  QUANDO EVITAR: 
        // 🚫 Loops infinitos sem necessidade (while (true) {} pode travar o programa).
        // 🚫 Quando há formas mais eficientes (exemplo: usar Stream API em coleções).
        // 🚫 Quando há risco de OutOfMemoryError (como adicionar elementos sem parar).
        // 🚫 Não alterar a coleção dentro do for-each – Use Iterator ou ListIterator.
        // 🚫 Usar a estrutura mais adequada – Não use for onde while ou for-each seria melhor.
        // 🚫 Evitar complexidade desnecessária – Loops aninhados aumentam o custo computacional.

        // !   ▶︎ CONCLUSÃO:
        // 🍀 O for é ótimo para loops com contador.
        // 🍀 O while é ideal para repetições baseadas em condição.
        // 🍀 O do-while garante que o código rode pelo menos uma vez.
        // 🍀 O for-each facilita a iteração sobre coleções.
        // 🍀 break e continue ajudam no controle do fluxo do loop.



        // break – Interrompe o Loop
        // continue – Pula uma Iteração (Ignora o códico abaixo e volta para o começo)


        // ! 1. For => O loop 'for' é ideal quando sabemos exatamente quantas vezes queremos executar um bloco de código.

        // Exemplo conta  1 até 10;
        for(int i = 1; i <= 10; i++) {
            System.out.println("n: " + i);
        }

        // Inicialização (int i = 1) → Define a variável do loop.
        // Condição (i <= 10) → Enquanto for verdadeira, o bloco será executado.
        // Incremento (i++) → Atualiza a variável a cada iteração


        // ! 2. O while é usado quando não sabemos exatamente quantas vezes um código precisa ser executado

        int contagem = 15; // fingir que não sabemos que número é esse;
        int n = 0;

        while (true) {
            if(n == contagem) {
                System.out.println("Contou até esse número;");
                break;
            }
            n++;
            System.out.println(n);
        }


        // Contar de 5 até 0 decrescente;
        int j = 5;
        while (j >= 0) {  // enquanto j for maior ou igual a 0 ele vai continuar;
            System.out.println(j);
            j--;  // decremento -1 a cada loop;
        }

        // Avalia a condição antes da execução.
        // Se a condição for true, o bloco de código executa.
        // Se for false, o loop termina


        // ! 3. A diferença entre do-while e while é que do-while sempre executa ao menos uma vez, pois a verificação da condição ocorre no final.
        int w = 1;  // Se w já começasse com 6, no while o bloco não rodaria, mas no do-while, seria executado pelo menos uma vez.
        do {
            System.out.println("Número: " + w);
            w++;
        } while (w <= 5);


        // ! 4. for-each => Para interar coleções (Arrays, List, Set, Map etc...)
        // Array de Strings;
        String[] animes = {"Pokémon", "Naruto", "Dragon ball", "Cavaleiros do Zodiaco"};
        for(String anime : animes) {  // tipo, item da array, array;
            System.out.println(anime);
        }

        // Não da acesso ao index do elemento;



    }
}
