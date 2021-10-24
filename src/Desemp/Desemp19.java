package Desemp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.SpinnerListModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Desemp19 extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox;
	private JSpinner spinner;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Desemp19 frame = new Desemp19();
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
	public Desemp19() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Velocidad de desplazamiento");
		lblNewLabel.setBounds(50, 35, 168, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblSeleccionDelBoton = new JLabel("Seleccion del boton");
		lblSeleccionDelBoton.setBounds(327, 35, 157, 14);
		contentPane.add(lblSeleccionDelBoton);
		
		spinner = new JSpinner();
		spinner.setModel(new SpinnerListModel(new String[] {"0", "25", "50", "75", "100"}));
		spinner.setBounds(60, 56, 95, 20);
		contentPane.add(spinner);
		
		comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				repaint();
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Izquierdo", "Derecho"}));
		comboBox.setBounds(337, 60, 132, 22);
		contentPane.add(comboBox);
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		g.drawRect(340, 150, 150, 150);
		
	
		
		String botonSeleccionadoString = comboBox.getSelectedItem().toString();
		
		if(botonSeleccionadoString.equals("Izquierdo")) {
			g.setColor(Color.black);
			g.fillRect(341, 150, 75, 75);
			
			g.setColor(Color.red);
			g.fillOval(355, 165, 40, 40);
		}else {
			g.setColor(Color.black);
			g.fillRect(415, 150, 75, 75);
			
			g.setColor(Color.red);
			g.fillOval(430, 165, 40, 40);
		}
	}

}
