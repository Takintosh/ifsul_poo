package aula5;

public class Juridica extends Pessoa {

    public Juridica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public int getIdade() {
        return super.getIdade()+100;
    }

}
