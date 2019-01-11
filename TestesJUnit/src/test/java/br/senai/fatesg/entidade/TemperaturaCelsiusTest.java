package br.senai.fatesg.entidade;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TemperaturaCelsiusTest {
	private TemperaturaCelsius temperaturaCelsiusTest;

	@Before
	public void init() {
		temperaturaCelsiusTest = new TemperaturaCelsius(0);
	}

	@Test
	public void testConverterCelsiusParaFahrenheit() {
		double saida = temperaturaCelsiusTest.converterCelsiusParaFahrenheit();
		assertEquals(32.0, saida, 0.0001);
	}

}
