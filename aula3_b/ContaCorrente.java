package aula3_b;

public class ContaCorrente {

    float saldo;

    public float getSaldo() {
        return saldo;
    }

    public String retirada(float valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return "deposito realizado";
        } else {
            return "deposito nao realizado";
        }
    }

    public void deposito(float valor) {
        this.saldo = this.saldo + valor;
    }
    
}
