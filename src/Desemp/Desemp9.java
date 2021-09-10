/*| Disponer dos objetos de la clase JButton con las etiquetas: "varón" y
        "mujer".
        | Al presionarse, mostrar en la barra de títulos del JFrame la etiqueta del
        botón presionado.*/

package Desemp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Desemp9 extends JFrame implements ActionListener {
    private JButton b1, b2, b3;

    public Desemp9() {
        setLayout(null);

        b1 = new JButton("Hombre");
        b1.setBounds(10, 100, 90, 30);
        b1.setForeground(Color.green);
        add(b1);
        b1.addActionListener(this);

        b2 = new JButton("Mujer");
        b2.setBounds(110, 100, 90, 30);
        b2.setForeground(Color.magenta);
        add(b2);
        b2.addActionListener(this);

        b3 = new JButton("No Binario");
        b3.setBounds(210, 100, 90, 30);
        b3.setForeground(Color.yellow);
        add(b3);
        b3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            setTitle("Hombre");
        }
        if (e.getSource() == b2) {
            setTitle("Mujer");
        }
        if (e.getSource() == b3) {
            setTitle("No Binario");
        }
    }

    public static void main(String[] args) {
        Desemp9 formulario = new Desemp9();
        formulario.setBounds(0, 0, 350, 200);
        formulario.setVisible(true);
    }
}
