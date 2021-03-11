package aula3;

public class pfisica extends persona {

    int cpf;
    Float sueldo;

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getCpf() {
        return cpf;
    }

    public void recibeSueldo(Float sueldo) {
        this.sueldo = sueldo;
    }

    public Float getSueldo() {
        return sueldo;
    }
    
}
