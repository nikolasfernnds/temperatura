package br.dev.nikolas.temperatura.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import br.dev.nikolas.temperatura.model.Temperatura;

public class TelaConversor {
	
	private JLabel lblCelsius;
	private JTextField txtCelsius;
	private JButton buttonKelvin;
	private JButton buttonFahrenheit;
	private JLabel lblResultado;
	private JLabel lblMensagemErro;
	
	public void criarTela() {
		JFrame tela = new JFrame();
		tela.setSize(500, 350);
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
		buttonFahrenheit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String textCelsius = txtCelsius.getText();
				
				try {
					double celsius = Double.parseDouble(textCelsius);
					Temperatura fahrenheit = new Temperatura();
					fahrenheit.setCelsius(celsius);
					celsius = fahrenheit.converterParaFahrenheit();
					lblResultado.setText(String.valueOf(Math.round(celsius) + "  Fahrenheit"));
				} catch (NumberFormatException e2) {
					lblMensagemErro.setText("<html>Para que o conversor funcione corretamente <br> digite apenas números!<html>");
				}
			}
		});
		
		buttonKelvin = new JButton();
		buttonKelvin.setText("Kelvin");
		buttonKelvin.setBounds(259, 90, 190, 40);
		buttonKelvin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String textCelsius = txtCelsius.getText();
				
				try {
					double celsius = Double.parseDouble(textCelsius);
					Temperatura kelvin = new Temperatura();
					kelvin.setCelsius(celsius);
					celsius = kelvin.converterParaKelvin();
					lblResultado.setText(String.valueOf(celsius + "  Kelvin"));
					
					
				} catch (NumberFormatException e2) {
					lblMensagemErro.setText("<html>Para que o conversor funcione corretamente <br> digite apenas números!<html>");
				}
			}
		});
		
		lblResultado = new JLabel();
		lblResultado.setBounds(150, 150, 300, 40);
		lblResultado.setFont(new Font("Arial", Font.BOLD, 22));
		
		lblMensagemErro = new JLabel();
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
