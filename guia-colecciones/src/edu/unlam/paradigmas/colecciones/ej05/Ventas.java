package edu.unlam.paradigmas.colecciones.ej05;

import java.util.HashMap;

public class Ventas {
	HashMap<String, Double> ventas;

	public Ventas() {
		ventas = new HashMap<String, Double>();
	}

	public void agregarVenta(String mes, double monto) throws RuntimeException{
		if (monto > 0)
			ventas.put(mes, monto);
		else
			throw new RuntimeException("Monto tiene que ser mayor a 0");

	}

	public double getMonto(String mes) {
		return ventas.get(mes);
	}
}
