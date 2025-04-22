package Arrays_Vetores;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArraysEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ! Crie um programa que leia 10 números e exiba a soma.
        int[] numeros = {45, 3, 18, 14, 5, 7, 0, 1, 4, 100};
        System.out.println(Arrays.toString(numeros));
        somaArray(numeros);
        // ! Implemente um programa que leia 15 números e exiba apenas os números pares.
        numerosParesArray();
        // ! Crie um programa que leia 10 números e exiba-os em ordem crescente e decrescente.
        ordemCrescente(numeros);
        ordemDecrescente(numeros);
        // ! Escreva um programa que leia uma lista de nomes e permita buscar um nome específico na lista.
        buscarNomes(sc);

    }

    public static void somaArray(int[] numeros) {
        int soma = Arrays.stream(numeros).sum();
        System.out.println("Soma dos números do Array: " + soma);       
    }

    public static void numerosParesArray() {
        int[] numbers = {2, 5, 7, 15, 4, 2, 8, 11, 12, 21, 25, 17, 55, 101, 88};
        ArrayList<Integer> pares = new ArrayList<>();

        for(int n : numbers) {
            if(n % 2 == 0) {
                pares.add(n);
            }
        }
        System.out.println("Números aleatorios => " + Arrays.toString(numbers) + " => Números pares => " + pares);
    }

    public static void ordemCrescente(int[] numeros) {
        int[] crescente = Arrays.copyOf(numeros, numeros.length);
        Arrays.sort(crescente);
        System.out.println("Ordem Crescente => " + Arrays.toString(crescente));
    }

    public static void ordemDecrescente(int[] numeros) {
        int[] decres = Arrays.copyOf(numeros, numeros.length);
        Integer[] decrescente = Arrays.stream(decres).boxed().toArray(Integer[]::new);
        Arrays.sort(decrescente, Collections.reverseOrder());
        System.out.println("Ordem Decrescente => " + Arrays.toString(decrescente));
    }

   public static void buscarNomes(Scanner sc) {
        ArrayList<String> listaNomes = new ArrayList<>(Arrays.asList("naruto", "kakashi", "nagato", "itachi"));
        System.out.println("Digite o nome que deseja buscar na lista: ");
        String name = sc.nextLine().toLowerCase();

        if(listaNomes.contains(name)) {
            System.out.println("Nome cadastrado no sistema.");
        } else {
            System.out.println("Nome não cadastrado no sistema.");
        }                                                                                               
   }
}
