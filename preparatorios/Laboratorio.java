package preparatorios;

public class Laboratorio {

    private String nome, ip_host1, ip_host2;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setIP1(String ip1) {
        this.ip_host1 = ip1;
    }
    public String getIP1() {
        return this.ip_host1;
    }

    public void setIP2(String ip2) {
        this.ip_host2 = ip2;
    }
    public String getIP2() {
        return this.ip_host2;
    }

    public void mostrar() {
        System.out.println("\nNome: " + getNome());
        System.out.println("IP do Host 1: " + getIP1());
        System.out.println("IP do Host 2: " + getIP2());
    }

    public Laboratorio(String nome, String ip1, String ip2) {
        setNome(nome);
        setIP1(ip1);
        setIP2(ip2);
        //this.nome = nome;
        //this.ip_host1 = ip1;
        //this.ip_host2 = ip2;
    }
    
}
