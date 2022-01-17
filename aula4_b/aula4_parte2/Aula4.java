package aula4_b.aula4_parte2;
import java.util.Scanner;

public class Aula4 {

    public static void main(String[] args) {

        boolean done = false;
        Scanner input = new Scanner(System.in);

        Pessoa p = new Pessoa();
        p.setNome("Fulano de Tal");
        p.setNroConta(666);

        Conta c = new Conta();
        c.setNroConta(666);
        c.setTipoConta("Corriente");
        c.setSaldo(10000);

        System.out.println("Control de Cuenta");
        System.out.println("Usuario: " + p.getNome());
        System.out.println("Nº de Cuenta: " + c.getNroConta() + ". Tipo de Cuenta: " + c.getTipoConta());
        System.out.println("Saldo Actual: " + c.getSaldo());
        System.out.println("--------------------------------");

        while (!done) {
            System.out.println("1 - Depositar saldo.");
            System.out.println("2 - Retirar Saldo.");
            System.out.println("0 - Cerrar proceso.");
 
            input = new Scanner(System.in);
            int resultado = input.nextInt();

            switch (resultado) {
                case 1:
                    System.out.println("Saldo a depositar: ");
                    input = new Scanner(System.in);
                    c.depositar(input.nextFloat());
                    break;

                case 2:
                    System.out.println("Saldo a retirar: ");
                    input = new Scanner(System.in);
                    c.retirar(input.nextFloat());
                    break;
                case 0:
                    System.out.println("Cerrando proceso...");
                    done = true;
                    break;
                
                default:
                    System.out.println("Valor incorrecto, intente nuevamente");
                    break;
            }

        }

    }
    
}
