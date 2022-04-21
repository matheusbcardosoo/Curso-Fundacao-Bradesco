package modulo3.br.com.gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame  extends JFrame{  
    public Frame(){
        super("Meu Frame");

        JButton botao = new JButton("Clique!");

        //JFrame frame = new JFrame();

        getContentPane().add(botao);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Frame();
    }
}