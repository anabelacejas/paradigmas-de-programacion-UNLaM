package unlam.paradigmas.objetos.ej03;
import static org.junit.Assert.*;

import org.junit.Test;

public class CirculoTests {

	@Test
	public void calcularDiametro() {
		Circulo c = new Circulo(2);
		
		double valorEsperado = 4;
		
		assertEquals(valorEsperado, c.getDiametro(), 0.0001);
	}
	
	@Test
	public void cambiarPerimetro() {
		Circulo c = new Circulo(2);
		c.setPerimetro(7);
		
		double valorEsperado = 7;
		
		assertEquals(valorEsperado, c.getPerimetro(), 0.0001);
	}
	
	
	@Test
	public void cambiarArea() {
		Circulo c = new Circulo(2);
		c.setArea(8);
		
		double valorEsperado = 8;
		
		assertEquals(valorEsperado, c.getArea(), 0.0001);
	}
	
	
	@Test
	public void cambiarDiametro() {
		Circulo c = new Circulo(2);
		c.setDiametro(16.7);
		
		double valorEsperado = 16.7;
		
		assertEquals(valorEsperado, c.getDiametro(), 0.0001);
	}
	
	@Test
	public void cambiarRadio() {
		Circulo c = new Circulo(2);
		c.setRadio(6.78);
		
		double valorEsperado = 6.78;
		
		assertEquals(valorEsperado, c.getRadio(), 0.0001);
	}
	
	
	@Test
	public void cambiarPerimetroRadio() {
		Circulo c = new Circulo(2);
		c.setPerimetro(41.469);
		
		double valorEsperado = 6.6;
		
		assertEquals(valorEsperado, c.getRadio(), 0.0001);
	}
	
	
	@Test
	public void cambiarAreaRadio() {
		Circulo c = new Circulo(2);
		c.setArea(136.848);
		
		double valorEsperado = 6.6;
		
		assertEquals(valorEsperado, c.getRadio(), 0.0001);
	}
	
	
	@Test
	public void cambiarDiametroRadio() {
		Circulo c = new Circulo(2);
		c.setDiametro(13.2);
		
		double valorEsperado = 6.6;
		
		assertEquals(valorEsperado, c.getRadio(), 0.0001);
	}
	

}
