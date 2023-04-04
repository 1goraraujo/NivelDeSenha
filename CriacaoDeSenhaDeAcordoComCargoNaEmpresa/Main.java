import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        teclado
        Scanner teclado = new Scanner(System.in);
//        variaveis
        String login, senha;
        int estrategico, tatico, operacional;


        System.out.println("DIGITE SEU NIVEL NA EMPRESA");
        System.out.println("1 PARA ESTRATEGICO");
        System.out.println("2 PARA TATICO");
        System.out.println("3 PARA OPERACIONAL");


        int opcoes = teclado.nextInt();
        switch (opcoes) {
            case 1:
                System.out.println("Você é do nivel ESTRATÉGICO, usará um perfil de senha de alto nível");
                System.out.println("Crie um login e uma senha:");
                System.out.println("LOGIN:\n");
                login = teclado.next();
                System.out.println("SENHA:\n");
                senha = teclado.next();
                break;
            case 2:
                System.out.println("Você é do nível TÁTICO, usará um perfil de senha intermediário");
                System.out.println("Crie um login e uma senha:");
                System.out.println("LOGIN:\n");
                login = teclado.next();
                System.out.println("SENHA:\n");
                senha = teclado.next();
                break;
            case 3:
                System.out.println("Você é do nível OPERACIONAL, usará um perfil de senha baixo");
                System.out.println("Crie um login e uma senha:");
                System.out.println("LOGIN:\n");
                login = teclado.next();
                System.out.println("SENHA:\n");
                senha = teclado.next();
                break;
            default:
                System.out.println("OPCAO INVALIDA");
        }
        System.out.println("LOGIN CRIADO COM SUCESSO!");

    }

}
