package aula2_b;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aula2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("\n\n------------ Menu ------------");
            System.out.print("\n--------------------------------");
            System.out.print("\nQual classe deseja testar?");
            System.out.print("\n1 - Pessoa");
            System.out.print("\n2 - Cachorro");
            System.out.print("\n3 - ContaBancaria");
            System.out.print("\n0 - Encerrar");
            System.out.print("\n--------------------------------");

            Boolean done = false;
            int opcao = 0;

            while (!done) {
                try {
                    System.out.print("\nOpçao: ");
                    input = new Scanner(System.in);
                    opcao = input.nextInt();
                    done = true;
                } catch (InputMismatchException e) {
                    System.out.print("Formato errado, tente novamente.");
                }
            }

            switch (opcao) {
                case 1:
                    Pessoa p = new Pessoa();

                    // Inserir nome
                    System.out.print("\nEscreva nome: ");
                    input = new Scanner(System.in);
                    p.setNome(input.nextLine());

                    // Inserir idade
                    System.out.print("\nEscreva idade: ");
                    input = new Scanner(System.in);
                    p.setIdade(input.nextInt());

                    // Inserir quantVida
                    System.out.print("\nEscreva quantVida: ");
                    input = new Scanner(System.in);
                    p.setQuantVida(input.nextInt());

                    // Inserir habilidadeParaAtirar
                    System.out.print("\nEscreva habilidadeParaAtirar: ");
                    input = new Scanner(System.in);
                    p.setHabilidadeParaAtirar(input.nextInt());

                    // Retornar dados
                    System.out.print("\nDados da Pessoa:");
                    System.out.print("\n--------------------------------");
                    System.out.print("\nnome: " + p.getNome());
                    System.out.print("\nidade: " + p.getIdade());
                    System.out.print("\nquantVida: " + p.getQuantVida());
                    System.out.print("\nhabilidadeParaAtirar: " + p.getHabilidadeParaAtirar());
                    System.out.print("\n--------------------------------");

                    break;

                case 2:
                    Cachorro c = new Cachorro();

                    // Inserir nome
                    System.out.print("\nEscreva nome: ");
                    input = new Scanner(System.in);
                    c.setNome(input.nextLine());
                    
                    // Inserir corDoPelo
                    System.out.print("\nEscreva corDoPelo: ");
                    input = new Scanner(System.in);
                    c.setCorDoPelo(input.nextLine());

                    // Inserir idade
                    System.out.print("\nEscreva idade: ");
                    input = new Scanner(System.in);
                    c.setIdade(input.nextInt());

                    // Inserir quantVida
                    System.out.print("\nEscreva quantVida: ");
                    input = new Scanner(System.in);
                    c.setQuantVida(input.nextInt());

                    // Inserir forcaDaMordida
                    System.out.print("\nEscreva habilidadeParaAtirar: ");
                    input = new Scanner(System.in);
                    c.setForcaDaMordida(input.nextInt());

                    // Retornar dados
                    System.out.print("\nDados do Cachorro:");
                    System.out.print("\n--------------------------------");
                    System.out.print("\nnome: " + c.getNome());
                    System.out.print("\nidade: " + c.getCorDoPelo());
                    System.out.print("\nidade: " + c.getIdade());
                    System.out.print("\nquantVida: " + c.getQuantVida());
                    System.out.print("\nhabilidadeParaAtirar: " + c.getForcaDaMordida());
                    System.out.print("\n--------------------------------");

                    break;
                    
                case 3:
                    ContaBancaria cb = new ContaBancaria();

                    // Inserir nroConta
                    System.out.print("\nEscreva nroConta: ");
                    input = new Scanner(System.in);
                    cb.setNroConta(input.nextInt());

                    // Inserir saldo
                    System.out.print("\nEscreva saldo: ");
                    input = new Scanner(System.in);
                    cb.setSaldo(input.nextFloat());

                    // Inserir tipoConta
                    System.out.print("\nEscreva tipoConta: ");
                    input = new Scanner(System.in);
                    cb.setTipoConta(input.nextLine());

                    // Retornar dados
                    System.out.print("\nDados da ContaBancaria:");
                    System.out.print("\n--------------------------------");
                    System.out.print("\nnroConta: " + cb.getNroConta());
                    System.out.print("\nsaldo: " + cb.getSaldo());
                    System.out.print("\ntipoConta: " + cb.getTipoConta());
                    System.out.print("\n--------------------------------");

                    break;

                case 0:
                    System.out.print("\nEncerrando o programa...\n\n");
                    System.exit(0);
                    break;

                default:
                    System.out.print("\nOpçao errada, selecione outra opçao.\n");
                    break;
            }

        }

    }

}