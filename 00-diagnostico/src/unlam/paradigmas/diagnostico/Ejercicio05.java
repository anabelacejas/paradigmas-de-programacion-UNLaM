package unlam.paradigmas.diagnostico;

public class Ejercicio05 {

	public static int[][] resolver(int[][] m) {
		//
		
		int [][]result = new int [2*m.length - 1][];
		
		for(int i = 0; i < m.length; i++) {
			result[i]= new int[i + 1];
		}
		
		for(int j = 0; j < m.length; j++) {
		
			for(int i = m.length -1 ; i >= 0 + j; i--) {
				System.out.println(m[i][j]);
				result[m.length - i][j] = m[i][j];
			}
			
			System.out.println();
		}
		
		for(int i = 0; i < m.length; i++) {
			for(int j = i + 1; j < m.length; j++) {
				System.out.println(m[i][j]);
				//result[i][j] = m[i][j];
			}
			
			System.out.println();
		}
		
		return result;
		
	}
}
