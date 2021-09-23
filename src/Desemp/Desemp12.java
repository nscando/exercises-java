package Desemp;

import javax.swing.*;
import java.awt.event.*;

public class Desemp12 extends JFrame implements ActionListener {
    private JTextArea text1, text2;
    private JButton button;

    public Desemp12() {
        setLayout(null);

        text1 = new JTextArea("Ingrese texto 1");
        text1.setBounds(10, 10, 200, 100);
        add(text1);

        text2 = new JTextArea("Ingrese texto 2");
        text2.setBounds(10, 150, 200, 100);
        add(text2);

        button = new JButton("Comparar");
        button.setBounds(10, 260, 100, 30);
        add(button);
        button.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            String texto1 = text1.getText();
            String texto2 = text2.getText();

            if (texto1.equals(texto2)) {

                setTitle("Los textos son iguales");
            } else {
                setTitle("Los textos son diferentes");
            }
        }

    }

    public static void main(String[] args) {
        Desemp12 formulario = new Desemp12();
        formulario.setBounds(0,0,400,380);
        formulario.setVisible(true);
    }
}
