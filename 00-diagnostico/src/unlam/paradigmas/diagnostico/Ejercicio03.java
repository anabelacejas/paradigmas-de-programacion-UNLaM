package unlam.paradigmas.diagnostico;

public class Ejercicio03 {

	/*
	 * Escribir un método en Java que de una matriz numérica dada, devuelva una
	 * matriz con la misma cantidad de elementos, pero donde cada valor es la suma
	 * de sus adyacentes originales (arriba, abajo, izquierda, y derecha; si
	 * existen)
	 */

	// agregar matriz irregular

	public static int[][] resolver(int[][] m) {
		int[][] resultado = new int[m.length][];

		for (int i = 0; i < m.length; i++) {

			resultado[i] = new int[m[i].length];

			for (int j = 0; j < m[i].length; j++) {

				resultado[i][j] = m[i][j];
				System.out.println(m[i][j]);

				if ((j + 1) < m[i].length) {
					resultado[i][j] += m[i][j + 1];
				}
				if ((j - 1) >= 0) {
					resultado[i][j] += m[i][j - 1];
				}

				if ((i - 1) >= 0 && j < m[i - 1].length) {
					resultado[i][j] += m[i - 1][j];
				}

				if ((i + 1) < m.length && j < m[i + 1].length) {
					resultado[i][j] += m[i + 1][j];
				}
			}

		}

		return resultado;
	}
}
