package aula4;
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {

        System.out.println("\nQué tipo de lámpara desea construir?");
        System.out.println("\n1 - Fluorescente.");
        System.out.println("\n2 - Incandescente.");

        Scanner input = new Scanner(System.in);
        int resultado = input.nextInt();

        FabricaLampara fabrica = new FabricaLampara();

        switch(resultado) {
            case 1:
                Lampara fluorescente = fabrica.construir(true);
                fluorescente.encender();
                fluorescente.apagar();
                break;

            case 2:
                Lampara incandescente = fabrica.construir(false);
                incandescente.encender();
                incandescente.apagar();
                break;

            default: 
                System.out.print("\nValor incorrecto.");
                break;
        }

        input.close();

    }

    
}
