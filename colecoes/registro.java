package colecoes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class registro extends JFrame implements ActionListener {

    protected JLabel lnome, ldescricao, lcusto, lestoque;
    protected JTextField tnome, tdescricao, tcusto, testoque;
    protected JButton sub, fim;
    
    ArrayList<bebida> bebidas = new ArrayList<>();
    
    public registro() {

        JFrame f = new JFrame();

        // Nome
        lnome = new JLabel("Nome:");
        lnome.setFont(new Font("Arial", Font.PLAIN, 20));
        lnome.setSize(100, 20);
        lnome.setLocation(100, 100);
        f.add(lnome);
        tnome = new JTextField();
        tnome.setFont(new Font("Arial", Font.PLAIN, 15));
        tnome.setSize(190, 20);
        tnome.setLocation(200, 100);
        f.add(tnome);

        // Custo
        lcusto = new JLabel("Custo:");
        lcusto.setFont(new Font("Arial", Font.PLAIN, 20));
        lcusto.setSize(100, 20);
        lcusto.setLocation(100, 150);
        f.add(lcusto);
        tcusto = new JTextField();
        tcusto.setFont(new Font("Arial", Font.PLAIN, 15));
        tcusto.setSize(190, 20);
        tcusto.setLocation(200, 150);
        f.add(tcusto);

        // Descriçao
        ldescricao = new JLabel("Descriçao:");
        ldescricao.setFont(new Font("Arial", Font.PLAIN, 20));
        ldescricao.setSize(100, 20);
        ldescricao.setLocation(100, 200);
        f.add(ldescricao);
        tdescricao = new JTextField();
        tdescricao.setFont(new Font("Arial", Font.PLAIN, 15));
        tdescricao.setSize(190, 20);
        tdescricao.setLocation(200, 200);
        f.add(tdescricao);

        // Estoque
        lestoque = new JLabel("Estoque:");
        lestoque.setFont(new Font("Arial", Font.PLAIN, 20));
        lestoque.setSize(100, 20);
        lestoque.setLocation(100, 250);
        f.add(lestoque);
        testoque = new JTextField();
        testoque.setFont(new Font("Arial", Font.PLAIN, 15));
        testoque.setSize(190, 20);
        testoque.setLocation(200, 250);
        f.add(testoque);

        // Submit
        sub = new JButton("Registrar");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(100, 300);
        sub.addActionListener(this);
        f.add(sub);
        
        // Finalizar registro e continuar
        fim = new JButton("Continuar");
        fim.setFont(new Font("Arial", Font.PLAIN, 15));
        fim.setSize(100, 20);
        fim.setLocation(290, 300);
        fim.addActionListener(this);
        f.add(fim);
        fim.addActionListener(e -> {
            f.dispose();
            listado();
        });

        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==sub) {
            registrar();
        }
    }

    public void registrar() {
        String nome = tnome.getText();
        String descricao = tdescricao.getText();
        String scusto = tcusto.getText();
        String sestoque = testoque.getText();
        float custo = Float.parseFloat(scusto);
        int estoque = Integer.parseInt(sestoque);
        bebidas.add(new bebida(nome, custo, descricao, estoque));
        JOptionPane.showMessageDialog(null, "Bebida Registrada", "Aviso", 1);
    }

    public void listado() {
        for (bebida b:bebidas) {
            JOptionPane.showMessageDialog(null, "Bebida: " + b.getNome()+
            "\nCusto: " + b.getCusto()+
            "\nDescriçao: " + b.getDescricao()+
            "\nEstoque: " + b.getEstoque(), "Bebida Registrada", 1);
        }
        chamarMetodos();
    }

    public void chamarMetodos() {
        JOptionPane.showMessageDialog(null, f1(), "Método 1 do exercicio", 1);
        JOptionPane.showMessageDialog(null, f2(), "Método 2 e 3 do exercicio", 1);
        JOptionPane.showMessageDialog(null, f4(), "Método 4 do exercicio", 1);
        JOptionPane.showMessageDialog(null, f5(), "Método 5 do exercicio", 1);
        JOptionPane.showMessageDialog(null, f6(), "Método 6 do exercicio", 1);
        JOptionPane.showMessageDialog(null, f7(), "Método 7 do exercicio", 1);
    }

    // Quantidade de bebidas em estoque
    public String f1() {
        int quant = 0;
        for(bebida b:bebidas) {
            quant = quant+b.getEstoque();
        }
        return "Quantidade de bebidas em estoque: " + quant;
    }

    // Nome da bebida mais cara + Descriçao e Custo (funcoes 2 e 3 pra economizar linhas)
    public String f2() {
        int index=0;
        float caro = bebidas.get(index).getCusto();
        for (bebida b:bebidas) {
            if (b.getCusto()>caro) {
                index = bebidas.indexOf(b);
            }
        }
        return  "A bebida mais cara é: " + bebidas.get(index).getNome() +
                ". Descriçao: " + bebidas.get(index).getDescricao() +
                ". Custo: " + caro;
    }

    // Nome e custo da bebida mais barata
    public String f4() {
        int index = 0;
        float barato = bebidas.get(index).getCusto();
        for (bebida b:bebidas) {
            if (b.getCusto()<barato) {
                index = bebidas.indexOf(b);
            }
        }
        return "A bebida mais barata é: " + bebidas.get(index).getNome() + ". Custo: " + bebidas.get(index).getCusto();
    }

    // nome das bebidas com estoque superior a 30
    public String f5() {
        String textoAux = "";
        for (bebida b:bebidas) {
            if (b.getEstoque()>=30) {
                textoAux = textoAux + " - " + b.getNome();
            }
        }
        return "Bebidas com mais de 30u em estoque: " + textoAux; 
    }

    // Nome da bebida com custo entre 4 e 5
    public String f6() {
        String textoAux = "";
        for (bebida b:bebidas) {
            if ((b.getCusto()>4) && (b.getCusto()<5)) {
                textoAux = textoAux + " - " + b.getNome();
            }
        }     
        return "Bebidas com custo entre 4 e 5 Reais: " + textoAux;
    }

    // Dados de todas as bebidas
    public String f7() {
        String textoAux = "";
        for (bebida b:bebidas) {
            textoAux = textoAux + "Nome: " + b.getNome() + ". Custo: " + b.getCusto() + ". Descriçao: " + b.getDescricao() + ". Estoque: " + b.getEstoque() + "\n";
        }
        return textoAux;
    }

}