package lista1.ex1;
import java.util.ArrayList;
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Boolean done = false;
        ArrayList<perro> perros = new ArrayList<perro>();
        ArrayList<caballo> caballos = new ArrayList<caballo>();
        ArrayList<perezoso> perezosos = new ArrayList<perezoso>();

        while(!done) {
            System.out.println("\n-- Ingresar Animal --");
            System.out.println("\n-----------------------");
            System.out.println("\n1 - Perro");
            System.out.println("\n2 - Caballo");
            System.out.println("\n2 - Perezoso");
            System.out.println("\n0 - Salir y listar animales");

            input = new Scanner(System.in);
            int resultado = input.nextInt();

            switch (resultado) {

                case 1:
                    perro perro = new perro();

                    System.out.print("Nombre: ");
                    input = new Scanner(System.in);
                    perro.setNombre(input.nextLine());

                    System.out.print("Edad: ");
                    input = new Scanner(System.in);
                    perro.setEdad(input.nextInt());

                    System.out.print("Sonido: ");
                    input = new Scanner(System.in);
                    perro.setSonido(input.nextLine());

                    System.out.print("Corre: ");
                    input = new Scanner(System.in);
                    perro.setCorrer(input.nextLine());
                    
                    perros.add(perro);
                    break;

                case 2:
                    caballo caballo = new caballo();

                    System.out.print("Nombre: ");
                    input = new Scanner(System.in);
                    caballo.setNombre(input.nextLine());

                    System.out.print("Edad: ");
                    input = new Scanner(System.in);
                    caballo.setEdad(input.nextInt());

                    System.out.print("Sonido: ");
                    input = new Scanner(System.in);
                    caballo.setSonido(input.nextLine());

                    System.out.print("Corre: ");
                    input = new Scanner(System.in);
                    caballo.setCorrer(input.nextLine());
                    
                    caballos.add(caballo);
                    break;

                case 3:
                    perezoso perezoso = new perezoso();

                    System.out.print("Nombre: ");
                    input = new Scanner(System.in);
                    perezoso.setNombre(input.nextLine());

                    System.out.print("Edad: ");
                    input = new Scanner(System.in);
                    perezoso.setEdad(input.nextInt());

                    System.out.print("Sonido: ");
                    input = new Scanner(System.in);
                    perezoso.setSonido(input.nextLine());

                    System.out.print("Corre: ");
                    input = new Scanner(System.in);
                    perezoso.setSubir(input.nextLine());
                    
                    perezosos.add(perezoso);
                    break;

                case 0:
                    done = true;
                    break;

                default: 
                    System.out.print("\nValor incorrecto.");
                    break;

            }

        }

        System.out.println("\nPerros:");
        System.out.println("-----------------");
        for(perro p : perros) {
            System.out.println("Nombre: " + p.getNombre() + " | Edad: " + p.getEdad() + " | Sonido: " + p.getSonido() + " | Corre: " + p.getCorrer());
        }

        System.out.println("\nCaballos:");
        System.out.println("-----------------");
        for(caballo c : caballos) {
            System.out.println("Nombre: " + c.getNombre() + " | Edad: " + c.getEdad() + " | Sonido: " + c.getSonido() + " | Corre: " + c.getCorrer());
        }

        System.out.println("\nPerezosos:");
        System.out.println("-----------------");
        for(perezoso pe : perezosos) {
            System.out.println("Nombre: " + pe.getNombre() + " | Edad: " + pe.getEdad() + " | Sonido: " + pe.getSonido() + " | Sube: " + pe.getSubir());
        }

    }
    
}
