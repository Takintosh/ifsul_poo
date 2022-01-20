package aula5;

public class Pessoa {

    public static String nome;
    public static int idade;

    public Pessoa(String nome, int idade) {
        Pessoa.nome = nome;
        Pessoa.idade = idade;
    }
    
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public static void main(String[] args) {

        Pessoa p = new Pessoa("Fulano", 25);
       
        Fisica f = new Fisica(nome, idade);
        Juridica j = new Juridica(nome, idade);

        System.out.println(f.getNome());
        System.out.println(j.getIdade());
        
    }

}
