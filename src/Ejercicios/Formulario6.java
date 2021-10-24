package Ejercicios;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Formulario6 extends JFrame {

	private JPanel contentPane;
	private JSpinner spinnerInf;
	private JSpinner spinnerSup;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario6 frame = new Formulario6();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);

		g.setColor(Color.blue);
		g.drawRect(30, 80, 100, 140);

		int spinnerMsup = Integer.parseInt(spinnerSup.getValue().toString());
		int spinnerMinf = Integer.parseInt(spinnerInf.getValue().toString());

		g.setColor(Color.red);
		g.drawLine(30, 80 + spinnerMsup, 130, 80 + spinnerMsup);
		g.drawLine(30, 220 - spinnerMinf, 130, 220 - spinnerMinf);

		String direccion = comboBox.getSelectedItem().toString();
		if (direccion.equals("Horizontal")) {
			g.drawRect(320, 120, 200, 100);
		} else {
			g.drawRect(320, 120, 100, 200);
		}
	}

	/**
	 * Create the frame.
	 */
	public Formulario6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hoja");
		lblNewLabel.setBounds(32, 28, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Margen Superior");
		lblNewLabel_1.setBounds(153, 28, 88, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Margen Inferior");
		lblNewLabel_1_1.setBounds(153, 133, 88, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Orientacion de la pagina");
		lblNewLabel_2.setBounds(347, 28, 146, 14);
		contentPane.add(lblNewLabel_2);
		
		spinnerSup = new JSpinner();
		spinnerSup.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				repaint();
			}
		});
		spinnerSup.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		spinnerSup.setBounds(153, 53, 62, 20);
		contentPane.add(spinnerSup);
		
		spinnerInf = new JSpinner();
		spinnerInf.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				repaint();
			}
		});
		spinnerInf.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		spinnerInf.setBounds(153, 158, 62, 20);
		contentPane.add(spinnerInf);
		
		comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				repaint();
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Horizontal", "Vertical"}));
		comboBox.setBounds(347, 53, 136, 22);
		contentPane.add(comboBox);
		
		JButton btnInicializar = new JButton("Inicializar");
		btnInicializar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				spinnerSup.setValue(0);
				spinnerInf.setValue(0);
				comboBox.setSelectedIndex(0);			
				repaint();
			}
		});
		btnInicializar.setBounds(38, 233, 89, 23);
		contentPane.add(btnInicializar);
	}
}
