package aula3;

public class pjuridica extends persona {

    int cnpj;
    String rubro;
    Float valor;

    public int getCnpj() {
        return cnpj;
    }

    public String getRubro() {
        return rubro;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public void pagaImpuesto(Float valor) {
        this.valor = valor;
    }

    public Float getValor() {
        return valor;
    }
    
}
