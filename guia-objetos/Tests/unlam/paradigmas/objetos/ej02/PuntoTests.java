package unlam.paradigmas.objetos.ej02;

import static org.junit.Assert.*;

import org.junit.Test;

public class PuntoTests {

	@Test
	public void puntoEsElOrigen() {
		Punto p = new Punto(0,0);
		
		boolean valorEsperado = true;
		
		assertEquals(valorEsperado, p.esElOrigen());
	}

	@Test
	public void puntoEstaSobreElEjeX() {
		Punto p = new Punto(7,0);
		
		boolean valorEsperado = true;
		
		assertEquals(valorEsperado, p.estaSobreEjeX());
	}
	
	@Test
	public void puntoEstaSobreElEjeY() {
		Punto p = new Punto(0,6);
		
		boolean valorEsperado = true;
		
		assertEquals(valorEsperado, p.estaSobreEjeY());
	}
	
	@Test
	public void distanciaAlOrigenEsCero() {
		Punto p = new Punto(0,0);
		
		double valorEsperado = 0;
		
		assertEquals(valorEsperado, p.distanciaAlOrigen(), 0.01);
	}
	
	@Test
	public void distanciaAlOrigen() {
		Punto p = new Punto(1,7);
		
		double valorEsperado = 7.071068;
		
		assertEquals(valorEsperado, p.distanciaAlOrigen(), 0.000001);
	}
	
	@Test
	public void distanciaEntrePuntosAlOrigen() {
		Punto p1 = new Punto(1,7);
		Punto p2 = new Punto(0,0);
		
		double valorEsperado = 7.071068;
		
		assertEquals(valorEsperado, p1.distanciaAotroPunto(p2), 0.000001);
	}
	
	
}
