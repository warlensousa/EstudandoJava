package Exercicios;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Loops {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // ! 1. Crie um programa que leia 10 números e exiba a soma deles usando um loop for.
            int soma = somaNumerosFor(sc);
            System.out.println(soma);
            // ! 2. Desenvolva um programa que leia uma lista de nomes e exiba cada nome em uma nova linha usando um loop for-each.
            List<String> listaNomes = new ArrayList<>();
            listaNomes(sc, listaNomes);
            // ! 3. Escreva um programa que leia números do usuário até que ele digite zero, exibindo a soma dos números lidos usando um loop while
            int somaUsuario = somaNum(sc);
            System.out.println("Total: " + somaUsuario);
            // ! 4. Implemente um programa que leia uma lista de números e exiba apenas os números pares usando um loop for-each.
            List<Integer> listaNumeros = new ArrayList<>();
            adicionarElementList(sc, listaNumeros);
            System.out.println("Lista com números aleatórios do usuário => " + listaNumeros);
            // Números pares;
            listAtualizadaPares(listaNumeros);
            // ! 5. Crie um programa que leia uma lista de números e exiba-os em ordem inversa usando um loop for.
            List<Integer> listaNumerosInversa = new ArrayList<>(listaNumeros);
            listaInversa(listaNumerosInversa);
            System.out.println("Lista Original => " + listaNumeros);
            System.out.println("Lista copiada e inversa => " + listaNumerosInversa );   
            
        } catch (Exception e) {
            System.out.println("Erro de dados!");
        }
    }

    public static int somaNumerosFor(Scanner sc) {
        int soma = 0;
        for(int i = 1; i <= 10; i++) {
            System.out.println("Digite um número: ");
            if(sc.hasNextInt()) {
                int numero = sc.nextInt();
                soma += numero;
            } else {
                System.out.println("Digite um valor válido;");
                sc.next();  // limpar e evitar loop infinito;
                i--;
            }
        }
        return soma;
    }

    public static void listaNomes(Scanner sc, List<String> lista) {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Digite um nome: ");
            if(sc.hasNextLine()) {
                String nome = sc.nextLine();
                if (!nome.isEmpty() && !nome.trim().isEmpty()) {
                    lista.add(nome);
                } else {
                    System.out.println("Por favor, digite um valor!");
                    i--;
                }
            } else {
                System.out.println("Digite um valor válido");
                i--;
            }
        }

        System.out.println("== LISTA DE NOMES ==");
        for(String nome : lista) {
            System.out.println("Nome:" + nome);
        }    
    }

    public static int somaNum(Scanner sc) {
        int soma = 0;
        while (true) {
            System.out.println("Digite o número: ");
            if(sc.hasNextInt()) {
                int usuario = sc.nextInt();
                if (usuario == 0) {
                    break;
                }
                soma += usuario;
            } else {
                System.out.println("Valor inválido!");
                sc.next();
            }
        }
        return soma;
    }

    public static List<Integer> adicionarElementList(Scanner sc, List<Integer> listaNumeros) {
        for(int i = 1; i <= 7; i++) {
            System.out.println("Digite um numero: ");
            if(sc.hasNextInt()) {
                int numero = sc.nextInt();
                listaNumeros.add(numero);
            } else {
                System.out.println("Digite um valor válido!");
                sc.next();
                i--;
            }
        }
        return listaNumeros;
    }

    public static void listAtualizadaPares(List<Integer> listaNumeros) {
        System.out.println("=== Números pares da lista ===");
        for(int numero : listaNumeros) {
            if(numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }

    public static List<Integer> listaInversa(List<Integer> listaNumeros) {
        Collections.reverse(listaNumeros);
        return listaNumeros;
    }
}
