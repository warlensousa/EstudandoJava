package Condicionais;
import java.util.Scanner;

public class if_elseEx {
    private static String nome;
    private static String senha;

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
           // ! 1. Implemente um sistema de login que valide o nome de usuário e senha, permitindo três tentativas antes de bloquear o acesso.
            cadastroDeLogin(sc);
            logarNoServidor(sc);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void cadastroDeLogin(Scanner sc) {
        while (true) {
            System.out.println("Digite um nome para seu usúario: ");
            String name = sc.nextLine().trim();
            if(!name.isEmpty() && name.matches("^[a-zA-Z]+$")) {
                nome = name;
                 break;
            } else {
                System.out.println("Digite um nome de usúario válido.");
                System.out.println();
            }
        }

        while (true) {
            System.out.println("Digite uma senha de login: ");
            String password = sc.nextLine().trim();
            if(!password.isEmpty() && password.length() > 6 && password.length() < 11 ) {
                senha = password;
                break;
            } else {
                System.out.println("A senha não pode ser vazia, menor que 6 e maior que 10!");
            }           
        }            
    }

    public static void logarNoServidor(Scanner sc) {
        for(int i = 1; i <= 3; i++) {
            System.out.println("Usuario: ");
            String login = sc.nextLine().trim();
            System.out.println("Senha: ");
            String password = sc.nextLine().trim();
            if(login.equalsIgnoreCase(nome) && password.equalsIgnoreCase(senha) && !login.isEmpty() && !password.isEmpty()) {
                System.out.println("Login efetuado com sucesso.");
                System.out.println("== BEM VINDO AO SERVIDOR ==");
                break;
            } else {
                System.out.println("Login e senha incorretos");
           }
       }
    }
}
