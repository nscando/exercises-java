
/*Por un lado disponer tres objetos de la clase JRadioButton (llamarlos radio1, radio2 y radio 3), configurar el primero para que aparezca seleccionado (propiedad "selected")
Disponer dos objetos de la clase JComboBox (llamarlos comboPesos y comboCentavos)
En el JComboBox pesos inicializar la propiedad model con los valores del 0 al 5 (hay que cargar un valor por cada línea en el diálogo que aparece)
En forma similar el segundo JComboBox cargamos los valores: 0,10,20,30 etc. hasta 90.

Se sabe que :
Bebida A tiene un costo de 0 pesos 80 centavos.
Bebida B tiene un costo de 1 peso 20 centavos.
Bebida C tiene un costo de 3 pesos 10 centavos.

Cuando se presiona el botón extraer mostrar en la label de resultado el texto "Correcto" o "Incorrecto" dependiendo la bebida seleccionada y la cantidad de pesos y centavos seleccionados.*/

package Desemp;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;


public class PanelBebidas extends JFrame {

    private JPanel contentPane;
    private JComboBox comboPesos;
    private JComboBox comboCentavos;
    private JRadioButton radio1;
    private JRadioButton radio2;
    private JRadioButton radio3;
    private JLabel l1;
    private final ButtonGroup buttonGroup = new ButtonGroup();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PanelBebidas frame = new PanelBebidas();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public PanelBebidas() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 319);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Pesos");
        lblNewLabel.setBounds(263, 59, 46, 14);
        contentPane.add(lblNewLabel);
        
        comboPesos = new JComboBox();
        comboPesos.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
        comboPesos.setBounds(319, 56, 73, 20);
        contentPane.add(comboPesos);
        
        JLabel lblNewLabel_1 = new JLabel("Centavos");
        lblNewLabel_1.setBounds(263, 102, 58, 14);
        contentPane.add(lblNewLabel_1);
        
        comboCentavos = new JComboBox();
        comboCentavos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        comboCentavos.setModel(new DefaultComboBoxModel(new String[] {"0", "10", "20", "30", "40", "50", "60", "70", "80", "90"}));
        comboCentavos.setBounds(319, 96, 73, 20);
        contentPane.add(comboCentavos);
        
        JButton b1 = new JButton("Extraer");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                int pesos=Integer.parseInt((String)comboPesos.getSelectedItem());
                int centavos=Integer.parseInt((String)comboCentavos.getSelectedItem());
                if (radio1.isSelected() && pesos==0 && centavos==80)
                    l1.setText("Correcto");
                else
                    if (radio2.isSelected() && pesos==1 && centavos==20)
                        l1.setText("Correcto");
                    else
                        if (radio3.isSelected() && pesos==3 && centavos==10)
                            l1.setText("Correcto");
                        else
                            l1.setText("Incorrecto");
                
            }
        });
        b1.setBounds(30, 196, 89, 23);
        contentPane.add(b1);
        
        l1 = new JLabel("resultado");
        l1.setBounds(148, 205, 73, 14);
        contentPane.add(l1);
        
        radio1 = new JRadioButton("Bebida A");
        buttonGroup.add(radio1);
        radio1.setSelected(true);
        radio1.setBounds(10, 55, 109, 23);
        contentPane.add(radio1);
        
        radio2 = new JRadioButton("Bebida B");
        buttonGroup.add(radio2);
        radio2.setBounds(10, 81, 109, 23);
        contentPane.add(radio2);
        
        radio3 = new JRadioButton("Bebida C");
        buttonGroup.add(radio3);
        radio3.setBounds(10, 107, 109, 23);
        contentPane.add(radio3);
    }
}
