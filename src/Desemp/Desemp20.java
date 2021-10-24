package Desemp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.SpinnerNumberModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class Desemp20 extends JFrame {

	private JPanel contentPane;
	private JSpinner spinnerBultos;
	private JComboBox comboBox1;
	int numAleatorio = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Desemp20 frame = new Desemp20();
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
	public Desemp20() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 392, 434);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cantidad de bultos");
		lblNewLabel.setBounds(10, 31, 130, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Procedencia");
		lblNewLabel_1.setBounds(218, 31, 97, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnSorteo = new JButton("Sortear");
		btnSorteo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numAleatorio = (int) Math.floor(Math.random()*3+1);
				repaint();
			}
		});
		btnSorteo.setBounds(10, 168, 89, 23);
		contentPane.add(btnSorteo);
		
		spinnerBultos = new JSpinner();
		spinnerBultos.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				repaint();
			}
		});
		spinnerBultos.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		spinnerBultos.setBounds(20, 56, 79, 20);
		contentPane.add(spinnerBultos);
		
		comboBox1 = new JComboBox();
		comboBox1.setModel(new DefaultComboBoxModel(new String[] {"Interior", "Exterior"}));
		comboBox1.setBounds(218, 56, 130, 22);
		contentPane.add(comboBox1);
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		g.setColor(Color.green);
		g.fillOval(10, 270, 100, 100);
		
		int bultos = Integer.parseInt(spinnerBultos.getValue().toString());
		

		
		if(numAleatorio == 1 || bultos > 5) {
			g.setColor(Color.red);
			g.fillOval(10, 270, 100, 100);
		}else {
			g.setColor(Color.green);
			g.fillOval(10, 270, 100, 100);
		}
		
	}

}
