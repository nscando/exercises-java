

/* En este desempeño te proponemos implementar un programa para la
extracción de dinero de un cajero automático. En él se debe poder fijar la
cantidad de dinero a extraer: para ello debés disponer un control de tipo
JComboBox (disponer los valores: 0,50,150 etc. hasta 500). Por otro lado,
se debe poder seleccionar el tipo de cuenta, para ello debes almacenar en
otro JComboBox los textos “Caja de Ahorro” y “Cuenta Corriente”.
Además debés tener en cuenta que:
. De Caja de Ahorro se puede extraer hasta 200.
. De Cuenta Corriente se puede extraer hasta 400.
Al presionar el botón extraer, hay que mostrar en una label el texto
“correcto” si para el tipo de cuenta el importe está permitido.
Inicialmente el cajero tiene almacenado un monto de 3000 pesos. Para
terminar, debés restar en cada extracción el monto respectivo y mostrar el mensaje “fuera de servicio” cuando se intenta extraer más dinero del
que hay en el cajero. */

package Desemp;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class CajeroAutomatico extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox1;
	private JComboBox comboBox2;
	private JLabel label1;
	private JLabel dineroDisponible;
	private int dinero = 3000;
	private int total;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CajeroAutomatico frame = new CajeroAutomatico();
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
	public CajeroAutomatico() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		comboBox1 = new JComboBox();
		comboBox1.setFont(new Font("Monospaced", Font.PLAIN, 11));
		comboBox1.setModel(new DefaultComboBoxModel(new String[] {"Caja de Ahorro", "Cuenta Corriente"}));
		comboBox1.setBounds(47, 108, 128, 22);
		contentPane.add(comboBox1);
		
		comboBox2 = new JComboBox();
		comboBox2.setFont(new Font("Monospaced", Font.PLAIN, 11));
		comboBox2.setModel(new DefaultComboBoxModel(new String[] {"0", "50", "150", "200", "250", "300", "350", "400", "450", "500"}));
		comboBox2.setBounds(250, 108, 116, 22);
		contentPane.add(comboBox2);
		
		JLabel lblNewLabel = new JLabel("Tipo de cuenta");
		lblNewLabel.setFont(new Font("Monospaced", Font.BOLD, 12));
		lblNewLabel.setBounds(47, 88, 107, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblDineroAExtraer = new JLabel("Dinero a extraer");
		lblDineroAExtraer.setFont(new Font("Monospaced", Font.BOLD, 12));
		lblDineroAExtraer.setBounds(250, 88, 144, 14);
		contentPane.add(lblDineroAExtraer);
		
		JButton extraerButton = new JButton("Extraer");
		extraerButton.setFont(new Font("Monospaced", Font.BOLD, 11));
		extraerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dineroExtraer = Integer.parseInt(comboBox2.getSelectedItem().toString());
				
				if(dineroExtraer > dinero) {
					label1.setText("Cajero fuera de servicio.");
				}else {
					String tipoCuenta = comboBox1.getSelectedItem().toString();
					
					if(tipoCuenta.equals("Caja de Ahorro") && dineroExtraer <= 200) {
					label1.setText("Operacion realizada con exito");
					
					dinero = dinero - dineroExtraer;
					
					String labelDineroDisponible = String.valueOf(dinero);
					dineroDisponible.setText(labelDineroDisponible);
					}else {
						if(tipoCuenta.equals("Cuenta Corriente") && dineroExtraer <= 400) {
							
							label1.setText("Operacion realizada con exito");
							dinero = dinero - dineroExtraer;
							
							String labelDineroDisponible = String.valueOf(dinero);
							dineroDisponible.setText(labelDineroDisponible);
						}else {
							label1.setText("Su tipo de cuenta no permite retirar ese monto.");
						}
					}
				}
			}
		});
		extraerButton.setBounds(47, 178, 89, 23);
		contentPane.add(extraerButton);
		
		label1 = new JLabel("Resultado");
		label1.setForeground(Color.RED);
		label1.setFont(new Font("Monospaced", Font.BOLD, 11));
		label1.setBounds(146, 180, 278, 19);
		contentPane.add(label1);
		
		JLabel lblMontoDisponible = new JLabel("Dinero Disponible");
		lblMontoDisponible.setFont(new Font("Monospaced", Font.BOLD, 12));
		lblMontoDisponible.setBounds(291, 11, 133, 14);
		contentPane.add(lblMontoDisponible);
		
		dineroDisponible = new JLabel("3000");
		dineroDisponible.setFont(new Font("Monospaced", Font.BOLD, 13));
		dineroDisponible.setBounds(301, 36, 82, 14);
		contentPane.add(dineroDisponible);
	}
}
