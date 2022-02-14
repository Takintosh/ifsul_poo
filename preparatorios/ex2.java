package preparatorios;
import java.util.*;

public class ex2 {
    
    public static void main(String[] args) {

        String nome, ip1, ip2;
        Scanner input = new Scanner(System.in);
        ArrayList<Laboratorio> laboratorios = new ArrayList<>();

        for (int i=0; i<3; i++) {
            System.out.print("\nLaboratorio " + (i+1));
            System.out.print("\nNome: ");
            nome = input.nextLine();
            System.out.print("IP do Host 1: ");
            ip1 = input.nextLine();
            System.out.print("IP do Host 2: ");
            ip2 = input.nextLine();

            laboratorios.add(new Laboratorio(nome, ip1, ip2));
        }

        for (Laboratorio lab : laboratorios) {
            System.out.print("\nLaboratorio: " + (laboratorios.indexOf(lab)+1));
            lab.mostrar();
        }

        input.close();
    }

}
