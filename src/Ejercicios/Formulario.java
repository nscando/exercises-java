package Ejercicios;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Formulario extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
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
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 768, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

	@Override
	public void paint (Graphics g) {
		super.paint(g);
		
		g.setColor(Color.blue);
		g.drawLine(0, 70, 100, 70);
		g.drawRect(150, 70, 50, 70);
		g.drawRoundRect(250, 70, 50, 70, 25, 25);
		g.drawOval(350, 70, 50, 70);
		
		//para poligono
		int [] vx = {500, 550, 450};
		int [] vy = {70, 120, 120};
		g.drawPolygon(vx, vy, 3);
		
		g.setColor(Color.red);
		g.fillRect(150, 270, 50, 70);
		g.fillRoundRect(250, 270, 50, 70, 25, 25);
		g.fillOval(350, 270, 50, 70);
		
		//para poligono
		int [] vx1 = {500, 550, 450};
		int [] vy1 = {270, 320, 320};
		g.fillPolygon(vx1, vy1, 3);
	}
	
}
