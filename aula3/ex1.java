package aula3;
import java.util.ArrayList;
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Boolean done = false;
        ArrayList<pfisica> personasF = new ArrayList<pfisica>();
        ArrayList<pjuridica> personasJ = new ArrayList<pjuridica>();

        while(!done) {
            System.out.println("\n-- Ingresar Usuario --");
            System.out.println("\n-----------------------");
            System.out.println("\n1 - Persona Física");
            System.out.println("\n2 - Personería Jurídica");
            System.out.println("\n0 - Salir y listar usuarios");

            input = new Scanner(System.in);
            int resultado = input.nextInt();

            switch (resultado) {

                case 1:
                    pfisica personaf = new pfisica();

                    System.out.print("Nombre: ");
                    input = new Scanner(System.in);
                    personaf.setNombre(input.nextLine());

                    System.out.print("\nDirección: ");
                    input = new Scanner(System.in);
                    personaf.setDireccion(input.nextLine());

                    System.out.print("\nCPF: ");
                    input = new Scanner(System.in);
                    personaf.setCpf(input.nextInt());

                    System.out.print("\nSueldo: ");
                    input = new Scanner(System.in);
                    personaf.recibeSueldo(input.nextFloat());

                    personasF.add(personaf);
                    break;

                case 2:
                    pjuridica personaj = new pjuridica();

                    System.out.print("Nombre: ");
                    input = new Scanner(System.in);
                    personaj.setNombre(input.nextLine());

                    System.out.print("\nDirección: ");
                    input = new Scanner(System.in);
                    personaj.setDireccion(input.nextLine());

                    System.out.print("\nRubro: ");
                    input = new Scanner(System.in);
                    personaj.setRubro(input.nextLine());

                    System.out.print("\nCNPJ: ");
                    input = new Scanner(System.in);
                    personaj.setCnpj(input.nextInt());

                    System.out.print("\nImpuesto: ");
                    input = new Scanner(System.in);
                    personaj.pagaImpuesto(input.nextFloat());

                    personasJ.add(personaj);
                    break;

                case 0:
                    done = true;
                    break;

                default: 
                    System.out.print("\nValor incorrecto.");
                    break;

            }

        }

        System.out.println("\nPersonas Físicas:");
        System.out.println("-----------------");
        for(pfisica p : personasF) {
            System.out.println("Nombre: " + p.getNombre() + " | Dirección: " + p.getDireccion() + " | CPF: " + p.getCpf() + " | Sueldo: " + p.getSueldo());
        }

        System.out.println("\nPersonerías Jurídicas:");
        System.out.println("-----------------");
        for(pjuridica p : personasJ) {
            System.out.println("Nombre: " + p.getNombre() + " | Dirección: " + p.getDireccion() + " | Rubro: " + p.getRubro() + " | CNPJ: " + p.getCnpj() + " | Impuesto: " + p.getValor());
        }

    }
    
}
