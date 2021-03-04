package aula2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ex1 {

    public static void main (String[] args) {

        sueldo sueldo = new sueldo();
        Scanner input = new Scanner(System.in);
        
        while(true) {
            try {
                System.out.print("Sueldo bruto: ");
                input = new Scanner(System.in);
                sueldo.setSueldoBruto(input.nextInt()) ;
                break;
            } catch (InputMismatchException e) {
                System.out.print("Formato erroneo, intente nuevamente.");
            }
        }

        input.close();

        if(sueldo.getSueldoBruto() <= 1000) {
            sueldo.setImpuesto(0);
        } else if (sueldo.getSueldoBruto() > 1000 && sueldo.getSueldoBruto() <= 2000){
            sueldo.setImpuesto((int) (sueldo.getSueldoBruto() * 0.05));
        } else if (sueldo.getSueldoBruto() > 2000 && sueldo.getSueldoBruto() <= 3000){
            sueldo.setImpuesto((int) (sueldo.getSueldoBruto() * 0.1));
        } else if (sueldo.getSueldoBruto() > 3000) {
            sueldo.setImpuesto((int) (sueldo.getSueldoBruto() * 0.15));
        }

        sueldo.setSueldoLiquido(sueldo.getSueldoBruto()-sueldo.getImpuesto());

        System.out.println("Valor del impuesto: " + sueldo.getImpuesto());
        System.out.println("Sueldo líquido: " + (sueldo.getSueldoLiquido()));

    }
    
}