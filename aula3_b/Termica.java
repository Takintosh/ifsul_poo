package aula3_b;

public class Termica {

    String marca;
    int peso, quantidadeAgua;

    public void servir() {
        if (this.quantidadeAgua > 0) {
            this.quantidadeAgua = this.quantidadeAgua - 5;
        } else {
            System.out.println("Térmica sem agua");
        }
    }

    public void encher() {
        this.quantidadeAgua = 100;
    }

    public int getQuantAgua() {
        return quantidadeAgua;
    }

    public int getPeso() {
        return peso;
    }
    
}
