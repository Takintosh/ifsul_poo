package aula11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class form extends JFrame implements ActionListener {

    protected JLabel lusuario, lsenha;
    protected JTextField tusuario, tsenha;
    protected JButton sub, close;
    protected String usuario, senha;
        
    public form() {

        JFrame f = new JFrame();

        // Usuario
        lusuario = new JLabel("Usuario:");
        lusuario.setFont(new Font("Arial", Font.PLAIN, 20));
        lusuario.setSize(100, 20);
        lusuario.setLocation(100, 100);
        f.add(lusuario);
        tusuario = new JTextField();
        tusuario.setFont(new Font("Arial", Font.PLAIN, 15));
        tusuario.setSize(190, 20);
        tusuario.setLocation(200, 100);
        tusuario.addFocusListener(focus);
        f.add(tusuario);

        // Senha
        lsenha = new JLabel("Senha:");
        lsenha.setFont(new Font("Arial", Font.PLAIN, 20));
        lsenha.setSize(100, 20);
        lsenha.setLocation(100, 150);
        f.add(lsenha);
        tsenha = new JTextField();
        tsenha.setFont(new Font("Arial", Font.PLAIN, 15));
        tsenha.setSize(190, 20);
        tsenha.setLocation(200, 150);
        tsenha.addFocusListener(focus);
        f.add(tsenha);

        // Submit
        sub = new JButton("Registrar");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(140, 200);
        sub.addActionListener(this);
        f.add(sub);
        sub.addActionListener(e -> {
            if (verificarLogin(tusuario.getText(), tsenha.getText())) {
                f.dispose();
                info();
            } else {
                //
            }
        });

        // Close
        close = new JButton("Fechar");
        close.setFont(new Font("Arial", Font.PLAIN, 15));
        close.setSize(100, 20);
        close.setLocation(250, 200);
        close.addActionListener(this);
        f.add(close);
        close.addActionListener(e -> {
            f.dispose();
        });

        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==sub) {
            //
        }
    }

    // Janela de confirmaçao
    public void info() {
        JOptionPane.showMessageDialog(null, "Bem vindo\nIFSul\nAnálise e Desenvolvimento de Sistemas", "Logado", 1);
    }

    // verificaçao de login hardcode
    public boolean verificarLogin(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
        if ((usuario.equals("usuario")) & (senha.equals("senha"))) {
            return true;
        } else if (usuario.equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Usuario vazio", "Aviso", 2);
            return false;
        } else if (senha.equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Senha vazio", "Aviso", 2);
            return false;
        } else {
            JOptionPane.showMessageDialog(null, "Usuario e Senha erradas", "Aviso", 2);
            return false;
        }
    }

    // FocusListener
    java.awt.event.FocusListener focus = new java.awt.event.FocusListener() {
        public void focusGained(java.awt.event.FocusEvent focusEvent) {
            try {
                JTextField src = (JTextField)focusEvent.getSource();
                if (src.getText().equals("")) {
                    //src.setText("");
                    src.setBackground(new Color(255,255,255));
                }
            } catch (ClassCastException ignored) {
                //
            }
        }

        public void focusLost(java.awt.event.FocusEvent focusEvent) {
            try {
                JTextField src = (JTextField)focusEvent.getSource();
                if (src.getText().equals("")) {
                    //src.setText("Campo vazío!!");
                    src.setBackground(new Color(255,0,0));
                }
            } catch (ClassCastException ignored) {
                //
            }
        }
    };

}