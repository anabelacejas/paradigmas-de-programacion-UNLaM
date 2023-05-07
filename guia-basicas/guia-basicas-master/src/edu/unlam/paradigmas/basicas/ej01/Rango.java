package edu.unlam.paradigmas.basicas.ej01;

public class Rango {
	private double limInferior;
	private double limSuperior;
	private boolean abiertoIzquierda;
	private boolean abiertoDerecha;

	
	public static Rango crearIntervaloAbierto(double inicio, double fin) {
		Rango rango = new Rango(inicio, fin);
		rango.abiertoIzquierda = true;
		rango.abiertoDerecha = true;
		
		return rango;
	}

	public static Rango crearIntervaloCerrado(double inicio, double fin) {
		Rango rango = new Rango(inicio, fin);
		rango.abiertoIzquierda = false;
		rango.abiertoDerecha = false;
		
		return rango;
	}

	public static Rango crearIntervaloAbiertoDerecha(double inicio, double fin) {
		Rango rango = new Rango(inicio, fin);
		rango.abiertoIzquierda = false;
		rango.abiertoDerecha = true;
		
		return rango;
	}

	public static Rango crearIntervaloAbiertoIzquierda(double inicio, double fin) {
		Rango rango = new Rango(inicio, fin);
		rango.abiertoIzquierda = true;
		rango.abiertoDerecha = false;
		
		return rango;
	}

	public Rango(double inicio, double fin) {
		this.limInferior = inicio;
		this.limSuperior = fin;
	}

}
