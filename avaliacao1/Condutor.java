package avaliacao1;

public class Condutor {

    // atributos
    protected static String nome, tipoHabilitacao;
    protected static int pontosCarteira;
    protected static int pontos;

    // gets & sets
    public void setNome(String nome) {
        Condutor.nome = nome;
    }
    public String getNome() {
        return Condutor.nome;
    }
    public void setTipoHabilitacao(String habilitacao) {
        Condutor.tipoHabilitacao = habilitacao;
    }
    public String getTipoHabilitacao() {
        return Condutor.tipoHabilitacao;
    }
    public static void setPontosCarteira(int pontos) {
        Condutor.pontosCarteira = pontos;
    }
    public static int getPontosCarteira() {
        return Condutor.pontosCarteira;
    }

    // metodo de verificaçao
    public static String verificaPontuacao() {
        if (getPontosCarteira()<=19) {
            return ("Pontuaçao atual do Condutor: " + getPontosCarteira());
        } else {
            return ("Carteira caçada");
        }
    }

    // metodo de aplicar pontuaçao
    public static void aplicaPontuacao(int pontos) {
        setPontosCarteira(getPontosCarteira()+pontos);
    }

    // construtor
    public Condutor(String nome, String habilitacao) {
        setNome(nome);
        setTipoHabilitacao(habilitacao);
        setPontosCarteira(0);
    }
    
}
