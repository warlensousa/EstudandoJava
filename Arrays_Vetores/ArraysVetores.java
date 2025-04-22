package Arrays_Vetores;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class ArraysVetores {
    public static void main(String[] args) {
        
        // ! Arrays => Um array é uma estrutura de dados em Java que armazena múltiplos elementos do mesmo tipo em posições consecutivas de memória.

                // ! Características do Array;
        // ✅ Tamanho fixo: O tamanho do array deve ser definido na criação e não pode ser alterado.
        // ✅ Elementos homogêneos: Todos os elementos devem ser do mesmo tipo.
        // ✅ Acesso direto pelo índice: Permite acesso rápido aos elementos através de índices numéricos.


        // Declarações de Array;

        // Array vazia;
        String[] anime = new String[]{}; 

        // Um array de 5 posições, inicializado com 0
        int[] numerosInt = new int[5]; 
        System.out.println(Arrays.toString(numerosInt));

        // Array com valores predefinidos
        String[] nomes = {"Gabriel", "Kaique", "Kratos", "Isagi"};
        System.out.println(Arrays.toString(nomes));

        // Copiar um Array, podendo ajustar seu tamanho;
        String[] copiaArrayNomes = Arrays.copyOf(nomes, 6); // (Array que vai ser copiado, elementos que vai ser copiado) obs: se colocar mais elementos que o array que está sendo copiado tem... os que não tem no array original vai ter valor de 0 (int) ou null (String);
        System.out.println(Arrays.toString(copiaArrayNomes));


        // arrays.sort(array) => colocar em ordem crescente;
        // arrays.equals(array) => compara se os arrays são iguais em conteúdo e ordem;
        // Arrays.deepToString => imprimir arrays multidimencionais;


        // ! ArrayList => é uma classe da Java Collections Framework que implementa uma lista dinâmica, permitindo redimensionamento automático e diversas operações práticas.

                // ! Características do ArrayList;
        // ✅ Tamanho dinâmico: Expande e reduz conforme a necessidade.
        // ✅ Elementos homogêneos: Apenas um tipo de dado (usando Generics).
        // ✅ Permite elementos duplicados.
        // ✅ Usa índice para acesso rápido.
        // ✅ Mais flexível que arrays convencionais.

        // Declarando e Inicializando um ArrayList vazia;
        ArrayList<String> times = new ArrayList<>();  

        // Adicionar itens => times.add("Barcelona");
        // Acessando elementos através do index => times.get(0);
        // Modificando elementos através do index => times.set(0, "Real Madrid")
        // Removendo elementos atráveis do index ou nome do elemento => times.remove(0)
        
        // times.size(); // Retorna o tamanho da lista
        // times.contains("Barcelona"); // Verifica se "Ana" está na lista (true/false)
        // times("Barcelona"); // Retorna o índice de "Beatriz"
        // times.clear(); // Remove todos os elementos
        // times.isEmpty(); // Verifica se a lista está vazia (true/false)


        // ! Quando Usar Cada Um?
        // ✔ Use Arrays quando: O tamanho é fixo, a performance é crucial e não precisa de muitas operações de adição/remoção de elementos.

        // ✔ Use ArrayList quando: O tamanho pode variar e você precisa de métodos para manipulação dos dados facilmente.


        // ! List => A interface List faz parte do Java Collections Framework (JCF) e representa uma coleção ordenada de elementos;
        // ✅ Aceita elementos duplicados
        // ✅ Mantém a ordem de inserção
        // ✅ Permite acesso por índice

        // ! 📌 A List é uma interface, então não pode ser instanciada diretamente. Para utilizá-la, precisamos de uma classe concreta como ArrayList, LinkedList, Vector ou Stack.

        // ! 🔹 O ideal é declarar como List e instanciar com a implementação desejada, para facilitar futuras alterações.

        // Declaração de uma List
        List<String> pokemon = new ArrayList<>();
                
        // 📌 Use ArrayList para acesso rápido aos elementos.
        // 📌 Use LinkedList para inserções/remoções frequentes.
        // 📌 Use Vector para aplicações multithread.
        // 📌 Use Stack para estruturas de pilha (LIFO).




        


        
    }
}