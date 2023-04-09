package unlam.paradigmas.diagnostico;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ejercicio02Tests {

	@Test
	public void matrizConCero() {
		int[][] m = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 0 } };

		boolean valorEsperado = true;

		assertEquals(valorEsperado, Ejercicio02.resolver(m));
	}
	
	@Test
	public void matrizSinCero() {
		int[][] m = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		boolean valorEsperado = false;

		assertEquals(valorEsperado, Ejercicio02.resolver(m));
	}
	
	@Test
	public void matrizVacia() {
		int[][] m = {{}};

		boolean valorEsperado = false;

		assertEquals(valorEsperado, Ejercicio02.resolver(m));
	}
	
	@Test
	public void matrizVaciaVec() {
		int[][] m = {};

		boolean valorEsperado = false;

		assertEquals(valorEsperado, Ejercicio02.resolver(m));
	}
	

	@Test
	public void matrizIrregularConCero() {
		int[][] m = { { 1, 2, 3, 4, 5 }, { 6, 7, 8 }, { 9 }, { 10, 0, 12, 13, 14 } };

		boolean valorEsperado = true;

		assertEquals(valorEsperado, Ejercicio02.resolver(m));

	}

	@Test
	public void matrizIrregularSinCero() {
		int[][] m = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		boolean valorEsperado = false;

		assertEquals(valorEsperado, Ejercicio02.resolver(m));

	}
	
	
	
	

}
