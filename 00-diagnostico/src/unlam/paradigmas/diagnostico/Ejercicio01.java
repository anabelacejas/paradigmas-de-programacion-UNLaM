package unlam.paradigmas.diagnostico;

public class Ejercicio01 {

	/*Escribir un método en Java que permita comprobar si la diagonal principal de una 
	matriz cuadrada de enteros tiene en cada posición un valor igual a la suma de todos 
	los valores de las posiciones anteriores de dicha diagonal.*/
	
	public static boolean resolver(int[][] m) {
		int suma = m[0][0], i, j;
		
		for(i=1, j = 1; i < m.length && m[i][j] == suma; i++, j++) {
			suma += m[i][j];
		}
		
		return i == m.length;
	}
}
