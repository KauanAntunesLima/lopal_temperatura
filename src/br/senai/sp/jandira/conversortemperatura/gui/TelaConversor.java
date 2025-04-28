package br.senai.sp.jandira.conversortemperatura.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.senai.sp.jandira.conversortemperatura.model.Temperatura;

public class TelaConversor {

	private JTextField campoCelsius;
	private JLabel labelResultado;
	private JLabel labelErro;

	public void criarTela() {

		JFrame tela = new JFrame();
		Dimension tamanho = new Dimension();
		tamanho.setSize(400, 300);

		tela.setSize(tamanho);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);

		JLabel labelEntrada = new JLabel("Digite a temperatura em Celsius");
		labelEntrada.setBounds(30, 30, 250, 25);

		campoCelsius = new JTextField();
		campoCelsius.setBounds(30, 60, 150, 25);

		JButton botaoFahrenheit = new JButton("Converter para Fahrenheit");
		botaoFahrenheit.setBounds(30, 100, 300, 30);
		JButton botaoKelvin = new JButton("Converter para Kelvin");
		botaoKelvin.setBounds(30, 140, 300, 30);

		labelResultado = new JLabel("");
		labelResultado.setBounds(30, 180, 300, 25);

		labelErro = new JLabel("");
		labelErro.setForeground(Color.red);
		labelErro.setBounds(30, 210, 300, 25);

		tela.getContentPane().add(labelEntrada);
		tela.getContentPane().add(campoCelsius);
		tela.getContentPane().add(botaoFahrenheit);
		tela.getContentPane().add(botaoKelvin);
		tela.getContentPane().add(labelResultado);
		tela.getContentPane().add(labelErro);

		botaoFahrenheit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Temperatura temperatura = new Temperatura();
				double fahrenheit = Double.parseDouble(campoCelsius.getText());
				temperatura.setCelsius(fahrenheit);
				double temp = temperatura.ConverterParaFahrenheit();
				labelResultado.setText(temp + "FAHRENHEIT");
				labelErro.setText("");
				
				
				
		});

		botaoKelvin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});

		tela.setVisible(true);
	}

	
 }

}
