package gui;
import javax.swing.JOptionPane;

public class exercicio {

    public static void main(String[] args) {
        int opcao;

        while (true) {
            String menuList = JOptionPane.showInputDialog(  "0) Cadastro de bebida."+
            "\n1) Mostrar a quantidade de bebidas em estoque."+
            "\n2) Mostrar o nome da bebida mais cara."+
            "\n3) Mostrar a descriçao e preço da bebida mais cara."+
            "\n4) Mostrar o nome e o preço de venda da bebida mais barata."+
            "\n5) Mostrar o nome das bebidas com quantidade superior a 30."+
            "\n6) Mostrar o nome da bebida com preço entre 4 e 5 reais."+
            "\n7) Mostrar todos os dados de todas as bebidas."+
            "\n8) Sair.");

            opcao = Integer.parseInt(menuList);

            switch(opcao) {

                case 1:
                JOptionPane.showMessageDialog(null, "Mostrar a quantidade de bebidas em estoque", "Mensagem", 1);
                break;
                
                case 2:
                JOptionPane.showMessageDialog(null, "Mostrar o nome da bebida mais cara", "Mensagem", 1);
                break;
                
                case 3:
                JOptionPane.showMessageDialog(null, "Mostrar a descriçao e preço da bebida mais cara", "Mensagem", 1);
                break;
                
                case 4:
                JOptionPane.showMessageDialog(null, "Mostrar o nome e o preço de venda da bebida mais barata", "Mensagem", 1);
                break;
                
                case 5:
                JOptionPane.showMessageDialog(null, "Mostrar o nome das bebidas com quantidade superior a 30", "Mensagem", 1);
                break;
                
                case 6:
                JOptionPane.showMessageDialog(null, "Mostrar o nome da bebida com preço entre 4 e 5 reais", "Mensagem", 1);
                break;
                
                case 7:
                JOptionPane.showMessageDialog(null, "Mostrar todos os dados de todas as bebidas", "Mensagem", 1);
                break;
                
                case 8:
                JOptionPane.showMessageDialog(null, "Finalizando processo", "Mensagem", 2);
                System.exit(0);
                break;

            }
        }
        
        
        

    }

}