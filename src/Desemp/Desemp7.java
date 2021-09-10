package Desemp;

import javax.swing.*;

public class Desemp7 extends JFrame{
    private JLabel label1;

    public Desemp7(){
        setLayout(null);
        label1= new JLabel("No resizable");
        label1.setBounds(10, 20, 200, 30);
        add(label1);

    }

    public static void main(String[] args) {
        Desemp7 formulario = new Desemp7();
        formulario.setVisible(true);
        formulario.setBounds(10, 10,1024, 800);
        formulario.setResizable(false);
    }
}
