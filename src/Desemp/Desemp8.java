package Desemp;


import javax.swing.*;
import java.awt.*;

public class Desemp8 extends JFrame{
    private JLabel label1, label2, label3;

    public Desemp8(){
        setLayout(null);
        label1= new JLabel("Hello world!");
        label1.setBounds(10, 10, 200, 30);
        label1.setForeground(Color.blue);
        add(label1);

        label2= new JLabel("No resizable V.2");
        label2.setBounds(30, 30, 200, 30);
        label2.setForeground(Color.red);
        add(label2);

        label3= new JLabel("No resizable V.3");
        label3.setBounds(50, 50, 200, 30);
        label3.setForeground(Color.green);
        add(label3);

    }

    public static void main(String[] args) {
        Desemp8 formulario = new Desemp8();
        formulario.setVisible(true);
        formulario.setBounds(10, 10,300, 200);
        formulario.setResizable(false);
    }
}

