package com.qa.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {

	TemperatureConverter tempConverter = new TemperatureConverter();
	
	@Test
	public void convertFahrenheitToCelsiusTest() {
		// assertEquals(Expected, Actual, Delta)
		assertEquals(15.556, tempConverter.convertFahrenheitToCelsius(60), 0.001);
	}
	
	@Test
	public void convertCelsiusToFahrenheitTest() {
		
	}
	
	@Test
	public void convertKelvinToCelsiusTest() {
		
	}
	
	@Test
	public void convertCelsiusToKelvinTest() {
		
	}
	
	@Test
	public void convertKelvinToFahrenheitTest() {
		
	}
	
	@Test
	public void convertFahrenheitToKelvinTest() {
		
	}
	
}
