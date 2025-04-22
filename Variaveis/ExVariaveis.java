
import java.util.ArrayList;
import java.util.Scanner;

public class ExVariaveis {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // ! 1. Crie um programa que leia o nome, idade e salário de um funcionário e exiba essas informações formatadas.
            adicionarInfo(sc);
            // ! 2. Implemente um sistema de cadastro de produtos que armazene o nome, preço e quantidade em estoque. Permita a atualização e exibição dos dados.
            ArrayList<ArrayList<Object>> produtos = new ArrayList<>();
            cadastroProdutos(sc, produtos);

        } catch (Exception e) {
            System.out.println("Erro" + e.getMessage());
        }
        
    }

    public static void adicionarInfo(Scanner sc) {
        String nome = "";
        int idade = 0;
        double salario = 0;
        
        System.out.println("Digite seu nome: ");
        if(sc.hasNextLine()) {
            nome = sc.nextLine();  // fiz direto, mas tem forma melhor para tratar os erros;
        } else {
            System.out.println("Digite um valor válido.");
        }
        
        System.out.println("Insira sua idade: ");
        if(sc.hasNextInt()) {
            int idade_user = sc.nextInt();
            if(idade_user >= 18) {
                idade = idade_user;
            } else {
                System.out.println("Idade não pode ser menor que 18 anos.");
            }
        } else {
            System.out.println("Insira um valor válido.");
        }
        sc.nextLine();
        
        System.out.println("Digite o seu salário: ");
        String salario_user = sc.nextLine().trim();
        if(!salario_user.isEmpty()) {
            double salario_double = Double.parseDouble(salario_user);
            salario = salario_double;
        } else {
            System.out.println("Entrada vazia! Por favor, digite um valor.");
        }

        System.out.println("INFORMAÇÕES USUARIO => Nome: " + nome + " | Idade: " + idade + " | Salário: " + salario);
    }

    private static void cadastroProdutos(Scanner sc, ArrayList produtos) {
        for(int i = 0; i < 3; i++) {
            produtos.add(new ArrayList<>());
        }
    }
}
