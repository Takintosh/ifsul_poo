package aula1;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ex2 {

    
    
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, opcion = 0;

        while (true) {

            System.out.println("\n------------------------------");
            System.out.println("Calculadora: ");
            System.out.println("------------------------------");
    
            while(true) {
                try {
                    System.out.print("Valor 1: ");
                    input = new Scanner(System.in);
                    n1 = input.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.print("Formato erroneo, intente nuevamente.");
                }
            }
    
            while(true) {
                try {
                    System.out.print("Valor 2: ");
                    input = new Scanner(System.in);
                    n2 = input.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.print("Formato erroneo, intente nuevamente.");
                }
            }
    
            System.out.println("1 - Adición");
            System.out.println("2 - Resta");
            System.out.println("3 - Multiplicación");
            System.out.println("4 - División");
    
            while(true) {
                try {
                    System.out.print("Opción del cálculo: ");
                    input = new Scanner(System.in);
                    opcion = input.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.print("Formato erroneo, intente nuevamente.");
                }
            }
    
            switch(opcion) {
                case 1:
                    adicion(n1, n2);
                    break;
                case 2:
                    resta(n1, n2);
                    break;
                case 3:
                    multiplicacion(n1, n2);
                    break;
                case 4:
                    division(n1, n2);
                    break;
                default:
                    System.out.print("Opción erronea, seleccione otra opción.");
                    break;
            }
        }
        
    }

    public static void adicion(int n1, int n2) {
        System.out.println("Operación: " + n1 + " + " + n2 + " = " + (n1+n2));
    }
    
    public static void resta(int n1, int n2) {
        System.out.println("Operación: " + n1 + " - " + n2 + " = " + (n1-n2));
    }
    
    public static void multiplicacion(int n1, int n2) {
        System.out.println("Operación: " + n1 + " x " + n2 + " = " + (n1*n2));
    }
    
    public static void division(int n1, int n2) {
        System.out.println("Operación: " + n1 + " ÷ " + n2 + " = " + (n1/n2));
    }
}
