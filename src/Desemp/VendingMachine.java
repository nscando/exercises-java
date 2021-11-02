package Desemp;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Frame;

public class VendingMachine extends JFrame {

	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;
	private JButton btnProductoA;
	private JButton btnProductoB;
	private JButton btnProductoC;
	private JButton btnProductoD;
	private JButton btn100;
	private JButton btn50;
	private JButton btn10;
	private JButton btn5;
	private JButton btnBalance;
	private JButton btnPagar;
	private JLabel lblBalance;
	private boolean bandera = false;
	private int contadorA = 10;
	private int contadorB = 10;
	private int contadorC = 10;
	private int contadorD = 10;
	private int totalA = 0;
	private int totalB = 0;
	private int totalC = 0;
	private int totalD = 0;
	private int sumaValorProductos = 0;
	private int ingresarDinero = 0;
	private int balance = 0;
	private int totalContadores;
	private JLabel lblCounterA;
	private JLabel lblCounterB;
	private JLabel lblCounterC;
	private JLabel lblCounterD;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VendingMachine frame = new VendingMachine();
					frame.setVisible(true);
					frame.setTitle("VENDING MACHINE");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VendingMachine() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// BOTONES DE PRODUCTOS
		btnProductoC = new JButton("$80");
		btnProductoC.setBackground(new Color(255, 215, 0));
		btnProductoC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				bandera = true;
				contadorC--;
				repaint();
				totalC = totalC + 80;
				sumaTotalPago();
				estadoContadores();

