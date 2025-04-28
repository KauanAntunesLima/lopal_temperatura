package br.senai.sp.jandira.conversortemperatura.model;

public class Temperatura {
  private double celsius;
 
 public double getCelsius() {
	return celsius;
}
public void setCelsius(double celsius) {
	this.celsius = celsius;
}
public double ConverterParaFahrenheit() {
	 return (celsius *1.8) + 32;
 }
 public double ConverterParaKelvin() {
	 return (celsius + 273);
 }
}
