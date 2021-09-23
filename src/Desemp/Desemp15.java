/* Disponer tres objetos de la clase JCheckBox con nombres de
navegadores web.
| Cuando se presione un botón, mostrar en el título del JFrame los
programas seleccionados.*/


package Desemp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Desemp15 extends JFrame implements ActionListener {

    private JCheckBox checkBox1, checkBox2, checkBox3;
    private JButton boton;

    public Desemp15() {
        setLayout(null);

        checkBox1 = new JCheckBox("Mozilla");
        checkBox1.setBounds(10, 10, 150, 30);
        add(checkBox1);

        checkBox2 = new JCheckBox("Chrome");
        checkBox2.setBounds(10, 50, 150, 30);
        add(checkBox2);

        checkBox3 = new JCheckBox("Safari");
        checkBox3.setBounds(10, 90, 150, 30);
        add(checkBox3);

        boton = new JButton("Confirmar");
        boton.setBounds(10, 140, 100, 30);
        boton.addActionListener(this);
        add(boton);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton) {

            String cad = " ";

            if (checkBox1.isSelected()) {
                cad = cad + " Mozilla - ";

            }

            if (checkBox2.isSelected()) {
                cad = cad + "Chrome - ";

            }

            if (checkBox3.isSelected()) {
                cad = cad + "Safari - ";

            }
            setTitle(cad);

        }
    }

    public static void main(String[] args) {
        Desemp15 formulario = new Desemp15();
        formulario.setBounds(0, 0, 300, 500);
        formulario.setVisible(true);
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
