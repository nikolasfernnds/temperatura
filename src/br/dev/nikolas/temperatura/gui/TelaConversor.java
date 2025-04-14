package br.dev.nikolas.temperatura.gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TelaConversor {
	
	private JLabel lblCelsius;
	private JTextField txtCelsius;
	private JButton buttonKelvin;
	private JButton buttonFahrenheit;
	private JButton buttonLimpar;
	private JLabel lblResultado;
	private JLabel lblMensagemErro;
	
	public void criarTela() {
		JFrame tela = new JFrame();
		tela.setSize(500, 400);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Conversor de Temperatura");
		tela.setLocationRelativeTo(null);
		tela.setLayout(null);
		tela.setResizable(false);
		
		
		lblCelsius = new JLabel();
		lblCelsius.setText("Temperatura em graus celsius: ");
		lblCelsius.setBounds(50, 10, 300, 25);
		
		txtCelsius = new JTextField();
		txtCelsius.setBounds(50, 40, 400, 40);
		
		buttonFahrenheit = new JButton();
		buttonFahrenheit.setText("FAHRENHEIT");
		buttonFahrenheit.setBounds(50, 90, 190, 40);
		
		buttonKelvin = new JButton();
		buttonKelvin.setText("Kelvin");
		buttonKelvin.setBounds(259, 90, 190, 40);
		
		lblResultado = new JLabel();
		lblResultado.setText("69 FAHREINHEIT");
		lblResultado.setBounds(150, 150, 300, 40);
		lblResultado.setFont(new Font("Arial", Font.BOLD, 22));
		
		lblMensagemErro = new JLabel();
		lblMensagemErro.setText("<html>Caso o valor fornecido pelo usuário esteja incorreto,<br>a mensagem de erro deverá aparecer aqui.</html>");
		lblMensagemErro.setBounds(50, 200, 400, 50);
		lblMensagemErro.setForeground(Color.red);
		lblMensagemErro.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensagemErro.setVerticalAlignment(SwingConstants.CENTER);
		
		tela.getContentPane().add(lblCelsius);
		tela.getContentPane().add(txtCelsius);
		tela.getContentPane().add(buttonFahrenheit);
		tela.getContentPane().add(buttonKelvin);
		tela.getContentPane().add(lblResultado);
		tela.getContentPane().add(lblMensagemErro);

		tela.setVisible(true);
		
	}
	
}
