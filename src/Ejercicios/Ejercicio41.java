package Ejercicios;

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

public class Ejercicio41 extends JFrame {

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
					Ejercicio41 frame = new Ejercicio41();
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
	public Ejercicio41() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 648, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Partido 1");
		lblNewLabel.setBounds(26, 41, 69, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPartido = new JLabel("Partido 2");
		lblPartido.setBounds(26, 78, 69, 14);
		contentPane.add(lblPartido);
		
		JLabel lblPartido_1 = new JLabel("Partido 3");
		lblPartido_1.setBounds(26, 118, 69, 14);
		contentPane.add(lblPartido_1);
		
		textField1 = new JTextField();
		textField1.setBounds(123, 38, 86, 20);
		contentPane.add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setColumns(10);
		textField2.setBounds(123, 75, 86, 20);
		contentPane.add(textField2);
		
		textField3 = new JTextField();
		textField3.setColumns(10);
		textField3.setBounds(123, 115, 86, 20);
		contentPane.add(textField3);
		
		JButton btnGraficar = new JButton("Graficar");
		btnGraficar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				graficar = true;
				repaint();
			}
		});
		btnGraficar.setBounds(26, 181, 89, 23);
		contentPane.add(btnGraficar);
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		if (graficar) {
			
			int v1 = Integer.parseInt(textField1.getText());
			int v2 = Integer.parseInt(textField2.getText());
			int v3 = Integer.parseInt(textField3.getText());
			
			int mayor = retornarMayor(v1, v2, v3);

			int largo1 = v1 * 400 / mayor;
			int largo2 = v2 * 400 / mayor;
			int largo3 = v3 * 400 / mayor;

			g.setColor(Color.RED);
			g.fillRect(100, 250, largo1, 40);
			g.drawString("Partido 1", 10, 270);
			
			g.setColor(Color.GREEN);
			g.fillRect(100, 300, largo2, 40);
			g.drawString("Partido 2", 10, 320);
			
			g.setColor(Color.BLUE);
			g.fillRect(100, 350, largo3, 40);
			g.drawString("Partido 3", 10, 370);
			
		}
	}

	private int retornarMayor(int valor1, int valor2, int valor3) {
		if (valor1 > valor2 && valor1 > valor3) {
			return valor1;
		} else {
			if (valor2 > valor3) {
				return valor2;
			} else {
				return valor3;
			}
		}
	}

}
