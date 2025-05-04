package br.senai.sp.jandira.conversortemperatura.model;

public class Temperatura {
	
	//Torna a celsius privado
	private double celsius;
	
	//Metodos Get e Set para acessar e atribuir valores
	
	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
	
	//Calculo de conversão, retorna kelvin
	public double converterParaKelvin() {
		
		double kelvin = celsius + 273;
		return kelvin;
		
	}
	
	//Calculo de conversão,retorna fahreinheit
	public double converterParaFahreinheit() {
		
		double fahreinheit = celsius*1.8 + 32;
		return fahreinheit;
		
	}
	

}