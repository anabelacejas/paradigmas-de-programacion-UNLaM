package unlam.paradigmas.diagnostico;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ejercicio01Tests {

	@Test
	public void matrizSumaDiagonal() {
		int[][] mat = { { 1, 2, 3 }, { 4, 1, 6 }, { 7, 8, 2 } };
		
		boolean valorEsperado = true;
		
		assertEquals(valorEsperado, Ejercicio01.resolver(mat));
	}
	
	@Test
	public void matrizNoSumaUltimoValor() {
		int[][] mat = { { 1, 2, 3 }, { 4, 2, 6 }, { 7, 8, 2 } };
		
		boolean valorEsperado = false;
		
		assertEquals(valorEsperado, Ejercicio01.resolver(mat));
	}
	
	@Test
	public void matrizNoSumaSegundoValor() {
		int[][] mat = { { 1, 2, 3 }, { 4, 2, 6 }, { 7, 8, 3 } };
		
		boolean valorEsperado = false;
		
		assertEquals(valorEsperado, Ejercicio01.resolver(mat));
	}
	

}
