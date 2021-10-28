package Desemp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Desemp21 extends JFrame {

	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private boolean graficar = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Desemp21 frame = new Desemp21();
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
	public Desemp21() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 662, 505);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Partido 1");
		lblNewLabel.setBounds(23, 43, 69, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPartido_1 = new JLabel("Partido 2");
		lblPartido_1.setBounds(23, 82, 69, 14);
		contentPane.add(lblPartido_1);
		
		JLabel lblPartido = new JLabel("Partido 3");
		lblPartido.setBounds(23, 120, 69, 14);
		contentPane.add(lblPartido);
		
		textField1 = new JTextField();
		textField1.setBounds(121, 40, 86, 20);
		contentPane.add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setColumns(10);
		textField2.setBounds(121, 79, 86, 20);
		contentPane.add(textField2);
		
		textField3 = new JTextField();
		textField3.setColumns(10);
		textField3.setBounds(121, 117, 86, 20);
		contentPane.add(textField3);
		
		JButton btnGraficar = new JButton("Graficar");
		btnGraficar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				graficar = true;
				repaint();
			}
		});
		btnGraficar.setBounds(23, 188, 89, 23);
		contentPane.add(btnGraficar);
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);

		if (graficar == true) {

			int v1 = Integer.parseInt(textField1.getText());
			int v2 = Integer.parseInt(textField2.getText());
			int v3 = Integer.parseInt(textField3.getText());

			int total = v1 + v2 + v3;

			int largo1 = v1 * 500 / total;
			int largo2 = v2 * 500 / total;
			int largo3 = v3 * 500 / total;

			int porcentaje1 = (v1 * 100) / total;
			int porcentaje2 = (v2 * 100) / total;
			int porcentaje3 = (v3 * 100) / total;

			g.setColor(Color.red);
			g.fillRect(50, 280, largo1, 60);
			g.setColor(Color.BLACK);
			g.drawString("P1 " + porcentaje1 + "%", 55, 300);

			g.setColor(Color.blue);
			g.fillRect(50 + largo1, 280, largo2, 60);
			g.setColor(Color.white);
			g.drawString("P2 " + porcentaje2 + "%", 55 + largo1, 300);

			g.setColor(Color.green);
			g.fillRect(50 + largo1 + largo2, 280, largo3, 60);
			g.setColor(Color.black);
			g.drawString("P3 " + porcentaje3 + "%", 55 + largo1 + largo2, 300);

		}
	}
	


}
