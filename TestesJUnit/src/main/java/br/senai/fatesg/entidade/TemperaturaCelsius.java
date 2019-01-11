package br.senai.fatesg.entidade;

public class TemperaturaCelsius {
	private double celcius;

	public TemperaturaCelsius(double celcius) {
		this.celcius = celcius;
	}
	
	public double converterCelsiusParaFahrenheit() {
		double fah = 1.8 * celcius + 32;
		return fah;
	}
}
