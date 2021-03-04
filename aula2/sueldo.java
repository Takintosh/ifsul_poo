package aula2;

public class sueldo {
    private int sueldoBruto, sueldoLiquido, impuesto;
    
    public int setSueldoBruto(int sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
        return 1;
    }

    public int getSueldoBruto() {
        return sueldoBruto;
    }

    public int setImpuesto(int impuesto) {
        this.impuesto = impuesto;
        return 1;
    }

    public int getImpuesto() {
        return impuesto;
    }

    public int setSueldoLiquido(int sueldoLiquido) {
        this.sueldoLiquido = sueldoLiquido;
        return 1;
    }

    public int getSueldoLiquido() {
        return sueldoLiquido;
    }
}
