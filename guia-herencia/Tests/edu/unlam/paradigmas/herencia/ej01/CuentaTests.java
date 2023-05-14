package edu.unlam.paradigmas.herencia.ej01;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaTests {

	@Test
	public void depositarTest() {
		Cuenta c = new Cuenta();
		c.depositar(1000);
		
		int valorEsperado = 1000;
		
		assertEquals(valorEsperado, c.consultarSaldo());
	
	}
	
	@Test
	public void extraerTest() {
		Cuenta c = new Cuenta();
		c.depositar(1000);
		
		c.extraer(550);
		
		int valorEsperado = 450;
		
		assertEquals(valorEsperado, c.consultarSaldo());
	
	}
	
	@Test
	public void extraerSinSaldoSuficienteTest() {
		Cuenta c = new Cuenta();
		c.depositar(1000);
		c.extraer(1550);
	
	}
	
	
	@Test
	public void transferirTest() {
		Cuenta cuentaOrigen = new Cuenta();
		cuentaOrigen.depositar(10000);
		System.out.println(cuentaOrigen.consultarSaldo()); // 10000
		Cuenta cuentaDestino = new Cuenta();
		System.out.println(cuentaDestino.consultarSaldo()); // 0
		cuentaOrigen.transferir(550, cuentaDestino);
		System.out.println(cuentaOrigen.consultarSaldo()); // 9450
		System.out.println(cuentaDestino.consultarSaldo()); // 550
		
	}
	
	
	

}
