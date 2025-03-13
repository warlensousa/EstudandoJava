package Condicionais;
import java.util.Scanner;

public class switchEx {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // ! Implemente um sistema de menu que permita ao usuário escolher entre diferentes operações matemáticas (adição, subtração, multiplicação, divisão) e execute a operação escolhida.
            menu(sc);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public static void menu(Scanner sc)  {
        System.out.println("== ESCOLHA UMAS DA OPERAÇÕES ==");
        System.out.println();
        System.out.println("ADIÇÃO => 1");
        System.out.println("SUBTRAÇÃO => 2");
        System.out.println("MULTIPLICAÇÃO => 3");
        System.out.println("DIVISÃO => 4");
        int operacao = sc.nextInt();

        System.out.println("Digite um número: ");
        int n1 = sc.nextInt();
        System.out.println("Digite outro número: ");
        int n2 = sc.nextInt();
        sc.nextLine();

        switch (operacao) {
            case 1:
                System.out.println(n1 + n2); 
                break;
            case 2:
                System.out.println(n1 - n2); 
                break;
            case 3:
                System.out.println(n1 * n2); 
                break;
            case 4:
                System.out.println(n1 / n2); 
                break;
            default:
                System.out.println("Por favor, escolha um operação existente.");
           break;           
        }

    }
}
