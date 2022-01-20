package aula5;

public class Fisica extends Pessoa {

    public Fisica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String getNome() {
        return "Dr. " + super.getNome();
    }
    
}
