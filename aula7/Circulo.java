package aula7;
import java.lang.Math;
import java.util.Scanner;

public class Circulo {

    public static Double raio, diametro, perimetro;

    public static void construtor(Double raio) {
        Circulo.raio = raio;
    }

    public static double diametro() {
        return Circulo.diametro = raio * 2;
    }
    
    public static double perimetro() {
        return Circulo.perimetro = diametro() * 2 * Math.PI;
    }

    public static void main(String[] args) {

        System.out.print("\nIngresse o valor do raio: ");
        Scanner input = new Scanner(System.in);
        Circulo.construtor(input.nextDouble());

        System.out.println("Valor do Diametro: " + Circulo.diametro());
        System.out.println("Valor do Perimetro: " + Circulo.perimetro());

        input.close();
    }
    
}
