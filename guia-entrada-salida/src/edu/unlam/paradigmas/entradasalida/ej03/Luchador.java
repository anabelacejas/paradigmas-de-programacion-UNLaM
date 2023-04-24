package edu.unlam.paradigmas.entradasalida.ej03;

public class Luchador {
	private int peso;
	private int altura;

	public Luchador(int peso, int altura) {
		this.peso = peso;
		this.altura = altura;
	}

	public int getPeso() {
		return this.peso;
	}

	public int getAltura() {
		return this.altura;
	}
	
	public boolean comparar(Luchador otro) {
		
		boolean mayorAlturaYPeso = this.peso > otro.getPeso() && this.altura > otro.getAltura();
		
		boolean igualAlturaMayorPeso = this.peso > otro.getPeso() && this.altura == otro.getAltura();
		
		boolean igualPesoMayorAltura = this.peso == otro.getPeso() && this.altura > otro.getAltura();
	
		return mayorAlturaYPeso || igualAlturaMayorPeso || igualPesoMayorAltura;
	}
	
}
