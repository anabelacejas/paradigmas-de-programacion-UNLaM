package unlam.paradigmas.diagnostico;

public class Ejercicio02 {

	public static boolean resolver(int[][] m) {

		int prod = 1;
		if(m.length == 0)
			return false;
		
		for(int i = 0; i< m.length && prod != 0; i++) {
			for(int j=0; j < m[i].length; j++) {
				prod *= m[i][j];
			}
		}

		return prod == 0;
	}
}
