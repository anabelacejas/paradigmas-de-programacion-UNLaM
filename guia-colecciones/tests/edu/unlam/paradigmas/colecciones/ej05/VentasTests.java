package edu.unlam.paradigmas.colecciones.ej05;

import static org.junit.Assert.*;

import org.junit.Test;

public class VentasTests {

	@Test(expected = Exception.class)
	public void agregarVentaCero() {
		Ventas ventas = new Ventas();
		ventas.agregarVenta("febrero", 0);
	}
	
	@Test
	public void agregarVentaTest() {
		Ventas ventas = new Ventas();
		ventas.agregarVenta("febrero", 10);
		
		double expectedValue = 10;
		
		assertEquals(expectedValue, ventas.getMonto("febrero"), 0.00001);
	}
	
	
	@Test(expected = NullPointerException.class)
	public void ventaNoExistente() {
		Ventas ventas = new Ventas();
		ventas.agregarVenta("febrero", 10);
	}
	

}
