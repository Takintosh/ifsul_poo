package aula6;

public class Produto {

    private double punitario;
    private int idproduto, stock;

    // Construtores
    public void construtor() {
        this.idproduto = 1;
        this.punitario = 1.5;
        this.stock = 10;
    }
    public void construtor(int id) {
        construtor();
        this.idproduto = id;
    }
    public void construtorAlt(int id) {
        this.idproduto = id;
        this.stock = 0;
        this.punitario = 0;
    }

    // Métodos
    public double valorDoEstoque() {
        return (this.punitario * this.stock);
    }
    public void repoe(int add) {
        this.stock = this.stock + add;
    }
    public boolean retira(int retiro) {
        if (this.stock > retiro) {
            this.stock = this.stock - retiro;
            return true;
        }
        else {
            return false;
        }
    }
    @Override
    public String toString() {
        return "ID: " + idproduto + ". Cantidad en Stock: " + stock + ". Valor Unitário: " + punitario + ".";
    }

    // Get & Set
    public void setStock(int stock) {
        this.stock = stock;
    }
    public int getStock() {
        return this.stock;
    }
    public void setPUnitario(double valor) {
        this.punitario = valor;
    }
    public double getPUnitario() {
        return this.punitario;
    }
    public int getCodigo() {
        return this.idproduto;
    }
    
}
