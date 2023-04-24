package edu.unlam.paradigmas.entradasalida.ej03;

public class Resolver {

	public void resolver(String nombreArch) {
		Archivo archivo = new Archivo(nombreArch);
		Archivo salida = new Archivo(nombreArch);

		Luchador[] luchadores = archivo.leerArchivo();

		int[] datos = new int[luchadores.length];

		for (int i = 0; i < luchadores.length; i++) {
			datos[i] = 0;
			for (int j = 0; j < luchadores.length; j++) {
				if (!luchadores[i].equals(luchadores[j]) && luchadores[i].comparar(luchadores[j])) {
					datos[i] += 1;
				}
			}
		}

		salida.guardarArchivo(datos);
	}
}
