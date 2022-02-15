package avaliacao1;
import java.util.Scanner;

public class avaliacao {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nome, habilitacao;
        int pontos;

        System.out.print("Ingresse o nome do Condutor: ");
        input = new Scanner(System.in);
        nome = input.nextLine();
        
        System.out.print("Ingresse o tipo de habilitaçao: ");
        input = new Scanner(System.in);
        habilitacao = input.nextLine();

        new Condutor(nome, habilitacao);

        System.out.print(Condutor.verificaPontuacao());

        System.out.print("\nIngresse os pontos da nova multa: ");
        input = new Scanner(System.in);
        pontos = input.nextInt();

        Condutor.aplicaPontuacao(pontos);
        System.out.print(Condutor.verificaPontuacao());

    }
    
}
