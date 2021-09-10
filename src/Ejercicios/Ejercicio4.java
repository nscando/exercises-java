package Ejercicios;
import javax.swing.*;

public class Ejercicio4  extends JFrame{
    private JLabel label1;

    public Ejercicio4(){
        setLayout(null);
        label1=new JLabel("Hello world!");
        label1.setBounds(10,20,200,30);
        add(label1);
    }

    public static void main(String[] args) {
        Ejercicio4 formulario =new Ejercicio4();
        formulario.setBounds(10,10,400,300);
        formulario.setVisible(true);
    }
}
