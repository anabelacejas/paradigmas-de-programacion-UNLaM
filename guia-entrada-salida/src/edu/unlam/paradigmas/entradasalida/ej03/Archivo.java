package edu.unlam.paradigmas.entradasalida.ej03;

import java.util.Locale;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivo {
	private String nombre;

	public Archivo(String nombre) {
		this.nombre = nombre;
	}

	public Luchador[] leerArchivo() {
		Scanner scanner = null;
		Luchador[] datos = null;

		try {
			File file = new File("casos de prueba/in/" + this.nombre + ".in");
			scanner = new Scanner(file);

			scanner.useLocale(Locale.ENGLISH);

			int cant = scanner.nextInt();
			datos = new Luchador[cant];

			for (int i = 0; i < cant; i++) {
				int peso = scanner.nextInt();
				int altura = scanner.nextInt();
				datos[i] = new Luchador(peso, altura);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		finally {
			scanner.close();
		}

		return datos;
	}

	public void guardarArchivo(int datos[]) {
		FileWriter file = null;
		PrintWriter printerWriter = null;

		try {
			file = new FileWriter("casos de prueba/out/" + this.nombre + ".out");
			printerWriter = new PrintWriter(file);

			for (int i = 0; i < datos.length; i++) {
				printerWriter.println(datos[i]);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (file != null) {
				try {
					file.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}

}
