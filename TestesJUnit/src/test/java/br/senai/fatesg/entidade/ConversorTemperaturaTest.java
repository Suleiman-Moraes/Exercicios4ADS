package br.senai.fatesg.entidade;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConversorTemperaturaTest {
	ConversorTemperatura conversorTemperaturaTest;
	
	@Test
	public void testConverterCelsiusParaFahrenheit() {
		double saida = ConversorTemperatura.converterCelsiusParaFahrenheit(50);
		assertEquals(122.0, saida, 0.0001);
	}

	@Test
	public void testConverterFahrenheitParaCelsius() {
		double saida = ConversorTemperatura.converterFahrenheitParaCelsius(50);
		assertEquals(10.0, saida, 0.0001);
	}

}
