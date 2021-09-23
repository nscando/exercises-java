
package Ejercicios;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio5 extends JFrame implements ActionListener{

    private JTextField textField1, textField2;
    private JButton boton1;

    public Ejercicio5()  {
        setLayout(null);

        textField1= new JTextField("Val1");
        textField1.setBounds(10,10,100,30);
        add(textField1);

        textField2= new JTextField("Val2");
        textField2.setBounds(10,50,100,30);
        add(textField2);

        boton1= new JButton("SUMAR");
        boton1.setBounds(10,90,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1){
            //tomamos el texto del campo de texto y lo guardamos en la variable String cadena 1 y 2
            String cadena1= textField1.getText();
            String cadena2= textField2.getText();

            //parseamos el string
            int x1 = Integer.parseInt(cadena1);
            int x2= Integer.parseInt(cadena2);

            //suamos los valores parseados
            int suma = x1+x2;

            String total = String.valueOf(suma);
            setTitle(total);
        }

    }

    public static void main(String[] args) {
        Ejercicio5 formulario = new Ejercicio5();
        formulario.setBounds(0,0,140,150);
        formulario.setVisible(true);
    }
}
