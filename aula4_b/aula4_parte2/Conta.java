package aula4_b.aula4_parte2;

public class Conta {

    String tipoConta;
    int nroConta;
    float saldo, retiro, deposito;

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
    public String getTipoConta() {
        return tipoConta;
    }

    public void setNroConta(int nroConta) {
        this.nroConta = nroConta;
    }
    public int getNroConta() {
        return nroConta;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public float getSaldo() {
        return saldo;
    }

    public void depositar(float deposito) {
        this.saldo = this.saldo + deposito;
        System.out.println("Saldo depositado exitosamente.");
        System.out.println("Saldo actual: " + this.saldo);
    }

    public void retirar(float retiro) {
        if (this.saldo>retiro) {
            this.saldo = this.saldo - retiro;
            System.out.println("Retiro exitoso.");
            System.out.println("Saldo actual: " + this.saldo);
        } else {
            System.out.println("Saldo Insuficiente.");
        }
    }
    
    
}
