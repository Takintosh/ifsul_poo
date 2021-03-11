package aula3;
import java.util.ArrayList;
import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Boolean done = false;
        ArrayList<cd> cds = new ArrayList<cd>();
        ArrayList<dvd> dvds = new ArrayList<dvd>();
        ArrayList<pendrive> pendrives = new ArrayList<pendrive>();

        while(!done) {
            System.out.println("\n-- Ingresar Media --");
            System.out.println("\n-----------------------");
            System.out.println("\n1 - CD");
            System.out.println("\n2 - DVD");
            System.out.println("\n3 - Pendrive");
            System.out.println("\n0 - Salir y listar");

            input = new Scanner(System.in);
            int resultado = input.nextInt();

            switch (resultado) {

                case 1:
                    cd cd = new cd();

                    System.out.print("Titulo: ");
                    input = new Scanner(System.in);
                    cd.setTitulo(input.nextLine());
                    
                    System.out.print("Artista: ");
                    input = new Scanner(System.in);
                    cd.setArtista(input.nextLine());
                    
                    System.out.print("Pistas: ");
                    input = new Scanner(System.in);
                    cd.setPistas(input.nextInt());
                    
                    System.out.print("Duración: ");
                    input = new Scanner(System.in);
                    cd.setDuracion(input.nextInt());
                    
                    System.out.print("Descripción: ");
                    input = new Scanner(System.in);
                    cd.setDescripcion(input.nextLine());

                    cds.add(cd);
                    break;

                case 2:
                    dvd dvd = new dvd();

                    System.out.print("Titulo: ");
                    input = new Scanner(System.in);
                    dvd.setTitulo(input.nextLine());

                    System.out.print("Director: ");
                    input = new Scanner(System.in);
                    dvd.setDirector(input.nextLine());
                                        
                    System.out.print("Duración: ");
                    input = new Scanner(System.in);
                    dvd.setDuracion(input.nextInt());

                    System.out.print("Clasificación: ");
                    input = new Scanner(System.in);
                    dvd.setClasificacion(input.nextLine());
                    
                    System.out.print("Estudio: ");
                    input = new Scanner(System.in);
                    dvd.setEstudio(input.nextLine());

                    dvds.add(dvd);
                    break;

                case 3:
                    pendrive pendrive = new pendrive();

                    System.out.print("Titulo: ");
                    input = new Scanner(System.in);
                    pendrive.setTitulo(input.nextLine());

                    System.out.print("Capacidad: ");
                    input = new Scanner(System.in);
                    pendrive.setCapacidad(input.nextInt());

                    System.out.print("Contenido: ");
                    input = new Scanner(System.in);
                    pendrive.setContenido(input.nextLine());
                                        
                    System.out.print("Duración: ");
                    input = new Scanner(System.in);
                    pendrive.setDuracion(input.nextInt());

                    pendrives.add(pendrive);
                    break;

                case 0:
                    done = true;
                    break;

                default: 
                    System.out.print("\nValor incorrecto.");
                    break;

            }

        }

        System.out.println("\nCDs:");
        System.out.println("-----------------");
        for(cd c : cds) {
            System.out.println("Titulo: " + c.getTitulo() + " | Artista: " + c.getArtista() + " | Pistas: " + c.getPistas() + " | Duración: " + c.getDuracion() + " | Descripción: " + c.getDescripcion());
        }

        System.out.println("\nDVDs:");
        System.out.println("-----------------");
        for(dvd d:dvds) {
            System.out.println("Titulo: " + d.getTitulo() + " | Director: " + d.getDirector() + " | Duración: " + d.getDuracion() + " | Clasificación: " + d.getClasificacion() + " | Estudio: " + d.getEstudio());
        }

        System.out.println("\nPendrives:");
        System.out.println("-----------------");
        for(pendrive p:pendrives) {
            System.out.println("Titulo: " + p.getTitulo() + " | Duración: " + p.getDuracion() + " | Capacidad: " + p.getCapacidad() + " | Contenido: " + p.getContenido());
        }

    }
    
}
