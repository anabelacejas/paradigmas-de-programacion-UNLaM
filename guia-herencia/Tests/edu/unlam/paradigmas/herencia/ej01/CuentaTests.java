package edu.unlam.paradigmas.herencia.ej01;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaTests {

	@Test
	public void depositarTest() {
		Cuenta c = new Cuenta();
		c.depositar(1000);
		
		int valorEsperado = 1000;
		
		assertEquals(valorEsperado, c.getSaldo());
	
	}
	
	@Test
	public void extraerTest() {
		Cuenta c = new Cuenta();
		c.depositar(1000);
		
		c.extraer(550);
		
		int valorEsperado = 450;
		
		assertEquals(valorEsperado, c.getSaldo());
	
	}
	
	@Test
	public void extraerSinSaldoSuficienteTest() {
		Cuenta c = new Cuenta();
		c.depositar(1000);
		c.extraer(1550);
	
	}
	
	

}
