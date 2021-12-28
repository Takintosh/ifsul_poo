package aula2_b;

public class Pessoa {

    private String nome;
    private int idade, quantVida, habilidadeParaAtirar;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    
    public void setQuantVida(int quantVida) {
        this.quantVida = quantVida;
    }
    public int getQuantVida() {
        return quantVida;
    }
    
    public void setHabilidadeParaAtirar(int habilidadeParaAtirar) {
        this.habilidadeParaAtirar = habilidadeParaAtirar;
    }
    public int getHabilidadeParaAtirar() {
        return habilidadeParaAtirar;
    }

}
