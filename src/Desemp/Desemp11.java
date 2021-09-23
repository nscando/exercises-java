package Desemp;


import javax.swing.*;
import java.awt.event.*;

public class Desemp11 extends JFrame implements ActionListener {

    private JTextField textField1, textField2;
    private JButton button1;

    public Desemp11(){
        setLayout(null);

        textField1= new JTextField("Ingrese Usuario");
        textField1.setBounds(10,10,150,30);
        add(textField1);

        textField2= new JTextField("Ingrese Contraseña");
        textField2.setBounds(10, 50,150,30);
        add(textField2);

        button1=new JButton("Ingresar");
        button1.setBounds(10,90,100,30);
        add(button1);
        button1.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1){
            String user = textField1.getText();
            String password = textField2.getText();

            if (user.equals("juan") && password.equals("abc123")){
                setTitle("Correcto");
            }else{
                setTitle("Usuario o contraseña incorrectos");
            }
        }
    }

    public static void main(String[] args) {
        Desemp11 formulario= new Desemp11();
        formulario.setBounds(0,0,300,300);
        formulario.setVisible(true);
    }
}
