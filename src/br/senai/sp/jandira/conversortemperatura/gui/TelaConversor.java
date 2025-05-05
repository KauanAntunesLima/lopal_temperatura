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
	 // Campo de texto para digitar a temperatura em Celsius
    private JTextField campoCelsius;
    // Label para exibir o resultado da conversão
    private JLabel labelResultado;
    // Label para exibir mensagem de erro
    private JLabel labelErro;
 // Método para criar e exibir a tela
    public void criarTela() {

        JFrame tela = new JFrame(); // Janela principal
        Dimension tamanho = new Dimension();
        tamanho.setSize(400, 300); // Tamanho que eu escolhi para a janela

        tela.setSize(tamanho);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha o programa ao cliclar no "X"
        tela.setLayout(null);
        
     // Label para instrução de entrada
        JLabel labelEntrada = new JLabel("Digite a temperatura em Celsius");
        labelEntrada.setBounds(30, 30, 250, 25); //Posição da escrita "Digite a temperatura em Celsius"
        
     // Campo onde o usuário digita a temperatura
        campoCelsius = new JTextField();
        campoCelsius.setBounds(30, 60, 150, 25); //Posição do campo para inserir a temperatura
        
     // Botão para converter para Fahrenheit
        JButton botaoFahrenheit = new JButton("Converter para Fahrenheit");
        botaoFahrenheit.setBounds(30, 100, 300, 30); //Posição do botão de conversão para Fahrenheit
        
     // Botão para converter para Kelvin
        JButton botaoKelvin = new JButton("Converter para Kelvin");
        botaoKelvin.setBounds(30, 140, 300, 30); //Posição do botão de conversão para Kelvin

        // Label para exibir o resultado da conversão
        labelResultado = new JLabel("");
        labelResultado.setBounds(30, 180, 300, 25); //Posição do resultado d conversão
        
     // Label para exibir mensagens de erro
        labelErro = new JLabel("");
        labelErro.setForeground(Color.red);// Texto na cor vermelho
        labelErro.setBounds(30, 210, 300, 25); //Posição para mensagem de erro

     // Adiciona todos os objetos para a janela
        tela.getContentPane().add(labelEntrada);
        tela.getContentPane().add(campoCelsius);
        tela.getContentPane().add(botaoFahrenheit);
        tela.getContentPane().add(botaoKelvin);
        tela.getContentPane().add(labelResultado);
        tela.getContentPane().add(labelErro);
        
     // Ação do botão de conversão para Fahrenheit
        botaoFahrenheit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                	// Cria objeto Temperatura e define o valor em Celsius
                    Temperatura temperatura = new Temperatura();
                    double fahrenheit = Double.parseDouble(campoCelsius.getText());
                    temperatura.setCelsius(fahrenheit);
                 // Converte e mostra o resultado
                    double temp = temperatura.converterParaFahreinheit();
                    labelResultado.setText(temp + " FAHRENHEIT");
                    labelErro.setText("");
                } catch (Exception erro) {
                	 // Exibe mensagem de erro caso o usuario não insira um número
                    labelResultado.setText("");
                    labelErro.setText("Ocorreu um Erro! Digite somente números.");
                }
            }
        });
     // Ação do botão de conversão para Kelvin
        botaoKelvin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                	// Cria objeto Temperatura e define o valor em Celsius
                    Temperatura temperatura = new Temperatura();
                    double kelvin = Double.parseDouble(campoCelsius.getText());
                    temperatura.setCelsius(kelvin);
                 // Converte e exibe o resultado
                    double temp = temperatura.converterParaKelvin();
                    labelResultado.setText(temp + " KELVIN");
                    labelErro.setText("");
                } catch (Exception erro) {
                	// Exibe mensagem de erro caso o usuario não insira um número
                    labelResultado.setText("");
                    labelErro.setText("Ocorreu um Erro! Digite somente números.");
                }
            }
        });
     // Torna a janela visível
        tela.setVisible(true);
    }
}