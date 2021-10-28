package Ejercicios;

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

public class Ejercicio40 extends JFrame {

	private JPanel contentPane;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField1;
	private boolean graficar = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio40 frame = new Ejercicio40();
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
	public Ejercicio40() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 632, 493);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Partido 1");
		lblNewLabel.setBounds(31, 14, 65, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPartido = new JLabel("Partido 2");
		lblPartido.setBounds(31, 61, 65, 14);
		contentPane.add(lblPartido);
		
		JLabel lblPartido_1 = new JLabel("Partido 3");
		lblPartido_1.setBounds(31, 116, 65, 14);
		contentPane.add(lblPartido_1);
		
		textField1 = new JTextField();
		textField1.setBounds(106, 11, 86, 20);
		contentPane.add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setColumns(10);
		textField2.setBounds(106, 58, 86, 20);
		contentPane.add(textField2);
		
		textField3 = new JTextField();
		textField3.setColumns(10);
		textField3.setBounds(106, 113, 86, 20);
		contentPane.add(textField3);
		
		JButton btnGraficar = new JButton("Graficar");
		btnGraficar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				graficar= true;
				repaint();
			}
		});
		btnGraficar.setBounds(31, 173, 89, 23);
		contentPane.add(btnGraficar);
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		if(graficar) {
			int v1 = Integer.parseInt(textField1.getText());
			int v2 = Integer.parseInt(textField2.getText());
			int v3 = Integer.parseInt(textField3.getText());

			int total = v1 + v2 + v3;

			int grados1 = v1 * 360 / total;
			int grados2 = v2 * 360 / total;
			int grados3 = v3 * 360 / total;

			int porcentaje1 = (v1 * 100) / total;
			int porcentaje2 = (v2 * 100) / total;
			int porcentaje3 = (v3 * 100) / total;

						
			g.setColor(Color.red);
			g.fillArc(50, 250, 200, 200, 0, grados1);
			g.fillRect(370, 250, 20, 20);
			g.drawString("Partido 1 - " + porcentaje1+ "%", 400, 270);

			g.setColor(Color.green);
			g.fillArc(50, 250, 200, 200, grados1, grados2);
			g.fillRect(370, 280, 20, 20);
			g.drawString("Partido 2 - " + porcentaje2+ "%", 400, 300);

			g.setColor(Color.blue);
			g.fillArc(50, 250, 200, 200, grados1 + grados2, grados3);
			g.fillRect(370, 310, 20, 20);
			g.drawString("Partido 3 - "+ porcentaje3+ "%", 400, 330);
		}
	}
}
