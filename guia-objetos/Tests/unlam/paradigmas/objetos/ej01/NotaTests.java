package unlam.paradigmas.objetos.ej01;

import static org.junit.Assert.*;

import org.junit.Test;

public class NotaTests {

	@Test
	public void notaAprobada() {
		Nota n = new Nota(10);
		
		boolean valorEsperado = true;
		
		assertEquals(valorEsperado, n.aprobado());
	}
	
	@Test
	public void notaDesaprobada() {
		Nota n = new Nota(6);
		
		boolean valorEsperado = true;
		
		assertEquals(valorEsperado, n.desaprobado());
	}
	

}
