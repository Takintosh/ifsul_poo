package colecoes;

public class bebida {

    protected String nome, descricao;
    protected float custo;
    protected int estoque;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }
    public float getCusto() {
        return this.custo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return this.descricao;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    public int getEstoque() {
        return this.estoque;
    }

    public bebida(String nome, Float preco, String descricao, int estoque) {
        setNome(nome);
        setCusto(preco);
        setDescricao(descricao);
        setEstoque(estoque);
    }

}