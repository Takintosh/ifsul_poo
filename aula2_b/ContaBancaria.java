package aula2_b;

public class ContaBancaria {

    int nroConta;
    float saldo;
    String tipoConta;

    public void setNroConta(int nroConta) {
        this.nroConta = nroConta;
    }
    public int getNroConta() {
        return nroConta;
    }
    
    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
    public String getTipoConta() {
        return tipoConta;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public float getSaldo() {
        return saldo;
    }

}
