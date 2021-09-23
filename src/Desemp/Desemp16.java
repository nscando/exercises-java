/*| Permitir el ingreso de dos números en controles de tipo JTextField y
        mediante dos controles de tipo JRadioButton permitir la selección en caso
        de que queramos sumarlos o restarlos.
        | Al presionar un botón, mostrar en el título del JFrame el resultado de la
        operación.*/
package Desemp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Desemp16 extends JFrame implements ActionListener {
    private JRadioButton radioButton1, radioButton2, radioButton3;
    private JTextField val1, val2;
    private ButtonGroup buttonGroup;
    private JButton boton;

    public Desemp16(){
        setLayout(null);
        buttonGroup=new ButtonGroup();

        radioButton1 = new JRadioButton("Sumar");
        radioButton1.setBounds(20,60,100,30);
        radioButton1.addActionListener(this);
        add(radioButton1);

        radioButton2 = new JRadioButton("restar");
        radioButton2.setBounds(150,60,100,30);
        radioButton2.addActionListener(this);
        add(radioButton2);

        radioButton3 = new JRadioButton("multiplicar");
        radioButton3.setBounds(250,60,100,30);
        radioButton3.addActionListener(this);
        add(radioButton3);


        val1 = new JTextField("Valor 1");
        val1.setBounds(10,20,100,30);
        add(val1);

        val2 = new JTextField("Valor 2");
        val2.setBounds(150,20,100,30);
        add(val2);

        boton = new JButton("Calcular");
        boton.setBounds(20, 100, 100,30);
        boton.addActionListener(this);
        add(boton);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton) {
            int total = 0;

            if (radioButton1.isSelected()) {
                String cadena1 = val1.getText();
                String cadena2 = val2.getText();

                int numero1 = Integer.parseInt(cadena1);
                int numero2 = Integer.parseInt(cadena2);

                total = numero1 + numero2;

                setTitle("El Resultado es: " + total);
            }

            if (radioButton2.isSelected()) {
                String cadena1 = val1.getText();
                String cadena2 = val2.getText();

                int numero1 = Integer.parseInt(cadena1);
                int numero2 = Integer.parseInt(cadena2);

                total = numero1 - numero2;

                setTitle("El Resultado es: " + total);
            }


            if (radioButton3.isSelected()) {
                String cadena1 = val1.getText();
                String cadena2 = val2.getText();

                int numero1 = Integer.parseInt(cadena1);
                int numero2 = Integer.parseInt(cadena2);

                total = numero1 * numero2;

                setTitle("El Resultado es: " + total);
            }
        }

    }


    public static void main(String[] args) {
        Desemp16 formulario = new Desemp16();
        formulario.setBounds(0,0, 500,600);
        formulario.setVisible(true);
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
