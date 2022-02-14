package preparatorios;

public class bebida {

    private static String nome;
    private static String descricao;
    private static float custo, precoVenda;
    private static int estoque;

    public static void setNome(String nome) {
        bebida.nome = nome;
    }
    public static String getNome() {
        return bebida.nome;
    }

    public static void setCusto(float custo) {
        bebida.custo = custo;
    }
    public static float getCusto() {
        return bebida.custo;
    }

    public static void setDescricao(String descricao) {
        bebida.descricao = descricao;
    }
    public static String getDescricao() {
        return bebida.descricao;
    }

    public static void setEstoque(int estoque) {
        bebida.estoque = estoque;
    }
    public static int getEstoque() {
        return bebida.estoque;
    }

    public static float getPrecoVenda() {
        bebida.precoVenda = (float) (getCusto() * 1.3);
        return bebida.precoVenda;
    }

    public static void mostrar() {
        System.out.print("\nProduto: " + bebida.getNome());
        System.out.print("\nCusto: " + bebida.getCusto());
        System.out.print("\nDescriçao: " + bebida.getDescricao());
        System.out.print("\nEstoque: " + bebida.getEstoque());
        System.out.print("\nValor de venda do produto: " + bebida.getPrecoVenda());
    }

    public static String retirar(int quant) {
        if (bebida.estoque >= quant) {
            setEstoque(getEstoque()-quant);
            return ("Estoque atualizado. Estoque atual: " + bebida.estoque);
        } else {
            return ("Quantidade maior que o Estoque.");
        }
    }
    public static String adicionar(int quant) {
        setEstoque(getEstoque()+quant);
        return ("Estoque atualizado. Estoque atual: " + bebida.estoque);
    }

    public bebida(String nome, Float preco, String descricao, int estoque) {
        setNome(nome);
        setCusto(preco);
        setDescricao(descricao);
        setEstoque(estoque);
    }

}