package preparatorios;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ex1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nome, descricao;
        Float custo;
        int estoque, quant, opcao = 0;

        System.out.println("------------------------------");
        while (true) {
            try {
                System.out.print("\nIngresse o nome do produto: ");
                input = new Scanner(System.in);
                //bebida.setNome(input.nextLine());
                nome = input.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.print("Formato errado, tente novamente.");
            }
        }

        while (true) {
            try {
                System.out.print("\nIngresse o custo do produto: ");
                input = new Scanner(System.in);
                //bebida.setCusto(input.nextFloat());
                custo = input.nextFloat();
                break;
            } catch (InputMismatchException e) {
                System.out.print("Formato errado, tente novamente.");
            }
        }
        
        while (true) {
            try {
                System.out.print("\nIngresse o descriçao do produto: ");
                input = new Scanner(System.in);
                //bebida.setDescricao(input.nextLine());
                descricao = input.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.print("Formato errado, tente novamente.");
            }
        }
        
        while (true) {
            try {
                System.out.print("\nIngresse o estoque do produto: ");
                input = new Scanner(System.in);
                //bebida.setEstoque(input.nextInt());
                estoque = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.print("Formato errado, tente novamente.");
            }
        }

        new bebida(nome, custo, descricao, estoque);

        bebida.mostrar();

        while (true) {
            try {
                System.out.println("\nRetirar ou Adicionar no estoque?");
                System.out.println("1 - Adicionar");
                System.out.println("2 - Retirar");
                System.out.println("0 - Fechar");
                input = new Scanner(System.in);
                opcao = input.nextInt();

                switch (opcao) {

                    case 1:
                        while (true) {
                            try {
                                System.out.print("\nQuantidade a Adicionar: ");
                                input = new Scanner(System.in);
                                quant = input.nextInt();
                                System.out.println(bebida.adicionar(quant));
                                break;
                            } catch (InputMismatchException e) {
                                System.out.print("Formato errado, tente novamente.");
                            }
                        }
                        break;
        
                    case 2:
                        while (true) {
                            try {
                                System.out.print("\nQuantidade a Retirar: ");
                                input = new Scanner(System.in);
                                quant = input.nextInt();
                                System.out.println(bebida.retirar(quant));
                                break;
                            } catch (InputMismatchException e) {
                                System.out.print("Formato errado, tente novamente.");
                            }
                        }
                        break;
        
                    case 0:
                        System.out.print("Finalizando processo...");
                        System.exit(0);
                        break;
        
                    default:
                        System.out.print("Formato errado, tente novamente.");
                        break;
                }
                
            } catch (InputMismatchException e) {
                System.out.print("Formato errado, tente novamente.");
            }
        }

    }
}
