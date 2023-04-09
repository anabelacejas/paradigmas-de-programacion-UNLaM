package unlam.paradigmas.diagnostico;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class Ejercicio03Tests {

	@Test
	public void matrizSumaAdyacentes() {
		int[][] m = { { 8, 2, -3, 4 }, { 5, -6, -6, 20 }, { 21, 1, -5, 0 } };

		int[][] matrizEsperada = { { 15, 1, -3, 21 }, { 28, -4, 0, 18 }, { 27, 11, -10, 15 } };

		assertArrayEquals(matrizEsperada, Ejercicio03.resolver(m));
	}

	@Test
	public void matrizIrregular() {
		int[][] m = { { 8, 2, -3 }, { 5, 20 }, { 21, 1, -5, 0 } };

		int[][] matrizEsperada = { { 15, 27, -1 }, { 54, 28 }, { 27, 37, -4, -5 } };

		
		assertArrayEquals(matrizEsperada, Ejercicio03.resolver(m));
	}

	@Test
	public void matrizNula() {
		int[][] m = { {} };

		int[][] matrizEsperada = { {} };

		assertArrayEquals(matrizEsperada, Ejercicio03.resolver(m));
	}

}
