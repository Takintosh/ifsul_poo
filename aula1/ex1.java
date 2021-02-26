package aula1;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex1 {

    private static final String regex = "^(.+)@(.+)$";
    public static String nome, telefone, email = "";
    public static Boolean done = false;
    
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        input = new Scanner(System.in);
        Pattern pattern = Pattern.compile(regex);

        System.out.print("\nNome: ");
        String nome = input.nextLine();

        while (!done) {
            System.out.print("\nEmail: ");
            input = new Scanner(System.in);
            email = input.nextLine();
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                done = true;
            } else {
                System.out.print("\nFormato incorreto, tente novamente. ");
            }
        }

        System.out.print("\nTelefone: ");
        input = new Scanner(System.in);
        String telefone = input.nextLine();

        exibir(nome, email, telefone);

    }

    public static void exibir(String nome, String email, String telefone) {
        System.out.println("\n------------------------------");
        System.out.println("Dados do Usuario: ");
        System.out.println("------------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("------------------------------");
        System.out.println("\nFinalizando...");
    }
}