				String valoresTotales = String.valueOf(sumaValorProductos);
				textField1.setText(valoresTotales);
			}
		});
		btnProductoC.setBounds(445, 187, 89, 23);
		contentPane.add(btnProductoC);

		btnProductoB = new JButton("$260");
		btnProductoB.setBackground(new Color(255, 215, 0));
		btnProductoB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				bandera = true;
				contadorB--;
				repaint();
				totalB = totalB + 260;
				sumaTotalPago();
				estadoContadores();

				String valoresTotales = String.valueOf(sumaValorProductos);
				textField1.setText(valoresTotales);
			}
		});
		btnProductoB.setBounds(240, 187, 89, 23);
		contentPane.add(btnProductoB);

		btnProductoA = new JButton("$175");
		btnProductoA.setBackground(new Color(255, 215, 0));
		btnProductoA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bandera = true;
				contadorA--;
				repaint();
				totalA = totalA + 175;
				sumaTotalPago();
				estadoContadores();

				String valoresTotales = String.valueOf(sumaValorProductos);
				textField1.setText(valoresTotales);
			}
		});
		btnProductoA.setBounds(40, 187, 89, 23);
		contentPane.add(btnProductoA);

		btnProductoD = new JButton("$305");
		btnProductoD.setBackground(new Color(255, 215, 0));
		btnProductoD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bandera = true;
				contadorD--;
				repaint();
				totalD = totalD + 305;
				sumaTotalPago();
				estadoContadores();

				String valoresTotales = String.valueOf(sumaValorProductos);
				textField1.setText(valoresTotales);
			}
		});
		btnProductoD.setBounds(640, 187, 89, 23);
		contentPane.add(btnProductoD);

		// LABELS

		JLabel lblProductoB = new JLabel("Producto B");
		lblProductoB.setBounds(250, 162, 79, 14);
		contentPane.add(lblProductoB);

		JLabel lblNewLabel = new JLabel("Producto A");
		lblNewLabel.setBounds(50, 162, 79, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_2_1 = new JLabel("Producto D");
		lblNewLabel_2_1.setBounds(650, 162, 79, 14);
		contentPane.add(lblNewLabel_2_1);

		JLabel lblProductoC = new JLabel("Producto C");
		lblProductoC.setBounds(450, 162, 84, 14);
		contentPane.add(lblProductoC);

		JLabel lblNewLabel_1 = new JLabel("IMPORTE TOTAL:   $");
		lblNewLabel_1.setBounds(382, 296, 105, 14);
		contentPane.add(lblNewLabel_1);

		lblBalance = new JLabel("");
		lblBalance.setBounds(150, 392, 105, 23);
		contentPane.add(lblBalance);

		JLabel lblNewLabel_1_1 = new JLabel("INGRESE DINERO:  $");
		lblNewLabel_1_1.setBounds(382, 324, 122, 14);
		contentPane.add(lblNewLabel_1_1);

		JLabel lblEstadoPago = new JLabel("");
		lblEstadoPago.setBounds(496, 355, 191, 14);
		contentPane.add(lblEstadoPago);

		// BOTONES DE PAGO

		btn100 = new JButton("$100");
		btn100.setBackground(new Color(100, 149, 237));
		btn100.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ingresarDinero = ingresarDinero + 100;
				String ingresoDineroTotal = String.valueOf(ingresarDinero);
				textField2.setText(ingresoDineroTotal);
			}
		});
		btn100.setBounds(40, 243, 89, 23);
		contentPane.add(btn100);

		btn50 = new JButton("$50");
		btn50.setBackground(new Color(100, 149, 237));
		btn50.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ingresarDinero = ingresarDinero + 50;
				String ingresoDineroTotal = String.valueOf(ingresarDinero);
				textField2.setText(ingresoDineroTotal);
			}
		});
		btn50.setBounds(240, 243, 89, 23);
		contentPane.add(btn50);

		btn10 = new JButton("$10");
		btn10.setBackground(new Color(100, 149, 237));
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ingresarDinero = ingresarDinero + 10;
				String ingresoDineroTotal = String.valueOf(ingresarDinero);
				textField2.setText(ingresoDineroTotal);
			}
		});
		btn10.setBounds(445, 243, 89, 23);
		contentPane.add(btn10);

		btn5 = new JButton("$5");
		btn5.setBackground(new Color(100, 149, 237));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ingresarDinero = ingresarDinero + 5;
				String ingresoDineroTotal = String.valueOf(ingresarDinero);
				textField2.setText(ingresoDineroTotal);
			}
		});
		btn5.setBounds(640, 243, 89, 23);
		contentPane.add(btn5);

		// TEXTFIELDS
		textField1 = new JTextField("0");
		textField1.setEditable(false);
		textField1.setBounds(496, 293, 246, 20);
		contentPane.add(textField1);
		textField1.setColumns(10);

		textField2 = new JTextField("0");
		textField2.setEditable(false);
		textField2.setColumns(10);
		textField2.setBounds(496, 324, 246, 20);
		contentPane.add(textField2);

		// BOTONES DE ACCIONES
		btnBalance = new JButton("BALANCE");
		btnBalance.setForeground(new Color(255, 255, 240));
		btnBalance.setBackground(new Color(139, 0, 0));
		btnBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valorBalanceString = String.valueOf(balance);
				lblBalance.setText(" $ " + valorBalanceString);
			}
		});
		btnBalance.setBounds(40, 392, 89, 23);
		contentPane.add(btnBalance);

		btnPagar = new JButton("PAGAR");
		btnPagar.setForeground(new Color(255, 250, 240));
		btnPagar.setFont(new Font("Monospaced", Font.BOLD, 14));
		btnPagar.setBackground(new Color(0, 128, 0));
		btnPagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (sumaValorProductos == ingresarDinero) {
					balance = balance + ingresarDinero;

					lblEstadoPago.setText("Pago procesado");

					textField1.setText("0");
					textField2.setText("0");

					resetearVariables();

				} else {
					lblEstadoPago.setText("Error, vuelva a intentar.");
				}

			}
		});
		btnPagar.setBounds(40, 296, 105, 61);
		contentPane.add(btnPagar);

		// LABELS DE CONTADORES

		lblCounterA = new JLabel();
		lblCounterA.setBounds(125, 162, 46, 14);
		contentPane.add(lblCounterA);

		lblCounterB = new JLabel("");
		lblCounterB.setBounds(328, 162, 46, 14);
		contentPane.add(lblCounterB);

		lblCounterC = new JLabel("");
		lblCounterC.setBounds(527, 162, 46, 14);
		contentPane.add(lblCounterC);

		lblCounterD = new JLabel("");
		lblCounterD.setBounds(728, 162, 46, 14);
		contentPane.add(lblCounterD);
	}

	// METODOS COMPLEMENTARIOS

	public void sumaTotalPago() {
		sumaValorProductos = totalA + totalB + totalC + totalD;
	}

	public void resetearVariables() {
		ingresarDinero = 0;
		sumaValorProductos = 0;
		totalA = 0;
		totalB = 0;
		totalC = 0;
		totalD = 0;

	}

	public void estadoContadores() {
		String countA = String.valueOf(contadorA);
		String countB = String.valueOf(contadorB);
		String countC = String.valueOf(contadorC);
		String countD = String.valueOf(contadorD);

		lblCounterA.setText(countA);
		lblCounterB.setText(countB);
		lblCounterC.setText(countC);
		lblCounterD.setText(countD);
	}
	
	
	//GRAFICOS
	@Override
	public void paint(Graphics g) {
	
		super.paint(g);

		totalContadores = contadorA + contadorB + contadorC + contadorD;

		if (totalContadores == 0) {
			this.setTitle("FUERA DE SERVICIO");
			btn10.setEnabled(false);
			btn100.setEnabled(false);
			btn5.setEnabled(false);
			btn50.setEnabled(false);

		}

		g.setColor(Color.black);
		g.drawRect(20, 50, 740, 200);

		// PRODUCTO A
		g.setColor(Color.black);
		g.drawRect(30, 60, 120, 120);
		g.setColor(Color.white);
		g.fillRect(30, 60, 120, 120);

		g.setColor(new Color(0, 128, 0));
		g.fillOval(30, 60, 115, 115);

		if (contadorA == 0) {
			g.setColor(new Color(139, 0, 0));
			g.fillOval(30, 60, 115, 115);
			btnProductoA.setEnabled(false);
		}

		// PRODUCTO B
		g.setColor(Color.black);
		g.drawRect(230, 60, 120, 120);
		g.setColor(Color.white);
		g.fillRect(230, 60, 120, 120);

		g.setColor(new Color(0, 128, 0));
		g.fillOval(230, 60, 115, 115);

		if (contadorB == 0) {
			g.setColor(new Color(139, 0, 0));
			g.fillOval(230, 60, 115, 115);
			btnProductoB.setEnabled(false);
		}

		// PRODUCTO C
		g.setColor(Color.black);
		g.drawRect(430, 60, 120, 120);
		g.setColor(Color.white);
		g.fillRect(430, 60, 120, 120);

		g.setColor(new Color(0, 128, 0));
		g.fillOval(430, 60, 115, 115);

		if (contadorC == 0) {
			g.setColor(new Color(139, 0, 0));
			g.fillOval(430, 60, 115, 115);
			btnProductoC.setEnabled(false);
		}

		// PRODUCTO D
		g.setColor(Color.black);
		g.drawRect(630, 60, 120, 120);
		g.setColor(Color.white);
		g.fillRect(630, 60, 120, 120);

		g.setColor(new Color(0, 128, 0));
		g.fillOval(630, 60, 115, 115);

		if (contadorD == 0) {
			g.setColor(new Color(139, 0, 0));
			g.fillOval(630, 60, 115, 115);
			btnProductoD.setEnabled(false);
		}

	}
}
