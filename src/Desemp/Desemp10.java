
/*| Modificar el programa del TaTeTi (Problema 13) para mostrar en el título
        de JFrame cuándo alguno de los dos jugadores ganó (verificar si en forma
        vertical, horizontal o diagonal hay tres String iguales entre sí y distintos a
        cadena vacía "").
        | Para saber cuál es el contenido de un botón, debemos llamar al método
        getText():*/

package Desemp;

import javax.swing.*;
import java.awt.event.*;

public class Desemp10 extends JFrame implements ActionListener {

    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
    String actual = "X";

    public Desemp10() {
        setLayout(null);

        b1 = new JButton("");
        b1.setBounds(10, 10, 100, 100);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("");
        b2.setBounds(120, 10, 100, 100);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("");
        b3.setBounds(230, 10, 100, 100);
        b3.addActionListener(this);
        add(b3);

        b4 = new JButton("");
        b4.setBounds(10, 120, 100, 100);
        b4.addActionListener(this);
        add(b4);

        b5 = new JButton("");
        b5.setBounds(120, 120, 100, 100);
        b5.addActionListener(this);
        add(b5);

        b6 = new JButton("");
        b6.setBounds(230, 120, 100, 100);
        b6.addActionListener(this);
        add(b6);

        b7 = new JButton("");
        b7.setBounds(10, 230, 100, 100);
        b7.addActionListener(this);
        add(b7);

        b8 = new JButton("");
        b8.setBounds(120, 230, 100, 100);
        b8.addActionListener(this);
        add(b8);

        b9 = new JButton("");
        b9.setBounds(230, 230, 100, 100);
        b9.addActionListener(this);
        add(b9);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            b1.setText(actual);
        }
        if (e.getSource() == b2) {
            b2.setText(actual);
        }
        if (e.getSource() == b3) {
            b3.setText(actual);
        }
        if (e.getSource() == b4) {
            b4.setText(actual);
        }
        if (e.getSource() == b5) {
            b5.setText(actual);
        }
        if (e.getSource() == b6) {
            b6.setText(actual);
        }
        if (e.getSource() == b7) {
            b7.setText(actual);
        }
        if (e.getSource() == b8) {
            b8.setText(actual);
        }
        if (e.getSource() == b9) {
            b9.setText(actual);
        }

        if(actual.equals("X")){
            actual="O";
        }else {
            actual="X";
        }


        verificarGanador();

    }

    private void verificarGanador() {
        String val1 = b1.getText();
        String val2 = b2.getText();
        String val3 = b3.getText();
        String val4 = b4.getText();
        String val5 = b5.getText();
        String val6 = b6.getText();
        String val7 = b7.getText();
        String val8 = b8.getText();
        String val9 = b9.getText();

        if (val1.equals("X") && val2.equals("X") && val3.equals("X")) {
            setTitle("Gano el jugador X");
        }

        if (val4.equals("X") && val5.equals("X") && val6.equals("X")) {
            setTitle("Gano el jugador X");
        }
        if (val7.equals("X") && val8.equals("X") && val9.equals("X")) {
            setTitle("Gano el jugador X");
        }
        if (val1.equals("X") && val5.equals("X") && val9.equals("X")) {
            setTitle("Gano el jugador X");
        }
        if (val3.equals("X") && val5.equals("X") && val7.equals("X")) {
            setTitle("Gano el jugador X");
        }
        if (val1.equals("X") && val4.equals("X") && val7.equals("X")) {
            setTitle("Gano el jugador X");
        }
        if (val2.equals("X") && val5.equals("X") && val8.equals("X")) {
            setTitle("Gano el jugador X");
        }
        if (val3.equals("X") && val6.equals("X") && val9.equals("X")) {
            setTitle("Gano el jugador X");
        }


        if (val1.equals("O") && val2.equals("O") && val3.equals("O")) {
            setTitle("Gano el jugador O");
        }

        if (val4.equals("O") && val5.equals("O") && val6.equals("O")) {
            setTitle("Gano el jugador O");
        }
        if (val7.equals("O") && val8.equals("O") && val9.equals("O")) {
            setTitle("Gano el jugador O");
        }
        if (val1.equals("O") && val5.equals("O") && val9.equals("O")) {
            setTitle("Gano el jugador O");
        }
        if (val3.equals("O") && val5.equals("O") && val7.equals("O")) {
            setTitle("Gano el jugador O");
        }
        if (val1.equals("O") && val4.equals("O") && val7.equals("O")) {
            setTitle("Gano el jugador O");
        }
        if (val2.equals("O") && val5.equals("O") && val8.equals("O")) {
            setTitle("Gano el jugador O");
        }
        if (val3.equals("O") && val6.equals("O") && val9.equals("O")) {
            setTitle("Gano el jugador O");
        }


    }


    public static void main(String[] args) {
        Desemp10 tateti = new Desemp10();
        tateti.setBounds(10,10,350,400);
        tateti.setVisible(true);
    }

}
