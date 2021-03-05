package aula2;
import java.util.ArrayList;
import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Boolean done = false;
        ArrayList<vehiculo> vehiculos = new ArrayList<vehiculo>();

        while (!done) {
            vehiculo vehiculo = new vehiculo();

            System.out.println("\nIngresar Vehículo");
            System.out.println("\n-----------------");
            System.out.print("Placa del Vehículo (escriba \"Salir\" para finalizar): ");
            input = new Scanner(System.in);
            String placa = input.nextLine();
            
            if (placa.equals("Sair") || placa.equals("Salir") || placa.equals("sair") || placa.equals("salir")) {
                done = true;
            } else {
                vehiculo.setPlaca(placa);
                
                System.out.print("\nChasis: ");
                input = new Scanner(System.in);
                vehiculo.setChasis(input.nextLine());

                System.out.print("\nColor: ");
                input = new Scanner(System.in);
                vehiculo.setColor(input.nextLine());

                System.out.print("\nDefecto: ");
                input = new Scanner(System.in);
                vehiculo.setDefecto(input.nextLine());

                vehiculos.add(vehiculo);
            }
        }

        System.out.println("\nListado de Vehículos");
        System.out.println("--------------------");

        for (vehiculo v:vehiculos) {
            System.out.println("Placa: " + v.getPlaca() + " | Chasis: " + v.getChasis() + " | Color: " + v.getColor() + " | Defecto: " + v.getDefecto());
        }

    }
    
}
