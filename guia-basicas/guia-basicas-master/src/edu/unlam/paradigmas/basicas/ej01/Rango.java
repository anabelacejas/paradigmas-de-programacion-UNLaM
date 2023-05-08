package edu.unlam.paradigmas.basicas.ej01;

import java.util.Objects;

public class Rango {
	private final double limInferior;
	private final double limSuperior;
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

	public boolean estaDentroDelRango(double num) {
		return num >= this.limInferior && num <= this.limSuperior;
	}

	public boolean estaDentroDelRango(Rango rango) {
		return rango.limInferior >= this.limInferior && rango.limSuperior <= this.limSuperior;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rango other = (Rango) obj;
		return abiertoDerecha == other.abiertoDerecha && abiertoIzquierda == other.abiertoIzquierda
				&& Double.doubleToLongBits(limInferior) == Double.doubleToLongBits(other.limInferior)
				&& Double.doubleToLongBits(limSuperior) == Double.doubleToLongBits(other.limSuperior);
	}

	@Override
	public String toString() {
		return "Rango [limInferior=" + limInferior + ", limSuperior=" + limSuperior + ", abiertoIzquierda="
				+ abiertoIzquierda + ", abiertoDerecha=" + abiertoDerecha + "]";
	}

}
