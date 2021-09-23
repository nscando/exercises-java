/*| Mediante dos controles de tipo JTextField permitir el ingreso de dos
números.
| Crear un menú que contenga una opción que redimensione el JFrame
con los valores ingresados por teclado.
| Finalmente disponer otra opción que finalice el programa (finalizamos
un programa en Java llamando al método exit de la clase
System: System.exit(0))*/


package Desemp;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Desemp14 extends JFrame implements ActionListener {

    private JMenuBar menuBar;
    private JMenu menu1;
    private JMenuItem menuItem1, menuItem2;
    private JTextField textField1, textField2;

    public Desemp14() {
        setLayout(null);

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        menu1 = new JMenu("Opciones");
        menuBar.add(menu1);

        menuItem1 = new JMenuItem("Redimensionar");
        menu1.add(menuItem1);
        menuItem1.addActionListener(this);

        menuItem2 = new JMenuItem("Salir");
        menu1.add(menuItem2);
        menuItem2.addActionListener(this);

        textField1 = new JTextField("alto");
        textField1.setBounds(10, 10, 100, 30);
        add(textField1);

        textField2 = new JTextField("ancho");
        textField2.setBounds(10, 50, 100, 30);
        add(textField2);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == menuItem1) {
            String cadena1 = textField1.getText();
            String cadena2 = textField2.getText();

            int alto = Integer.parseInt(cadena1);
            int ancho = Integer.parseInt(cadena2);

            setSize(alto, ancho);
        }
        if (e.getSource() == menuItem2) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Desemp14 formulario = new Desemp14();
        formulario.setBounds(10, 10, 300, 300);
        formulario.setVisible(true);
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
